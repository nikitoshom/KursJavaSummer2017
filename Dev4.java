import java.util.Scanner;

public class Dev4 {
  public static void main (String[] args) throws Exception {
    System.out.println("Please enter sequence of numbers and use space for separation:");
    Scanner numbers = new Scanner(System.in);
    String str = numbers.nextLine();
    String chisla[] = str.split(" "); 
    int n = 1;
    for (int i = 1; i < chisla.length; i++) {
      if(Integer.parseInt(chisla[i]) < Integer.parseInt(chisla[i-1])){ 
        n++;
      }
    }
    if (n == chisla.length) {
      System.out.println("ubivauzhay");
    } else {
        System.out.println("neubivauzhay");
      }
  }
}