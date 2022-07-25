package com.backend.main.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.main.entities.categoriaEntity;

@Repository
public interface categoriaRepository extends JpaRepository<categoriaEntity, Long> {

	Optional<categoriaEntity> findById(Integer id);

}
 