package com.example.dbinit.composed_primary_keys;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class DepartmentPk implements Serializable {

    private String name;
    private Long number;
}
