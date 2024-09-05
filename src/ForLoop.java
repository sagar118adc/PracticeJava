public class ForLoop {
  public static void main(String[] args) {
    String name = "mahabubnagar";

    // indexOf
    System.out.println(name.indexOf('a'));

    System.out.println(name.lastIndexOf('a'));

    System.out.println(name.length());

    for(int i=0; i<=4 ; i=i+2) {
      System.out.println(name.charAt(i));
    }

 // i=6; i< 12; i++
    for(int i=0; i < name.length(); i++) {
      System.out.println(name.charAt(i));
    }

    System.out.println(name.indexOf('u'));
  }
}
