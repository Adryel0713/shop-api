package com.nullpointerx.shop.services;

import com.nullpointerx.shop.exceptions.RecursoNaoEncontradoException;
import com.nullpointerx.shop.model.Product;
import com.nullpointerx.shop.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return repository.findById(id).orElseThrow(() -> new RecursoNaoEncontradoException("O ID " + id + " não foi encontrado."));
    }

    public Product insert(Product product){
        return repository.save(product);
    }

    public void deleteById(Long id){
        if(!repository.existsById(id)){
            throw new RecursoNaoEncontradoException("O ID " + id + " não foi encontrado!");
        }
        repository.deleteById(id);
    }
}
