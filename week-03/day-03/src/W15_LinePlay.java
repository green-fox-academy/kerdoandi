import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class W15_LinePlay {
  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/line-play/r1.png]
    int x;
    int y;
    int space = 20;

    for (int i = 0; i < 16; i++) {
      x = 1+ i * space;
      y = 1+ i * space;
      graphics.setColor(Color.BLUE);
      graphics.drawLine(x, 0, 300, y);
    }

    for (int i = 0; i < 16; i++) {
      x = 1 + i * space;
      y = 1 + i * space;
      graphics.setColor(Color.GREEN);
      graphics.drawLine(0, y, x, 300);
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
