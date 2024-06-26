package com.hcltech.javaday4;

public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car Mycar1 = new Car();
Mycar1.setCarName("honda");
Mycar1.setCarModel("xing");
Mycar1.setSeats(5);
System.out.println("My car details :" + Mycar1);
Car yourcar = new Car();

yourcar.setCarName("TATA");
yourcar.setCarModel("Activa");
yourcar.setSeats(7);
 System.out.println("Your car details:" + yourcar);
 Car[] cars = new Car[3];
 
 
 cars[0] = Mycar1;
 cars[1] = yourcar;
 for(Car c1:cars)
 {
	 System.out.println(c1+" ");
 }
 
 
 Race_Car r1 = new Race_Car();
 r1.setBrandname("Ferrari");
 r1.setCarName("Formula one");
 r1.setCarModel("zoom");
 r1.setSeats(2);
 System.out.println(r1+" ");
 
	}

}
