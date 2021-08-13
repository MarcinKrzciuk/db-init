package com.example.dbinit.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person")
    private Long idPerson;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private Integer age;
    @Column(name = "id_address")
    private Long idAddress;

    public Person(String firstName, String lastName, Integer age, Long idAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.idAddress = idAddress;
    }
}
