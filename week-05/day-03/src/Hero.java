import java.awt.event.KeyEvent;

/**
 * Created by Andi on 4/12/2017.
 */
public class Hero extends GameObject {

  public Hero(int posX, int posY, String costume) {
    super(posX, posY, costume);
  }

  public void moveUp() {
    this.costume.equals("pic/hero-up.png");
    this.posY -= 1;
  }

  public void moveDown() {
    this.costume.equals("pic/hero-down.png");
    this.posY += 1;
  }

  public void moveRight() {
    this.costume.equals("pic/hero-right.png");
    this.posX += 1;
  }

  public void moveLeft() {
    this.costume.equals("pic/hero-right.png");
    this.posX -= 1;
  }
}
