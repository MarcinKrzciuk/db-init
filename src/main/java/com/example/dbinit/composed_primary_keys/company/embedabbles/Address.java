package com.example.dbinit.composed_primary_keys.company.embedabbles;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
public class Address {

    private String street;
    private String no;
    private String zip;

}
