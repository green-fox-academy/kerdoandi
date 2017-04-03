import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andi on 4/3/2017.
 */
public class SharpieSet {
  List<Sharpie> sharpieList = new ArrayList<>();

  public void addSharpie(Sharpie sharpie) {
    sharpieList.add(sharpie);
  }

  public int countUsable() {
    int counter = 0;
    for (int i = 0; i < sharpieList.size(); i++) {
      if (sharpieList.get(i).inkAmount > 0) {
        counter++;
      }
    }
    return counter;
  }

  public void removeTrash(){
    List<Sharpie> trashSharpie = new ArrayList<>();
    for (int i = 0; i < sharpieList.size(); i++) {
      if (sharpieList.get(i).inkAmount < 1) {
        trashSharpie.add(sharpieList.get(i));
      }
    }
    sharpieList.removeAll(trashSharpie);
  }
}

