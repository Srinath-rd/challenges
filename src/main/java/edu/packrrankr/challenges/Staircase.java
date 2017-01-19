package edu.packrrankr.challenges;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
	
	   Scanner scanner = new Scanner(System.in);
	   int size = scanner.nextInt();
	   Staircase staircase = new Staircase();
       String output =   staircase.getStairCaseSymbol(size);
       
       System.out.println(output);
       scanner.close();
	}

    // output = String.join(" ", Collections.nCopies(index, "#"));
	public  String getStairCaseSymbol(int size) {
		String output = "";
		int index = size - 1;
        for(int i=size; i>0; i--){  	
        	for(int j = index;j>0;j--){
        		output += " ";
        		System.out.print(" ");
        	}
        	for(int k=1;k<=(size-index);k++){
        		output +=  "#";
        		System.out.print("#");
        	}
        	output += "\n";
        	System.out.println();
        	index--;
        }
		return output;
	}

}
