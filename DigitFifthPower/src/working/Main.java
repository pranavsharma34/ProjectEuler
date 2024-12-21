package working;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr = findNumbers(arr);
		sumFifthPower(arr);
	}

	private static ArrayList<Integer> findNumbers(ArrayList<Integer> arr) {
		for (int i = 2; i < 1000000; i++) {
			int firstDigit = 0;
			int secondDigit = 0;
			int thirdDigit = 0;
			int fourthDigit = 0;
			int fifthDigit = 0;
			int sixthDigit = 0;
			
			if (i < 10) {
				firstDigit = Integer.parseInt(Integer.toString(i).substring(0, 1));
			}
			if (i > 9 && i < 100) {
				firstDigit = Integer.parseInt(Integer.toString(i).substring(0, 1));
				secondDigit = Integer.parseInt(Integer.toString(i).substring(1, 2));
			}
			if (i > 99 && i < 1000) {
				firstDigit = Integer.parseInt(Integer.toString(i).substring(0, 1));
				secondDigit = Integer.parseInt(Integer.toString(i).substring(1, 2));
				thirdDigit = Integer.parseInt(Integer.toString(i).substring(2, 3));
			}
			if (i > 999 && i < 10000) {
				firstDigit = Integer.parseInt(Integer.toString(i).substring(0, 1));
				secondDigit = Integer.parseInt(Integer.toString(i).substring(1, 2));
				thirdDigit = Integer.parseInt(Integer.toString(i).substring(2, 3));
				fourthDigit = Integer.parseInt(Integer.toString(i).substring(3, 4));
			}
			if (i > 9999 && i < 100000) {
				firstDigit = Integer.parseInt(Integer.toString(i).substring(0, 1));
				secondDigit = Integer.parseInt(Integer.toString(i).substring(1, 2));
				thirdDigit = Integer.parseInt(Integer.toString(i).substring(2, 3));
				fourthDigit = Integer.parseInt(Integer.toString(i).substring(3, 4));
				fifthDigit = Integer.parseInt(Integer.toString(i).substring(4, 5));
			}
			if (i > 99999 && i < 1000000) {
				firstDigit = Integer.parseInt(Integer.toString(i).substring(0, 1));
				secondDigit = Integer.parseInt(Integer.toString(i).substring(1, 2));
				thirdDigit = Integer.parseInt(Integer.toString(i).substring(2, 3));
				fourthDigit = Integer.parseInt(Integer.toString(i).substring(3, 4));
				fifthDigit = Integer.parseInt(Integer.toString(i).substring(4, 5));
				sixthDigit = Integer.parseInt(Integer.toString(i).substring(5, 6));
			}
			
			
			if(Math.pow(firstDigit, 5) + Math.pow(secondDigit, 5) + 
					Math.pow(thirdDigit, 5) + Math.pow(fourthDigit, 5) + 
					Math.pow(fifthDigit, 5) + Math.pow(sixthDigit, 5) == i) {
				arr.add(i);
			}
		}
		return arr;
	}

	private static void sumFifthPower(ArrayList<Integer> arr) {
		int sum = 0;
		for (int i = 0; i < arr.size(); i++) {
			sum = sum + arr.get(i);
		}
		
		System.out.println(sum);
	}
}
