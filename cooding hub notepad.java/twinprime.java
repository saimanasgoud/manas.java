	//twin prime..........

public class twinprime{
	public static void main(String[] args){
		
	main m = new main();
	
	int num1 = 11, num2 = 17;

	String res1 = m.twin_prime2(num1);
	String res2 = m.twin_prime2(num2);

	System.out.println("result1 is "+ res1);
	System.out.println("result2 is "+ res2);
	System.out.println("The difference of two numbers should be 2");
	
	if(res1 == "prime" && res2 == "prime" && num1 - num2 == 2 || num2 - num1 == 2)
		System.out.println(num1 + " and " + num2 + " are twin primes.");
	else
		System.out.println(num1 + " and " + num2 + " are not twin primes.");

	}
}



class main{
	
	String twin_prime2(int num){
	
	int count = 0;

	for(int start = 2; start <= num/2;start++){
		if(num % start == 0){
			count++;
			break;
		}
	}
	if(count == 0 && num >= 2)
		return num + " prime";
	else
		return num + " not a prime";
	}
}