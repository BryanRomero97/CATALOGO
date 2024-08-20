package com.stock.stock.aplicacion.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaDtoRequest {
    private Long id;
    private String nombre ;
    private String descripcion;
}
