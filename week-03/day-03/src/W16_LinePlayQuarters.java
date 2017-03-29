import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class W16_LinePlayQuarters {
  public static void mainDraw(Graphics graphics) {
    // divide the canvas into 4 parts
    // and repeat this pattern in each quarter:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/line-play/r1.png]
    graphics.setColor(Color.blue);

    int canvasLength = 300;
    int maxInterval = 75;

    for (int i = canvasLength/2; i >= maxInterval; i = i / 2) {
      for (int j = 0; j < canvasLength/i-1; j++) {
        graphics.drawLine((j+1)*i, 0, (j+1)*i, canvasLength);
        graphics.drawLine(0, (j+1)*i, canvasLength, (j+1)*i);

      }
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
