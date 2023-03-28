package Poly_Game;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Random;
import java.util.Scanner;


public class Map extends Stage{
	
	Random ran = new Random();
	
	private final int SIZE = 10;
	private final int WALL = 9;
	private final int Player = 2;
	private final int pX = 0;
	private final int pY = 0;


	private final int POTION = -1;
	private final int ROAD = 0;
	
	public int getSIZE() {
		return SIZE;
	}

	public int getWALL() {
		return WALL;
	}

	public int getME() {
		return Player;
	}

	public int getPOTION() {
		return POTION;
	}

	public int getROAD() {
		return ROAD;
	}
	
	public int getpX() {
		return pX;
	}

	public int getpY() {
		return pY;
	}

	
	public void randomWall() {
		Random ran = new Random();
		int wallCnt = ran.nextInt(SIZE) + SIZE;
		
		
	}
	
	public void printMap() {
		int[][] map = new int[SIZE][SIZE];
		
	}
	
	public void move() {
		Scanner scan = new Scanner(System.in);
		System.out.println("w a s d");
		char dir = scan.next().charAt(0);
		
	}
	
}
