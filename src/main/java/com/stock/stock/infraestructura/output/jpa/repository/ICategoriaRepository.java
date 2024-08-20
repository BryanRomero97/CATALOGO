package com.stock.stock.infraestructura.output.jpa.repository;

import com.stock.stock.infraestructura.output.jpa.entity.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ICategoriaRepository extends JpaRepository<CategoriaEntity, Long> {

    //Optional<CategoriaEntity> findByid(Long pokemonNumber);
}
