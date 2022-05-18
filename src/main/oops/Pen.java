package main.oops;

public   class Pen {
	final int cost = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	final int toAdd() { // cannot be overriden
//		cost = 15;//cannot reassign the value
		System.out.println("hi");
		return 0;
	}
	int toMultiply() {
		System.out.println("multiply");
		return 0;
	}

}
