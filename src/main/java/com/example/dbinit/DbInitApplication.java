package com.example.dbinit;

import com.example.dbinit.one_to_one_ONE_DIRECTION.Detail;
import com.example.dbinit.one_to_one_ONE_DIRECTION.Product;
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
//
//		Address address1 = new Address("Wodna", 13, 9999);
//
//		Department department = new Department();
//		department.setName("IT");
//		department.setCode("ABC");
//		department.setNumber(123L);

//		Firm firm1 = new Firm();
//		firm1.setFirmName("MK");
//		firm1.setStreet("Stein");
//		firm1.setNumber("20");
//		firm1.setDetails("test");
//
//		Firm firm2 = new Firm();
//		firm2.setFirmName("DELL");
//		firm2.setStreet("Wodna");
//		firm2.setNumber("100");
//		firm2.setDetails("no comment");
//

		entityManager.getTransaction().begin();

		Product product = new Product("coke", 30.0);
		entityManager.persist(product);

		Detail detail1 = new Detail(100, product);
		Detail detail2 = new Detail(400, product);

		entityManager.persist(detail1);
		entityManager.persist(detail2);

		entityManager.getTransaction().commit();
	}
}
