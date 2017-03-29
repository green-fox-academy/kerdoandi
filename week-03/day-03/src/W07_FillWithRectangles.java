import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class W07_FillWithRectangles {
  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.
    ArrayList<String> colors = new ArrayList<>();
    colors.add("RED");
    colors.add("BLUE");
    colors.add("GREEN");
    colors.add("YELLOW");
    Random rand = new Random();

//    for (int i = 0; i < 4; i++){
//      graphics.setColor(Color.decode(colors.get(i)));
      for (int i = 0; i < 4; i++) {
        int x = rand.nextInt(150);
        int y = rand.nextInt(150);
        int w = rand.nextInt(150);
        int h = rand.nextInt(150);
        graphics.drawRect(x,y,w,h);
      }
    }
//  }

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
