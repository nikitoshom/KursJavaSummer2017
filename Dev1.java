public class Dev1 {
	public static void main(String[] args) {
		int N = 100;
		for(int i = 0; i <= 100; i++) {
			if(i % 3 == 0) {
				System.out.println(i*N);
			}
			else {
				System.out.println(i);			
			}
		}
		
	}
}