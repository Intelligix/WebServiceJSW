package br.com.intelligix.WebServiceJSW.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.intelligix.WebServiceJSW.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
