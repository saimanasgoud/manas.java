public class twistedprime{
	public static void main(String[] args){
		
		second sd = new second();
		sd.factors(5);
		sd.factorsRecursion(12, 0);

		/*int num = 13;
		String src = sd.twisted_prime1(num);
		System.out.println(src);*/
			
	}

}







 


class second{

	String twisted_prime1(int num){
	int count = 0, rev = 0, rem = 0, temp = num, count1 = 0;
		for(int start = 1; start <= num; start++){
			if(num % start == 0)
			count++;
		}
		
	for(;num != 0; num /= 10){
		rem = num % 10; 
		rev = rev * 10 + rem;
	}
	num = rev;
	for(int start = 1; start <= num/2; start++){
		if(num % start == 0)
			count1++;
		}
	if(count == 2 && count1 == 1)
		return temp + " twisted prime";
	else
		return temp + " not a twisted prime";
	}


void factors(int num){
	int sum = 0, temp = num, pro = 0, rem = 0;
	for(;num != 0; num /= 10){
		rem = num % 10;
		pro *= rem;
		}
	System.out.println("Factors of " + temp + " is " + pro);
	}


void factorsRecursion(int num, int sum){
	int temp = num, rem = 0;
	
	if(num == 0)
	System.out.println("Factors of " + temp + " is " + rem);
	else{
		rem = num % 10;
		sum += rem;
		factorsRecursion(num /= 10, num);
		}
	}
}




























































