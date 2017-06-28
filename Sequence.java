import java.util.Scanner;

public class Sequence {
  public static void main (String[] args) {
    if (args.length == 0){
      System.out.println("Please enter sequence of numbers and use space for separation:");
      Scanner numbers = new Scanner(System.in);
      String str = numbers.nextLine();
      String chisla[] = str.split(" "); 
      Test(chisla);
    } else {
        Test(args);
      }
  }
/*
 *This method checks the sequence
 */
  public static void Test (String [] chisla){
    int n = 1;
    for (int i = 1; i < chisla.length; i++) {
      if(Integer.parseInt(chisla[i]) < Integer.parseInt(chisla[i-1])){ 
        n++;
      }
    }
    if (n == chisla.length) {
      System.out.println("Decreasing sequence");
    } else {
        System.out.println("Nondecreasing sequence");
      }
  }
}
