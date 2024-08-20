package com.stock.stock.dominio.usecase;

import com.stock.stock.dominio.api.ICategoriaServicePort;
import com.stock.stock.dominio.modelo.Categoria;
import com.stock.stock.dominio.spi.ICategoriaPersistencePort;

import java.util.List;

public class CategoriaUseCase implements ICategoriaServicePort {


    private final ICategoriaPersistencePort categoriaPersistencePort;

    public CategoriaUseCase(ICategoriaPersistencePort categoriaPersistencePort) {
        this.categoriaPersistencePort = categoriaPersistencePort;
    }

    @Override
    public void crearCategoria(Categoria categoria) {
        categoriaPersistencePort.crearCategoria(categoria);
    }

    @Override
    public List<Categoria> listarCategoria() {
        return categoriaPersistencePort.listarCategoria();
    }

    @Override
    public Categoria obtenerCategoria(Long id) {
        return  categoriaPersistencePort.obtenerCategoria(id);
    }

    @Override
    public void actualizar(Categoria categoria) {
        categoriaPersistencePort.actualizar(categoria);
    }

    @Override
    public void eliminarCategoria(Long id) {
     categoriaPersistencePort.eliminarCategoria(id);
    }
}
