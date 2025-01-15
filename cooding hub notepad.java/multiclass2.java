	//Amstrong

public class amstrong{
	public static void main(String[] args){
	
	start sc = new start();
	int num = 371;
	//String amst = sc.amstrong(num);
	//System.out.println(amst);
	
	String result = sc.amstrong(num);
	if(result == "prime")
		System.out.println(num + " Amstrong prime");
	else
		System.out.println(num + " Not an amstrong prime");
	}
}



class start{

String amstrong(int num){
	int count = 0, rem = 0, temp = num, sum = 0, power = 0, count1 = 0;
	
	for(;num!= 0; num/= 10){
		rem = num % 10;
		count++;
		}

	num = temp;
	for(;num!= 0; num/= 10){
		rem = num % 10;
		power = (int)Math.pow(rem, count);
		sum += power;
	}

	if(temp == sum)
		return "Amstrong";
	else
		return " not Amstrong";
	}


String Amstrong_prime(int num){
	int temp = 0, count = 0,

	for(int start = 0; start <= num; start++){
		if(num % start == 0)
			count++;
		}
	temp = num;
		for(num != 0; num /= 10){
				





































	













