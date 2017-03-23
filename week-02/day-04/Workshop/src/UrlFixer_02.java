/**
 * Created by Andi on 2017. 03. 23..
 */
public class UrlFixer_02 {
  public static void main(String... args){
    String url = "https//www.reddit.com/r/nevertellmethebots";

    url = url.replace("bots", "odds");

    String url1 = url.substring(0, 5);
    String url2 = url.substring(5);

    url1 = url1.concat(":");
    url1 = url1.concat(url2);

    System.out.println(url1);

  }
}
// Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
// Also, the URL is missing a crutial component, find out what it is and insert it too!
// Try to solve it more than once using different String functions!