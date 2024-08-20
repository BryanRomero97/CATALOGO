package com.stock.stock.aplicacion.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaDtoResponse {
        private Long id;
        private String nombre ;
        private String descripcion;
}
