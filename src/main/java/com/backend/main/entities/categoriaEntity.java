package com.backend.main.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name= "categoria")
public class categoriaEntity {
	
		@Id   //solo crea id, puede ser para ingresar curp o dpi
		@Column(name="id")
		@GeneratedValue(strategy= GenerationType.IDENTITY) //para crear un id consecutivo
		private Integer id;
		
		@ManyToOne
		@JoinColumn
		@Column
		private String descripcion;

		public Integer getId() {
			// TODO Auto-generated method stub
			return null;
		}

		public String getNombre() {
			// TODO Auto-generated method stub
			return null;
		}

		public String getDescripcion() {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		

	
		

}
