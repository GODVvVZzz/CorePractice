package chapter_14.bounce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @author HP
 * @date 2022/3/5
 */
public class BounceFrame extends JFrame {
    private BallComponent comp;
    public static final int STEPS = 1000;
    public static final int DELAY = 3;

    public BounceFrame(){
        setTitle("Bounce");
        comp = new BallComponent();
        add(comp,BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        addButton(buttonPanel, "Start", event -> addBall());
        addButton(buttonPanel,"Close", event -> System.exit(0));
        add(buttonPanel,BorderLayout.SOUTH);
        pack();
    }

    private void addButton(Container c, String title, ActionListener listener) {
        JButton button = new JButton(title);
        c.add(button);
        button.addActionListener(listener);
    }

    private void addBall() {

            Ball ball = new Ball();
            comp.add(ball);
            Runnable r = () -> {
              try {
                  for (int i = 1; i <= STEPS; i++) {
                      ball.move(comp.getBounds());
                      comp.print(comp.getGraphics());
                      Thread.sleep(DELAY);
                  }
              }
              catch (InterruptedException e){

              }
            };
            Thread t = new Thread(r);
            t.start();
    }
}
