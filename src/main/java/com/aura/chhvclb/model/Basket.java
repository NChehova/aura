package com.aura.chhvclb.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Basket {

    @Id
    @SequenceGenerator(name = "basketSequence", sequenceName = "BASKET_ID_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "basketSequence")
    private long id;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "basket")
    private List<Product> products;

    @OneToOne
    private Client client;

}