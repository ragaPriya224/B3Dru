package main.java8;



import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		Predicate<Integer> lessThan = a -> a>50;//single line no need retunr 
		// multi line use return
		
		
	
		Predicate<Integer> gt = a -> a<50;
		Predicate<Integer> eq = a -> a==50;
//
		boolean		lessThanResult = lessThan.test(20);
		boolean		gtThan = gt.test(20);
		boolean		eqThhe = eq.test(20);
		System.out.println("less than: " +lessThanResult);
//
//
//		// and or method  ..logical operator
//
		System.out.println("And" +gt.and(lessThan).test(20));//false 
		System.out.println("or" +gt.or(lessThan).test(20)); //true
		System.out.println("or" +gt.or(eq).test(20));  //true

	}
}