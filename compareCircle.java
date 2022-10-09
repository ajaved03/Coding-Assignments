package cshw136;

public class compareCircle {
	public static void main(String[] args) {
		// Create two instances of ComparableCircle objects
		int[] arr= new int[] {1,2,3,4,5,6,7,8,9,10};
		int[] arr2= new int[10];
		int pos=0;
		for(int i=arr.length-1;i>=0;i--) {
			arr2[pos]=arr[i];
			pos++;
		}
		for (int element: arr2) {
            System.out.println(element);
        }
	}
}
