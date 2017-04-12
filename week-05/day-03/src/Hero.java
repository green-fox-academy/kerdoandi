import java.awt.event.KeyEvent;

/**
 * Created by Andi on 4/12/2017.
 */
public class Hero extends GameObject {

  public Hero(int posX, int posY, String costume) {
    super(posX, posY, costume);
  }

  public void moveUp(KeyEvent e) {
    this.costume.equals("pic/hero-up");
    this.posY -= 72;
  }

  public void moveDown(KeyEvent e) {
    this.costume.equals("pic/hero-down");
    this.posY += 72;
  }

  public void moveRight(KeyEvent e) {
    this.costume.equals("pic/hero-right");
    this.posX += 72;
  }

  public void moveLeft(KeyEvent e) {
    this.costume.equals("pic/hero-right");
    this.posX -= 72;
  }
}
