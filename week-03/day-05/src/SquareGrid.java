import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.black);
    graphics.fillRect(0,0,200,200);
    graphics.setColor(Color.RED);
    graphics.fillRect(5,5,190,190);


  }

  public static void squareGrid(Graphics g, int x, int y, int size, int i,) {
    g.setColor(Color.BLACK);
    g.fillRect(x, y, size, size);
    g.setColor(Color.WHITE);
    g.fillRect(x-i, y -i , size - 2*i, size - 2*i);

    if (i < 2) {
      return;
    } else {




    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new SquareGrid.ImagePanel());
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
