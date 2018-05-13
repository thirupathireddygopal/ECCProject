package day.nine;

public class SpinningArray {
	
	public static int[] rotate(int[] arr, int nop ) {
		int temp = 0 ;
		for(int i = 0 ; i < nop ; i++) {
			temp = arr[arr.length-1];
			for(int j = arr.length-1 ; j > 0 ; j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = temp;
			System.out.println("arr[0]-->" + arr[0]);
			System.out.println(arr[0] + "" + arr[1] + "" + arr[2] + "" + arr[3] + "" + arr[4]);		
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};      // or int[] arr = new int[] {1,2,3,4,5};
 		int [] result = SpinningArray.rotate(arr,5);
		for(int i = 0 ; i < result.length ; i++) {
			System.out.print(result[i] + " ");
			//System.out.println();
		}
	}

}
