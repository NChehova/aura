package com.aura.chhvclb.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "order_status")
@Getter
@Setter
@NoArgsConstructor
public class OrderStatus {

    @Id
    @SequenceGenerator(name = "orderStatusSequence", sequenceName = "ORDER_STATUS_ID_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orderStatusSequence")
    private long id;

    @Column(nullable = false, length = 25)
    private String status;

}
