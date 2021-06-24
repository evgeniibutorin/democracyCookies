package com.example.democracycookies.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private String tag;

    @Getter
    @Setter
    @OneToMany
    List<Comment> comments;

    public Product(String description, String tag) {
        this.description = description;
        this.tag = tag;
    }
}
