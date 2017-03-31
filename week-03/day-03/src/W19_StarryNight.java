import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class W19_StarryNight {
  public static void mainDraw(Graphics graphics){
    graphics.setColor(Color.BLACK);
    graphics.fillRect(0,0,900,900);

    int size = 2;

    for (int i = 1; i < 200; i++) {
      int x = (int) (Math.random() * 900);
      int y = (int) (Math.random() * 900);

      int c = (int) (Math.random() * 255);
      Color grey = new Color(c,c,c);

      graphics.setColor(grey);
      graphics.fillRect(x,y,size,size);
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
