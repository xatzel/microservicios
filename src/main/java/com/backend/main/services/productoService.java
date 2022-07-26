package com.backend.main.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.main.entities.productoEntity;
import com.backend.main.repository.productoRepository;

@Service
public class productoService {
	
	@Autowired //nos permite crear una inyeccion de este elemento sin crear una instancia 
	
	//crear la implementacion con un atributo
	private productoRepository productoRepository;

	
	public List<productoEntity> findAll() {
		
		return productoRepository.findAll();
	}
	public productoEntity guardarProducto(productoEntity productoNuevo){
        return productoRepository.save(productoNuevo);
    }

    public Optional<productoEntity> obtenerProductoPorId(long id){
        return productoRepository.findById(id);
    }

    public boolean eliminarProducto(long id) {
        try{
            productoRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
	public Object getAllProducto() {
		// TODO Auto-generated method stub
		return null;
	}
}