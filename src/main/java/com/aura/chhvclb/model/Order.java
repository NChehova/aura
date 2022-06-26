package com.aura.chhvclb.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Order {

    @Id
    @SequenceGenerator(name = "orderSequence", sequenceName = "ORDER_ID_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orderSequence")
    private long id;

    @OneToOne
    private OrderStatus status;

    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    @Column(name = "departure_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date departureDate;

    @Column(name = "receive_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date receiveDate;

    @ManyToMany(mappedBy="orderSet")
    private Set<Product> productSet;

    @OneToOne
    private Client client;

}
