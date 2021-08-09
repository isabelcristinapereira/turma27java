package com.generation.blogPessoal.Repository;



import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.blogPessoal.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long>{
    
    public List <Tema> findAllByDescricaoContainingIgnoreCase (String descricao);

    public Optional <Tema> findByDescricaoContainingIgnoreCase (String descricao);
    
    public Tema findByDescricao(String descricao);

}