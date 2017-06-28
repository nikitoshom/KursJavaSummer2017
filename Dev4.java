import java.io.*;
import java.util.Scanner;
public class Dev4 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
		System.out.println("Vvedite 5 chisel: ");
		int[] chisla = new int [5];
		int i = 0, n = 1;
		while (i < 5){
    			String stroka = reader.readLine();
			chisla[i] = Integer.parseInt(stroka);
			i++;
		}
		for (i = 1; i < 5; i++) {
			if(chisla[i] < chisla[i-1]){ 
				n++;
			}
		}
		if (n == chisla.length) {
			System.out.println("ubivauzhay");
		}
		else {
			System.out.println("neubivauzhay");
		}
	}
}