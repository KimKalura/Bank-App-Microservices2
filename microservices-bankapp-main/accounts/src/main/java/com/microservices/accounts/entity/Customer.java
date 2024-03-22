package com.microservices.accounts.entity;

import jakarta.persistence.*;
import lombok.*;


    @Entity
    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    public class Customer {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "customer_id")
        private Long customerId;

        private String name;

        private String email;

        @Column(name = "mobile_number")
        private String mobileNumber;

    }


