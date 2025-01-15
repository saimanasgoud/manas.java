//import java.util.Scanner;

/*public class arrays{
	public static void main(String args[]){

		int arr[] = new int[7];
		System.out.println("length of array is " + arr.length);
		
		arr[0] = 120; 
		arr[1] = 10; 
		arr[2] = 20; 
		arr[3] = 12; 
		arr[4] = 110; 
		arr[5] = 128; 
		arr[6] = 111; 

		for(int x = 0; x <= arr.length - 1; x++)
			System.out.println("Array of index [" + x + "] = " + arr[x] + " is an Element" ); 


		// Array by using scanner class and for loop

		int arr[] = new int[8];
		System.out.println("length of array is " + arr.length);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Array :");
	
		for(int y = 0; y <= arr.length - 1; y++){

			arr[y] = sc.nextInt();
		}
		
		for(int x = 0; x <= arr.length - 1; x++){	

			System.out.println("Array is [ " + x + " ] = " + arr[x]);
		}


		//sum of even array and product (*) of odd array

		int sum = 0, pro = 1;

		int arr[] = new int[5];
		System.out.println("length of array is " + arr.length);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Array :");
		
		for(int x = 0; x <= arr.length - 1; x++){
			arr[x] = sc.nextInt();
		}
		for(int y = 0; y <= arr.length - 1; y++){
			System.out.println("Array is [ " + y + " ] = " + arr[y] );
		
		if( arr[y] % 2 == 0)
			sum += arr[y];
		else
			pro *= arr[y];
		}

	System.out.println("sum of even numbers is "  + sum);
	System.out.println("product of odd numbers is " + pro);
	}
}*/


/*public class arrays{
	public static void main(String args[]){
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter an Array ELEMENT :");
		
		int a[] = new int[]{12, 23, 56, 87, 23, 1, 3, 9, 9, 3, 11};
		int b[] = new int[a.length];
		System.out.println("Array length is " + a.length);
	
		for(int x = 0; x <= a.length - 1; x++){
			b[x] = a[x];
			}
		System.out.println(" a array elements are " );
			
		for(int x = 0; x <= a.length-1; x++){
			System.out.println( a[x] );
			}

		System.out.println(" b array elements are" );
			
		for(int x = 0; x <= a.length-1; x++){
			System.out.println( + b[x] );
		}
	}
}*/
		//max value....
		
/*public class arrays{
	public static void main(String args[]){
		
		int a[] = new int[]{12, 23, 56, 87, 23, 1, 3, 9, 9, 3, 11};
		int max = Integer.MIN_VALUE;
		for(int x = 0; x <= a.length-1; x++){
			if(a[x] > max){
				max = a[x];
			}	
		}		
		System.out.println(" The max array is " + max);
	}
}*/
		//mini value....

/*public class arrays{
	public static void main(String args[]){
		
		int a[] = new int[]{12, 23, 56, 87, 23, 11};
		int mini = Integer.MAX_VALUE;
		for(int x = 0; x <= a.length-1; x++){
			if(a[x] < mini){
				mini = a[x];
			}	
		}		
		System.out.println(" The minimum array is " + mini);
	}
}*/

		//SECOND max and min.....
	
/*public class arrays{
	public static void main(String args[]){
		
		int a[] = new int[]{12, 23, 56, 87, 23, 11};
		int max = Integer.MIN_VALUE;
		int sec_max = Integer.MIN_VALUE;
		
		for(int x = 0; x <= a.length-1; x++){
			if(a[x] > max){
				sec_max = max;
				max = a[x];			
		}
			else if(a[x] > max && a[x] != max){
				sec_max = a[x];
			}
		}		
		System.out.println(" The maximum array is " + max);
		System.out.println(" The second maximum array is " + sec_max);
		}
	}*/

		//LEANEAR SEARCH (SEQUENTIAL SEARCH).......

/*public class arrays{
	public static void main(String args[]){
		int a[] = new int[]{12, 23, 56, 87, 23, 10, 123, 92, 43, 72, 11};
		//int b[] = new int[a.length];
		System.out.println("Array length is " + a.length);
			
		int search = 1, count = 0;
		
		for(int x = 0; x <= a.length - 1; x++){
			if(a[x] == search){
				System.out.println("Search element found");
				count++;
				break;
				}
			}
			if(count == 0)
				System.out.println("Search element not found");
			}		
		}*/


/*public class arrays{
	public static void main(String args[]){
		int a[] = new int[]{10, 20, 30, 40, 50};
		int b[] = new int[a.length];
		System.out.println("Array length is " + a.length);
		
		for(int x = 0; x <= a.length - 1; x++){
			if(x == 0)
				b[x] = a[x] + a[x+1]; 
			else if(x == a.length - 1)
				b[x] = a[x] + a[x -1];
			else
				b[x] = a[x - 1] + a[x + 1];
			}
		
		for(int x = 0; x <= b.length - 1; x++){
			System.out.println(b[x]);
		}
	}
}*/


public class arrays{
	public static void main(String args[]){
		int a[] = new int[]{10, 20, 30, 40, 50};
		int b[] = new int[a.length];
		int sum = 0;
		System.out.println("Array length is " + a.length);
		
		for(int x = 0; x <= a.length - 1; x++){
			sum = sum + a[x];
			}
		for(int x = 0; x <= a.length - 1; x++){
			 b[x] = sum - a[x]/a[x];
			}
		for(int x = 0; x <= b.length - 1; x++){
			System.out.println(b[x]);
		}
	}
}
