import java.util.Scanner;

/*public class test2{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		
		int sq = num * num, sum = 1, rem = 0;
			
		for(;sq != 0; sq /= 10){
			rem = num % 10;
			sum *= num;
		}
		if(num == sum)
		System.out.println(sum+ " evil number");
		else
		System.out.println(sum+ " not an evil number");

	}
}*/



/*public class test2{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = sc.nextInt();

		int sum = 0, pro = 0, rem = 0;
	
		for(;num != 0; num /= 10){
			
			rem = num % 10;

			sum += num;
			pro *= num;
		}
		if(sum == pro)
			System.out.println("Power number");
		else 
			System.out.println("not a power");

	}
}*/
		//done

/*public class test2{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		
		int power = 0, rem = 0, count = 0;
		int sq = num * num;
		int temp = sq;

		for(; num!= 0; num /= 10){
			rem = num % 10;
    			count++;
			}
	
		for(;sq != 0; sq /= 10){
			power = (int)Math.pow(10, count);
			}

		if(sq % power == num)
			System.out.println("Automatic number");
		else
			System.out.println("not an automatic number");
		}
	}*/


		//Technology number 2025

/*public class test2{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		
		int rem = 0, rev = 0, temp = num;

		for(;num != 0; num /= 10){

			rem = num * 10;
			rev = rev * 10 + rem;
				
		}
		
		temp = rem;
		
		for(){
			power = (int)Math.sqrt(temp);
			
		}	
		
		if(power == temp)
			Sys("Technology number");
		else
			sys("not a tech num");

	}
}*/



/*public class test2{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		
		
		if(num == 7){
			System.out.println(num + " The number is bussy number");
		}
		else if(num % 7 == 0){
				System.out.println(num + " The number is bussy number");
			}
		else{
			System.out.println(num + " The number is not a bussy number");
			}
		}
	}*/


//Amstrong

/*public class test2{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

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
			System.out.println(temp + " Amstrong");
		else
			System.out.println(temp + " not an Amstrong");
		}
	}*/



/*public class test2{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int mini = 0, max = 0, temp = num, rem = 0;

		for(;num != 0; num /= 10){
			rem = num % 10;
			}
			if(mini > rem){
				mini = rem;
				max = mini;
			}
		if(mini >= rem)
			System.out.println(temp + "second largest number is" + max);
		}
	}*/


		//**

/*public class test2{
	public static void main(String args[]){
		
		int rows = 4;
		
		for(int r = 1; r<= rows; r++){
			
			for(int c = 1; c <= rows; c++){
				
				if(c == 1 || r == rows || c == r ){
					System.out.print("# ");}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}
}*/
	

/*public class test2 {
    public static void main(String args[]) {

        int rows = 5;

        for (int r = 1; r <= rows; r++) {
            int num = r;

            for (int c = 1; c <= rows; c++) {

                if (c < r) {
                    System.out.print(" "); 
                } else {
                    System.out.print(num++); 
                }
            }
            System.out.println();
        }
    }
}*/


/*public class test2 {
    public static void main(String args[]) {
	for (int x = 1; x <= 10; x++){
		long fact = 1, num = x;
			for(int start = 1; start <= num; start++){
				fact *= start;
				}
			System.out.println(num + "factorial is " + fact);
			}
		}
	}*/


