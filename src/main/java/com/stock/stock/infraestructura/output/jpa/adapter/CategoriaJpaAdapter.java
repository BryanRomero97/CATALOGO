package com.stock.stock.infraestructura.output.jpa.adapter;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.stock.stock.dominio.modelo.Categoria;
import com.stock.stock.dominio.spi.ICategoriaPersistencePort;
import com.stock.stock.infraestructura.exeptions.CategoriaAlreadyExistsEception;
import com.stock.stock.infraestructura.exeptions.CategoriaNotFoundExeption;
import com.stock.stock.infraestructura.exeptions.NoDataFoundExeption;
import com.stock.stock.infraestructura.output.jpa.entity.CategoriaEntity;
import com.stock.stock.infraestructura.output.jpa.mapper.ICategoriaEntityMapper;
import com.stock.stock.infraestructura.output.jpa.repository.ICategoriaRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class CategoriaJpaAdapter implements ICategoriaPersistencePort {

    private final ICategoriaRepository categoriaRepository;
    private final ICategoriaEntityMapper categoriaEntityMapper;

    @Override
    public void crearCategoria(Categoria categoria) {

        if (categoria.getId() == null) {
            System.out.println("ID no puede ser nulo");
        }

        if (categoriaRepository.findById(categoria.getId()).isPresent()){
            throw new CategoriaAlreadyExistsEception();
        }
        categoriaRepository.save(categoriaEntityMapper.toEntity(categoria));
    }

    @Override
    public List<Categoria> listarCategoria() {
       List<CategoriaEntity> listaCategorias= categoriaRepository.findAll();
       if (listaCategorias.isEmpty()){
           throw new NoDataFoundExeption();
       }
       return categoriaEntityMapper.toCategoriaList(listaCategorias);
    }

    @Override
    public Categoria obtenerCategoria(Long id) {
        if (categoriaRepository.findById(id).isEmpty()){
            throw new CategoriaNotFoundExeption();
        }
        CategoriaEntity categoria = categoriaRepository.findById(id).get();
        return categoriaEntityMapper.toCategoria(categoria);
    }

    @Override
    public void actualizar(Categoria categoria) {
        categoriaRepository.save(categoriaEntityMapper.toEntity(categoria));
    }

    @Override
    public void eliminarCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }


}
