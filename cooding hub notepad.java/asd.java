		//count of numbers with amstrong..

/*public class asd{
	public static void main(String args[]){
	
		int  num = 1293, count = 0, temp = 0, power = 0, rem = 0, sum = 0;
			for (;num != 0; num /= 10){
			rem = num % 10; 
			count++;
			}
		System.out.println("count is " + count);

		num = temp;
		for (;num != 0; num /= 10){
			power = (int) Math.pow(rem, count);
			rem = num % 10;
			sum += power;
			}
		System.out.println("sum is "+sum);
		
		if(temp == sum){
			System.out.println(temp  + " is an " + "amstrong");
		}
		else{
			System.out.println(temp + " is not an " + "amstrong");
		}
	}
}*/
 
                 //palindrom or not
			//unknown


/*public class asd{
	public static void main(String args[]){
		int num = 1634, rem = 0, sum = 0, count = 0, power = 0;
		for(; num != 0; num /= 10){
			rem = num/10;
			count++;	
			power = (int)Math.pow(rem, count);
			sum +=power;
		}
		System.out.println("the sum is : " + sum);
		if(count%2 != 0){
			sum += rem;
			System.out.println("the sum is equals to  : " + sum);
		}
		else{
			System.out.println(" ");
		}
	}
}*/

		//Reversing the no...


/*public class asd{
	public static void main(String args[]){
		int num = 12, count = 0, rem = 0, pev = 0;
		for(;num != 0; num /= 10){
			rem = num % 10;
			pev = pev * 10 + rem;	
		}

		System.out.println(pev);
	}	
}*/


		//check the no is PALINDROM or not....


/*public class asd{
	public static void main(String args[]){
		int num = 138, count = 0, rem = 0, rev = 0, temp = num;
		for(;num != 0; num /= 10){
			rem = nu

m % 10;
			rev = rev * 10 + rem;	
			}
		//System.out.println("The no is " + rev);
		//int temp = num;
		if (temp == rev){
			System.out.println(rev + " is a Palindrom");
		}	
		else{
			System.out.println(rev + " is not a Palindrom");
		}
	}
}*/


		//PALINDROM IS PRIM or NOT...  (IMP)


/*public class asd{
	public static void main(String args[]){
		int num = 7, rem = 0, rev = 0, temp = num;
		for(; num != 0; num /= 10){
			rem = num % 10;
			rev = rev * 10 + rem;
			}
		System.out.println("given number is "+ temp + " reverse is "+rev);
		num = temp;
		int start = 1, count = 0;
		for (; start <= num/2; start++){
			if(num % start == 0){
				//System.out.println("palindrom");
				count++;	
			}
		}
		if(count == 2 && temp == rev){
			System.out.println(temp + " IS A PALINDROM PRIME");
		}
		else{
			System.out.println(temp + " IS NOT A PALINDROM PRIME");
		}
	}
}*/

	
		//sum and count in a given digit/no.......	
		

/*public class asd{
	public static void main(String args[]){
		int num = 135742183, count = 0, rem = 0, sum = 0, temp = num;
		for(;num != 0; num /= 10){
			rem = num % 10;
			count++;
			if(count%2 == 0){
				sum += rem;
			}
		//System.out.println("the sum is " + sum);
		}
		System.out.println("The sum is " + sum);
		System.out.println("The count of " + temp + " is " + count);
	} 
}*/
				
		//Largest number in a given digit/no.......	


/*public class asd{
	public static void main(String args[]){
		int num = 39278572, rem = 0, large = 0, temp = num;
		for(;num != 0; num /= 10){
			rem = num % 10;
			if(rem > large){
			large = rem;
		}
		//System.out.println("The largest digit is " + large);
		}
		System.out.println("The largest digit is of given number " + temp + " is " + large);

	}
}*/



		//smallest no in a given input....	
	

/*public class asd{
	public static void main(String args[]){
		int num = 39278572, rem = 0, mini = 9, temp = num;   // We need to give the mini value is 9.
		for(;num != 0; num /= 10){
			rem = num % 10;
			if(rem < mini){
			mini = rem;
		}
		//System.out.println("The largest digit is " + mini);
		}
		System.out.println("The smallest digit of given number " + temp + " is " + mini);
	}
}*/


		//twin prime or not

/*public class asd{
	public static void main(String args[]){
		int num = 2, num1 = 12, start1 = 1, start2 = 0, count1 = 0, count2 = 0;
		for(;start1 <= num; start1++){
			if(num % start1 == 0)
				count1++;
				}
			if (count1 == 2){
			for(;start2 <= num1; start2++){
				if(num1 % start2 == 0) 
				count2++;
				}
			if(count2 == 2){
				System.out.println(num - num1 == 2 || num1 - num == 2 ? "twin" : "not a twin prime"); }
		}	
	}
}*/				

		//Reverse a number and count the zeros...

/*public class asd{
	public static void main(String args[]){
		int num = 12302900, rev = 0, count1 = 0, count2 = 0, temp = num, rev2 = 0;
		for(; num != 0; num /= 10){
			int rem = num % 10;
			rev = rev * 10 + rem;
			//num /= 10;
			count1++;
		}
		num = rev;
		for(; num != 0; count2++){
			int rem = num % 10;
			rev2 = rev2 * 10 + rem;			
			num /= 10;
			}
		int zeros = count1 - count2;
		rev2 = rev2 * (int) Math.pow(10, zeros);

		//System.out.println("number is " + temp + "\n reverse number is " + rev + "\n reverse of reverse " + rev + " is " + rev2);


		System.out.println("\n number is " + temp + "\n reverse number is " + rev + "\n reverse of  " + rev + " is given number " + rev2);

		//System.out.println("number is " + temp);
		//System.out.println("reverce  is " + rev);
		//System.out.println("reverse of " + rev + " is " + rev2);
	}
}*/


		//GIVEN NUM IS A PRIME OR NOT....

/*public class asd{
	public static void main(String args[]){
		int num = 11, start = 1, count = 0;
		for(;start <= num/2; start++){
		if(num % start == 0){
			count++;
			}
		}
		if (count == 1){
			System.out.println(num + " is a prime number ");
		}
		else{		
			System.out.println(num + " is not a prime number "); 
		}
	}
}*/

		//AMSTRONG prime or not...

public class asd{
	public static void main(String args[]){
	
		//for(int x = 1; x <= 1000; x++){

		int num = 371, count = 0, temp = num, power = 0, rem = 0, sum = 0;
		for (;num != 0; num /= 10){
			rem = num % 10; 
			count++;
			}
		//System.out.println("count is " + count);

		num = temp;
		for (;num != 0; num /= 10){
			power = (int) Math.pow(rem, count);
			rem = num % 10;
			sum += power;
			}
		//System.out.println("sum is "+sum);
		
		/*if(temp == sum){
			System.out.println(temp  + " is an " + "amstrong");
		}
		else{
			System.out.println(temp + " is not an " + "amstrong");
			
			//amstrong - and - amstrong prime
		
		}*/
		if (temp%sum == 0 && temp == sum){
			System.out.println(temp + " is Amstrong prime");
		}	
		else{
			System.out.println(temp + " is not an Amstrong prime");
	}	//}
	}
}



/*public class asd{
	public static void main(String args[]){
	
		int  num = 123, count = 0, temp = num, power = 0, rem =  cz0, sum = 0;
			for (;num != 0; num /= 10){
			rem = num % 10; 
			count++;
			}
		System.out.println("Given number is "+ temp);

		System.out.println("count is " + count);
			System.out.println("updated no is " + num);

			System.out.println("reminder is " + rem);

		num = temp;
		for (;num != 0; num /= 10){
			power = (int) Math.pow(rem, count);
			rem = num % 10;
			sum += power;
			}

		System.out.println("sum is "+sum);
		System.out.println("power is "+power);
		
		if(temp == sum)
			System.out.println(temp  + " is an " + "amstrong");
		
		else
			System.out.println(temp + " is not an " + "amstrong");
		
	}
}*/
	



/*public class asd{
	public static void main(String args[]){

	char let = 'd';

	char result =(char)(let - 32);
	char result1 = (char)(let + 32);

	if (let >= 'a' && let <= 'z')
		System.out.println("The given letter is " + let + " It is converted into " + result);

	else 
		System.out.println("The given letter is " + let + " It is converted into " + result1);
	}
}*/







