

/*
***************** ONE TO ONE RELATION
***************** ONE DIRECTION
***************** ONLY DETAIL ENTITY KNOWS ABOUT PRODUCT ENTITY
 */


package com.example.dbinit.one_to_one_ONE_DIRECTION;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detail")
    private Long idDetail;

    private Integer kcal;

    @JoinColumn(name = "id_product")
    @OneToOne(cascade = CascadeType.ALL)
    private Product product;

    public Detail(Integer kcal, Product product) {
        this.kcal = kcal;
        this.product = product;
    }
}
