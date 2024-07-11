package JAVAFINAL.REVIEW.PREPARARTION;

 class Varaiabl_Demo {
	int a=10;
	private static int c=20;//static variable
	public void fly() {
		int b=10;//Local varaible
		
		int a=20; 
	
		System.out.println(b);//local varaiable access with in the method only
		System.out.println(c);//Static varaiable we can access within the class not outside class and we can't change the value of static once it created
		System.out.println(a);//we can access instance varaiable within the class we can change the value also 
	
	}

}
 class Varaiables_Demo{
	
	public static void main(String[] args) {
		int d=20;//Instance varaiable
		System.out.println(d);
		Varaiabl_Demo v1= new Varaiabl_Demo();
		v1.fly();
		}
	
}

