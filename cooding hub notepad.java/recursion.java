public class recursion{
	public static void main(String[] args){
		
		first st = new first();
		st.natural_sum(10, 0, 0);
		
		st.WithrecursionSum(10,0,0);
		
		
	}

}


class first{
	
void natural_sum(int num, int start, int sum){
		
	for(start = 1; start <= num; start++){
		sum += start;
		}
	System.out.println("sum of first " + num + " Natural number is " + sum);
	}


void WithrecursionSum(int num, int start, int sum){
			
	if(start == num + 1){
		System.out.println("sum of first " + num + " Natural number is " + sum);
	} 
	else{	
		sum += start;
		WithrecursionSum(num, start + 1, sum);
		}
	}
}







































































