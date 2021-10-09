package lab3;

abstract class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void displayInfo();
}

class Alabai extends Dog {
    private String coat_color;

    public Alabai(String name, int age, String coat_color) {
        super(name, age);
        this.coat_color = coat_color;
    }

    public void displayInfo() {
        System.out.println("Кличка этого алабая " + super.getName() + ", возраст: " + super.getAge() + ". Цвет шерсти: " + coat_color);
    }
}

class Terrier extends Dog {
    private String coat_color;

    public Terrier(String name, int age, String coat_color) {
        super(name, age);
        this.coat_color = coat_color;
    }

    public void displayInfo() {
        System.out.println("Кличка этого терьера " + super.getName() + ", возраст: " + super.getAge() + ". Цвет шерсти: " + coat_color);
    }
}

class Doberman extends Dog {
    private String coat_color;

    public Doberman(String name, int age, String coat_color) {
        super(name, age);
        this.coat_color = coat_color;
    }

    public void displayInfo() {
        System.out.println("Кличка этого добермана " + super.getName() + ", возраст: " + super.getAge() + ". Цвет шерсти: " + coat_color);
    }
}

public class Main {
    public static void main(String[] args) {
        Alabai dog1 = new Alabai("мирэа", 3, "серый");
        dog1.displayInfo();
        Terrier dog2 = new Terrier("ранхигс", 4, "белый");
        dog2.displayInfo();
        Doberman dog3 = new Doberman("мгу", 5, "черный");
        dog3.displayInfo();
    }
}
