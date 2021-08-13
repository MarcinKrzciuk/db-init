package com.example.dbinit;

import com.example.dbinit.entity.Address;
import com.example.dbinit.entity.Person;
import com.example.dbinit.repository.AddressRepository;
import com.example.dbinit.repository.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class DbInitApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(DbInitApplication.class, args);


		AddressRepository addressRepository =configurableApplicationContext.getBean(AddressRepository.class);
		Address address = new Address("Rolnicza", 7, 98765);
		addressRepository.save(address);

		PersonRepository personRepository = configurableApplicationContext.getBean(PersonRepository.class);
		Person person = new Person("Jan", "Kowalski", 55, 1L);
		personRepository.save(person);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

	}
}
