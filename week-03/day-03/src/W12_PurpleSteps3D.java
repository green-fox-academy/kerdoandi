import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class W12_PurpleSteps3D {
  public static void mainDraw(Graphics graphics){

    Color purple = new Color(128,0,128);

    int steps = 0;
    int temp = 10;

    for (int i = 1; i < 7; i++) {
      int size = 10 * i;
      graphics.setColor(purple);
      graphics.fillRect(temp, temp, size, size );

      temp = temp + size;
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
