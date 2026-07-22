package com.cognizant.springairline;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springairline.model.Country;

@SpringBootApplication
public class SpringairlineApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringairlineApplication.class, args);

		displayCountries();
	}

	@SuppressWarnings("unchecked")
	public static void displayCountries() {

		ApplicationContext context =
				new ClassPathXmlApplicationContext("country.xml");

		List<Country> countries =
				(List<Country>) context.getBean("countryList");

		System.out.println("List of Countries:");

		for (Country country : countries) {
			System.out.println(country);
		}

		((ClassPathXmlApplicationContext) context).close();
	}
}