public class multiclass{
	public static void main(String args[]){

		second sc = new second();
		sc.odd();		

		//sc.prime(); works only for void methord

		/*String op = sc.prime();
		System.out.println(op);

		String pal = sc.pallindrom();
		System.out.println(pal);
		
		String amst = sc.amstrong();
		System.out.println(amst);

		char let = sc.letter();
		System.out.println(let);

		String twpm = sc.twin_prime(12);
		System.out.println(twpm);

		String per_num= sc.perfect_number(6);
		System.out.println(per_num);*/
		
	}
}

class second{
	
void odd(){
	int num1 = 12, num2 = 31;

	if(num1%2 == 0)	
		System.out.println(num1 +" is even");
	else
		System.out.println(num2 +" is odd");
	}


String prime(){
	
	int num = 11, start = 1, count = 0, temp = num;
		
	for(;start <= num/2; start++){
		if(num % start == 0)
			count++;
	}
        if(count == 1)
		return temp + " prime";
      	else
		return temp + " not a prime";
	
}


String pallindrom(){
	
	int num = 123, start = 0, rem = 0, rev = 0, temp = num;
	
	for(;num != 0; num /= 10){
		rem = num % 10;
		rev = rev * 10 + rem;
	}
		if(temp == rev)
			return  temp + " is a pallindrom";
		else
		     return    temp + " is not a pallindrom";
}
	


String amstrong(){
	
	int num = 605, count = 0, temp = num, rem = 0;
		for(;num != 0; num /= 10){
			rem = num % 10;
			count++;	
		}
		num = temp;
		int sum = 0, power = 0;
			for(;num != 0; num /= 10){
				power = (int) Math.pow(rem, count);
				rem = num % 10;
				sum += power;
			}
		if(temp == sum)
			return temp + " is an amstrong number";
		else
			return temp + " is not an amstrong number";	
	}


char letter(){

	char let = 'A';

	char result =(char)(let - 32);
	char result1 = (char)(let + 32);

	if (let >= 'a' && let <= 'z')
		return result;

	else 
		return result1;
	}


String twin_prime(int num){
	
	int count = 0;
	for(int start = 1; start <= num; start++){
		if(num % start == 0)
			count++;
		}
		
		if(count == 1)
			return num + "prime";
		else
			return num + " not a prime";
		
	}



String perfect_number(int num){
	
	int sum = 0, temp = num;
	for(int start = 1; start <= num/2; start++){
		if(num % start == 0)
			sum += start;
		}
	if(sum == num && num != 0)
		return temp + " Perfect number";
	else
		return temp + " Not a perfect number";
	}
}



























