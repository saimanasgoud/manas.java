		//recurssion of pallindrom

public class pallidrominrecurssion{
	public static void main(String[] args){
		
		dromic dr = new dromic();
		dr.pallindrom(12);
		
		dr.pallidrominrecurssion(121);

	}
}














class dromic{
		
void pallindrom(int num){
	int rem = 0, rev = 0, count = 0, temp = num;
	for(;num != 0; num /= 10){
		rem = num % 10;
		rev = rev * 10 + rem;
		count++;
	}
	if(temp == rev)
		System.out.println(temp + " pallindrom");
	else
		System.out.println(temp + " not a pallindrom");		
	}


void pallindromWithRecursion(int num){

	int rev = 0;
	if(temp == rev)
		System.out.println(temp + " pallindrom");
	else{
		for(;num != 0; num /= 10){
		rem = num % 10;
		rev = rev * 10 + rem;
		count++;
		pallindromWithRecursion(int num);
		}
	}
}





