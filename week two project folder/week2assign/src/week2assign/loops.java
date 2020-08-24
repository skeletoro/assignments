package week2assign;

public class loops {

	public static void main(String[] args) {
		int x = 0;  
		while (x < 100) {
			System.out.println(x); // example a
			x +=2;}
		
		int y = 100;             // example b
		while (y >= 0) {
			System.out.println(y);
			y -= 3 ;}

		
		for (int z = 1; z <= 100; z+=2) 
		
		System.out.println(z); //example c
		
		
		for (int k = 0; k <= 100; k++) {      //example d 
		    if (k % 3 == 0 && k % 5 == 0) {
		    System.out.println("hello world"); 	
		    }
			else if (k % 3 == 0) {
				System.out.println("hello"); }
			else if(k % 5 == 0) {System.out.println("world");
			}
		   	else {System.out.println(k);}
			
	
		
	

		
		
		
		
		}	
	}
}
	