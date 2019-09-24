package br.com.intelligix.WebServiceJSW.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.intelligix.WebServiceJSW.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
