package main.java8.DefaultStaticMethod;

public interface DemoInterface {
	
	
	void m1();
	
	default void m2() {
		System.out.println("this is default method");
	}
	
	static void m3() {
		System.out.println("m3 method i static");
	}
}
