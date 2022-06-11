package week1.day1.assignments;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int input = 22;
		boolean remainderflag = false;
		 
	  for (int i = 2;i<(input/2);i++) {
		  int d = input%i;
		    if (d==0) {
		remainderflag = true; 
		  		  }}
		 if (remainderflag==true)
		  		  {
			  System.out.println("given input is not a Prime number");
		  }
			  else
			  {
				  
				  System.out.println("given input is a prime number");
			  }
		  
		 
	  }
	}