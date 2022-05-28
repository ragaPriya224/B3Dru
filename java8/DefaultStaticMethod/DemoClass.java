package main.java8.DefaultStaticMethod;

public class DemoClass implements DemoInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoClass a = new DemoClass();
		a.m1();
		a.m2();
		DemoInterface.m3();
		
	}

	@Override
	public void m1() {
		System.out.println("m1 method ");

	}

}
