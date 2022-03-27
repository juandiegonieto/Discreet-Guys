package model;

public class Floor {
	
	private Office[] offices;
	private int num;
	public Floor(int num ,int offices) {
		this.num = num;
		this.offices = new Office[offices];
	}

	public Office[] getOffices() {
		return offices;
	}

	public void setOffices(Office[] offices) {
		this.offices = offices;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void addOffice(int num) {
		boolean finish=false;
		for(int i = 0; i<offices.length&&!finish;i++) {
			if(offices[i]==null) {
				offices[i] = new Office(num);
				finish = true;
			}
		}
	}
	
	public String toString() {
		String out ="";
		for(Office f : offices)
		out = f.getNum()+"";
		return out;
	}
	
}
