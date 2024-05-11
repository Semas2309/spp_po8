import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class BouncingBallFrame extends JFrame {
    Ball ball;

    public BouncingBallFrame(int ballSize, int speedX, int speedY) {
        ball = new Ball(ballSize, speedX, speedY);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        add(ball, BorderLayout.CENTER);
        setVisible(true);

        while (true) {
            ball.move();
            ball.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            File file = new File("C:/Users/semen/Desktop/lab7_1/src/1.txt");
            Scanner scanner = new Scanner(file);
            int size = scanner.nextInt();
            int dx = scanner.nextInt();
            int dy = scanner.nextInt();
            new BouncingBallFrame(size, dx, dy);
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static class Ball extends JPanel {
        int x = 0, y = 0, dx, dy, size;

        public Ball(int size, int dx, int dy) {
            this.size = size;
            this.dx = dx;
            this.dy = dy;
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.fillOval(x, y, size, size);
        }

        public void move() {
            if (x + dx < 0 || x + dx > getWidth() - size) dx = -dx;
            if (y + dy < 0 || y + dy > getHeight() - size) dy = -dy;
            x += dx;
            y += dy;
        }
    }
}
