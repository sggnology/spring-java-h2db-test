package com.h2dbtest.h2dbtest.model;

import javax.persistence.*;

@Entity
@Table(name = "Countries")
public class Countries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name", nullable = false)
    String name;

    public Countries() {
    }

    public Countries(String name) {
        this.name = name;
    }
}
