public class twistedprime{
	public static void main(String[] args){
		
		second sd = new second();
		
		int num = 13;
		String src = sd.twisted_prime1(num);

		
		System.out.println(src);
		

		
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
		if(num % start == 0){
			count1++;
		}

	}
	if(count == 2 && count1 == 1)
		return temp + " twisted prime";
	else
		return temp + " not a twisted prime";

	}

}





































































