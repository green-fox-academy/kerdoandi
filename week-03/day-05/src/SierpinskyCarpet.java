import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.BLACK);
    toMultiplyFilledBoxes(graphics, 200, 200, 100);
  }

  public static void toMultiplyFilledBoxes(Graphics g, int x, int y, int size) {
    g.fillRect(x,y,size,size);

    if (size < 5) {
      return;
    } else {

      toMultiplyFilledBoxes(g, (x - (2*size/3)), y + size/3, size/3 );
      toMultiplyFilledBoxes(g, (x - (2*size/3)), (y - (2*size/3)),size/3);
      toMultiplyFilledBoxes(g, (x - (2*size/3)), y + size + size/3, size/3);
      toMultiplyFilledBoxes(g, x + size/3, (y - (2*size/3)), size/3);
      toMultiplyFilledBoxes(g, x + size + size/3, (y - (2*size/3)), size/3);
      toMultiplyFilledBoxes(g, x + size + size/3,y + size/3 , size/3);
      toMultiplyFilledBoxes(g, x + size + size/3,y + size + size/3 , size/3);
      toMultiplyFilledBoxes(g, x + size + size/3,y + size + size/3 , size/3);
      toMultiplyFilledBoxes(g, x + size/3,y + size + size/3 , size/3);
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
