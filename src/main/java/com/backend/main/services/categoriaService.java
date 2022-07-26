package com.backend.main.services;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
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

    public Optional<categoriaEntity> obtenerCategoriaPorId(int i){
        return categoriaRepository.findById(i);
    }

    public boolean eliminarCategoria(Long id) {
        try{
            categoriaRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }


	public Object getAllCategoria() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
