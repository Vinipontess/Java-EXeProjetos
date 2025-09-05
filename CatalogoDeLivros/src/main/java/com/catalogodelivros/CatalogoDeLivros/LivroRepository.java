package com.catalogodelivros.CatalogoDeLivros;

import org.springframework.data.jpa.repository.JpaRepository;


//Aqui estamos criando um repositório para a entidade Livro
//O JpaRepository já traz métodos prontos para operações básicas de CRUD
public interface LivroRepository extends JpaRepository<Livro, Long> {
    
}
