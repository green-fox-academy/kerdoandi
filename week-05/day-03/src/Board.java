import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Board extends JComponent implements KeyListener {

  int testBoxX;
  int testBoxY;
  int keyeventCounter = 0;
  Map map = new Map();
  Hero myHero = new Hero(0,0,"pic/hero-down.png", map);
  Monsters skeleton1 = new Skeleton("pic/skeleton.png", map);
  Monsters skeleton2 = new Skeleton("pic/skeleton.png", map);
  Monsters skeleton3 = new Skeleton("pic/skeleton.png", map);
  Monsters boss = new Boss("pic/boss.png", map);
  ArrayList<GameObject> objectList = new ArrayList<>();

  public Board() {
    testBoxX = 0;
    testBoxY = 0;


    // set the size of your draw board
    setPreferredSize(new Dimension(720, 800));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    for (ArrayList<Tiles> tempList : map.getMap()) {
      for(Tiles tiles : tempList) {
        objectList.add(tiles);
      }
    }
    objectList.add(myHero);
    objectList.add(skeleton1);
    objectList.add(skeleton2);
    objectList.add(skeleton3);
    objectList.add(boss);

    for (GameObject objects : objectList) {
      PositionedImage image = new PositionedImage(objects.getCostume(), objects.getPosX()*72, objects.getPosY()*72);
      image.draw(graphics);
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(board);
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  @Override
  public void keyReleased(KeyEvent e) {
      if (e.getKeyCode() == KeyEvent.VK_UP) {
        myHero.moveUp();
        keyeventCounter += 1;
      } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
        myHero.moveDown();
        keyeventCounter += 1;
      } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
        myHero.moveLeft();
        keyeventCounter += 1;
      } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
        myHero.moveRight();
        keyeventCounter += 1;
      }
      if (keyeventCounter % 2 == 0) {
        skeleton1.moveMonster(myHero.getPosX(), myHero.getPosY());
        skeleton2.moveMonster(myHero.getPosX(), myHero.getPosY());
        skeleton3.moveMonster(myHero.getPosX(), myHero.getPosY());
        boss.moveMonster(myHero.getPosX(), myHero.getPosY());
      }
    repaint();
  }
}