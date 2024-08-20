package com.stock.stock.aplicacion.mapper;

import com.stock.stock.aplicacion.dto.response.CategoriaDtoResponse;
import com.stock.stock.dominio.modelo.Categoria;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ICategoriaResponseMapper {
    CategoriaDtoResponse toCategoriaDto (Categoria categoria);

    default List<CategoriaDtoResponse> toListDtoRespons(List<Categoria> categorias){
        List<CategoriaDtoResponse> categoriaDtoResponses = List.of();
        for(Categoria categoria: categorias){
            CategoriaDtoResponse categoriaDtoResponse = toCategoriaDto(categoria);
            categoriaDtoResponses.add(categoriaDtoResponse);
        }
        return categoriaDtoResponses;
    }
}

