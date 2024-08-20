package com.stock.stock.dominio.api;

import com.stock.stock.dominio.modelo.Categoria;

import java.util.List;

public interface ICategoriaServicePort {

    void crearCategoria(Categoria categoria);

    List<Categoria> listarCategoria();

    Categoria obtenerCategoria(Long id);

    void actualizar (Categoria categoria);

    void eliminarCategoria(Long id);

}
