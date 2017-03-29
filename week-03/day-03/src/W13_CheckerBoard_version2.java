import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class W13_CheckerBoard_version2 {

  public static void mainDraw(Graphics graphics) {
    int x;
    int y;
    int size = 20;


    for (int j = 0; j < 15; j++) {
      for (int i = 0; i < 15; i++) {
        x = i;
        y = j;
        if (y % 2 == 0) {
          if (x % 2 == 0) {
            graphics.setColor(Color.BLACK);
            graphics.fillRect(x * size, y * size, size, size);
          } else {
            graphics.setColor(Color.WHITE);
            graphics.fillRect(x * size, y* size, size, size);
          }
        } else {
          if (x % 2 == 0) {
            graphics.setColor(Color.WHITE);
            graphics.fillRect(x * size, y * size, size, size);
          } else {
            graphics.setColor(Color.BLACK);
            graphics.fillRect(x * size, y* size, size, size);
          }
        }
      }
    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new W13_CheckerBoard_version2.ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);

  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }
}