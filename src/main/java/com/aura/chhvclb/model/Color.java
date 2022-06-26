package com.aura.chhvclb.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Color {

    @Id
    @SequenceGenerator(name = "colorSequence", sequenceName = "COLOR_ID_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "colorSequence")
    private long id;

    @Column(unique = true, length = 50)
    private String color;

}