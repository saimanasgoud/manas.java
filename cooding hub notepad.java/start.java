/*class Start {
    public static void main(String args[]) {
        int n = 5;        
	int r = 3;
        int factN = 1, factR = 1, factNR = 1;

        for (int i = 1; i <= n; i++) {
            factN *= i;
        }
        System.out.println("Factorial of n (" + n + ") is: " + factN);

        for (int i = 1; i <= r; i++) {
            factR *= i;
        }
        System.out.println("Factorial of r (" + r + ") is: " + factR);

        int dini = n - r;
        for (int i = 1; i <= dini; i++) {
            factNR *= i;
        } 
        System.out.println("Factorial of (n-r) (" + dini + ") is: " + factNR);

        int result = factN / (factR * factNR);
        System.out.println("The result of n! / r!(n-r)! is: " + result);
    }
}*/


		//factorial of 12.........


/*class Start {
    public static void main(String args[]) {
	int num = 12, fact = 1;	// rem = 0, rev = 0, temp = num, count = 0, sum = 0, pro = 1; 
	for(int start = 1; start <= num; start++){
		fact *= start;
		}
		System.out.println(fact);
	}
}*/

		//Hcf....(not cleaar).......

/*class Start {
    public static void main(String args[]) {
	int num = 6,num1 = 12, start = 1, high = 0, temp = num, temp1 = num1, sum = 0, pro = 1; 

	for(; start <= num; start++){

		if(start <= num && start <= num1){

			if(num % start == 0 && num1 % start == 0)
				high = start;
			}
		}
		System.out.println(" Highest common factor between " + temp + " and " + temp1 + " is " + high);

	}
}*/
		//Strong number.............
		
/*class Start {
    public static void main(String args[]) {
	int num = 6, rem = 0, temp = num, end = rem, sum = 0, fact = 1 ;

	for(int start = 1; start <= num; start++){
		rem = num % 10;
		for(; start <= end; start++){
			fact += start;
			num /= 10;
			} 
		//System.out.println(temp + " factors is " + fact);
		sum += fact;
		}
		System.out.println(temp + " factors is " + fact);
		System.out.println("sum of factors is " + sum);

		if(sum == temp)
			System.out.println("number " + temp + " is Strong number");
		else
			System.out.println("number " + temp + " not a Strong number");
		}
	}*/


public class start{
	public static void main(String args[]){
		int num = 17543,  rem = 0, temp = num, end = rem, sum = 0, count = 0 ;
			for(int start = 1; start <= num; start++){
				rem = num % 10; 
				num /= 10;
				count++;
					System.out.println(count);

				/*if(count % 2 == 0)
					System.out.println(count+"even");
				else
					System.out.println(count+"odd");*/
				}
			}
}





























		//sq root...(factors of given num = sum)....

/*class Start {
    public static void main(String args[]) {
	int num = 6, sum = 0, fact = 1;  
	for(int start = 1; start < num; start++){
		
		if(num % start == 0){
			sum += start;
			}
		}
		System.out.println(sum);

		if(sum == num)	
			System.out.println("perfect number");
		else 
			System.out.println("not a perfect number");

	}
}*/
		//reverse of number  EXTRACTION.............	

/*class Start {
    public static void main(String args[]) {
	int num = 12345, rem = 0, rev = 0, temp = num, count = 0, sum = 0, pro = 1; 
	for(;num != 0; num /= 10){
		rem = num % 10;
		sum += rev;
		pro *= rem;
		count++; 
		rev = rev * 10 + rem;
		}
	System.out.println("Given number is " + temp + " and reverse of number is " + rev);
	System.out.println("Given number is " + temp + " and sum of number is " + sum);
	System.out.println("Given number is " + temp + " and product of number is " + pro);
	System.out.println("Given number is " + temp + " and count of number is " + count);
	
	}
}*/

		

/*class Start {
    public static void main(String args[]) {
	int num = 12345, rem = 0, rev = 0, temp = num, count = 0, sum = 0, pro = 1; 
	for(;num != 0; num /= 10){
		rem = num % 10;
		if(rem % 2 == 0){
			sum += rem;
			System.out.println("even digits is " + rem );
			System.out.println("sum of even digits is " + sum );
			}
		else{
			pro *= rem;
			//System.out.println("product of odd digits is " + pro);
			System.out.println("odd digits is " + rem );
			}
		}
		System.out.println("sum of even digits is " + sum );
		System.out.println("product of odd digits is " + pro);
	}
}*/

		//mini = 9		

/*class Start {
    public static void main(String args[]) {
	int num = 345, rem = 0, rev = 0, temp = num, count = 0, mini = 9, pro = 1; 
	for(;num != 0; num /= 10){
		rem = num % 10;
		if(rem < mini){
			mini = rem;
			}
		}
		System.out.println(" The given number is " + temp + " the minimum number is " + mini);

	}
}*/

/*class Start {
    public static void main(String args[]) {
	int num = 345, rem = 0, rev = 0, temp = num, max = 0, mini = 9, pro = 1; 
	for(;num != 0; num /= 10){
		rem = num % 10;
		if(rem > max){
			max = rem;
			}
		}
		//System.out.println(" The given number is " + temp + " the minimum number is " + mini);
		System.out.println(" The given number is " + temp + " the max number is " + max);

	}
}*/


/*class Start {
    public static void main(String args[]) {
	int num = 221, rem = 0, rev = 0, temp = num; 
	for(;num != 0; num /= 10){
		rem = num % 10;
		rev = rev * 10 + rem;
		}
	if(temp == rev)
		System.out.println(temp + " palindrom");
	else
		System.out.println(temp + " not a palindrom");
		}
	}*/
		
		//reverse of num...

/*class Start {
    public static void main(String args[]) {
	int num = 12345, rem = 0, rev = 0, temp = num, count = 0, rev1 = 0, count2 = 0; 
	for(;num != 0; num /= 10){
		rem = num % 10;
		count++; 
		rev = rev * 10 + rem;
		}	
	num = rev;		
	for(;num != 0; num /= 10){
		rem = num % 10;
		rev1 = rev1 * 10 + rem;
		count2++;
		}
	//int zeros = count - count2;
	System.out.println(temp + " reverse is " + rev + " reverse of " + rev + " is given number " + rev1 );
	}	
}*/


// second mini 


/*class Start {
    public static void main(String args[]) {
	int num = 345, rem = 0, rev = 0, temp = num, count = 0, mini = 9, smini = 0; 
	for(;num != 0; num /= 10){
		rem = num % 10; 
		
		if(mini > rem){
			smini = mini;
			mini = rem; 
			}

		else if(smini > rem && rem != mini){
			smini = rem;
			}
		}
		System.out.println("The given number is " + temp + " second smallest digit " + smini);
		System.out.println("The given number is " + temp + " first smallest digit " + mini);

	}
}*/

		//prime num range

/*class Start {
    public static void main(String args[]) {

	for(int x = 1; x <= 50; x++){
	int num = x, rem = 0, rev = 0, temp = num, count = 0; 
	for(int start = 1; start <= num/2; start++){
		if(num % start == 0){
		count++;
		}
	}
			if(count == 1 && num >= 3)
			System.out.println(" The prime numbers are " + x); }
		
	}
}*/
		//patterns...(are done in vs code .patt12)..






































