package main.java8;



import java.util.List;
import java.util.function.Predicate;

import main.java8.data.Person;
import main.java8.data.PersonRepository;

//heoght gender gonna check
public class PredicatePersonExample {
static Predicate<Person> heightPredicate = per-> per.getHeight() >= 140;
static Predicate<Person> genderPredicate = per-> per.getGender().equals("Male" );

public static void main(String[] args) {
	List<Person> list = PersonRepository.getAllPersons();
	list.forEach((per) ->{
		 if(heightPredicate.and(genderPredicate).test(per))// based on requirement
		 System.out.println(per);
	});
}
//BIPREDICATE -> 2 inputs try on your own
}