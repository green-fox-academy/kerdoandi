import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class w11 {
  public static void mainDraw(Graphics graphics){
    int canvasSize = 300;



  }

  public static void toMultiplyBoxes(Graphics g, int i) {
    int canvasSize = 300;

    if (i == 0) {
      g.setColor(Color.BLACK);
      g.drawRect(0, 0, canvasSize, canvasSize);
      return toMultiplyBoxes(g, i);

    } else {
      canvasSize = canvasSize/3;

      g.drawRect(canvasSize , 0, canvasSize, canvasSize);
      g.drawRect(2 * canvasSize, canvasSize, canvasSize, canvasSize );
      g.drawRect(canvasSize, 2 * canvasSize, canvasSize, canvasSize);
      g.drawRect(0, canvasSize, canvasSize, canvasSize);

      return toMultiplyBoxes(g,i -1);
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
