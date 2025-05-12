package com.nullpointerx.shop.repositories;

import com.nullpointerx.shop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
