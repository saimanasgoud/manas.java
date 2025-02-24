//print starting letter 

class str{
	public static void main(String args[]){
		
	String s = "vital information required under sizes";
	String a[] = s.split(" ");
	String res = "";
	for(int x = 0; x < a.length; x++){	
		String s2 = a[x];
		int count = 0;

		for(int y = 0; y < s2.length(); y++){
			char c = s2.charAt(y);
                        char ch=(char)(c-32);
			res += ch;
			//count++;
			break;
			}
		}	
	
	System.out.println(res);
		
	}
}*/

//print inverse of odd string

class str{
	public static void main(String args[]){
		
	String s = "Hello all Good Morning";
		//Hello llA Good gninroM.
	String s1[] = s.split(" ");
	String res = "", rev = "";
	for(int x = 0; x < s1.length; x++){
			
		}
	}
}*/

//dublicant elements of the array...

class str{
	public static void main(String args[]){
		
	String s = "Hello all Good Morning";
	String s1 = "";
	s = s.toUpperCase();
	for(int x = 0; x < s.length(); x++){
		char c = s.charAt(x);
		if(s.indexOf(c) != s.lastIndexOf(c)){
			
			if(s1.indexOf(c) == -1){
				s1 = s1 + c;
				}
			}
		}
	System.out.println(s1);
	}
}*/

class str{
	public static void main(String args[]){
		
	String s = "abc";
	String s1 = "";
	
	for(int x = 0; x < s.length(); x++){
		for(int y = x + 1; y <= s.length(); y++){
			System.out.println(s.substring(x, y));
			}
		}
	}
}


//how many char in the string...

class str{
	public static void main(String args[]){
		
	String s = "hello all good morning";
	String s1[] = s.split(" ");
	
	for(int x = 0; x < s1.length; x++){

		System.out.println(s1[x] + " " + s1[x].length());
		}
	}
}*/

//Higest repeated char (dublicant..)in the string...

class str{
	public static void main(String args[]){
		
	String s = "hello all good morning";
	String s1 = "";
	int count = 0;
	for(int x = 0; x < s.length(); x++){
		char c = s.charAt(x);
		if(s.indexOf(c) != s.lastIndexOf(c)){
			if(s1.indexOf(c) == -1){
				count++;
				s1 = s1 + c;
				}
			}
		}
        System.out.println("Count of duplicate characters: " + count + " :and Characters are: " + s1);
	}
}*/

//print the vowels in each and every sub_string...

class str{
	public static void main(String args[]){
		
	String s = "hello all good morning";
	int max = 0;
	String res = "";
	String s1[] = s.split(" ");

	for(int x = 0; x < s1.length; x++){
		String s2 = s1[x];
		int count = 0;
		for(int y = 0; y < s2.length(); y++){
			char c = s2.charAt(y);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
			count++;
			}
		}
		System.out.println(s2 + " " + count);
		if(count >= max && count >= 0){
			if(count == max)
				res += s2 + " ";
			else{
				res = s2 + " ";
				max = count;
				}
			}
		}	
	System.out.println("Max count of Dublicant / repeated string " + s + " is " + max);

	}
}*/

//count all the sub_string count...

class str{
	public static void main(String args[]){
		
	String s = "hello all good morning";
	String s1[] = s.split(" ");
	
	for(int x = 0; x < s1.length; x++){
	System.out.println(s1[x] + " " + s1[x].length());
		}
	}
}*/
		//check each substring is pallindrom or not...

/class str{
	public static void main(String args[]){
		
	String s = "madam arora teacher malayalam";
	String s1[] = s.split(" ");
	String res = "";
	for(int x = 0; x < s1.length; x++){
		String rev = "";
		String s2 = s1[x];
		StringBuffer sb = new StringBuffer(s2);
		sb.reverse();
		rev = sb.toString();
		if(rev.contentEquals(s2)){
			System.out.println(s2);
			}	
		}
	}
}*/

//to print the assige values or numbers ...

class str{
	public static void main(String args[]){
		
	String s = "a10b20c9";
	int sum = 0;
	for(int x = 0; x < s.length(); x++){
		int num = 0;
		char c = s.charAt(x);
		if(!Character.isDigit(c)){
			for(int y = x + 1; y < s.length(); y++){
				char c1 = s.charAt(y);
				if(Character.isDigit(c1)){
					num = num * 10 + Character.getNumericValue(c1);
					}
				else
					break;
				}
			sum = sum + num;
			for(int z = 1; z < num; z++)
				System.out.println(c + " " + z + " ");
			}
		System.out.println();
		}
	System.out.println("sum of digites are: " + sum);  
	}
}*/

// how many times the character is repeated count....

class str{
	public static void main(String args[]){
		
	String s = "aaaaabbbbcccdd";
	for(int x = 0; x < s.length(); x++){
		char c = s.charAt(x);
		int first = s.indexOf(c);
		int second = s.lastIndexOf(c);
		int count = second - first + 1;
		System.out.println(c + " Count is ==> " + count);
		x = second;
		}
	}
}*/

class str{
	public static void main(String args[]){
		
	String s = "apple";

	str st = new str();
//	System.out.println("vowels are " + st.vowels(s));	
//	System.out.println("Sub strings are " + st.sub_string(s));	
//	System.out.println("duplicates are " + st.dublicates(s));	

	String s1 = st.sub_string(s); 
	String a[] = s1.split(" ");
	for(int x = 0; x < a.length; x++){
		String word = a[x];
		int no_of_dublicates = st.dublicates(word);
		if(no_of_dublicates == 0){
			int vowels_count = st.vowels(word);
			if(vowels_count > 1){
				System.out.println(word);
				}
			}
		}
	


	
}



int vowels (String s){
	int count = 0;
	
	for(int x = 0; x < s.length(); x++){
		char c = s.charAt(x);
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ){
			count++;
		}
	}
	return count;
}


String sub_string(String s){
	String res = "";
	
	for(int x = 0; x < s.length(); x++){
		for(int y = x + 1; y <= s.length(); y++){
			String s1 = s.substring(x, y);
			res = res + s1 + "";
			}
		}
	//res = res.trim();
	return res;
}

int dublicates(String s){
	String s1 = "";
	int count = 0;
	for(int x = 0; x < s.length(); x++){
		char c = s.charAt(x);
		if(s.indexOf(c) != s.lastIndexOf(c)){
			if(s1.indexOf(c) == -1){
				count++;
				s1 = s1 + c;
			}
		}
	}
	return count;
	}
}





















































































































































































































































