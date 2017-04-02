import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andi on 2017. 04. 02..
 */
public class Tree {
  public static void main(String[] args) {
    ArrayList<String> firstTreeVariables = new ArrayList<>();
    ArrayList<String> secondTreeVariables = new ArrayList<>();
    ArrayList<String> thirdTreeVariables = new ArrayList<>();
    ArrayList<String> fourthTreeVariables = new ArrayList<>();
    ArrayList<String> fifthTreeVariables = new ArrayList<>();

    int treeTypeIndex = 0;
    int leafColorIndex = 1;
    int ageIndex = 2;
    int sexIndex = 3;

    firstTreeVariables.add(treeTypeIndex, "apple");
    firstTreeVariables.add(leafColorIndex, "green");
    firstTreeVariables.add(ageIndex, "16");
    firstTreeVariables.add(sexIndex, "female");

    secondTreeVariables.add(treeTypeIndex, "cherry");
    secondTreeVariables.add(leafColorIndex, "green");
    secondTreeVariables.add(ageIndex, "10");
    secondTreeVariables.add(sexIndex, "female");

    thirdTreeVariables.add(treeTypeIndex, "almond");
    thirdTreeVariables.add(leafColorIndex, "green");
    thirdTreeVariables.add(ageIndex, "5");
    thirdTreeVariables.add(sexIndex, "male");

    fourthTreeVariables.add(treeTypeIndex, "oak");
    fourthTreeVariables.add(leafColorIndex, "green");
    fourthTreeVariables.add(ageIndex, "38");
    fourthTreeVariables.add(sexIndex, "male");

    fifthTreeVariables.add(treeTypeIndex, "plum");
    fifthTreeVariables.add(leafColorIndex, "green");
    fifthTreeVariables.add(ageIndex, "20");
    fifthTreeVariables.add(sexIndex, "male");

  }
}