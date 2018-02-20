/****************************************************************************
 *
 * Created by: Matthew lourenco
 * Created on: Feb 2018
 * This program calculates the maximum and minimum integer in an array that
 *     is ten integers long and contains integers randomized between 1 and 99
 *
 ****************************************************************************/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MaxMinNumbers {

	//int List initialization
	private static List<Integer> intList = new ArrayList<Integer>();

	private static int min(List<Integer> array) {
		//returns the minimum integer in the array
		int minNumber = array.get(0);
		for(int item: array) {
			if(item<minNumber) {
				minNumber = item;
			}
		}
		return minNumber;
	}
	
	private static int max(List<Integer> array) {
		//returns the maximum integer in the array
		int maxNumber = array.get(0);
		for(int item: array) {
			if(item>maxNumber) {
				maxNumber = item;
			}
		}
		return maxNumber;
	}
	
	public static void main(String[] args) {
		// generates an array containing random integers between 1 and 99
		// that is 10 integers long
		
		Random rand = new Random();
		for(int insertNumber = 0; insertNumber<10; insertNumber++) {
			intList.add(rand.nextInt(99) + 1);
		}
		System.out.println(intList);
		System.out.println("The minimum number is " + min(intList) + ".");
		System.out.println("The maximum number is " + max(intList) + ".");
	}
}