package com.example.dbinit.composedprimary.pk.company;

import com.example.dbinit.composedprimary.pk.DepartmentPk;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(DepartmentPk.class)
@Getter
@Setter
public class Department {

    @Id
    private String code;

    @Id
    private Long number;

    private String name;
}
