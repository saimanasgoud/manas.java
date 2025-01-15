import java.util.Scanner;

public class tech{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		
		int rem = 0, temp = num, power = 0;

		for(;num != 0; num /= 10){   

			rem = num % 10;   
				
		}
		
		temp = rem;
		
		for(;num != 0; num /= 10){
			power = (int)Math.sqrt(temp);
			
		}	
		
		if(power == temp)
			System.out.println("Technology number");
		else
			System.out.println("not a tech num");

	}
}
