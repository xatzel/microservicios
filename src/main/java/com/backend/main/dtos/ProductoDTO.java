package com.backend.main.dtos;

import com.backend.main.entities.productoEntity;

public class ProductoDTO {

	private Integer id;
	private String nombre;
	private String descripcion;
	
	public ProductoDTO() {
		super();
	}

	public ProductoDTO(productoEntity p) {
		this.id = p.getId();
		this.nombre = p.getNombre();
		this.descripcion = p.getDescripcion();
	}
	
	public Integer getId() {
		return id;
	}
	public void setid(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
