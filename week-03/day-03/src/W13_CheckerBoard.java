import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class W13_CheckerBoard {
  public static void mainDraw(Graphics graphics) {
    // fill the canvas with a checkerboard pattern.
    int row;
    int col;
    int size = 20;

    for (row = 0; row < 15; row++) {
      for (col = 0; col < 15; col++) {

        if ((row % 2) == (col % 2)) {
          graphics.setColor(Color.white);
        } else {
          graphics.setColor(Color.black);
        }
        graphics.fillRect(row * size, col * size, size, size);
      }
    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
