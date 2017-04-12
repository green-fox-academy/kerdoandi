import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Board extends JComponent implements KeyListener {

  int testBoxX;
  int testBoxY;
  Map map = new Map();
  Hero myHero = new Hero(0,0,"pic/hero-down.png", map);
  ArrayList<GameObject> objectList = new ArrayList<>();

  public Board() {
    testBoxX = 300;
    testBoxY = 300;

    // set the size of your draw board
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    map.addMap();
    for (ArrayList<Tiles> tempList : map.getMap()) {
      for(Tiles tiles : tempList) {
        objectList.add(tiles);
      }
    }
    objectList.add(myHero);

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
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      myHero.moveDown();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      myHero.moveLeft();
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      myHero.moveRight();
    }
    repaint();
  }
}