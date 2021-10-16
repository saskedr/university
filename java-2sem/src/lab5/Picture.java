package lab5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Scanner;

class Picture extends JFrame {
    private int window_w = 400;
    private int window_h = 400;

    Picture(String path) {
        super("PictureByPath");
        add(new DrawingImage(path));
        setSize(window_w, window_h);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static class DrawingImage extends JComponent {
        private Image image;

        public DrawingImage(String path) {
            try {
                image = ImageIO.read(new File(path));
                Graphics pic = image.getGraphics();
                pic.drawImage(image, 0, 0, null);
            } catch (Exception exception) {
                exception.printStackTrace();
            }

        }
    }

    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);
        String path = input.nextLine();
        new Picture(path);
    }
}



