package com.aura.chhvclb.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Client {

    @Id
    @SequenceGenerator(name = "clientSequence", sequenceName = "CLIENT_ID_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clientSequence")
    private long id;

    @Column(nullable = false, length = 25)
    private String name;

    @Column(nullable = false, length = 25)
    private String lastName;

    @Column(length = 25)
    private String patronymic;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(length = 15)
    private String phone;

    @OneToOne(cascade = CascadeType.ALL)
    private Basket basket;

    @OneToOne(cascade = CascadeType.ALL)
    private Order order;

    @OneToOne
    private User user;

}
