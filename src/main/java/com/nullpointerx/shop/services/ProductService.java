package com.nullpointerx.shop.services;

import com.nullpointerx.shop.model.Product;
import com.nullpointerx.shop.repositories.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        return repository.findById(id).orElseThrow();
    }

    public Product insert(Product product){
        return repository.save(product);
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }
}
