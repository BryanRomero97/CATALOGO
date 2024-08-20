package com.stock.stock.aplicacion.mapper;

import com.stock.stock.aplicacion.dto.request.CategoriaDtoRequest;
import com.stock.stock.dominio.modelo.Categoria;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ICategoriaRequestMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "descripcion", target = "descripcion")
    Categoria toCategoria(CategoriaDtoRequest categoriaDto);



}
