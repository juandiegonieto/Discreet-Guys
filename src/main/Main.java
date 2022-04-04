package main;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import model.Building;
import model.Person;

public class Main {

	static Building[] buildings;
	static Scanner sc = new Scanner(System.in);
	static int numberOfBuildings;
	
	public static void main(String[] args){
		ask();
	}
	
	public static  <V>void ask() {
		int numberOfBuildings = menu1(sc);
		buildings = new Building[numberOfBuildings];
		for(int i = 0; i<numberOfBuildings;i++) {
			create();
		}	
	}
	
	private static void print(ArrayList<String> arr) {
		String out = "";
		for(String a : arr)
			out+=a+", ";
		System.out.println("["+out+"]");
		
	}

	public static int menu1(Scanner sc) {
		System.out.println("****************************************");
		System.out.println("*********Descreet Guys Elevator*********");
		System.out.println("****************************************");
		System.out.println("-Welcome to the elevator");
		System.out.println("-To continue, write the number of buildings: ");
		int numOfBuildings = sc.nextInt();
		sc.nextLine();	
		return numOfBuildings;
	}
	
	public static String menu2(Scanner sc) {
		System.out.println("");
		System.out.println("-Now, the building information.");
		System.out.println("-To continue, write the building id, the amount of people, floors quantity "
				+ "and offices quantity per floor. All in one line separated with space(id people floors offices.): ");
		String info = sc.nextLine();
		return info;
	}
	
	public static String menu3(Scanner sc) {
		System.out.println("");
		System.out.println("-Now, the person information.");
		System.out.println("-To continue, write the person's name, actual floor and the destity floor."
				+ ". All in one line separated with space (name actualfloor destinyfloor): ");
		String perInfo = sc.nextLine();
		return perInfo;
	}
	
	public static void create() {
		String info = menu2(sc);
		String[] infoArray = info.split(" ");
		Building b = new Building(infoArray[0],Integer.parseInt(infoArray[1]),
				Integer.parseInt(infoArray[2]),Integer.parseInt(infoArray[3]));
		for(int i=0;i<Integer.parseInt(infoArray[1]);i++) {
			String perInfo = menu3(sc);
			String[] perSplit = perInfo.split(" ");
			b.getPersons()[i]= new Person(perSplit[0],Integer.parseInt(perSplit[1]),Integer.parseInt(perSplit[2]));
		}
		for(int i=0;i<buildings.length;i++) {
			if(buildings[i]==null) {
				buildings[i]=b;
				printBuild(i);
				break;
			}
		}
		
	}
	
	public static <V> void printBuild(int i) {
		Queue <Person> persons =  (Queue<Person>) new LinkedList<V>();
		ArrayList<Integer> notEmptyOffice= new ArrayList<>();
		ArrayList<String> stateBuild= new ArrayList<>();
			persons = rute(i);
			for(Person p : persons) {
				if(((buildings[i].getOfficeQuantity()*buildings[i].getFloorsQuantity())>=p.getDestinyFloor())) {
					if(!notEmptyOffice.contains(p.getDestinyFloor())) {
						System.out.println(p.getName()+" se mueve a la oficina: "+p.getDestinyFloor());
						notEmptyOffice.add(p.getDestinyFloor());
						stateBuild.add(p.getName());
					}else {
						System.out.println(p.getName()+" no puede ser incluido en las oficinas del edificio");
					}
				}else {
					System.out.println(p.getName()+" no puede ser incluido en las oficinas del edificio");
				}
				
			}
			
			System.out.println("\nEl estado final en el edificio "+buildings[i].getId());
			print(stateBuild);
			System.out.print("\n");
	}
	
	public static <V> Queue <V> rute(int buil){
		Queue <V> out =  new LinkedList<V>();
		int persons = buildings[buil].getPersons().length;
		for (int i=0;i<persons;i++ ) {
			out.add((V) buildings[buil].getPersons()[i]);
		}
		return out;
	}
	

}
