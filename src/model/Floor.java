package model;

public class Floor {
	private Office[] offices;

	public Floor(int offices) {
		this.offices = new Office[offices];
	}

	public Office[] getOffices() {
		return offices;
	}

	public void setOffices(Office[] offices) {
		this.offices = offices;
	}
	
}
