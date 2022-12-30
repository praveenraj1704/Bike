package org.bike;

public class Ktm implements Bike{

	//child class Fully abstract 
	@Override
	public void cost() {
		System.out.println("KTM RC200 bikecost :Rs.210000 ");
	}
 
	@Override
	public void speed() {
		System.out.println("KTM RC200 Topspeed :140km/hrs");
		
	}
	public static void main(String[] args) {
		
		Ktm a=new Ktm();
		
		System.out.println("\n***Bike Details*** \n");
		
		a.cost();
		a.speed();
	}
	

}
