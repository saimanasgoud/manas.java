public class factrosrecursion{
	public static void main(String args[]){
		
		fact rial = new fact();
		rial.factorsnumber(5);
		
		rial.recursionFactors(4, 1, 1);
		rial.fact(5);
		}
	}

class fact{
	
	void factorsnumber(int num){
		int pro = 1;
		for(int start = 1; start <= num; start++){
			pro *= start;
		}
	System.out.println("factorial of " + num + " is " + pro);
	}
	
	void recursionFactors(int num, int start, int pro){
		
		if(start == num + 1)
			System.out.println("factorial of " + num + " is " + pro);

		else{
			pro *= start;
			recursionFactors(num, start+1, pro);
		}			
	}

void fact(int num){
	
	
	System.out.println("factors of " + num + " is " + count);
	}
}
