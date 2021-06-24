package com.example.democracycookies.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Rating {
    @Id
    @Getter
    @Setter
    Integer id;

    @Getter
    @Setter
    int mark;

    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    Product product;

    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    User user;

}
