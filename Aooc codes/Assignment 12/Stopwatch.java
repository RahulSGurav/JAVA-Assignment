import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Stopwatch extends JFrame implements ActionListener {
    private JLabel timeLabel;
    private JButton startButton, stopButton;
    private boolean running = false;
    private int seconds = 0;
    private Thread timerThread;

    public Stopwatch() {
        setTitle("Stopwatch");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        timeLabel = new JLabel("Time: 0 s");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");

        add(timeLabel);
        add(startButton);
        add(stopButton);

        startButton.addActionListener(this);
        stopButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton && !running) {
            running = true;
            timerThread = new Thread(() -> {
                while (running) {
                    try {
                        Thread.sleep(1000);  // wait for 1 second
                        seconds++;
                        timeLabel.setText("Time: " + seconds + " s");
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                }
            });
            timerThread.start();
        }

        if (e.getSource() == stopButton) {
            running = false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Stopwatch app = new Stopwatch();
            app.setVisible(true);
        });
    }
}
