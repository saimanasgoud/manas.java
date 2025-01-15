	//Amstrong with recurssion.....

public class amstrong{
	public static void main(String[] args){
	
	start sc = new start();
	int num = 7;

	String amst = sc.amstrong(num);
	System.out.println(num + amst + " Number");
	
	sc.amstrongrecurssion(7);

	/*String result = sc.amstrong_prime(num);
	
		
	if(result == "count" && result == "prime" && result == "amstrong"){
		System.out.println(num + " Amstrong prime");
		System.out.println(num + " prime");
	}
	else if(result != "count"){
		System.out.println(num + " not a prime");
		System.out.println(num + " Not an amstrong prime");
	}*/
		
	}
}



class start{

String amstrong(int num){
	int count = 0, rem = 0, temp = num, sum = 0, power = 0, count1 = 0;
	
	for(;num!= 0; num/= 10){
		count++;
		}

	num = temp;
	for(;num!= 0; num/= 10){
		rem = num % 10;
		power = (int)Math.pow(rem, count);
		sum += power;
	}

	if(sum == temp)
		return " Amstrong";
	else
		return " not Amstrong";
	}



void amstrongrecurssion(int num){
	int count = 0, rem = 0, temp = num, sum = 0, power = 0, count1 = 0;
	if(temp == sum){
		System.out.println("amst");
	}
	else{
		if
		for(;num!= 0; num/= 10){
		count++;
		}
	}
	num = temp;
	for(;num!= 0; num/= 10){
		rem = num % 10;
		power = (int)Math.pow(rem, count);
		sum += power;
	amstrongrecurssion(num);
		}
	}
}

/*String amstrong_prime(int num){

	int temp = 0, count = 0, rem = 0;
	int count1 = 0, power = 0, sum = 0, start = 0;

	for(;num != 0; num /= 10){
		count1++;
		}
	num = temp;
		for(;num != 0; num /= 10){
			rem = num % 10;
			power = (int)Math.pow(rem, count);
			sum += power;
		}
	temp = num; 
		for(;start <= num/2; start++){
			if(num % start == 0)
				count++;
			}
	if(count == 2 && temp == sum)
		return temp + " Amstrong prime";
	else
		return temp + " not Amst prime ";
	}
}*/									





































	













