
public class Car_Encaapsulation {
	
	private String make;
	private String model;
	private int year;
	
	
	Car_Encaapsulation(String make, String model, int year) {
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
		
		
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void copy(Car_Encaapsulation x) {
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
	}

}
