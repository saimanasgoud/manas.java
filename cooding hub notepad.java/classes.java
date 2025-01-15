/*public class classes
{
	public static void main(String args[])
	{
	
		int num = 4;
		while(num == num && num != 1)
		{
			if(num%2 == 0)
			{
				num = num/2;
				System.out.println(num);
			}
			else{
				num = 3 * num + 1;
				System.out.println(num);
			}
		}
		
	}
}*/




/*public class classes{
	public static void main(String args[]){
		
		int num = 12, start = 1, store = 0;
		while(start <=num/2){                            //while(start <= num){
			store = start;
			if(num%start == 0){
			//System.out.println(store);
			}
		start++;
		//System.out.println(store);ew
		}
	System.out.println(store);      //out side the while loop

	}
}*/

                             //HCF PROBLEM  MINIMUM....

public class classes{
	public static void main(String args[]){

		int num = 12, num1 = 23, start = 1, store = 0;
		while(start <= num && start <=num1){
			if(num%start == 0 && num1%start == 0){
				store = start*num;
				//store = start;
				System.out.println(store);
			}
		start++;
		}
		//System.out.println(store);

	}
}

			//print power of num without using(Math.pow())

/*public class classes
{
	public static void main(String args[])
	{
                      int num1 = 3 , num2 = 7 , res = 1;
		      for(int start= 1; start<=num2; start++)
		      {
			res = start*num2;
		       }
                   System.out.println(res);
	}
}*/



                              //FABONACCI SERIES.........



/*public class classes
{
	public static void main(String args[])
	{
		int a = 0, b = 1, c = 0, end = 10, start = 1;
		System.out.println(a);
		System.out.println(b);

			while(start <= end)
			{
				c = a + b;
				a = b;          // b value is stored in A
				b = c; 		// c value is stored in B
			System.out.println(c);
			start++;
			}
		//start++;
		//System.out.println(c);
		
	}
}*/

			//REVERSING THE NUMBER 20-11 && 1 - 10                   

/*public class classes
{
	public static void main(String args[])
	{
		int num = 30, start = 1;// end = 1; //num2 = 0;
		int num1=num/2;
		while(num >= start)
		{
			if(num > num1)
			{
				System.out.println(num);
				num--;
			}
			else
			{
				System.out.println(start);
				start++;
			}
			//start--;
		}

	}
}*/









