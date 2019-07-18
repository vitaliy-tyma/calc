/*
*CalcApplication - works well
* */
package com.luxoft.calc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//https://www.shortn0tes.com/2018/01/spring-boot-web-app-intellij-idea-community-ru.html

@SpringBootApplication
public class CalcApplication {

	public static void main(String[] args) {
/*		String operation = args[0];
		Integer a = Integer.valueOf(args[1]);
		Integer b = Integer.valueOf(args[2]);

		Calculator calculator = new Calculator();
		Integer result = calculator.getResult(operation, a, b);

		System.out.println(
				String.format(
					"Result of %s %s %s is %s",
						a,
						operation,
						b,
						result));*/

		SpringApplication.run(CalcApplication.class, args);
	}


}
