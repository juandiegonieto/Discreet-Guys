package main;

import java.util.Scanner;

import model.Building;

public class Main {

	static Building[] buildings;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static void ask() {
		int numberOfBuildings = sc.nextInt();
		for(int i = 0; i>numberOfBuildings;i++) {
			create();
		}
		
	}
	
	public static void create() {
		String info = sc.next();
		String[] infoArray = info.split(" ");
		Building b = new Building(infoArray[0],Integer.parseInt(infoArray[1]),Integer.parseInt(infoArray[2]),Integer.parseInt(infoArray[3]));
		for(int i=0;i<buildings.length;i++) {
			if(buildings[i]==null) {
				buildings[i]=b;
			}
		}
	}
	

}
