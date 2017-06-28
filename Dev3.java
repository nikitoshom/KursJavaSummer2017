import java.io.*;
import java.util.Scanner;
public class Dev3 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
		System.out.println("Vvedite chislo: ");
    		String stroka = reader.readLine();
    		int chislo = Integer.parseInt(stroka);
		int a = 1, b = 1, c = 1, ii = 0, chislo_pro = 0, result = 0;
		if (chislo == 0 || chislo == 1 || chislo == -1) {
			System.out.println("eto chislo Fibonachchi");
		}
		else {
			if (chislo < 0) {
				chislo_pro = chislo * (-1);
			}
			else{
				chislo_pro = chislo;
			}
			for (int i = 1; i <= chislo_pro; i++) {
				b = a;
				a = c;
				c = a + b;
				ii = i;			
				if (c == chislo_pro) {
					result = 1;
					break;
				}			
			}
			//System.out.println(ii+2);
			if (result == 1) {
				if (chislo == chislo_pro * Math.pow((-1), (ii+2+1)) && chislo < 0) {
					System.out.println("eto otrizhatelnoe chislo Fibonachchi");
				}
				else {
					System.out.println("eto NE chislo Fibonachchi");
				}
				if (chislo > 0) {
					System.out.println("eto chislo Fibonachchi");
				}
			}
			else{
				System.out.println("eto NE chislo Fibonachchi");
			}
		}
		
	}
}