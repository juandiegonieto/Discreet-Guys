package model;

public class Building <T>{
	private Floor[] floors;
	private Person[] persons;
	private T id;
	private int officeQuantity;
	
	
	public Building( T id,int persons, int floors,int office ) {
		this.floors = new Floor[floors];
		this.persons = new Person[persons];
		this.id = id;
		this.officeQuantity = office;
	}
	
	
	
}
