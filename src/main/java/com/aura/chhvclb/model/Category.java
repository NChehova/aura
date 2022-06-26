package com.aura.chhvclb.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(uniqueConstraints =
        {@UniqueConstraint(columnNames = {
//                "color", "size", "description", "photo", "sex",
                "is_active"})})
public class Category {

    @Id
    @SequenceGenerator(name = "categorySequence", sequenceName = "CATEGORY_ID_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categorySequence")
    private long id;

    @Column(name = "prent_id")
    private long parentId;

    @Column(name = "category_name", unique = true, length = 70)
    private String categoryName;

//    @Column(name = "product_name")
//    private boolean productName = false;

//    @Column
//    private boolean color = false;
//
//    @Column
//    private boolean size = false;
//
//    @Column
//    private boolean description = false;
//
//    @Column
//    private boolean photo = false;
//
//    @Column
//    private boolean sex = false;

    @Column(name = "is_active", nullable = false)
    private boolean isActive = false;

    @ManyToMany
    @JoinTable(name = "product_category",
            joinColumns=
            @JoinColumn(name="category_id", referencedColumnName="id"),
            inverseJoinColumns=
            @JoinColumn(name="product_id", referencedColumnName="id")
    )
    private Set<Product> productSet;

}