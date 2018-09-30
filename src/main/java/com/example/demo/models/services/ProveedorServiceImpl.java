package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IProveedorDao;
import com.example.demo.models.entities.Proveedor;

@Service

public class ProveedorServiceImpl implements IProveedorService {
	
	//public class ProveedorServiceImpl implements IProveedprService {
	
	@Autowired
	private IProveedorDao proveedorDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Proveedor> findAll()
	{
		return (List<Proveedor>) proveedorDao.findAll();
	}
	
	@Override
	@Transactional(readOnly=true)
	public Proveedor findOne(Long id)
	{
		return proveedorDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional(readOnly=true)
	public void save(Proveedor proveedor)
	{
		proveedorDao.save(proveedor);
    }
	
	@Override
	@Transactional
	public void delete(Long id)
	{
		proveedorDao.deleteById(id);
	}
		
}
