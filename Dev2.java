public class Dev2 {
  public static void main(String[] args) {
    int N = 100;
    for(int i = 0; i <= 100; i++) {
      if(i % 3 == 0 && i % 5 == 0) {
        System.out.println("Tutti-Frutti");
      } else {  
          if(i % 3 == 0) {
	    System.out.println("Tutti");
	  } else {
	      if(i % 5 == 0) {
	        System.out.println("Frutti");
              } else {
	          System.out.println(i);			
	        }
            }
       }
    }
  }
}