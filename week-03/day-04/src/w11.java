import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class w11 {
  public static void mainDraw(Graphics graphics){
    int canvasSize = 300;

    graphics.setColor(Color.BLACK);
    graphics.drawRect(0,0,canvasSize,canvasSize);
    graphics.drawRect(canvasSize/3,0,canvasSize/3,canvasSize/3);
    graphics.drawRect(2 * (canvasSize/3),canvasSize/3,canvasSize/3,canvasSize/3);
    graphics.drawRect(canvasSize/3,2 * (canvasSize/3),canvasSize/3,canvasSize/3);
    graphics.drawRect(0,canvasSize/3,canvasSize/3,canvasSize/3);

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
