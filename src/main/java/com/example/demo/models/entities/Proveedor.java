package com.example.demo.models.entities;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="proveedor")
public class Proveedor implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "customers_Seq")
	@SequenceGenerator(name = "customers_Seq", sequenceName = "CUSTOMERS_SEQ")
	private long id;
	
	@Column(name="fechaRegistro")
	@NotEmpty String fechaRegistro;
	
	
	@Column(name="giroVenta")
	@NotEmpty String giroVenta;
	
	
	@Column(name="direccion")
	@NotEmpty String direccion;
	
	
	@Column(name="nit")
	@NotEmpty String nit;
		
	@Column(name="nombreComercial")
	@NotEmpty
	private String nombreComercial;
	
	
	@Column(name="nombreLegal")
	@NotEmpty
	private String nombreLegal;
	
	public Proveedor()
	{
		
	}
	
	public Long getId() {
		return id;
	}
	
	public String getNombreComercial() {
		return nombreComercial;
	}
	
	public String getNombreLegal() {
		return nombreLegal;
	}
	
	public String getNit() {
		return nit;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public String getGiroVenta() {
		return giroVenta;
	}
	
	public String getFechaRegistro() {
		return fechaRegistro;
	}
	
	
	
	
}
