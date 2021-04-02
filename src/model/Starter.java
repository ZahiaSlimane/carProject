package model;

public class Starter {

	public static void main(String[] args) {
		
		Car porsche = new Car();
		porsche.setBrand("Porsche");
		porsche.setVelocity(237);
		
		System.out.println(porsche.getBrand()  + " " +  porsche.getVelocity());
		
		Car c = new Car("Citroen", 400);
		System.out.println(c.getBrand()  + " " +  c.getVelocity());
		

	}

}
