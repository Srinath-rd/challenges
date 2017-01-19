package edu.packrrankr.challenges;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class convertTime {
	
	private static final Logger logger =  Logger.getLogger(convertTime.class);

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String currentTime = scanner.next();
		String convertedTime = convertTimeTo24Format(currentTime);
		
		System.out.println(convertedTime);
		scanner.close();
	}

	private static String convertTimeTo24Format(String currentTime) {
		SimpleDateFormat df = new SimpleDateFormat("hh:mm:ssaa");
		SimpleDateFormat df1 = new SimpleDateFormat("HH:mm:ss");
		String output = "";
		try {
			Date date = df.parse(currentTime);
			output = df1.format(date);
		} catch (ParseException e) {
			logger.error("ParseException" + e.getMessage());;
		}
		return output;
	}

}
