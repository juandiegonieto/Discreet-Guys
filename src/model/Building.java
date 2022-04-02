package model;

public class Building <T>{
	
	private Floor[] floors;
	private Person[] persons;
	private T id;
	private int officeQuantity;
	private int floorsQuantity;
	
	
	public Building( T id,int persons, int floors,int office ) {
		this.floors = new Floor[floors];
		this.persons = new Person[persons];
		this.id = id;
		this.officeQuantity = office;
		this.floorsQuantity=floors;
		createArrayOffice();
	}


	public int getFloorsQuantity() {
		return floorsQuantity;
	}


	public void setFloorsQuantity(int floorsQuantity) {
		this.floorsQuantity = floorsQuantity;
	}


	public Floor[] getFloors() {
		return floors;
	}


	public void setFloors(Floor[] floors) {
		this.floors = floors;
	}


	public Person[] getPersons() {
		return persons;
	}


	public void setPersons(Person[] persons) {
		this.persons = persons;
	}


	public T getId() {
		return id;
	}


	public void setId(T id) {
		this.id = id;
	}


	public int getOfficeQuantity() {
		return officeQuantity;
	}


	public void setOfficeQuantity(int officeQuantity) {
		this.officeQuantity = officeQuantity;
	}
	
	public void createArrayOffice(){
		int k=0;
		for(int i =floors.length-1; i>=0;i--) {
			floors[i]=new Floor(i+1,officeQuantity);
			for(int j=0;j<officeQuantity;j++) {
				k++;
				floors[i].addOffice(k);
			}
			
		}
		
	}	
	
}
