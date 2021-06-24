package com.example.democracycookies.repository;

import com.example.democracycookies.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CookiesRepository extends JpaRepository<Product, Integer> {
}
