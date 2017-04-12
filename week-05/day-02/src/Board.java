import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.List;

public class Board extends JComponent implements KeyListener {
  int testBoxX = 0;
  int testBoxY = 0;
  public String pic;
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
    pic = "pictures/hero-down.png";
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

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
    PositionedImage hero = new PositionedImage(pic, testBoxX, testBoxY);
    hero.draw(graphics);
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

//  public void renderSkeletons(int randomX, int randomY) {
//    List<List<Integer>> coordList = new ArrayList<List<Integer>>();
//    coordList.add();
//
//
//  }

  @Override
  public void keyReleased(KeyEvent e) {
    System.out.println("testBoxX: " + testBoxX + "testboxY " + testBoxY);
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      pic = "pictures/hero-up.png";
      if (tilesMap[(testBoxY/72) -1][testBoxX/72] != 1  && testBoxY > 71) {
        testBoxY -= 72;
      }
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      pic = "pictures/hero-down.png";
      if (tilesMap[(testBoxY/72) + 1][testBoxX/72] != 1  && testBoxY < 720) {
        testBoxY += 72;
      }
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      pic = "pictures/hero-left.png";
      if (tilesMap[testBoxY/72][(testBoxX/72) -1] != 1  && testBoxX > 71) {
        testBoxX -= 72;
      }
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      pic = "pictures/hero-right.png";
      if (tilesMap[testBoxY/72][(testBoxX/72) + 1] != 1 && testBoxX < (720 - 72)) {
        testBoxX += 72;
      }
    }
    repaint();
  }
}