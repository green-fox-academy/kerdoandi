import java.util.ArrayList;

public class Map {

  private ArrayList<ArrayList<Tiles>> map = new ArrayList<>();
  public static int[][] intMap = new int[][]{
          {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
          {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
          {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
          {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
          {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
          {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
          {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
          {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
          {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
          {0, 0, 0, 1, 0, 1, 1, 0, 1, 0},
          {0, 1, 0, 1, 0, 1, 0, 0, 0, 0}
  };

  public Map() {
  }

  public void addMap() {
    for (int i = 0; i < 11; i++) {
      ArrayList<Tiles> lines = new ArrayList<>();
      for (int j = 0; j < 10; j++) {
        if (intMap[i][j] == 0) {
          Tiles floor = new Tiles(j, i, "pic/floor.png");
          lines.add(floor);
        } else {
          Tiles wall = new Tiles(j, i, "pic/wall.png");
          lines.add(wall);
        }
      }
      map.add(lines);
    }
  }

  public ArrayList<ArrayList<Tiles>> getMap() {
    return map;
  }

  public boolean isItWall(int x, int y) {
    return map.get(y).get(x).isWall();
  }
}
