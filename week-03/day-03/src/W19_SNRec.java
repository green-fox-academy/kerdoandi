import javax.swing.*;
import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class W19_SNRec {
  public static void mainDraw(Graphics graphics) {

    int starSize = 2;
    int canvasSize = 900;
    int rgbMax = 255;
    int nrOfStars = 600;

    toDrawRandomStars(graphics, canvasSize, starSize, rgbMax, nrOfStars);

  }

    public static void toDrawRandomStars(Graphics g,  int canvasSize, int starSize, int rgb, int counter ) {
        int x = (int) (Math.random() * canvasSize);
        int y = (int) (Math.random() * canvasSize);
        int c = (int) (Math.random() * rgb);

        Color grey = new Color(c, c, c);
        g.setColor(grey);
        g.fillRect(x, y, starSize, starSize);

      if (counter < 1) {
        return;
      } else {
        toDrawRandomStars(g,  canvasSize, starSize, rgb,counter - 1);
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
      this.setBackground(Color.BLACK);
      mainDraw(graphics);

    }
  }
}
