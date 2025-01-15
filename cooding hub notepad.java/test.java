		//pallindrom...  number is equal when it is reverse for ex(12 and 121)...


/*import java.util.Scanner;

public class test{
	public static void main (String args[]){

		Scanner Sc = new Scanner(System.in);
		System.out.println("enter a number");

		int num = Sc.nextInt();

		int count = 0, rem = 0, rev = 0, temp = num;
		for(;num != 0; num /= 10){
			rem = num % 10;    //2
			rev = rev * 10 + rem;	//0 * 10 + 2
			}// 2
		
		if (temp == rev){
			System.out.println(rev + " is a Palindrom");
		}	
		else{
			System.out.println(rev + " is not a Palindrom");
		}
	}
}*/
		
                              //FABONACCI SERIES.........

/*import java.util.Scanner;

public class test{
	public static void main (String args[]){
		Scanner Sc = new Scanner(System.in);

		System.out.println("FABONACCI SERIES");	

		System.out.print("enter a number A:");
                int a = Sc.nextInt();
	       System.out.print("enter a number B:");
		int b = Sc.nextInt();
		System.out.print("enter a number C:");	
                int c = Sc.nextInt();
		
		int end = 15;
		for(int start = 1; start <= end; start++){
			c = a + b;
			a = b;
			b = c;
		System.out.println("the fabonacci series is "+ c);

		}
		//System.out.println("the fabonacci series is "+ c);
	}
}*/


			//swipping of two numb without using third variable 

		
/*import java.util.Scanner;
	
public class test{
	public static void main (String args[]){
		Scanner mynum = new Scanner(System.in);
		System.out.println("enter a number A");	
		System.out.println("enter a number b");	
		
		int a = mynum.nextInt();
		int b = mynum.nextInt();
		System.out.println("Before swapping " + "a " + " is " + a + " and b is " + b);			

		a += b;
		b = a-b;
		a = a - b;
			
		//System.out.println("Before swapping " + a + "a " + " is " + a + " and b is " + b);	
		System.out.println("After swapping " + "a " + " is " + a + " and b is " + b);	
	}
}*/

		//prime or not..

/*import java.util.Scanner;

public class test{
	public static void main (String args[]){

		//for(int num = 1; num <= 1000; num++){
		
		Scanner mynum = new Scanner(System.in);
		
		System.out.println("enter a number A");	
		
		int num = mynum.nextInt();

		int start = 1, end = 10, count = 0;
		for(;start <= end; start++){
			if(num % start == 0){
				count++;	
			}
		}
		if (count == 1){
			System.out.println(num + " is prime");
		}	
		else{
			System.out.println(num + " is not a prime");            
		}		
	}
}*/

		//largest or smallest number..

      
/*import java.util.Scanner;

public class test{
	public static void main (String args[]){

		Scanner src = new Scanner(System.in);

		System.out.println("enter first number");
		System.out.println("enter second number");
		System.out.println("enter third number");
			
		int num1 = src.nextInt();
		int num2 = src.nextInt();
		int num3 = src.nextInt();
		
		if (num1 > num2 && num1 > num3){
			System.out.println(num1 + " is largest");
		}
		else if (num2 > num3 && num2 > num1){
			System.out.println(num2 + " is largest");
		}
		else if (num3 > num1 && num3 > num2){
			System.out.println(num3 + " is largest");
		}
		else{
			System.out.println("three numbers are same");
		}

		System.out.println((num1 > num2 && num1 > num3) ? num1 + " is largest" : (num2 > num3) ? num2 + " is largest" : (num3 > num1) ? num3 + " is largest" : "three numbers are same");
		
	}
}*/

		//prime range by using NESTED LOOPS...........


/*public class test{
	public static void main(String args[]){
		 
		
		for(int x = 1; x <= 1000; x++){
		
			int num = x, count = 0, start = 0;
		
			for(start = 2; start <= num/2; start ++){
				if (num % start == 0){
					count++;
					//break;
				}
			}
		if(count == 2){
			System.out.println(num + " is a prime number");
		}
		else{
			System.out.println(num + " is not a prime number");
			}
		}
	}
}*/

		//pallindrom by using NESTED LOOPS....

/*public class test{
	public static void main(String args[]){
		
		for(int x = 1; x <= 100; x++){
		 
			int num = x, rev = 0, rem = 0, count = 0, temp = num;
			for(;num != 0; num =num/10){
				rem = num % 10;
				rev = rev *  10 + rem;
			}
			
	if(temp == rev)	
		System.out.println(temp+" is palindrom "+"reverse of number====>"+rev);
	else
		System.out.println(temp+ " is not a palindrom "+"reverse of a  number====>" + rev);
		}
	}
}*/


		//Reversing a table from 1 to 10....


/*public class test{
	public static void main(String args[]){
		for(int x = 1; x <= 5; x++){
		int num = x, pro = 0;
			for(int start = 1; start <= 10; start++){
			//if(start <= end){
				//start--;
				pro = num * start;
				System.out.println(num + " X " + start + " = " + pro);
					}
				System.out.println();
				}
			}
		}*/
		

		//Extraction model in FACTORIL A number is STRONG or NOT...


/*import java.util.Scanner;     


public class test{
public static void main(String args[]){	
	
	Scanner my = new Scanner(System.in);
	System.out.print("Enter the number: ");	
	
	int num = my.nextInt();
	
		int temp = num, sum = 0,rem = 0, rev = 0, fact = 1;

		while(num!=0)//1!=0
		{
                rem = num % 10;

		 for(int start = 1; start <= rem; start++){
			fact *= start;//fact=1
			rev = fact * 10 + rem;
			}
			sum += rev;
			num /= 10;
		}
		System.out.println("Factorial of number " + temp + " is " + fact );
		System.out.println("sum of number " + temp + " is " + sum );

				
		if(temp == sum)
			System.out.println(temp + " strong ");
		else
			System.out.println(temp + " not a strong");

	}
}*/

		//SECOND MAX AND MIN NUMBER 
		//SECOND SMALLEST number...
			
			
			
import java.util.Scanner;         

public class test{
	public static void main(String args[]){	
		Scanner w = new Scanner(System.in);
		System.out.print("Enter the number:");
			
		int num = w.nextInt(); //1234

		int mini = num, smini = 0, rem = 0, tmini = 0 ,temp = num;	

		for(;num != 0; num /= 10){ 
		rem = num % 10;	
			if (mini > rem){  

			smini = mini;
			mini = rem;	
			tmini = smini;
			}
			else if(smini > rem && rem != mini){
				smini = rem;
				tmini = rem;

				}
			}

		System.out.println("The first smallest number in " + temp + " is " + mini);
		System.out.println("The second smallest number in " + temp + " is " + smini);
		System.out.println("The third smallest number in " + temp + " is " + tmini);


	}
}

		//Even number of digits ADD THE FIRST 3 NO THEN ANOTHER 3 NO (678123) ADD 678 WITH 123 ....

	
/*import java.util.Scanner;

public class test{
	public static void main(String args[]){	
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number:");

		int num = s.nextInt();
		int rem = 0, count = 0, sum = 0, power = 0, first = 0, second = 0, temp = num;
		//num = 123/–4
		for (;num != 0;	num /= 10){
			rem = num % 10;
			count++;

			if(count % 2 == 0){
				power = (int)Math.pow(10, count/2);
				first = temp / power;
				second = temp % power;
				sum = first + second;
				}
			}
		System.out.println("Given number/input is " + temp + " \n first half is " + first + " \n second half is " + second + " \n sum of " + temp + " is " + sum);
		}
	}*/



		// EACH AND EVERY DIGIT (PRIME OR NOT).... 


/*import java.util.Scanner;

public class test{
	public static void main(String args[]){	
		Scanner q = new Scanner(System.in);
		System.out.print("Enter a number:");

		int num = q.nextInt();
		int rem = 0;
				
		for(; num != 0 ; num /= 10){
			int count=0;
			rem = num % 10;
			int num1 = rem;

		for(int start = 2; start <= num1/2; start++){
			if(num1 % start == 0){
			count++;
			break;
		       }
      	 	}

		if(count == 0 && num1 >= 2)
			System.out.println(num1 + " prime");
		else
			System.out.println(num1 + " not a prime");
		}
	}	
}*/
