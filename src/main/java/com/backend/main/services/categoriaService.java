package com.backend.main.services;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.backend.main.entities.categoriaEntity;
import com.backend.main.repository.categoriaRepository;

@Service //sin esto no jala
public class categoriaService {
	
	@Autowired
	private categoriaRepository categoriaRepository;

	
	public List<categoriaEntity> findAll() {
		return categoriaRepository.findAll();
	}
	

    public categoriaEntity guardarCategoria(categoriaEntity categoriaNueva){
        return categoriaRepository.save(categoriaNueva);
    }

    public Optional<categoriaEntity> obtenerCategoriaPorId(Long id){
        return categoriaRepository.findById(id);
    }

    public boolean eliminarCategoria(Long id) {
        try{
            categoriaRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
	
}
