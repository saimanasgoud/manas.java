		//print the PATTERNS......

/*public class patterns{
	public static void main(String args[]){
		int row = 5, col = 5;
			for (int r = 1; r <= row; r++){              //*****
				for(int c = 1;c <= col; c++){	     //*****	
					System.out.print("*");	     //*****
					}			     //*****
				System.out.println("  ");	     //*****

				}
			}
		}*/


		//REMEMBER THE LOGIC FOR ALL PATTERNS/.......
		// Even no

/*public class patterns{
	public static void main(String args[]){
		int row = 8, col = 15;	
		for(int r = 1; r <= row; r++){
			for(int c = 1; c <= col; c++){	
				if(r % 2 == 0 && c % 2 == 0){	
					System.out.print("$");
					}
				else{
					System.out.print("#");
					}
				}
				System.out.println(" ");
			}
		}
	}*/


/*public class patterns{
	public static void main(String args[]){
		int row = 5, col = 5;
		for(int r = 1; r <= row; r++){
			for(int c = 1; c <= col; c++){
				if(r + c == row + 1){	
					System.out.print("-");	
				}
				else{
					System.out.print("#");
				}
			}
		System.out.println( );
//####-
//###-#
//##-##
//#-###
//-####
		}
	}
}*/


		///................
			

/*public class patterns{
	public static void main(String args[]){
		int row = 5, col = 10;
		for(int r = 1; r <= row; r++){
			for(int c = 1; c <= col; c++){
				if(r % 2 == 0 && c % 2 == 0){	
					System.out.print("$");	
				}
				
				else{
					System.out.print("#");
				}
			}
		System.out.println( );
		}
	}
}*/

			//Run the code....

/*public class patterns{
	public static void main(String args[]){
		int row = 5, col = 5;
		for(int r = 1; r <= row; r++){
			for(int c = 1; c <= col; c++){
				if(c == r || r + c == row+1){	
					System.out.print("$");		
				}
				
				else{
					System.out.print("#");
				}
			}
		System.out.println( );
		}
	}
}*/




		//reverse right angle triangle

/*public class patterns{
	public static void main(String args[]){
		int row = 5, col = 5;
		for(int r = 1; r <= row; r++){
			for(int c = 1; c <= col; c++){
				if(r + c <= row+1){	// left angle triangle
					System.out.print("$");		
				}
				
				else{
					System.out.print(" ");
				}
			}
		System.out.println( );
$$$$$
$$$$
$$$
$$
$
		}
	}
}*/

		//left angle TRIANGLE....

/*public class patterns{
	public static void main(String args[]){
		int row = 5, col = 5;
		for(int r = 1; r <= row; r++){
			for(int c = 1; c <= col; c++){
				if(r + c >= row + 1){	
					System.out.print("* ");		
				}
				
				else{
					System.out.print("  ");
				}
			}
		System.out.println( );
		}

        *
      * *
    * * *
  * * * *
* * * * *
	}
}*/




/*public class patterns{
	public static void main(String args[]){
		int row = 16, col = 16;
		for(int r = 1; r <= row; r++){
			for(int c = 1; c <= col; c++){
				if(r + c == row+1 || r == c || c ==1 || r == 1 || r == row || c == col){	
					System.out.print("$");		
				}
				
				else{
					System.out.print(" ");
				}
			}
		System.out.println( );
		}
	}
}*/

			//alphabets....


/*public class patterns{
	public static void main(String args[]){
		int row = 5, col = 5;
		char let = 'A';
		for(int r = 1; r <= row; r++){
			for(int c = 1; c <= col; c++){
				System.out.print(let + " ");    //let++;
			}
		System.out.println();
 		}
	}
}*/




/*public class patterns{
	public static void main(String args[]){
		int row = 5, col = 5;
		char let = 'A';
		for(int r = 1; r <= row; r++){
			for(int c = 1; c <= col; c++){                  
				System.out.print(let + " ");
 					let++;
			}
		System.out.println();
 		}
A B C D E
F G H I J
K L M N O
P Q R S T
U V W X Y
	}
}*/



/*public class patterns{
	public static void main(String args[]){
		int row = 5, col = 5;
		//char let = 'A';
		for(int r = 1; r <= row; r++){

			char let = 'A';

			for(int c = 1; c <= col; c++){ 

    				System.out.print(let + " ");
				let++;
			}
			//let--;
		System.out.println();
 		}
A B C D E
A B C D E
A B C D E
A B C D E
A B C D E
	}
}*/

		//No caption....

/*public class patterns{
	public static void main(String args[]){
		int row = 4, col = 4; //temp = 1;       
		char let = 'A';
		//temp = let;
		for(int r = 1; r <= row; r++){		
			char temp = let ;
			
				for(int c = 1; c <= col; c++){ 

    					System.out.print(temp + " ");
					temp++;
				}
			let++;
			System.out.println();
 			}
A B C D
B C D E
C D E F
D E F G
		}
	}*/

			//right angle TRIANGLE without loop.....


/*public class patterns{
	public static void main(String args[]){
		int row = 4; //col = 4; 
		for(int r = 1; r <= row; r++){		
	 
			
				for(int c = 1; c <= r; c++){ 

    					System.out.print( " * ");
				}
			
			System.out.println();
 			}
		}  
 *
 *  *
 *  *  *
 *  *  *  *

	}*/


/*public class patterns{
	public static void main(String args[]){
		int row = 6;
		for(int r = 1; r <= row; r++){				
			for(int c = 1; c <= r; c++){ 
				if(c == 1 || r == row || r == c){
    					System.out.print("*");
				}
				else
					System.out.print("$");
 			}
			System.out.println();
		}  
*
**
*$*
*$$*
*$$$*
******		
	}
	
}*/



/*public class patterns{
	public static void main(String args[]){
		int row = 6;
		for(int r = 1; r <= row; r++){ // 6 < 1  r=2				
			for(int c = 1; c <= r; c++){ 
				System.out.print(c + " ");
 			}
			System.out.println();
		} 
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
	}
}*/



/*public class patterns{
	public static void main(String args[]){
		int row = 6, temp = 0;   //or temp = 0 both are same.
		for(int r = 1; r <= row; r++){ // 6 < 1  r=2	
			temp = r;			
			for(int c = 1; c <= r; c++){ 
				System.out.print(temp-- + " ");
				//temp--;
 			}
			System.out.println();
		} 
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
6 5 4 3 2 1
	}
}*/



/*public class patterns{
	public static void main(String args[]){
		int row = 6;   

		for(int r = 1; r <= row; r++){ // 6 < 1  r=2	
			int temp = r;
			
			for(int c = 1; c <= r; c++){ 
				if(c == 1 || r == row || r == c){
				
					System.out.print(temp + " ");
				}
				else
					System.out.print("  ");
			temp--;

 			}
			System.out.println();
		}
1
2 1
3   1
4     1
5       1
6 5 4 3 2 1 
	}
}*/



/*public class patterns{
	public static void main(String args[]){
		int row = 6;   

		for(int r = 1; r <= row; r++){ // 6 < 1  r=2	
			int temp = 1;	
			for(int c = 1; c <= r; c++){ 
				if(c == 1 || r == row || r == c){
				
					System.out.print(temp++ + " ");
					
				}
				else
					System.out.print("  ");
		

 			}
			System.out.println();
		}
1
1 2
1   2
1     2
1       2
1 2 3 4 5 6
	}
}*/



/*public class patterns{
	public static void main(String args[]){
		int row = 6;   
		//char let = 'A';
		for(int r = 1; r <= row; r++){ // 6 < 1  r=2	
			int temp = 1;	
			char let = 'A';

			for(int c = 1; c <= r; c++){ 
				if(c == 1 || r == row || r == c){
				
					System.out.print(temp++ + " ");
					
				}
				else
					System.out.print(let++ + " ");

 			}
			System.out.println(" ");
		}
1
1 2
1 A 2
1 A B 2
1 A B C 2
1 2 3 4 5 6
	}
}*/

		//first methord...		

/*public class patterns{
	public static void main(String args[]){
		int row = 6;   
		
		for(int r = 1; r <= row; r++){ 	

			for(int c = 1; c <= row ; c++){ 
				if(r + c <= row + 1){
					System.out.print("# ");
		

 				}
			}
		System.out.println();

		}
# # # # # #
# # # # #
# # # #
# # #
# #
#	
	}	 
}*/
			//hallozen...
			

/*public class patterns{
	public static void main(String args[]){
		int row = 6;   
		 
		for(int r = row; r >= 1 ; r--){ 	

			for(int c = 1; c <= r; c++){  
				if(r == row || c == 1 || r == c){
					System.out.print("# ");
				
 				}
				else{
					System.out.print("  ");
				}

			}
		System.out.println();

		}
# # # # # #
#       #
#     #
#   #
# #
#
	}
}*/

		//k

/*public class patterns{
	public static void main(String args[]){
		int row = 5;   
		
		for(int r = 1; r <= row ; r++){ 	
			
			for(int c = 1; c <= row; c++){  
				if(r + c <= row + 1 ||r == 1){   // || c == 1 || r == 1
					System.out.print(" # ");
				
 				}
				
			}
	
		System.out.println();
		}
		for(int r = 2; r <= row ; r++){ 	
			
			for(int c = 1; c <= row; c++){  
				if( r + c >= row + 1 ){
					System.out.print(" # ");
				
 				}
				
			}
		System.out.println();
		}
	}
}*/


/*public class patterns{
	public static void main(String args[]){
		int row = 5,c,r;   
		
		for(r = 1; r <= row ; r++){ 	
			
			for(c = r; c <= row; c++){  
				if( c == row || r == 1 || c == r)								System.out.print("# ");
				
 				
				else
					System.out.print("  ");
				}
			
	
		System.out.println();
		}

		for(r = 2; r <= row ; r++){ 	
			
			for(c = 1; c <= row; c++){  
				if( c == 1 || c == r || r == row)
					System.out.print("# ");
				
 				
				else
					System.out.print("  ");
				}
				
			
		System.out.println();
		}
# # # # #
#     #
#   #
# #
#
# #
#   #
#     #
# # # # #
	}
}*/


/*public class patterns{
	public static void main(String args[]){
		int row = 7,c,r;   
		
		for(r = 1; r <= row ; r++){ 	
			
			for(c = r; c <= row; c++){  
				if(r + c >= row + 1){
					System.out.print("# ");
				}
			}
		System.out.println();

		}
#
# #
# # #
# # # #
# # #
# #
#
	}
}*/

  		//unsolved

/*public class patterns{
	public static void main(String args[]){
		int row = 7, r, c;   
		
		for(r = 1; r <= row ; r++){ 	
			
			for(c = 1; c <= r; c++){  
				if( c == 1 || c == r ){
					
					System.out.print("# ");
				}
				else{
					System.out.print("  ");
				}
			}
		System.out.println();
		}

		for(r = 2; r <= row ; r++){ 	
			
			for(c = r; c <= row; c++){  

				if( r == 1 || c == r || c == row ){
					
					System.out.print("# ");
				}
				else{
					System.out.print("  ");
				}
			}
		System.out.println();
		}
	}
#
# #
#   #
#     #
#       #
#         #
#           #
#         #
#       #
#     #
#   #
# #
#
}*/


/*public class patterns{
	public static void main(String args[]){
		int row = 7;   
		//int temp = 1;
		for(int r = 1; r <= row ; r++){ 	
			int temp = 1;
			for(int c = r; c <= row; c++){  
				if(){						
					System.out.print(temp++ + "  ");

				}
				else{
					System.out.print( temp++ +"  ");
				}
			}
		System.out.println();
		}
1  2  3  4  5  6  7
1  2  3  4  5  6
1  2  3  4  5
1  2  3  4
1  2  3
1  2
1 nt clr
	}
}*/


/*public class patterns{
	public static void main(String args[]){
		int row = 7;   

		for(int r = 1; r <= row ; r++){ 	
			
			for(int c = 1; c <= r; c++){      
				System.out.print("# ");
				}		
		
			for(int c = row; c >= r; c--){
				System.out.print("$ ");
				}

			for(int c = row; c >= r; c--){
				System.out.print("& ");
				}

			System.out.println();

		}
# $ $ $ $ $ $ $ & & & & & & &
# # $ $ $ $ $ $ & & & & & &
# # # $ $ $ $ $ & & & & &
# # # # $ $ $ $ & & & &
# # # # # $ $ $ & & &
# # # # # # $ $ & &
# # # # # # # $ &
	}
}*/


/*public class patterns{
	public static void main(String args[]){
		int row = 7;   

		for(int r = 1; r <= row ; r++){ 
	
			for(int c = row; c > r; c--){  
				System.out.print("  ");
			}

			for(int c = 1; c <= r; c++){  
				System.out.print("# ");
			}
			for(int c = 1; c <= r; c++){  
				System.out.print("@ ");
			}

		System.out.println();
		}
 	    # @
          # # @ @
        # # # @ @ @
      # # # # @ @ @ @
    # # # # # @ @ @ @ @
  # # # # # # @ @ @ @ @ @
# # # # # # # @ @ @ @ @ @ @
	}
}*/


/*public class patterns{
	public static void main(String args[]){
		int row = 7;   

		for(int r = 1; r <= row ; r++){ 
	
			for(int c = row; c > r; c--){  
				System.out.print(" ");
			}

			for(int c = 1; c <= r; c++){  
				System.out.print("# ");
			}

		System.out.println();
		}

		for(int r = 1; r <= row ; r++){ 

			for(int c = 1; c <= r; c++){  
				System.out.print(" ");
			}

			for(int c = row; c > r; c--){  
				System.out.print("# ");
			}
		System.out.println();
		}
      #
     # #
    # # #
   # # # #
  # # # # #
 # # # # # #
# # # # # # #
 # # # # # #
  # # # # #
   # # # #
    # # #
     # #
      #
	}
}*/
		//hollow pattern of dimond not compleated....
			
public class patterns{
	public static void main(String args[]){
		int row = 7;   

		for(int r = 1; r <= row ; r++){ 


			for(int c = row; c > r; c--){  
				System.out.print("  ");
			}

			for(int c = 1; c <= r; c++){  
				//if(c == 1 || r == row || c == r*2)
				System.out.print("# ");
			}
			for(int c = 2; c > r*2; c--){  
				//if(c == 1 || r == row || c == r*2)
				System.out.print("  ");
			}

		System.out.println();
		}

		for(int r = 2; r <= row ; r++){ 

			for(int c = 1; c <= r; c++){ 
 
				System.out.print(" ");
			}

			for(int c = row; c > r; c--){ 
				//if( c == row )

 
				System.out.print("# ");
			}
			for(int c = r; c >= row; c--){  
				//if(c == 1 || r == row || c == r*2)
				System.out.print("  ");
			}
		System.out.println();
		}
	}
}


/*public class patterns{
	public static void main(String args[]){
		int row = 7;   

		for(int r = 1; r <= row ; r++){ 
	
			for(int c = 1; c < r; c++){

				System.out.print("  ");
			}
			for(int c = row; c > r; c--){
				System.out.print("# ");
			}
			for(int c = row; c > r; c--){
				System.out.print("# ");
			}

		System.out.println();
		}
		for(int r = row; r > 1; r--){ 
	
			for(int c = 2; c < r; c++){

				System.out.print("  ");
			}
			for(int c = row; c >= r; c--){

				System.out.print("# ");
			}
			for(int c = row; c > r; c--){
				System.out.print("# ");
			}
		System.out.println();
		}
# # # # # # # # # # # #
  # # # # # # # # # #
    # # # # # # # #
      # # # # # #
        # # # #
          # #

          #
        # # #
      # # # # #
    # # # # # # #
  # # # # # # # # #
# # # # # # # # # # #				
	}
}*/
			//letter char a to A

/*public class patterns{
	public static void main(String[] args){
	

	char let = 'A';
	    char result = (let >='A' && let <= 'Z') ? (char)(let+32) : (char)(let-32);
		System.out.println(result);

	char letter = 'j';
	let = (char)(letter+32);

	char let3 = (char)(letter-32);

	if(letter >= 'A' && letter <= 'Z'){
		System.out.println(let);
		}

	else if(letter >= 'a' && letter <= 'z'){
		System.out.println(let3);
		}

	}
}*/

/*public class patterns{
	public static void main(String[] args){
	
	char let = 'D';
		char result = (char)(let + 32);
		char let1 = result;

		char result1 = (char)(let - 32);
		char let2 = result1;

	if(let >= 'A' && let <= 'Z')
		System.out.println("given letter is " + let + " and result is " + result);

	else 
		System.out.println("given letter is " + let + " and result is " + result1);

	}
}*/



















