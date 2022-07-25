package com.backend.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.main.entities.productoEntity;

@Repository //obligatorio
public interface productoRepository extends JpaRepository<productoEntity, Long> {

}
