package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int firstNum = 0; 
		int secNum = 1;
		int range = 8;
								
		System.out.println(firstNum);
			
		for (int i = 1; i<=(range); i++) {
	
		int sum = firstNum + secNum;   				
		firstNum = secNum;    
		secNum = sum;              
		
	System.out.println(sum);
		}
	}	
}

//the output here misses the 1 in the second place and also goes till 34//