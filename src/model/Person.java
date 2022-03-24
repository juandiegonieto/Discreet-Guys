package model;

public class Person {
	
	private String name;
	private int actualFloor;
	private int destinyFloor;
	
	public Person(String name, int actualFloor, int destinyFloor) {
		this.name = name;
		this.actualFloor = actualFloor;
		this.destinyFloor = destinyFloor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getActualFloor() {
		return actualFloor;
	}

	public void setActualFloor(int actualFloor) {
		this.actualFloor = actualFloor;
	}

	public int getDestinyFloor() {
		return destinyFloor;
	}

	public void setDestinyFloor(int destinyFloor) {
		this.destinyFloor = destinyFloor;
	}
	
	
	
}
