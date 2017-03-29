import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class W10_RainbowBoxes {
  public static void mainDraw(Graphics graphics) {
    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.
    Random rand = new Random();
    Color indigo = new Color(70,0,130);
    Color violet = new Color(148,0,211);

    ArrayList<Color> colors = new ArrayList<>();
    colors.add(Color.red);
    colors.add(Color.orange);
    colors.add(Color.yellow);
    colors.add(Color.green);
    colors.add(Color.blue);
    colors.add(indigo);
    colors.add(violet);

    for (int i = 0; i < 7; i++)  {
      int size = rand.nextInt(300);
      drawFilledSquares(graphics, size, colors.get(i));
    }
  }

  public static void drawFilledSquares(Graphics g, int size, Color color) {
    int x = 150 - (size/2);
    int y = 150 - (size/2);
    g.setColor(color);
    g.fillRect(x,y, size, size);
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
