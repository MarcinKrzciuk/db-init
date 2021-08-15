package com.example.dbinit.composedprimary.pk;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class DepartmentPk implements Serializable {

    private String name;
    private Long number;
}
