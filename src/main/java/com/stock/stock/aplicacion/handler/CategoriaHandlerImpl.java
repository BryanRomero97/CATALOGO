package com.stock.stock.aplicacion.handler;

import com.stock.stock.aplicacion.dto.request.CategoriaDtoRequest;
import com.stock.stock.aplicacion.dto.response.CategoriaDtoResponse;
import com.stock.stock.aplicacion.mapper.ICategoriaRequestMapper;
import com.stock.stock.aplicacion.mapper.ICategoriaResponseMapper;
import com.stock.stock.dominio.api.ICategoriaServicePort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CategoriaHandlerImpl implements ICategoriaHandler{

    private final ICategoriaServicePort categoriaServicePort;
    private final ICategoriaRequestMapper categoriaRequestMapper;
    private final ICategoriaResponseMapper categoriaResponseMapper;

    @Override
    public void crearCategoria(CategoriaDtoRequest categoriaDtoRequest) {
        categoriaServicePort.crearCategoria(categoriaRequestMapper.toCategoria(categoriaDtoRequest));
    }

    @Override
    public List<CategoriaDtoResponse> listarCategoria() {

        return categoriaResponseMapper.toListDtoRespons(categoriaServicePort.listarCategoria());
    }

    @Override
    public CategoriaDtoResponse obtenerCategoria(Long id) {
        return categoriaResponseMapper.toCategoriaDto(categoriaServicePort.obtenerCategoria(id));
    }

    @Override
    public void actualizar(CategoriaDtoRequest categoriaDtoRequest) {
        categoriaServicePort.actualizar(categoriaRequestMapper.toCategoria(categoriaDtoRequest));
    }

    @Override
    public void eliminarCategoria(Long id) {
        categoriaServicePort.eliminarCategoria(id);
    }
}
