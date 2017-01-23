package edu.packrrankr.challenges;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

/*Input Format

The first line contains space-separated integers, , , and , respectively.
The second line contains space-separated integers, where each integer describes array element (where ).
Each of the subsequent lines contains a single integer denoting . */

public class CircularArray {

	private static final Logger logger = Logger.getLogger(CircularArray.class);
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		logger.debug("n:number of elements: " + n);
		int k = in.nextInt();
		logger.debug("k: To be rotated: " + k + "times");
		int q = in.nextInt();
		logger.debug("q: " + q);
		
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int [] response = new int[q];
		for (int a0 = 0; a0 < q; a0++) {
			int m = in.nextInt();
		    response[a0] = m;
		}
		
		for(int i =0; i < q; i++){
			logger.info("m:" + response[i]);
			logger.info("n" + n);
			logger.info("k:" + k);
			int m = response[i];
		//	int index = ((n + k + m - 1) % n);
		//	int index = ((n - k + m) % n);
			int index = ((n + m - (k % n)) % n);
			logger.info("index:"+ index) ;
			logger.info(a[index]);
			System.out.println(a[index]);
		}
	}

}
