package com.backend.main.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//de persistencia para la base de datos
@Entity 
//tambien de persistencia
@Table(name= "producto") 
public class productoEntity {
	@Id
	@Column(name="id")
	// general el id automaticamente y consecutivo
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	//nombre de la columna
	@Column(name="nombre") 
	private String nombre;
	
	@Column(name="vendedor")
	private String vendedor;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="precio")
	private Double precio;
	
	 //relaciona 
	@ManyToOne
	
	@Column(name="categoria")
	@JoinTable(name="categoria")
	
	//que atributo se va a usar para identificar
	@JoinColumn(name="id") 
	private Integer Categoria;
	
	//para que tengo que generar los getters and setters? 
	//por que hay que agregar un metodo constructor?
	

	public Integer getId() {
		return id;
	}

	public productoEntity(String nombre, String vendedor, String descripcion, Double precio, Integer categoria) {
		super();
		this.nombre = nombre;
		this.vendedor = vendedor;
		this.descripcion = descripcion;
		this.precio = precio;
		Categoria = categoria;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCategoria() {
		return Categoria;
	}

	public void setCategoria(Integer categoria) {
		Categoria = categoria;
	}
 
}


