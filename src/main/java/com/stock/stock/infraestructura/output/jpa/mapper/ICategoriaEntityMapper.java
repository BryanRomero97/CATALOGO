package com.stock.stock.infraestructura.output.jpa.mapper;

import com.stock.stock.dominio.modelo.Categoria;
import com.stock.stock.infraestructura.output.jpa.entity.CategoriaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ICategoriaEntityMapper {

    CategoriaEntity toEntity(Categoria categoria);

    Categoria toCategoria(CategoriaEntity categoria);

    List<Categoria> toCategoriaList(List<CategoriaEntity> categoriaEntityList);
}
