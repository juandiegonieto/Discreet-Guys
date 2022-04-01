package main;

import java.util.Scanner;

import model.Building;
import model.Person;

public class Main {

	static Building[] buildings;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ask();
	}
	
	public static void ask() {
		int numberOfBuildings = sc.nextInt();
		sc.nextLine();
		buildings = new Building[numberOfBuildings];
		for(int i = 0; i<numberOfBuildings;i++) {
			create();
		}
		
	}
	
	public static void menu1() {
		System.out.println("****************************************");
		System.out.println("*********Descreet Guys Elevator*********");
		System.out.println("****************************************");
		System.out.println("-Welcome to the elevator");
		System.out.println("-To continue, write the number of buildings: ");
		int numOfBuildings = sc.nextInt();
		
	}
	
	public static void create() {
		String info = sc.nextLine();
		String[] infoArray = info.split(" ");
		Building b = new Building(infoArray[0],Integer.parseInt(infoArray[1]),Integer.parseInt(infoArray[2]),Integer.parseInt(infoArray[3]));
		for(int i=0;i<Integer.parseInt(infoArray[1]);i++) {
			String perInfo = sc.nextLine();
			String[] perSplit = info.split(" ");
			b.getPersons()[i]= new Person(perSplit[0],Integer.parseInt(perSplit[1]),Integer.parseInt(perSplit[2]));
		}
		for(int i=0;i<buildings.length;i++) {
			if(buildings[i]==null) {
				buildings[i]=b;
			}
		}
	}
	

}
