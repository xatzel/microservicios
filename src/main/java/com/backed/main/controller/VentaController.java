package com.backed.main.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.backend.main.entities.productoEntity;
import com.backend.main.services.productoService;

public class VentaController {

	 @Autowired
	    productoService productoService;

	    @GetMapping("/producto")
	    public List<productoEntity> arrayproducto(){
	        return productoService.findAll();
	    }
	    
}
