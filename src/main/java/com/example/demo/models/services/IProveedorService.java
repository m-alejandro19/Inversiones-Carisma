package com.example.demo.models.services;


import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.entities.Proveedor;
//import com.example.demo.models.entities.Factura;


public interface IProveedorService 
{
		public List<Proveedor> findAll(); 
		public void save(Proveedor proveedor);
		public Proveedor findOne(Long id);
		public void delete(Long id);
	

}
