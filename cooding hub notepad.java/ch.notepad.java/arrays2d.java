/*class arrays2d{
	public static void main(String rgs[]){
	
	//Selection sort...

	int a[] = new int[]{23, 4, 78, 4, 9, 0, 54, 12, 90, 55, 24};
		System.out.println("\nOriginal array:");
		for(int t : a)
			System.out.print(t + "\t");

	arrays2d arrays = new arrays2d();
	int[] sort = arrays.selectionSort(a);

		System.out.print("\nAfter selection sort in ACCENDING order > ");

		for(int t : sort)
			System.out.print(t + "\t");
}


int[] selectionSort(int a[]){
	
	for(int x = 0; x <= a.length - 2; x++){
		int mini = 1;
		for(int y = mini + 1; y < a.length - 1; y++){
			if(a[mini] > a[y]){
				mini = y;
			}
		}
		int temp = a[x];	
		a[x] = a[mini];
		a[mini] = temp;
		}	
	return a;
	}
}*/

//2d array to print original values...

/*class arrays2d{
	public static void main(String rgs[]){
	int [][]a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

	for(int r = 0; r < a.length; r++){
		for(int c = 0; c < a[r].length  ; c++){
			System.out.print(a[r][c] + " ");
		}
		System.out.println();
		}
	}
}*/


/*class arrays2d{
	public static void main(String rgs[]){
	int [][]a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

	for(int r = 0; r < a.length; r++){
		for(int c = 0; c < a[r].length; c++){
			if(r == c || r + c == a[r].length - 1){
				System.out.print(a[r][c] + "");
			}
			else
				System.out.print(" ");
		}
		System.out.println();
		}
1 3
 5
7 9
	}
}*/



/*class arrays2d{
	public static void main(String rgs[]){
	int [][]a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	int [][]b = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

	//int [][]b = new int[3][3];
	int [][]e = new int[3][3];
		
	System.out.println("\n" + "adding A array and B aray");

	for(int r = 0; r < a.length; r++){
		for(int c = 0; c < a[r].length; c++){
			e[r][c] = a[r][c] + b[r][c] ;
			System.out.print(e[r][c] + " ");
		}	
	System.out.println();
		}
	
	System.out.println("\n" + "c array by using for each loop");
	for(int x[] : e){
		for(int z : x){
			System.out.print(z + " ");
			}
		
		System.out.println();		
		}

	}
}*/

//max array in a row...

/*class arrays2d{
	public static void main(String rgs[]){
	int [][]a = new int[][]{{9, 2, 10}, {4, 5, 6}, {7, 8, 9}};

	for(int r = 0; r < a.length; r++){
		int max = 0;

		for(int c = 0; c < a[r].length; c++){
	
			if(max < a[r][c]){
				max = a[r][c];
				}
			}

		System.out.print(max);
		
		System.out.println();

		}
	}
}*/

//transpose array.....

/*class arrays2d{
	public static void main(String rgs[]){
	int [][]a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println("Original array");
	for(int r = 0; r < a.length; r++){
		for(int c = 0; c < a[r].length; c++){
			System.out.print(a[r][c] + " ");
			}
		System.out.println();
		}
	
	System.out.println("Transpose array");

	for(int r = 0; r < a.length; r++){
		for(int c = 0; c < a[r].length; c++){
			System.out.print(a[c][r] + " ");
			}
		System.out.println();
		}
	}
}*/


//After adding 0riginal array and TRANSPOSE array 

/*class arrays2d{
	public static void main(String rgs[]){
	int [][]a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	int [][]b = new int[3][3];
		
	System.out.println("Original array");
	for(int r = 0; r < a.length; r++){
		for(int c = 0; c < a[r].length; c++){
			System.out.print(a[r][c] + " ");
			}
		System.out.println();
		}

	System.out.println("Transpose array");
	for(int r = 0; r < a.length; r++){
		for(int c = 0; c < a[r].length; c++){
			System.out.print(a[c][r] + " ");
			}
		System.out.println();
		}

	System.out.println("After adding 0riginal array and TRANSPOSE array ");

	for(int r = 0; r < a.length; r++){
		int result = 0;

		for(int c = 0; c < a[r].length; c++){
			result = a[c][r] + a[r][c];
			b[r][c] = result;
			
		System.out.print(result + " " );
		}
		System.out.println();
		}
	}
}*/

/*import java.util.Scanner;
class arrays2d{
	public static void main(String rgs[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of rows : ");
		
	int rows = sc.nextInt();
	int b[][] = new int[rows][];
	System.out.println("Enter " + rows + " Column size " );

	for(int x = 0; x < rows; x++){
		System.out.println("Enter row " + x + " Columns size ");
		b[x] = new int[sc.nextInt()];
	}
	
	for(int r = 0; r < b.length; r++){
		System.out.println("Enter " + b[r].length + " Elements of rows " + r);
			for(int c = 0; c < b[r].length; c++){
				b[r][c] = sc.nextInt();
				}
			}
		System.out.println("Array elements are");
	for(int r = 0; r < b.length; r++){
		for(int c = 0; c < b[r].length; c++){
			System.out.print(b[r][c] + " ");
			}
			System.out.println();
		}
	}
}*/

	//Strings...
	//print vowels 

/*class arrays2d{
	public static void main(String rgs[]){
	
	String name = "Good morNing aLl toDay is Holiday";
	
	for(int x = 0; x < name.length(); x++){
		char c = name.charAt(x);
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
			System.out.print(c + " ");
			}
		}
	}
}*/


	//count the no of cap_ small_ space...

/*class arrays2d{
	public static void main(String rgs[]){
	
	String name = "Good mo1rNing aLl t1oDay is Ho23liday@!";
	int capital_count = 0, small_count = 0, space = 0, symbol = 0, digit_count = 0;
		
	for(int x = 0; x < name.length(); x++){
		char c = name.charAt(x);
		if(c >= 'A' && c <= 'Z')
			capital_count++;
		else if(c >= 'a' && c <= 'z')
			small_count++;
		else if(c >= '0' && c <= '9')
			digit_count++;
		else if(c == ' ')
			space++;
		else
			symbol++;
		}
	System.out.println("original String is "+ name.length());
	System.out.println("capital count is "+ capital_count );
	System.out.println("small count is "+ small_count);
	System.out.println("digits count is "+ digit_count);
	System.out.println("Space count is "+ space);
	System.out.println("Symbols count is "+ symbol);

	}
}*/

	//to print the string in reverse order...

/*class arrays2d{
	public static void main(String rgs[]){
	
	String name = "Hello world";
	
	for(int x = name.length() - 1; x >= 0; x--){
		System.out.print(name.charAt(x));
		}
	}
}*/

	//to store the reverse value...

/*class arrays2d{
	public static void main(String rgs[]){
	
	String name = "Hello world";
	String s = "";
	for(int x = name.length() - 1; x >= 0; x--){
		s = s + name.charAt(x);
		}
	System.out.print(s);

	}
}*/

	//reverse the string if equal (pallindron)....

/*class arrays2d{
	public static void main(String rgs[]){
	
	String name = "Malayalam";
	String s = "";
	for(int x = name.length() - 1; x >= 0; x--){
		s = s + name.charAt(x);
		}
	System.out.println("original string is : " + name);
	System.out.println("reverse of " + name + " is " + s);

		if(s.equalsIgnoreCase(name)){
			System.out.println(s + " is a pallindrom");

		//IgnoreCase to take capital and small letters are same and not case sensitive..

		}
		else
			System.out.println(s + " is not a pallindrom");

	}
}*/
	
/*class arrays2d{
	public static void main(String rgs[]){
	
	String name = "Hello 123";
	String number = "";//123
	//String reverse = "";

	for(int x = 0; x < name.length(); x++){
		char c = name.charAt(x);
		if(c >= '0' && c <= '9'){
			number = number + c;
		}	
	}
	System.out.println("number is: " + number);
	
	String reverse = "";
	for(int x = number.length() - 1; x >= 0; x--){
		char c = number.charAt(x);
		reverse = reverse + c;	
   		}
	System.out.println("reverse is " + reverse);
		if(reverse.equals(number))
			System.out.println("Pallindrom");
		else
			System.out.println(" Not a Pallindrom");
   	}
}*/

//convert the string to array and make in accending order...

/*class arrays2d{
	public static void main(String rgs[]){
	
	String name = "hello";
	char c[] = name.toCharArray();
	
	for(int x = 0; x <= c.length - 2; x++){
		if(c[x] > c[x + 1]){
			char temp = c[x];
			c[x] = c[x + 1];
			c[x + 1] = temp;
			x = -1;
			}
		}
		for(char t : c)
			System.out.println(t);
	}
}*/ 

// print the unique elements...

/*class arrays2d{
	public static void main(String rgs[]){
	
	String name = "hello all good morning";
	String s = "";
	char c[] = name.toCharArray();
	char c1[] = new char[c.length];

	for(int x = 0; x <= c.length - 2; x++){
		int count = 0;		
		if(c[x] == '1')
			continue;
			for(int y = x + 1; y <= c.length - 1; y++){
				if(c[x] == c[y]){
					count++;
					c[y] = '1';
					}
				}
	//	if(count < 1) for unique values
	//	if(count == 1)  for repeated values
			System.out.println(c[x] + " " + count);	
				
		}
	}
}*/


//smax max by using two loops...


/*class arrays2d{
	public static void main(String rgs[]){
	
	int[] a = new int[]{12, 23, 45, 14, 7};
	
	int max = Integer.MIN_VALUE;
	int smax = Integer.MIN_VALUE;

	for(int x = 0; x < a.length; x++){
	
	if(max < a[x]){
		max = a[x];
		}
	}
	System.out.println("max value is " + max);
	
	for(int x = 0; x < a.length; x++){

		if(a[x] > smax && a[x] != max)
			smax = a[x];
		  }
	System.out.println("second max value is " + smax);
	}
}*/


/*class arrays2d{
	public static void main(String rgs[]){
	
	int[] a = new int[]{12, 23, 45, 14, 7};
	
	int max = Integer.MIN_VALUE;
	int smax = Integer.MIN_VALUE;

	for(int x = 0; x < a.length; x++){
	
	if(max < a[x]){
		max = a[x];
		smax = max;
		}
	else if(a[x] > smax && a[x] != max){
		smax = a[x];
		}
	}
	System.out.println("max value is " + max);
	System.out.println("smax value is " + max);
	}
}*/
	

//left rotation..

/*class arrays2d{
	public static void main(String rgs[]){
	
	int[] a = new int[]{10, 20, 30, 40, 50};
	int r = 4;
	
	for(int x = r; x < a.length; x++){
		System.out.println(a[x]);
		}
	for(int x = 0; x < r ; x++){
		System.out.println(a[x]);
		}
	}
}*/

// right rotation...

/*class arrays2d{
	public static void main(String rgs[]){
	
	int[] a = new int[]{10, 20, 30, 40, 50};
	int r = 2, b = a.length - 1;
	
	for(int x = b; x < a.length ; x++){
		System.out.println(a[x]);
		}
	for(int x = 0 ;x < b ; x++){
		System.out.println(a[x]);
		}
	}
}*/

//reverse the string and remove all numbers spaces and special characters print only string without spaces and chect weadher it is pallindron is not.

/*class arrays2d{
	public static void main(String rgs[]){
			
	String s = "A man a plan & a canal panama 1";
	String s1 = "", rev = "";
	for(int x = 0; x <= s.length() - 1; x++){
		char c = s.charAt(x);
		if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'){
			s1 = s1 + c;	
			}
		}
	System.out.println("\nOriginal string is : " + s);

	System.out.println("\nAfter removing spaces and all : " + s1);
		
	//pallindrom or not condition.
	
	for(int x = s1.length() - 1; x >= 0; x--){
		char c = s1.charAt(x);
		rev = rev + c;
		}
	System.out.println("\nReverse is : " + rev);	

	//chect the rev...

	if(s1.equalsIgnoreCase(rev))  //if(s1.equals(rev)) checks only for small letters.
		System.out.println("Pallindrom");
	else
		System.out.println("Not a Pallindrom");

	}
}*/

	//delete

/*class arrays2d{
	public static void main(String rgs[]){
			
	String s = "Hello World";
        StringBuffer sb = new StringBuffer(s);
        sb.delete(1, 10);
	System.out.println(sb); 
    }
}*/

	//DeleteChar At

/*class arrays2d{
	public static void main(String rgs[]){
	
	String s = "Hello World";
        StringBuffer sb = new StringBuffer(s);
        sb.deleteCharAt(5);
        System.out.println(sb);
    }
}*/

	//CompareTo().........

/*class arrays2d{
	public static void main(String rgs[]){

	String s = "Hello all";
	String s1 = "Hell world";

        StringBuffer sb = new StringBuffer(s);
        StringBuffer sb1 = new StringBuffer(s1);

        int result = sb.toString().compareTo(sb1.toString());

        if (result < 0) {
            System.out.println("first string is smaller then second one");
        } else if (result > 0) {
            System.out.println("Second string is smaller then first one");
        } else {
            System.out.println("both are same");
        }
    }
}*/

	//insert,,,

/*class arrays2d{
	public static void main(String rgs[]){

	String s1 = "hello all";
        StringBuffer sb = new StringBuffer(s1);
        sb.insert(5, " Hii");     
	System.out.println(sb); 
	}
}*/


//set length...it takes only the string length not the indexes...

/*class arrays2d{
	public static void main(String rgs[]){

	String s = "Hello World";
        StringBuffer sb = new StringBuffer(s);
        sb.setLength(6); 
        System.out.println(sb); 
    }
}*/

		
/*public class array2d {
    public static void main(String[] args) {
        String str = "Hello";
        str = str.concat(" World");
        System.out.println(str);
    }
}*/

public class array2d {
    public static void main(String[] args) {
        int num = 7, rem = 0, rev = 0, count = 0;       
	for(int start = 2; start <= num / 2; start++){
		if(num % start == 0)
			count++;
		}
	if(count > 0)
		System.out.println("Not a prime");
	else
		System.out.println("prime");
	}
}