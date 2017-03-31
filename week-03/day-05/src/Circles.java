import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.BLACK);
    toMultiplyOvals(graphics, 0, 0, 600);
  }

  public static void toMultiplyOvals(Graphics g, int x, int y, int size) {
    g.drawOval(x, y, size, size);

    if (size < 60) {
      return;
    } else {
      toMultiplyOvals(g,x +size/4, y, size/2);
      toMultiplyOvals(g, x+size/16, y + 4*size/10, size/2);
      toMultiplyOvals(g, x+ 7*size/16,y + 4*size/10, size/2);
    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new Circles.ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      this.setBackground(Color.YELLOW);
      mainDraw(graphics);

    }
  }
}
