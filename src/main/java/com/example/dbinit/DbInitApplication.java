package com.example.dbinit;

import com.example.dbinit.composedprimary.pk.company.Department;
import lombok.var;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import javax.persistence.Persistence;

@SpringBootApplication
public class DbInitApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(DbInitApplication.class, args);


//		AddressRepository addressRepository =configurableApplicationContext.getBean(AddressRepository.class);
//		Address address = new Address("Rolnicza", 7, 98765);
//		addressRepository.save(address);
//
//		PersonRepository personRepository = configurableApplicationContext.getBean(PersonRepository.class);
//		Person person = new Person("Jan", "Kowalski", 55, 1L);
//		personRepository.save(person);

		var entityManagerFactory = Persistence.createEntityManagerFactory("test");
		var entityManager = entityManagerFactory.createEntityManager();

//		entityManager.getTransaction().begin();
//		entityManager.persist(person1);
//		entityManager.getTransaction().commit();
//
//		Address address1 = new Address("Wodna", 13, 9999);
//		entityManager.getTransaction().begin();
//		entityManager.persist(address1);
//		entityManager.getTransaction().commit();
//		entityManager.close();



		entityManager.getTransaction().begin();
		Department department = new Department();
		department.setName("IT");
		department.setCode("ABC");
		department.setNumber(123L);
		entityManager.persist(department);
		entityManager.getTransaction().commit();

	}
}
