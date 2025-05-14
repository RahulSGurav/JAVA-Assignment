import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ball extends JPanel implements Runnable, MouseListener {
    private int x = 50, y = 50;
    private int dx = 2, dy = 2;
    private final int RADIUS = 20;
    private boolean running = false;

    public Ball() {
        setPreferredSize(new Dimension(400, 300));
        setBackground(Color.WHITE);
        addMouseListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, RADIUS * 2, RADIUS * 2);
    }

    public void run() {
        while (running) {
            x += dx;
            y += dy;

            // Bounce off walls
            if (x <= 0 || x + RADIUS * 2 >= getWidth()) dx = -dx;
            if (y <= 0 || y + RADIUS * 2 >= getHeight()) dy = -dy;

            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ignored) {}
        }
    }

    public void mousePressed(MouseEvent e) {
        if (!running) {
            running = true;
            new Thread(this).start();
        }
    }

    public void mouseReleased(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Ball");
        Ball ballPanel = new Ball();
        frame.add(ballPanel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
