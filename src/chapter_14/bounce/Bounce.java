package chapter_14.bounce;

import javax.swing.*;
import java.awt.*;

/**
 * @author HP
 * @date 2022/3/5
 */
public class Bounce {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new BounceFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
