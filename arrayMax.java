package cshw114;
import java.util.Scanner;
import java.util.ArrayList;

public class arrayMax {
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();
		
		System.out.print(" enter numbers ending in 0");
		Integer num= input.nextInt();
		while(num.intValue()!=0) {
			numbers.add(num);
			num=input.nextInt();
			
		}
		System.out.println("The largest number in the input is " + maxValue(numbers));
	}
	
	public static Integer maxValue(ArrayList<Integer> numbers) {
		if (numbers.size() == 0)
			return null;

		Integer max = numbers.get(0);
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) > max)
				max = numbers.get(i);
		}
		return max;
	}

}
