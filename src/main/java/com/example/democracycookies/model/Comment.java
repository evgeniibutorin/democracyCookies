package com.example.democracycookies.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    @Getter
    Integer id;

    @Getter
    @Setter
    String comment;

    @Getter
    @Setter
    @ManyToOne
    Product product;

    @ManyToOne
    @Getter
    @Setter
    User user;

}
