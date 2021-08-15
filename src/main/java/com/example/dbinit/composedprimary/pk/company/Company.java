package com.example.dbinit.composedprimary.pk.company;

import com.example.dbinit.composedprimary.pk.company.embedabbles.Address;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_company")
    private Long idCompany;

    private String name;

    @Embedded
    @AttributeOverride(name = "no", column = @Column(name = "nr"))
    private Address address;
}
