package com.backend.service;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import com.backend.main.entities.categoriaEntity;
import com.backend.main.repository.categoriaRepository;
import com.backend.main.services.categoriaService;

public class CategoriaServiceTest {
	 @Mock
	    private transient categoriaRepository categoriaRepositorio;

	    @InjectMocks
	    private categoriaService categoriaServicio;
	    private categoriaEntity categoria;

	    @Test
	    void getAllCategoria() {
	        when(categoriaServicio.getAllCategoria()).thenReturn(new ArrayList<>());
	        assertNotNull(categoriaServicio.getAllCategoria());
	    }

	    @Test
	    void guardarCategoria() {
	        when(categoriaServicio.guardarCategoria(categoria)).thenReturn(categoria);
	        assertNotNull(categoriaServicio.guardarCategoria(categoria));
	    }
	    
	    @Test
	    void obtenerCategoriaPorId() {
	        assertNotNull(categoriaServicio.obtenerCategoriaPorId(1));
	    }

	    @Test
	    void eliminarCategoria() {
	        assertNotNull(categoriaServicio.eliminarCategoria((long) 2));
	    }
	
}
