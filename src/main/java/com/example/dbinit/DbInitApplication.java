package com.example.dbinit;

import com.example.dbinit.model.Address;
import com.example.dbinit.model.Person;
import com.example.dbinit.repository.AddressRepository;
import com.example.dbinit.repository.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DbInitApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(DbInitApplication.class, args);


		PersonRepository personRepository = configurableApplicationContext.getBean(PersonRepository.class);
		Person person = new Person("Jan", "Kowalski", 55);
		personRepository.save(person);

		AddressRepository addressRepository =configurableApplicationContext.getBean(AddressRepository.class);
		Address address = new Address("Rolnicza", 7, 98765);
		addressRepository.save(address);

	}
}
