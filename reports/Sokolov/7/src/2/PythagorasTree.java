import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PythagorasTree extends JPanel {

    public static double angleFactor; // Угол наклона
    public static double sizeFactor; // Коэффициент уменьшения
    public static int minSize; // Минимальный размер ветви

    public void paintComponent(Graphics g) {
        drawTree(g, getWidth() / 2, getHeight() , -Math.PI / 2, getHeight() / 3.5);
    }

    private void drawTree(Graphics g, int x1, int y1, double angle, double size) {
        if (size < minSize) return;

        int x2 = x1 + (int) (size * Math.cos(angle));
        int y2 = y1 + (int) (size * Math.sin(angle));

        g.drawLine(x1, y1, x2, y2);

        drawTree(g, x2, y2, angle - angleFactor + 0.3, size * sizeFactor);
        drawTree(g, x2, y2, angle + angleFactor, size * sizeFactor);
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("C:/Users/semen/Desktop/lab7_2/src/1.txt"));
            angleFactor = scanner.nextDouble();
            sizeFactor = scanner.nextDouble();
            minSize = scanner.nextInt();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame();
        frame.add(new PythagorasTree());
        frame.setSize(1300, 1100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
