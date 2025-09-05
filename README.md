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
