<img src="src/ProjetosJava.png"></img>
# Exercícios e projetos Java

Este repositório foi criado para armazenar projetos e exercícios em Java, servindo como um portfólio de prática e aprendizado contínuo na linguagem.

## Estrutura do Repositório

### `java`

Esta pasta é dedicada a exercícios e projetos pequenos, focados em conceitos específicos da linguagem. Cada exercício é acompanhado de uma breve descrição em seu arquivo `README.md`, detalhando os tópicos trabalhados para fixação e prática.


### `CatalogoCSV-TesteJUNIT`

Este projeto evolui a lógica do `CatalogoSimplescomCSVa`, reestruturando-o em um formato **Maven** com o objetivo principal de adicionar **Testes Unitários** para a classe de modelo `Produto`. 

O arquivo `ProdutoTest.java` utiliza o framework **JUnit 4** para verificar o comportamento da classe `Produto`, garantindo que ela armazene e manipule os dados corretamente. Os testes cobrem três cenários principais:

* **Teste de Construtor**: Valida se um objeto `Produto` é criado e inicializado corretamente.
* **Teste de Setters**: Garante que os métodos `set` (`setNome`, `setPreco`, etc.) alteram o estado do objeto como esperado.
* **Teste de Lógica**: Simula um cálculo (valor total do estoque) para confirmar que os dados no objeto podem ser usados para operações de negócio corretas.

### API RESTful Completa: Catálogo de Livros

Este projeto implementa uma **API RESTful** completa para um **Catálogo de Livros**, utilizando **Spring Boot** e **Spring Data JPA**. É uma demonstração prática de todas as operações **CRUD** (Create, Read, Update, Delete). 📚

A API expõe os seguintes *endpoints* na rota base `/livros`:

* **`POST /livros`**: Adiciona um novo livro ao catálogo.
* **`GET /livros`**: Lista todos os livros existentes.
* **`GET /livros/{id}`**: Busca um único livro pelo seu ID.
* **`PUT /livros/{id}`**: Atualiza as informações de um livro existente.
* **`DELETE /livros/{id}`**: Remove um livro do catálogo.

Pontos-chave demonstrados:
* **Mapeamento HTTP Completo**: Uso das anotações `@PostMapping`, `@GetMapping`, `@PutMapping` e `@DeleteMapping` para cada operação CRUD.
* **Variáveis de Caminho**: Utilização de `@PathVariable` para capturar o `id` da URL e operar em um recurso específico.
* **Validação no Modelo**: A entidade `Livro` possui validações simples em seus métodos `set` para garantir a integridade dos dados.
* **Tratamento de Erros**: O código introduz o tratamento para casos de "não encontrado" usando `.orElseThrow()`, uma prática comum ao buscar por um recurso que pode não existir.

### API com Relacionamento, Docker, Flyway e PostgreSQL: `LivroseAutores`

Este projeto representa um salto significativo em complexidade e boas práticas, construindo uma API REST com um ecossistema de produção mais realista, que inclui:

* **Relacionamento de Entidades (JPA)**: Modela o relacionamento `OneToMany` / `@ManyToOne` entre as entidades **Autor** e **Livro** usando **Spring Data JPA**.
* **Banco de Dados PostgreSQL**: Abandona o banco em memória H2 em favor do **PostgreSQL**, um sistema de gerenciamento de banco de dados relacional robusto e amplamente utilizado em produção. 🐘
* **Containerização com Docker**: Utiliza **Docker** e um arquivo `docker-compose.yml` para **containerizar** a aplicação e o banco de dados. Isso garante um ambiente de desenvolvimento consistente, isolado e facilmente replicável com um único comando. 🐳
* **Migrações com Flyway**: Introduz o **Flyway** para gerenciamento de **migrações de banco de dados**. Os scripts SQL na pasta `resources/db/migration` definem a estrutura das tabelas, permitindo que o esquema do banco evolua de forma versionada e automática junto com o código.
* **Arquitetura em Camadas**: Consolida a arquitetura em camadas (Controller, Service, Repository), separando as responsabilidades e tornando o código mais organizado e manutenível.
* 
