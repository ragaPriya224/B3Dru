package main.dataType;

import java.util.ArrayList;

public class Car {
	String color;
	int tyres;

	public Car(){
		this.color ="black";
		this.tyres =3;
	}
	public Car(String color, int tyres) {
		this.color =color;
		this.tyres =tyres;
	}
	public void start() {
		System.out.println("vehicle started");
	}

	public static void main(String[] args) {
		Car tata = new Car("blue",4);
//		tata.color = "blue";
		System.out.println(tata.color);
		System.out.println(tata.tyres);
		
		Car benz = new Car();
//		benz.color = "black";
		System.out.println(benz.color);
		System.out.println(benz.tyres);
		ArrayList a = new ArrayList<>();
		a.
	}

}
