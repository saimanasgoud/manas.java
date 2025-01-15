public class sqrd{
	public static void main(String args[]){
		
	alive al = new alive();

	al.fatorialWithRecurssion(5, 1, 1);

	al.numbers(3);
	System.out.println();
	al.numberWithRecurssion(3);
	System.out.println();

	al.fabinocci(0, 1, 0);
	System.out.println("__________________");
	al.fabinocciWithrecursion(0, 1, 0, 1, 10);

	}
}

class alive{
	
void fatorialWithRecurssion(int num, int fact, int start){
	if(start == num + 1){
		System.out.println(fact);
	}
	else{
		fact *= start;
		fatorialWithRecurssion(num, fact, start+1);
		}
	}


void numbers(int num){
	
	for(; num != 1;){
		if(num % 2 == 0)
			num /= 2;
		else
			num = 3 * num + 1;

		System.out.print(num + " ");
 
		}
	}

void numberWithRecurssion(int num){
	
	if(num == 1){

	}
	else{
		if(num % 2 == 0)
			num /= 2;
		else
			num = 3 * num + 1;
			
		//System.out.print(num + " ");

		numberWithRecurssion(num);
		System.out.print(num + " ");
	
		}
	}

void fabinocci(int a, int b, int c){
	System.out.println("__________________");

	int start = 1, end = 10; 
	for(; start <= end; start++){

		c = a + b;
		a = b;
		b = c;
	
	System.out.println(c);
		}
	}

void fabinocciWithrecursion(int a, int b, int c, int start, int num){
	
	if(start == num + 1){
	}
	else{
		c = a + b;
		a = b;
		b = c;
		System.out.println(c);

	fabinocciWithrecursion(a, b, c, start + 1, num);
		}
	}





