package com.example.democracycookies.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class Сookies {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private String tag;

    public Сookies(String description, String tag) {
        this.description = description;
        this.tag = tag;
    }
}
