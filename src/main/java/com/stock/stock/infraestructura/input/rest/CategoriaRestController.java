package com.stock.stock.infraestructura.input.rest;

import com.stock.stock.aplicacion.dto.request.CategoriaDtoRequest;
import com.stock.stock.aplicacion.dto.response.CategoriaDtoResponse;
import com.stock.stock.aplicacion.handler.ICategoriaHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria/")
@RequiredArgsConstructor
public class CategoriaRestController {

    private final ICategoriaHandler categoriaHandler;


    @PostMapping
    public ResponseEntity<Void> guardarCategoria(@RequestBody CategoriaDtoRequest categoria){
        categoriaHandler.crearCategoria(categoria);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<CategoriaDtoResponse>>listarCategoria(){
        return ResponseEntity.ok(categoriaHandler.listarCategoria());
    }

    @GetMapping("{id}")
    public ResponseEntity<CategoriaDtoResponse>obtenerCategoria(@PathVariable(name = "id") Long id){
        return ResponseEntity.ok(categoriaHandler.obtenerCategoria(id));
    }

    @PutMapping
    public ResponseEntity<Void> actualizarCatalogo(@RequestBody CategoriaDtoRequest categoria){
        categoriaHandler.actualizar(categoria);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteCategoria(@PathVariable Long id){
        categoriaHandler.eliminarCategoria(id);
        return ResponseEntity.noContent().build();
    }


}
