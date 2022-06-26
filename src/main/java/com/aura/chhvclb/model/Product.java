package com.aura.chhvclb.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @SequenceGenerator(name = "productSequence", sequenceName = "PRODUCT_ID_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productSequence")
    private long id;

    @Column(unique = true, length = 40)
    private String name;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "product")
    private List<Photo> photos;

    @Column(name = "is_in_stock", nullable = false)
    private boolean isInStock;

    @Column(columnDefinition = "json")
    private String colors;

    @Column(columnDefinition = "json")
    private String sizes;

    @Column(length = 6)
    private String sex;

    @Column(length = 1000)
    private String description;

    @Column
    private int count;

    @ManyToMany(mappedBy="productSet")
    private Set<Category> categorySet;

    @ManyToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Basket basket;

    @OneToOne(cascade = CascadeType.ALL)
    private Price price;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "product_order",
            joinColumns=
            @JoinColumn(name="product_id", referencedColumnName="id"),
            inverseJoinColumns=
            @JoinColumn(name="order_id", referencedColumnName="id")
    )
    private Set<Order> orderSet;



}