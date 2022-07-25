package com.backed.main.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.backend.main.entities.categoriaEntity;
import com.backend.main.services.categoriaService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/categoria")
public class categoriaController {
	
	@Autowired
    categoriaService categoraService;

    @ApiOperation(value = "Obtiene todas las categorias")
    @GetMapping()
    public List<categoriaEntity> findAll(){
        return categoraService.findAll();
    }

    @ApiOperation(value = "Se crea nueva categoria, tambien agregando el id actualiza")
    @PostMapping()
    public categoriaEntity guardarCategoria(@RequestBody categoriaEntity categoriaNueva){
        return this.categoraService.guardarCategoria(categoriaNueva);
    }

    @ApiOperation(value = "Se obtiene una categoria por id")
    @GetMapping( path = "/{id}" )
    public java.util.Optional<categoriaEntity> obtenerCategoriaPorId(@PathVariable("id") Long id) {
        return this.categoraService.obtenerCategoriaPorId(id);
    }

    @ApiOperation(value = "Elimina una categoria por id")
    @DeleteMapping( path = "/{id}" )
    public String eliminarCategoria(@PathVariable("id") Long id){
        boolean ok = this.categoraService.eliminarCategoria(id);
        if(ok){
            return "Se elimino la Categoria con id " + id + " correctamente";
        }else{
            return "No se pudo eliminar la categoria con id " + id;
        }
    }
    
}
