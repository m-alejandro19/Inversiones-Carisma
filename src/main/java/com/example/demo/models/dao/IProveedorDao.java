package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.entities.Proveedor;


public interface IProveedorDao extends CrudRepository<Proveedor, Long> {
	
	
	//CrudRepository implementa todas las operaciones basicas de un crud.
	
	//@Query("select u from Customer u where u.email = ?1")
	//public Customer findByEmailAddress(String email);

}
