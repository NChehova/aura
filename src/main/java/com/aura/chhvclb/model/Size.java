package com.aura.chhvclb.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Size {

    @Id
    @SequenceGenerator(name = "sizeSequence", sequenceName = "SIZE_ID_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sizeSequence")
    private long id;

    @Column(unique = true, length = 10)
    private String size;

}