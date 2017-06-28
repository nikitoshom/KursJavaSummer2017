import java.util.Scanner;

public class Fibonacci {
  public static void main (String[] args) {
    System.out.println("Please enter a number:");
    Scanner number = new Scanner(System.in);
    String str= number.next();
    int chislo = Integer.parseInt(str);
    int a = 1, b = 1, c = 1, ii = 0, chislo_proverka = 0, result = 0;
    if (chislo == 0 || chislo == 1 || chislo == -1) {
      System.out.println("It's number of sequence Fibonacci");
    } else {
        if (chislo < 0) {
          chislo_proverka = chislo * (-1);
        } else {
            chislo_proverka = chislo;
          }   
        for (int i = 1; i <= chislo_proverka; i++) {
          b = a;
          a = c;
          c = a + b;
          ii = i;			
          if (c == chislo_proverka) {
            result = 1;
            break;
          }			
        }
        if (result == 1) {
          if (chislo == chislo_proverka * Math.pow((-1), (ii+2+1)) && chislo < 0) {
            System.out.println("It's a negative number of sequence Fibonacci");
          } else {
              System.out.println("It isn't number of sequence Fibonacci");
            }
          if (chislo > 0) {
            System.out.println("It's number of sequence Fibonacci");
          }
        } else {
            System.out.println("It isn't number of sequence Fibonacci");
          }
      }		
  }
}
