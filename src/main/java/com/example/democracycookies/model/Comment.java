package com.example.democracycookies.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    @Getter
    @Setter
    User user;

    public Comment(String comment, Product product, User user) {
        this.comment = comment;
        this.product = product;
        this.user = user;
    }
}
