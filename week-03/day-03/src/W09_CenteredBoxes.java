import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class W09_CenteredBoxes {
  public static void mainDraw(Graphics graphics) {
    // create a square drawing function that takes 1 parameter:
    // the square size
    // and draws a square of that size to the center of the canvas.
    // draw 3 squares with that function.
    Random rand = new Random();

    for (int i = 0; i < 3; i++) {
      int size = rand.nextInt(300);
      drawCenteredSquare(graphics, size);
    }
  }

  public static void drawCenteredSquare(Graphics g, int size) {

    int x = 150 - (size/2);
    int y = 150 - (size/2);
    g.drawRect(x,y, size, size);
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

