/**
 * Created by Andi on 2017. 03. 23..
 */
public class ToDoPrint {

    public static void main(String[] args) {
      String todoText = " - Buy milk\n";

      System.out.println(todoText = "My todo:\n".concat(todoText).concat(" - Download games\n").concat("\t- Diablo\n"));

    }
}

// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention
//
// Expected outpt:
//
// My todo:
//  - Buy milk
//  - Download games
//      - Diablo
