package br.com.intelligix.WebServiceJSW.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.intelligix.WebServiceJSW.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
