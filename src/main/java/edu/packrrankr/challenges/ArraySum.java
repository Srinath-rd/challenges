package edu.packrrankr.challenges;

import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       
    	Scanner scanner = new Scanner(System.in);
    	int size = scanner.nextInt();
    	Long sum = 0L;
    	while(size-->0){
          String input = scanner.next();
    	  Long element = Long.parseLong(input);
    	  sum += element;
    	}
    	System.out.println(sum);	
    	scanner.close();
    
    }
}