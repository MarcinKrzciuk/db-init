package com.example.dbinit.practice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_address")
    private Long idAddress;
    private String street;
    @Column(name = "street_nr")
    private Integer streetNr;
    @Column(name = "zip_code")
    private Integer zipCode;

    public Address(String street, Integer streetNr, Integer zipCode) {
        this.street = street;
        this.streetNr = streetNr;
        this.zipCode = zipCode;
    }
}

