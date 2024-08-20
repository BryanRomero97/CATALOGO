package com.stock.stock.infraestructura.configuration;

import com.stock.stock.dominio.api.ICategoriaServicePort;
import com.stock.stock.dominio.spi.ICategoriaPersistencePort;
import com.stock.stock.dominio.usecase.CategoriaUseCase;
import com.stock.stock.infraestructura.output.jpa.adapter.CategoriaJpaAdapter;
import com.stock.stock.infraestructura.output.jpa.mapper.ICategoriaEntityMapper;
import com.stock.stock.infraestructura.output.jpa.repository.ICategoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    private final ICategoriaRepository categoriaRepository;
    private final ICategoriaEntityMapper categoriaEntityMapper;

    public BeanConfiguration(ICategoriaRepository categoriaRepository, ICategoriaEntityMapper categoriaEntityMapper) {
        this.categoriaRepository = categoriaRepository;
        this.categoriaEntityMapper = categoriaEntityMapper;
    }

    @Bean
    public ICategoriaPersistencePort categoriaPersistencePort(){
        return new CategoriaJpaAdapter(categoriaRepository, categoriaEntityMapper);
    }

    @Bean
    public ICategoriaServicePort categoriaServicePort(){
        return new CategoriaUseCase(categoriaPersistencePort());
    }

}
