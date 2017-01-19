package edu.packrrankr.challenges;

import static org.junit.Assert.*;

import org.junit.Test;

public class StaircaseTest {

	@Test
	public void testGetStairCaseSymbol() {
	   Staircase stairCase = new Staircase();
	   //test1 
       assertEquals(stairCase.getStairCaseSymbol(1), "#\n");
       assertEquals(stairCase.getStairCaseSymbol(2), " #\n##\n");
       assertEquals(stairCase.getStairCaseSymbol(3), "  #\n ##\n###\n");
       assertEquals(stairCase.getStairCaseSymbol(4), "   #\n  ##\n ###\n####\n");
       assertEquals(stairCase.getStairCaseSymbol(5), "    #\n   ##\n  ###\n ####\n#####\n");
       assertEquals(stairCase.getStairCaseSymbol(6), "     #\n    ##\n   ###\n  ####\n #####\n######\n");
	}

}
