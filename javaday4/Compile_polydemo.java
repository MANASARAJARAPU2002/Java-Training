package com.hcltech.javaday4;
class Calculate
{
	public int add(int x,int y) {
		return x+y;
	}
	public float add(float i , float j, float k)
			
	{
		return i+j+k;
	}
}

public class Compile_polydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate obj1 = new Calculate();
		int intsum = obj1.add(5,4);
		System.out.println("INteger sum:"+ intsum);
		float realsum=obj1.add(2.4f,3.4f,7.8f);
		System.out.println("Real sum:" + realsum);

	}

}
