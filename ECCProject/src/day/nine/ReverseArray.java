package day.nine;

public class ReverseArray {
	
	public static int[] rotate(int[] arr, int nop ) {		
		int a[] = new int[arr.length];
		for(int i = 0 ; i < arr.length ; i++) {
			if(i >= nop) {
				System.out.println("i value--> " + i);
				a[i] = arr[i-nop];
			}			
			else{
				a[i] = arr[arr.length-1-i];
				System.out.println("i value--> " + i + " a[i] value is-->" + a[i]);
			}
		}
		System.out.println("values--->"+a[0]+a[1]+a[2]+a[3]+a[4]); 
		return a;
		
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};      // or int[] arr = new int[] {1,2,3,4,5};
 		int [] result = ReverseArray.rotate(arr,5);
		for(int i = 0 ; i < result.length ; i++) {
			System.out.print(result[i] + " ");
		}
	}

}
