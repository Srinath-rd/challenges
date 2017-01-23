package edu.packrrankr.challenges;

import java.util.Arrays;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class FreeToys {

	private static final Logger logger = Logger.getLogger(FreeToys.class);
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		logger.debug("Size: " + num);
		int [] arr = new int[num];
		for(int i=0; i<arr.length;i++){
			arr[i] = scanner.nextInt();
		}
		logger.debug("Elements are: " + Arrays.toString(arr));
		int result = findMinPriBuy(arr, num);
        System.out.println(result);
        scanner.close();
	}
	private static int findMinPriBuy(int[] arr, int num) {
		for(int i=0; i<arr.length;i++){
			
		}
		
		return 0;
		
	}

}
