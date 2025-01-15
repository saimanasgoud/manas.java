		//Extraction of last 2 num and add, middle no pro(*) problem....


public class practise{
	public static void main(String args[]){ //4523, 4328
		int num = 4328, count = 0, sum = 0, rem = 0, pro = 1, sum2 = 0;
		for(;num != 0;)
{
			rem = num%10;//3
			count++; // after the st to increment.

			num = num/10;//452

		if (count == 1 || count == 4){
			sum =sum+rem;//sum=3;
			//System.out.println("sum is " + sum2);  need to write this st after the condition 
		} 	
		else{
			pro *= rem;
			//System.out.println("product is " + sum2); same	
		}
	}
		sum2 = sum + pro;
			System.out.println("sum of all is  " + sum2); 
			System.out.println("product is " + pro);
			System.out.println("sum of first and last no is " + sum);
		
			// to check the number/sum2 (o/p) is prime or not

		if (count == 2)
			System.out.println(sum2 + " is a prime number");
		else
			System.out.println(sum2 + " is not a prime number"); 
	}
}

		//Range of a prime number....

/*public class practise{
	public static void main(String args[]){
		for(int x = 1; x <= 13; x ++){		

		int num = x, count = 0;
		for(int start = 1; start <= num/2; start++){
			if(start%num == 0){
				count++;
				}
			}
			if(count == 0 && num == 2){
				System.out.println(num + " is prime");
				}
			//else
			//	System.out.println(num + " is not a prime");
		}
	}
}
*/



























			





