/*1. Array: an array is a fixed-size and collection of elements that are stored in memory locations. It can hold multiple values of the same data type and is indexed starting from 0. 

Advandtages: 

Disadvantages: 


2.String: string contains multiple characters 
	

String Buffer: it is a 



String Builder:


//Question-3

*/

	
// print the largest odd array a[]={125, 123, 456, 12, 335, 789, 100, 445, 791, 890, 896} with sorting
// print second largest element of the array without sorting.
// check weather the array contains only unique elements.
// 2d array
// 321     max value is 3
// 4767     max value is 7
// 7 -8      max value is 7
// input: hello all good morning
// output: ehllo all dgoo gimnnor  each and every word should be sorted in //accending order

//largest by using sorting...

/*class test{
	public static void main(String args[]){
			
	int a[] = new int[]{23, 45, 67, 8, 9, 43};
	
	for(int x = 0; x < a.length; x++){
		//sort		
		for(int y = x + 1; y < a.length; y++){
			if(a[x] > a[y]){
				int temp = a[x]; 
				a[x] = a[y]; 
				a[y] = temp;
				}
			}
		}
		System.out.println("smallest is: " + a[0]);
	for(int x = 0; x < a.length; x++){
		if(a[x] != a[0]){
			System.out.println("Second smallest is: " + a[x]);
			break;
			}
		}
	}
}*/


//second largest array without sorting..

/*class test{
	public static void main(String args[]){
			
	int a[] = new int[]{23, 45, 67, 8, 9, 43};
	
	int largest = Integer.MIN_VALUE;
	int seclarg = Integer.MIN_VALUE;
		
	for(int x = 0; x < a.length; x++){
		if(a[x] > largest){
			seclarg = largest;
			largest = a[x];
			}
		else if(a[x] < largest && a[x] != seclarg){
			seclarg = a[x];
			}
		}
	System.out.println("second largest : " + seclarg);
	}
}*/

/*class test{
	public static void main(String args[]){
			
	int a[] = new int[]{23, 45, 67, 8, 9, 43};
	
	for(int x = 0; x < a.length; x++){
		//sort		
		for(int y = x + 1; y < a.length; y++){
			if(a[x] > a[y]){
				int temp = a[x]; 
				a[x] = a[y]; 
				a[y] = temp;
				}
			}
		}
		System.out.println("smallest is: " + a[0]);
	for(int x = 0; x < a.length; x++){
		if(a[x] != a[0]){
			System.out.println("Second smallest is: " + a[x]);
			break;
			}
		}
	}*/

// print the largest odd array...

/*class test{
	public static void main(String args[]){
			
	int a[] = new int[]{125, 123, 456, 12, 335, 789, 100, 445, 791, 890, 896};
	for(int x = 0; x < a.length; x++){
		for(int y = x + 1; y < a.length; y++){
			if(a[x] > a[y]){
				int t = a[x];
				a[x] = a[y];
				a[y] = t;
				}
			}
		}
	for(int x = a.length - 1; x >= 0; x--){
		if(a[x] % 2 != 0){
			System.out.println(a[x]);
			break;
			}
		}
	}
}*/

// check weather the array contains only unique elements.

/*class test{
	public static void main(String args[]){
			
	int a[] = new int[]{12, 34, 64, 8, 1, 4};
	int b[] = new int[a.length];	
	int count = 0;
	
	for(int x = 0; x < a.length; x++){
		if(b[x] == 1)
			continue;
		for(int y = x + 1; y < a.length; y++){
			if(a[x] == a[y]){
			count++;
			b[y] = 1;
			}
		}
	}
	if(count == 1){
		System.out.println("The array contains duplicant elements");
	else
		System.out.println("The array contains Unique elements");
	}
}*/

// find the rotated value how many times the a array is rotaded to make the b array.

/*class test{
	public static void main(String args[]){
			
	int a[] = new int[]{10, 20, 30, 40, 50, 60, 70};
	int b[] = new int[]{50, 60, 70, 10, 20, 30, 40};
	
	int r = 0;
	if(a.length == b.length){
	for(int x = 0; x < a.length; x++){
		if(a[x] == b[0]){
			r = x;			
			break;
			}
		}
	}
	if(r != 0)
		System.out.println("The array was rotated: " + r);
	else
		System.out.println("The second array is not a rotated version of the first array.");
	}
}*/

//print the max of 2d array...

class test{
	public static void main(String args[]){
			
	int a[][] = new int[][]{{3, 2, 1}, {4, 7, 6, 7}, {7, -8}};
	
	for(int r = 0; r < a.length; r++){
		int max = 0;
		for(int c = 0; c < a[r].length; c++){
			if(max < a[r][c]){
				System.out.println("T"+a[r][c]);

				max = a[r][c];	
				}
			}
		System.out.println(max);
		}
	}
}























