package SnakeAndLadder;

import java.util.Random;
public class Game {
	
	public static final int NO_PLAY = 1;
	public static final int  Ladder = 2;
	public static final int  Snake = 3;
	
	public static int count = 0;
	public static int die_number = 0;
	public static Random rand = new Random();
	
	public static int play(int position)
	{
		if(position < 0)
		{
			position = 0;
		}
	
		die_number = rand.nextInt(7-1)+1;
		count++;
		System.out.println("die number:"+die_number);
	
		int option=rand.nextInt(4-1)+1;
		switch(option)
		{
		    case NO_PLAY: System.out.println("NO PLAY");
			              break;
			case Ladder : position += die_number;
						  System.out.println("Inclined by "+die_number);
						  position=play(position);
			              break;
			case Snake  : position-=die_number;
						  System.out.println("Declined by "+die_number);
			              break;
		}
		if(position>100)
		{
			position -= die_number;
		}
		return position;
	}
	

	public static void main(String[] args) {
		
		System.out.println("Welcome to Game");
		
		int person1position = 0,person2position = 0;
		
		
		while(person1position !=100 && person2position != 100)
		{
			System.out.println("Person1 is playing");
			person1position = play(person1position);
			System.out.println("position of person 1 "+person1position);
			System.out.println("Person2 is playing");
			person2position = play(person2position);
			System.out.println("position of person 2 "+person2position);	
		}
		
		if(person1position == 100)
		{
			System.out.println("Person 1 has won the match");
		}
		else
		{
			System.out.println("Person 2 has won the match!!!!");
		}
		System.out.println("Dice has been rolled "+count+" times");
		}
		
		
	}