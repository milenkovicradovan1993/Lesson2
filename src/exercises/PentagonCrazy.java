package exercises;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class PentagonCrazy {

	private void makePrettyThings() {
		Robot rob = new Robot();

		rob.penDown();
		rob.setSpeed(10);
		rob.setPenColor(0, 5, 120);
		int numberofSides = 4;
		double angle = 360/5;
	
	      for (int i = 0; i <200; i++)  {
	    	  rob.move(i);
	    	  rob.turn(angle+1);
	    	  
	    	  
	        	
	        }
		}
	

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}