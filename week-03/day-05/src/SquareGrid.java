import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.BLACK);
    squareGrid(graphics, 200, 200,200);
  }

  public static void squareGrid(Graphics g, int x, int y, int size) {

    g.drawRect(x, y, size, size);

    if (size < 20) {
      return;
    } else {

      squareGrid(g, x-size/4, y - size/4, size/2);
      squareGrid(g, x + 3*size/4, y-size/4, size/2);
      squareGrid(g, x - size/4, y + 3*size/4, size/2);
      squareGrid(g, x + 3*size/4,y + 3*size/4, size/2);

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
      this.setBackground(Color.WHITE);
      mainDraw(graphics);

    }
  }
}
