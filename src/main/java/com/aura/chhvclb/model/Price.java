package com.aura.chhvclb.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Price {

    @Id
    @SequenceGenerator(name = "priceSequence", sequenceName = "PRICE_ID_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "priceSequence")
    private long id;

    @OneToOne
    private Product product;

    @Column(nullable = false, scale = 2)
    private BigDecimal price;

    @Column(scale = 2)
    private BigDecimal discount;

    @Column(scale = 2)
    private BigDecimal price_discount;

}
