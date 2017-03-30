import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class w11 {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.BLACK);
    graphics.drawRect(0, 0, 600, 600);

    toMultiplyBoxes(graphics, 0, 0, 600, 5);
  }

  public static void toMultiplyBoxes(Graphics g, int x, int y, int size, int i) {
    g.drawRect(x,y,size,size);

    if (i > 0)  {

      toMultiplyBoxes(g, x + size/3, y, size/3, i-1 );
      toMultiplyBoxes(g, x, y + size/3, size/3, i-1 );
      toMultiplyBoxes(g, x + size/3, y + 2*size/3, size/3, i-1);
      toMultiplyBoxes(g, x + 2*size/3, y + size/3, size/3, i-1);
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
      this.setBackground(Color.YELLOW);
      mainDraw(graphics);

    }
  }
}
