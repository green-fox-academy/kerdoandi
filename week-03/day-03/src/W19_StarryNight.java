import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class W19_StarryNight {
  public static void mainDraw(Graphics graphics){
    // draw the night sky:
    // - The background should be black
    // - The stars can be small squares
    // - The stars should have random positions on the canvas
    // - The stars should have random color (some shade of grey)
    graphics.setColor(Color.BLACK);
    graphics.fillRect(0,0,300,300);

    Random rand = new Random();
    int size = 2;
    int x = rand.nextInt(298) + 1;
    int y = rand.nextInt(298) + 1;

    for (int i = 0; i < 150; i++) {
      graphics.setColor(Color.WHITE);
      graphics.fillRect(x,y,size, size);
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
