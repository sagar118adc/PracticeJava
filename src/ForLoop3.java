public class ForLoop3 {

  public static void main(String[] args) {
    int k =1;
    for (int i=1; i<=5; i++) {
//      System.out.println("i = "+ i +", "+ i + "<= 5");
      for (int j=1; j<=i; j++) {
//        System.out.println("j = "+ j +", "+ j + "<=" + i);
//        System.out.println("k = "+ k);
        System.out.print(k++);
//        System.out.println();
      }
      System.out.println();
    }
  }
}
