public class sixth{
	public static void main(String[] args){
	

	char let = 'q';
	    char result = (let >='A' && let <= 'Z') ? (char)(let+32) : (char)(let-32);
		System.out.println(result);

	char letter = 'K';
	char let = (char)(letter+32);
	char let3 = (char)(letter-32);
	if(letter >= 'A' && letter <= 'Z'){
		System.out.println(let);
	}
	else if(letter >= 'a' && letter <= 'z'){
		System.out.println(let3);
	}

	}
}