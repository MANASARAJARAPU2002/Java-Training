package com.hcltech.javaday8june5;

public class Universe_Example {
	public long stars;
	public int planet;
	 static class World{

	public static void main(String[] args) {
		Asia.India.Mycity.showCity();
		
		Universe_Example u1 = new Universe_Example();
		u1.stars=123456789L;
		u1.planet=9;
    

	}
	
	
	
	static class Asia{
		static class India{
			static class Mycity{
				String city="Hyderabad";
				
				static class Person extends Object{
					private String personName;
					private String profession;
					@Override
					public String toString() {
						return "Person [personName=" + personName + ", profession=" + profession + "]";
					}
					
					class History{
					}
					}
				
				public static void showCity() {
					
					
					Person p1= new Person();
					Person p2= new Person();
					p1.personName="Manasa";
					p1.profession="Software";
					p2.personName="Rajarapu";
					p2.profession="Engineer";
					System.out.println(p1);
					System.out.println(p2);
					
					class Monument{
						private String monumentName;
						private String monumentHistory;
						public String getMonumentName() {
							return monumentName;
						}
						public void setMonumentName(String monumentName) {
							this.monumentName = monumentName;
						}
						public String getMonumentHistory() {
							return monumentHistory;
						}
						public void setMonumentHistory(String monumentHistory) {
							this.monumentHistory = monumentHistory;
						}
						
						
						}
					
					Monument m1 = new Monument();
					m1.monumentName="charminar";
					System.out.println(new Mycity().city+"has"+ m1.monumentName);
					}
				}
					
					
				}
		
		class MilkyWay{
			class Blackhole{
		}
			}
		}
	 }
}



