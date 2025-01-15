/*public class factorial{
	public static void main(String arge[]){
		int start = 2, sum = 0, pro = 1;
			while (start <= 5){	

											// n             n! 120
					  						//  c     =  -------------
					  						//   r        r! (n-r)!  6  

			pro = pro*start;
			sum += start;
			start++;
			//System.out.println(start);

			//System.out.println(pro);
		}
		System.out.println(start);

	}
}*/



/*public class factorial {
	public static void main(String arge[]){
		int num1 = 5, s1 = 1, k1 = 1, num2 = 3, s2 = 1, k2 = 1;
		
		while(k1 <= num1){
			s1 = s1*k1;
			k1++;
		}
	System.out.println("it is s1 "+s1);

		while(k2 <= num2){
			s2 = s2*k2;
			k2++;
		}
	System.out.println("it is s2 " + s2);
    }
}*/


public class factorial {

    public static void main(String[] args) {
        int num = 18;
        double a = Math.sqrt(num);
        int s = (int)(a);
       // System.out.println(num + " perfect squrt is " + s + " and");

        if(s * s == num){
       	    System.out.println(num + " perfect squrt is " + s + " and");

            System.out.println(num + " is a Perfect square");
        }
        else{

            System.out.println(num + " is not a perfect square");
        }
    }
}