// File : App.java
// Java Swing test

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {
     public static void main(String[] args) {
          SwingUtilities.invokeLater(new Runnable() {
               public void run() {
                    JFrame frame = new JFrame("Monopoly");
                    frame.setSize(500, 400);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                    /*Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                    Dimension frameSize = getSize();
                    setLocation(new Point((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.width) / 2)); */
               }
          });
     }
}
