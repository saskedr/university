package lab2;

class Human{
    private String head;
    private String arms;
    private String body;
    private String legs;

    public Human(String h, String a, String b, String l) {
        head = h;
        arms = a;
        body = b;
        legs = l;
    }

    public String getHead() {
        return head;
    }

    public String getArms() {
        return arms;
    }

    public String getBody() {
        return body;
    }

    public String getLegs() {
        return legs;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public void setArms(String arms) {
        this.arms = arms;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }
}

public class Main {
    public static void main(String[] args) {
        Human man = new Human("красивая", "сильные", "с пузом", "большие");
        System.out.println(man.getHead());
        System.out.println(man.getArms());
        man.setHead("умная");
        man.setArms("мощные");
        System.out.println(man.getHead());
        System.out.println(man.getArms());
    }
}
