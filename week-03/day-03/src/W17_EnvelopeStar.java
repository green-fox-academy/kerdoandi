import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class W17_EnvelopeStar {
  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/envelope-star/r2.png]
    graphics.setColor(Color.GREEN);
    int canvasSize = 300;

    for (int i = 0; i < canvasSize/2; i+=10) {
      graphics.drawLine(canvasSize/2 , i, canvasSize/2-i, canvasSize/2);
      graphics.drawLine(canvasSize/2 , i, canvasSize/2+i, canvasSize/2);
      graphics.drawLine(canvasSize/2 , canvasSize-i, canvasSize/2-i, canvasSize/2);
      graphics.drawLine(canvasSize/2 , canvasSize-i, canvasSize/2+i, canvasSize/2);
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
