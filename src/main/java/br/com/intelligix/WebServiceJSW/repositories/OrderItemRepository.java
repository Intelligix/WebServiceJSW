package br.com.intelligix.WebServiceJSW.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.intelligix.WebServiceJSW.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
