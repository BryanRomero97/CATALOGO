package com.stock.stock.aplicacion.handler;

import com.stock.stock.aplicacion.dto.request.CategoriaDtoRequest;
import com.stock.stock.aplicacion.dto.response.CategoriaDtoResponse;
import com.stock.stock.dominio.modelo.Categoria;

import java.util.List;

public interface ICategoriaHandler {

    void crearCategoria(CategoriaDtoRequest categoriaDtoRequest);

    List<CategoriaDtoResponse> listarCategoria();

    CategoriaDtoResponse obtenerCategoria(Long id);

    void actualizar (CategoriaDtoRequest categoriaDtoRequest);

    void eliminarCategoria(Long id);

}
