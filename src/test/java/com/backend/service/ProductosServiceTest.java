package com.backend.service;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.backend.main.dtos.ProductoDTO;
import com.backend.main.entities.productoEntity;
import com.backend.main.repository.productoRepository;
import com.backend.main.services.productoService;

public class ProductosServiceTest {
	 @Mock
	    private transient productoRepository productoRepositorio;

	    @InjectMocks
	    private productoService productoServicio;
	    private ProductoDTO productoDTO;
	    private productoEntity producto;

	    @BeforeEach
	    void setUp() {
	        MockitoAnnotations.initMocks(this);

	        productoDTO = new ProductoDTO();
	        productoDTO.setNombre("Platano");
	        productoDTO.setDescripcion("Platano amarillo trasngenico");
	    }

	    @Test
	    void getAllProducto() {
	        when(productoServicio.getAllProducto()).thenReturn(new ArrayList<>());
	        assertNotNull(productoServicio.getAllProducto());
	    }

	    @Test
	    void guardarProducto() {
	        when(productoServicio.guardarProducto(producto)).thenReturn(producto);
	        assertNotNull(productoServicio.guardarProducto(producto));
	    }

	    @Test
	    void obtenerProductoPorId() {
	        assertNotNull(productoServicio.obtenerProductoPorId(1));
	    }

	    @Test
	    void eliminarProducto() {
	        assertNotNull(productoServicio.eliminarProducto(1));
	    }

}
