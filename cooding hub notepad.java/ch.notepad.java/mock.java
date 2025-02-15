
//Right rotation..

/*class arrays2d{
	public static void main(String rgs[]){

	
	int a[] = new int[]{10, 20, 30, 40, 50};
	
	int r = 2;

	for(int x = r; x <a.length; x++){
		a[r - 1] = a[x];
	}
	for(int y = r + 1; y < a.length; y++){
		a[y] = a[y - r];
		}
	for(int t : a){
		System.out.println(t);
		}
	}*/

//reversing the array and storing it in b array..

/*class arrays2d{
	public static void main(String rgs[]){

	int a[] = new int[]{10, 20, 30, 40, 50};
	int b[] = new int[a.length];

	int x = 0;

	for(int y = a.length - 1; y >= 0; y--,x++){
		b[x] = a[y];
		}	
	for(int t : b){		
		System.out.println(t);
		}
	}
}*/

//second max number 

/*class arrays2d{
	public static void main(String rgs[]){

	int num = 17543, mini = Integer.MAX_VALUE, smini = Integer.MAX_VALUE, rem = 0, temp = num;
	for(; num != 0; num /= 10){
		rem = num % 10;
		if(mini > rem){
			smini = mini;
			mini = rem;
			}
		else if(smini > rem && rem != mini)
			smini = rem;
		}	
	System.out.println("The number is " + temp + " Second Smallest number is " + smini);
	}
}*/