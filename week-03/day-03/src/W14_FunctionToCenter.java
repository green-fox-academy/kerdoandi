import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class W14_FunctionToCenter {

  public static void mainDraw(Graphics graphics) {
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // fill the canvas with lines from the edges, every 20 px, to the center.

    int x = 10;
    int y = 30;

    toTheCenter(graphics, x,y);

  }

  public static void toTheCenter (Graphics g, int x, int y) {
    int space = 20;

    for (int i = 0; i < 16; i++) {
      x = i * space;
      g.setColor(Color.BLUE);
      g.drawLine(x, 0, 150, 150);
      g.drawLine(x, 300, 150, 150);
    }

    for (int j = 0; j < 16; j++) {
      y = j * space;
      g.setColor(Color.BLUE);
      g.drawLine(0, y, 150, 150);
      g.drawLine(300, y, 150, 150);

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
