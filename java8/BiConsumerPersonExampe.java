package main.java8;

import java.util.List;
import java.util.function.BiConsumer;

import main.java8.data.Person;
import main.java8.data.PersonRepository;



public class BiConsumerPersonExampe {
	static List<Person> personList = PersonRepository.getAllPersons();
	static BiConsumer<String,List<String>>  hobbiesList = (name,hobbies)->
	System.out.println("Name: " +name + "/hobbies" +hobbies);
	public static void main(String[] args) {
		//		fetchHobbies();
		fetchSalary();

	}
	//fetch hobbies
	static void fetchHobbies() {
		//		list.forEach(hobbies);// error
		personList.forEach((per) -> {
			hobbiesList.accept(per.getName(), per.getHobbies());
			//e34d add salary lines here also

		});
	}  

	static BiConsumer<String,Double> incme = (name,salary) ->
	System.out.println("Name: " + name +"salary" + (salary+5000));
	// get name with salary
	static void fetchSalary() {
		//		list.forEach(hobbies);// error
		personList.forEach((per) -> {
			incme.accept(per.getName(), per.getSalary());
		});
	}  


}