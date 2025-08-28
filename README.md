<img src="src/ProjetosJava.png"></img>
# Exercícios e projetos Java

Este repositório foi criado para armazenar projetos e exercícios em Java, servindo como um portfólio de prática e aprendizado contínuo na linguagem.

## Estrutura do Repositório

### `java`

Esta pasta é dedicada a exercícios e projetos pequenos, focados em conceitos específicos da linguagem. Cada exercício é acompanhado de uma breve descrição em seu arquivo `README.md`, detalhando os tópicos trabalhados para fixação e prática.

### `CatalogoSimplescomCSV`

Este é um projeto mais completo que demonstra a **leitura e interpretação (parsing) de um arquivo CSV** (`produtos.csv`), uma tarefa muito comum em programação. O programa combina vários conceitos aprendidos:

* **Leitura de Arquivo**: Utiliza **Java NIO** (`Files.readAllLines`) para carregar o conteúdo do CSV.
* **Parsing de Dados**: Para cada linha lida, aplica o método `String.split(",")` para separar os campos. Em seguida, converte os dados de `String` para seus tipos corretos com `Double.parseDouble()` e `Integer.parseInt()`.
* **Orientação a Objetos**: Os dados de cada produto são armazenados em uma instância da classe `Produto`, que serve como um **modelo de dados (POJO)**.
* **Menu Interativo**: Um laço `while` com uma estrutura `switch` cria um menu que permite ao usuário **listar todos os produtos** ou **buscar por um produto específico** pelo nome.
