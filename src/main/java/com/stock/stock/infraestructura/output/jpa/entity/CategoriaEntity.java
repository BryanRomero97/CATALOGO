package com.stock.stock.infraestructura.output.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table (name = "categoria")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre ;
    private String descripcion;
}
