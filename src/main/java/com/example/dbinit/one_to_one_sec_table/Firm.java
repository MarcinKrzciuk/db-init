
//Using secondary table to manage foreign keys


package com.example.dbinit.one_to_one_sec_table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@SecondaryTable(name = "Faddress",
    pkJoinColumns = @PrimaryKeyJoinColumn(name = "id_firm"))
@SecondaryTable(name = "Info",
        pkJoinColumns = @PrimaryKeyJoinColumn(name = "id_firm"))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Firm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_firm")
    private Long idFirm;

    @Column(name = "firm_name")
    private String firmName;

    @Column(table = "Faddress", name = "street")
    private String street;
    @Column(table = "Faddress", name = "number")
    private String number;

    @Column(table = "Info")
    private String details;

}
