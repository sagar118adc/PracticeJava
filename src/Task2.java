public class Task2 {

  public static void main(String[] args) {

    int rows = 5; // Number of rows in the pattern

    for (int i = rows; i > 0; i--) { // Outer loop for each row
      for (int j = 1; j <= i; j++) { // Inner loop for printing numbers
        System.out.print(j); // Print numbers in the current row
      }
      System.out.println();
    }
  }
}
