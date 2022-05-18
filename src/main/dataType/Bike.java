package main.dataType;

public abstract class Bike {

	abstract void start() ;//abstract
	void stop() {
		System.out.println(" stopped");
	}
	abstract void toBreak();
}