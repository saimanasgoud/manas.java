			//fabinocii series by using three numbers(var)

/*public class qwer{
	public static void main(String args[]){
		int a = 0, b = 1, c =2, d = 0, end = 15;
		//while(start <= end-3){
		for(int start = 1; start <= end-3; start++){

			d = a+b+c;
			a = b;
			b = c;
			c = d;
			//start++;
			System.out.println("the fabinocii series is "+ a);
		}
		//start++;
	}
}*/


			//Reversing the number problems...... 

/*public class qwer{
	public static void main(String args[]){
		int num = 89670, rem = 0;
		while(num != 0){
			rem = num%10;
			System.out.println(rem);
			num = num/10;
		}
	}
}*/

			//Extraction problems sum(+)...... 
	

/*public class qwer{
	public static void main(String args[]){
		int num = 89670, rem = 0, sum = 0, temp = num;
		while(num != 0){
			rem = num%10;
			sum += rem;
			System.out.println(rem);
			num = num/10;
		}
		System.out.println("The sum of " + temp + " is " + sum);

	}
}*/

                	//Extraction problems power(imp)(^)...... 


/*public class qwer{
	public static void main(String args[]){
		int num = 89670, rem = 0, sum = 0, temp = num, power = 0;
		while (num != 0){
			rem = num%10;
			power =(int) Math.pow(rem, 3);
			System.out.println(rem);
			num = num/10;
		}
		System.out.println(power);
	}
}*/

                	//Amstrong problems power(imp)(^)...... 


/*public class qwer{
	public static void main(String args[]){
		int num = 1634, rem = 0, sum = 0, temp = num, power = 0;
		while (num != 0){
			rem = num%10;    //153/10 = 15
			power =(int) Math.pow(rem, 4);
			sum += power;
			num = num/10;
			}
		System.out.println("sum of "+ temp + " is " + sum);

		System.out.println("power of "+ temp + " is " + power);
		System.out.println(temp == sum? temp + " is an amstrong" : temp + " is not an amstrong");
	}
}*/


 			//find the no of digits in given input....

/*public class qwer{
	public static void main(String args[]){
		int num = 3490567893, temp = num, count = 0, rem = 0;
		while(num !=0){
			rem = num%10;
			System.out.println(rem);
			num = num/10;
			count++;
		}
		System.out.println("number of digites in " + temp + " is " + count);
	}
}*/



/*public class qwer{
	public static void main(String args[]){
		
	for (int i = 1; i <= 5; i++) {
            if (i == 5) {
                continue; // Skip the rest of the loop body when i == 3
	      //System.out.println("Value: " + i);
	      //break;
            	}
            System.out.println("Value: " + i);
		}
	}
}*/

 		//amstrong


public class qwer{
	public static void main(String args[]){
		for(int x = 1; x <= 1000; x++){
		int num = x, rem = 0, count = 0, temp = num, power = 0;
			for(;num != 0; num /= 10){
				//rem = num % 10;
				count++;
			
				}
			//System.out.println(rem +" is reminder ");
			//System.out.println(count +" is count ");


			num = temp;
			int sum = 0;
			for(;num != 0; num /= 10){
				rem = num % 10;
				power = (int)Math.pow(rem, count);
				sum += power;
				}
			//System.out.println(rem +" is reminder ");
			
		//System.out.println(count +" is count ");
		if(sum == temp)
			System.out.println(temp +" is amstrong ");
		//else
		//	System.out.println(temp +" is not an amstron");
		}
	}
}


