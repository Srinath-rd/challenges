package edu.packrrankr.challenges;

import java.text.DecimalFormat;
import java.util.Scanner;

import org.apache.log4j.Logger;


public class PlusMinus {
	
	private final static Logger logger = Logger.getLogger(PlusMinus.class);

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
        logger.debug("Beginning of the method:"+ ".................");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int index = size;
		int[] input = new int [size];
		int positives = 0;
		int negatives = 0;
		int zeroes = 0;
		DecimalFormat df = new DecimalFormat("0.000000");
		
		logger.debug("size: " + size);
		while (index--> 0) {
			String element = scanner.next();
			int number = Integer.parseInt(element);
            if(number > 0) positives++;
            if(number == 0) zeroes++;
            if(number < 0) negatives++;
			input[index] = number;
		}
		logger.debug("Postives: " + positives);
		logger.debug("Negatives: " + negatives);
		logger.debug("Zeroes: " + zeroes);
		
		
		Double x = (double) positives/size;
        String x1 = df.format(x);
		
        Double y = (double) negatives/size;
		String y1 = df.format(y);
		
		Double z = (double) zeroes/size;
		String z1 = df.format(z);
		
		logger.debug("X: " + x1);
		logger.debug("Y: " + y1);
		logger.debug("Z: " + z1);
		
		scanner.close();
		logger.debug("End of the method:"+ ".................");

	}

}
