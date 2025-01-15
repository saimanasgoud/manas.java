		//year problem.

public class four{
	public static void main(String [] args){			
		int year = 2030;
		
		if((year%4 == 0 && year!= 100 )|| year%400 == 0){    // this formula  is imp
			System.out.println("leap year");   
		}
		else{
			System.out.println("not a leap yer");
		}
	}
}