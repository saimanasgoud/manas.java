		//Twisted prime or not......

import java.util.Scanner;

public class zxc{
	public static void main(String args[]){
		//for(int num = 1; num <= 50; num++){

		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER NUMBER: ");
		int num = sc.nextInt();
  		
		int start = 1, count = 0, rem = 0, rev = 0, temp = num, count1 = 0;
		for(;start <= num; start++){
			if(num % start == 0)
				count++;
			}
		//System.out.println(count);    only for prime no
		
		//if (count == 1)
		//	System.out.println(num + "prime");
		//else
		//	System.out.println(num + "is not prime");
		

		num = temp;    //number is reverse
		for(;num != 0; num /= 10){
			rem = num % 10; 
			rev = rev * 10 + rem;
		}
		//System.out.println(rev);
		
		num = rev;     
		for(start = 1; start <= num; start++){
			if(num % start == 0){
				count1++;
			}
		}	
		if(count == 2 && count1 == 2){
			System.out.println(temp + " is twisted prime");
		}	
		else{
			System.out.println(temp + " is not a twisted prime");
		}	
	}	
}





















		//Twisted prime or not......

/*import java.util.Scanner;

public class zxc{
	public static void main(String args[]){
		//for(int num = 1; num <= 50; num++)

		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER STARTING NUMBER: ");
		int num = sc.nextInt();

		System.out.print("ENTER ENDING NUMBER: ");
		int end = sc.nextInt();
		
		int start = 1, count = 0, rem = 0, rev = 0, temp = num, count1 = 0;
		for(;start <= num; start++){
			if(num % start == 0)
				count++;
			}
		//System.out.println(count);    only for prime no
		
		//if (count == 1)
		//	System.out.println(num + "prime");
		//else
		//	System.out.println(num + "is not prime");
		

		num = temp;    //number is reverse
		for(;num != 0; num /= 10){
			rem = num % 10;
			rev = rev * 10 + rem;
		}
		//System.out.println(rev);
		
		num = rev;   
		for(start = 1; start <= num; start++){
			if(num % start == 0){
				count1++;
			}
		}	
		if(count == 2 && count1 == 2){
			System.out.println(temp + " is twisted prime");
		}	
		else{
			System.out.println(temp + " is not a twisted prime");
		}	
	}	
}*/














