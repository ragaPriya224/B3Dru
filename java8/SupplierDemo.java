package main.java8;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
		System.out.println(supplier.get());

	}

}
