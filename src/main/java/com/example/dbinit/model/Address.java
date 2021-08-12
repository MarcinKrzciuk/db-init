package com.example.dbinit.model;

import javax.persistence.*;

@Entity
@Table(name = "Address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_address;
    private String street;
    private Integer street_nr;
    private Integer zip_code;

    public Address(String street, Integer street_nr, Integer zip_code) {
        this.street = street;
        this.street_nr = street_nr;
        this.zip_code = zip_code;
    }
}
