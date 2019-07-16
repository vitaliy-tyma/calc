package com.luxoft.calc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcApplication {

	public static void main(String[] args) {

		//SpringApplication.run(CalcApplication.class, args);
		Integer a = 10;
		Integer b = 20;

		Integer sum = getSum(a, b);
		System.out.println("a = " + sum);

	}

	public static Integer getSum(Integer a, Integer b){
		Integer sum = a + b;
		return sum;
	}
}
