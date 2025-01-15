public class second{
	public static void main(String [] args){

		int sub1 = 60, sub2 = 15, sub3 = 15, sub4 = 25, sub5 = 60, sub6 = 20;

		int marks = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;

		int total = 200;

		double percentage = ((double)marks/total) * 100;
 
		if(percentage > 90){
			System.out.println("Your percentage is " + percentage + " outstanding - O");
		}
		else if(percentage > 70){
			System.out.println("Your percentage is " + percentage + " good - G");
		}
		else if(percentage >= 50){
			System.out.println("Your percentage is " + percentage + " avarage - A");
		}
		else if(percentage >= 30){
			System.out.println("Your percentage is " + percentage + " avarage - A");
		}
		else{
			System.out.println("fail");

		}
	}
}