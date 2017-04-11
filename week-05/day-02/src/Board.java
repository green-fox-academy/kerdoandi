import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  int testBoxX = 0;
  int testBoxY = 0;
  public static final int DIMENSION = 72;

  int[][] tilesMap = new int[][]{
          {0, 0, 0, 1, 0, 1, 0, 0, 0, 0,},
          {0, 0, 0, 1, 0, 1, 0, 1, 1, 0,},
          {0, 1, 1, 1, 0, 1, 0, 1, 1, 0,},
          {0, 0, 0, 0, 0, 1, 0, 0, 0, 0,},
          {1, 1, 1, 1, 0, 1, 1, 1, 1, 0,},
          {0, 0, 0, 1, 0, 1, 0, 0, 0, 0,},
          {0, 0, 0, 1, 0, 1, 0, 1, 1, 0,},
          {0, 1, 1, 1, 0, 1, 0, 1, 1, 0,},
          {0, 0, 0, 0, 0, 1, 0, 0, 0, 0,},
          {1, 1, 1, 1, 0, 1, 1, 1, 1, 0,},
          {1, 1, 1, 1, 0, 1, 1, 1, 1, 0,}
  };

  public Board() {
    setPreferredSize(new Dimension(DIMENSION * 10, DIMENSION * 11));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    PositionedImage hero = new PositionedImage("pictures/hero-down.png", testBoxX, testBoxY);

    int posX = 0;
    int posY = 0;
    for (int i = 0; i < 11; i++) {
      for (int j = 0; j < 10; j++) {
        if (tilesMap[i][j] == 0) {
          PositionedImage floor = new PositionedImage("pictures/floor.png", posX, posY);
          floor.draw(graphics);
        } else {
          PositionedImage wall = new PositionedImage("pictures/wall.png", posX, posY);
          wall.draw(graphics);
        }
        posX += DIMENSION;
      }
      posX = 0;
      posY += DIMENSION;
    }
    hero.draw(graphics);
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  @Override
  public void keyReleased(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP && testBoxY > 0) {
      if (tilesMap[(testBoxY/72) -1][testBoxX/72] != 1) {
        testBoxY -= 72;
      }
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && testBoxY < 720) {
      if (tilesMap[(testBoxY/72) + 1][testBoxX/72] != 1) {
        testBoxY += 72;
      }
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && testBoxX > 0) {
      if (tilesMap[testBoxY/72][(testBoxX/72) -1] != 1) {
        testBoxX -= 72;
      }
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && testBoxX < (720 - 72)) {
      if (tilesMap[testBoxY/72][(testBoxX/72) + 1] != 1) {
        testBoxX += 72;
      }
    }
    repaint();
  }
}