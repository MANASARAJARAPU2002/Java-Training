package com.hcltech.javaday7june4;

public abstract class Mobileoperator {
	protected String name;
	public abstract void support4G();
	public abstract void support5G();
	
	public void showOperator() {
		System.out.println(name+" ");
		
	}


public class Airtel extends Mobileoperator{
	public Airtel()
	{
		name ="Airtel";
	}
	@Override
	public void support4G() {
		System.out.println(name+"support 4G by router");
	}
	@Override
	public void support5G() {
		System.out.println(name+"support 5G by router");
	}
}

public class Docomo extends Mobileoperator{
	public Docomo()
	{
		name ="Docomo";
	}
	@Override
	public void support4G() {
		System.out.println(name+"support 4G by router");
	}
	@Override
	public void support5G() {
		System.out.println(name+"support 5G by router");
	}
}
}

