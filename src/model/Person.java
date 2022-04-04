package model;

public class Person implements Comparable<Person>{
	
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
	
	public boolean calculateDirection(int officesQuantity,int floorsQuantity) {
		boolean out = false;
		for(int i =1 ;i<=floorsQuantity;i++) {
			if(destinyFloor<=officesQuantity) {
				if(i-actualFloor>0) {
					out=true;
				}
			}
		}
		
		return out;
		
	}

	@Override
	public int compareTo(Person o) {
		Person a=this;
		Person b= o;
		
		int output = a.getActualFloor()-b.getActualFloor();
	
		return output;
	}
	
}
