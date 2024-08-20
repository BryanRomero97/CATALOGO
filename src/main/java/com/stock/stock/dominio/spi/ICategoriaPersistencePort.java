package com.stock.stock.dominio.spi;

import com.stock.stock.dominio.modelo.Categoria;

import java.util.List;

public interface ICategoriaPersistencePort {

    void crearCategoria(Categoria categoria);

    List<Categoria> listarCategoria();

    Categoria obtenerCategoria(Long id);

    void actualizar (Categoria categoria);

    void eliminarCategoria(Long id);
}
