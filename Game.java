package SnakeAndLadder;

import java.util.Random;
public class Game {

	public static final int NO_PLAY = 1;
	public static final int  Ladder = 2;
	public static final int  Snake = 3;

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Game");
		
		int pos = 0;
		
		Random rand = new Random();
		int die_number = rand.nextInt(7-1)+1;
		System.out.println("Die Number :"+die_number);
		
		int choice = rand.nextInt(4-1)+1;
				
		switch(choice) 
		{
		        case NO_PLAY : System.out.println("NO PLAY");
					           break;
				case Ladder  : System.out.println("You inclined by "+die_number+" current position is "+pos);
				               pos+=die_number;
				               break;
				case Snake   : System.out.println("You declined by "+die_number+" current position is"+pos); 
					           pos-=die_number;
							   break;
		}

	}

}
