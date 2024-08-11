package udemy;

public class DesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//first one
		for(int i=1;i<=5;i++) {
		  for(int j=1;j<=i;j++) {
			  
			  
			 System.out.print("* ");
			 
		  }
		  System.out.println();
		}

		//second one
		int k=1;
		for(int i=1;i<=5;i++) {
			  for(int j=1;j<=k;j++) {
				  
				  
				 System.out.print("* ");
				 
			  }
			  k=k+2;
			  System.out.println();
			}
		
	//Third one
		int rows =5;
		// loop to iterate for the given number of rows 
        for (int i = 1; i <= rows; i++) { 
  
            // loop to print the number of spaces before the star 
            for (int j = rows; j >= i; j--) { 
                System.out.print(" "); 
            } 
  
            // loop to print the number of stars in each row 
            for (int j = 1; j <= i; j++) { 
                System.out.print("* "); 
            } 
  
            // for new line after printing each row 
            System.out.println(); 
        }
	
	}

}
