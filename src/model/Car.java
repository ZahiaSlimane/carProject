package model;

public class Car {
	
	private String Brand;
	private Integer Velocity;
	
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public Integer getVelocity() {
		return Velocity;
	}
	public void setVelocity(Integer velocity) {
		Velocity = velocity;
	}
	public Car(String brand, Integer velocity) {
		Brand = brand;
		Velocity = velocity;
	}
	public Car() {
		
	}
	

}
