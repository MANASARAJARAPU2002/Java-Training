package com.hcltech.javaday4;

public class Car {
    public int seats;
	public static int Wheels;
	public String carName;
	public String carModel;
	public Car()
	{
		int wheels = 4;
	}
	
	public Car(int seats, String carName, String carModel) {
		super();
		this.seats = seats;
		this.carName = carName;
		this.carModel = carModel;
	}

	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public static int getWheels() {
		return Wheels;
	}
	public static void setWheels(int wheels) {
		Wheels = wheels;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	@Override
	public String toString() {
		return "Car [seats=" + seats + ", carName=" + carName + ", carModel=" + carModel + ", wheels : "+ Wheels+"]";
	}
	
}



