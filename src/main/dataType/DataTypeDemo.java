package main.dataType;

public class DataTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;//initialization and declaration 
		short biscuit= 10;
		//		boolean a = true;
		//		System.out.println(value);
		long b;
		b = 2L; //late initialization 
		int[] array = new int[9];
		//array[22] = 54;
		System.out.println(array.length);
		String s = "     HelloTeam ";
		//System.out.println(s.concat("team"));
		//System.out.println(s.substring(biscuit));
		//System.out.println(s.substring(5));
		System.out.println(s.substring(5, 8));
		String data = "Hello_TEAM_GOOD";
		System.out.println(s.split("_"));
		int c = 10;
		System.out.println(c++); //post
		System.out.println(c);
//		System.out.println(++c); //pre
		
		Math.ceil(234.097);
		int penCost = 10;
		int money = 5;
		int pencilCost = 2;
		if(money>= penCost) {
			
			System.out.println(" i can buy pen");
		}else if (money>= pencilCost) {
			System.out.println("we can buy pencil");
		}else {
			System.out.println("i can't buy pen");
		}
//		System.out.println(" i can buy pen");
		for (int i = 10; i >= 6; i--) {
			if(i == 7) {
				continue;
			}
			  System.out.println(i);
			}
	}

}
