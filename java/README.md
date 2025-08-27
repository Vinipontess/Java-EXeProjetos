# Descrição dos exercícios e pequenos projetos

### `Tabuada.java`

Este exercício utiliza **laços de repetição** (`while`) para gerar a tabuada dos números de 1 a 10. Ele demonstra o uso de **variáveis** para armazenar valores e o uso de **estruturas de controle de fluxo** (`if`) para resetar o contador e passar para a próxima tabuada, exibindo o resultado na tela.

### `Adivinhacao.java`

Este mini-projeto é um jogo de adivinhação que utiliza a **classe `Scanner`** para receber a entrada do usuário e a classe **`Math`** para gerar um número aleatório. O exercício foca no uso de **laços de repetição** (`while`) e **estruturas de controle condicional** (`if/else if/else`) para guiar o jogo.

### `acoes.java`

Este programa simula uma simples ferramenta de análise de ações, demonstrando conceitos de **Programação Orientada a Objetos (POO)** com a criação da classe `acoes`. Ele utiliza **métodos** para calcular indicadores financeiros, a classe **`Scanner`** para interação com o usuário e **laços de repetição** (`while`) para criar um menu de navegação. A formatação de saída com `printf` também é praticada para exibir os valores monetários corretamente.

### Exercícios de Estrutura de Conta Bancária

Este grupo de exercícios demonstra a evolução do desenvolvimento de um sistema simples de conta bancária, partindo de uma abordagem procedural e migrando para conceitos fundamentais de **Programação Orientada a Objetos (POO)**.

* **`CaixaEletronico.java`**: Versão inicial que utiliza estruturas de controle (`switch`, `while`) para simular o menu e as operações básicas de um caixa eletrônico em um único método `main`.
* **`CaixaEletronicoPOO.java`**: Introduz o conceito de **classe**, separando a lógica da conta bancária (`saldo`, `depositar`, `sacar`) em seu próprio objeto.
* **`ContaBancariaConstrutores.java`**: Adiciona o uso de **construtores** para garantir que as novas instâncias de `ContaBancaria` sejam inicializadas com dados essenciais, como número da conta e titular, de forma segura.
* **`ContaBancariaGettersSetters.java`**: Por fim, implementa o conceito de **Encapsulamento** com o uso de **`getters` e `setters`**, tornando as variáveis privadas (`private`) e controlando o acesso a elas.

### Evolução de um Sistema de Funcionários (POO)

Este conjunto de exercícios demonstra a aplicação progressiva de conceitos-chave da **Programação Orientada a Objetos (POO)**. Partindo da **Herança** para criar uma hierarquia de classes, o código evolui para introduzir **Polimorfismo** com classes e métodos abstratos, e finaliza com uma aplicação prática que utiliza o Java Collections Framework para gerenciar diferentes tipos de objetos de forma unificada.

* **`Herancas.java`**: Versão inicial que introduz o pilar da **Herança**. Cria uma classe base `Funcionario` e uma subclasse `Gerente` que herda seus atributos e métodos, utilizando as palavras-chave `extends` e `super()`.
* **`Polimorfismo.java`**: Introduz o **Polimorfismo** ao transformar a superclasse `Funcionario` em uma **classe abstrata** (`abstract class`) com um **método abstrato**. Isso força as subclasses a **sobrescreverem** (`@Override`) o método, permitindo que objetos de tipos diferentes respondam à mesma chamada.
* **`SistemadeFuncionarios.java`**: Demonstra uma aplicação prática do polimorfismo utilizando o Java Collections Framework. Vários objetos de subclasses diferentes (`Gerente`, `Programador`) são armazenados em uma única **`ArrayList<Funcionario>`** e processados de forma uniforme através de um laço de repetição.

### `TryCatchIdade.java`

Este exercício foca no **Tratamento de Exceções** (`Exception Handling`), um conceito crucial para criar programas robustos. Ele utiliza um bloco **`try-catch`** para lidar com possíveis erros na entrada de dados do usuário. O programa solicita a idade e, caso a entrada não seja um número inteiro, a exceção **`InputMismatchException`** é capturada. Em vez de quebrar o programa, o bloco `catch` exibe uma mensagem de erro amigável e permite que o usuário tente novamente, garantindo a **validação da entrada**.

### `ArrayListTarefas.java`

Este exercício prático foca na utilização do **`ArrayList`**, uma implementação fundamental do **Java Collections Framework**. O código simula uma lista de tarefas e demonstra as operações mais comuns: adicionar elementos com `add()`, obter o total de itens com `size()`, acessar um elemento específico pelo índice com `get()` e remover um item com `remove()`. Para finalizar, o programa percorre e exibe a lista atualizada utilizando um laço **`for-each`**.

### `HashSeteHashMap.java`

Este arquivo demonstra o uso de duas outras estruturas importantes do **Java Collections Framework**: o **`HashSet`** e o **`HashMap`**.
* **`HashSet`**: A primeira parte do código utiliza um `HashSet` para armazenar uma lista de e-mails, provando sua principal característica: a **não permissão de elementos duplicados**. Mesmo que um e-mail seja adicionado duas vezes, ele aparecerá na lista apenas uma vez.
* **`HashMap`**: A segunda parte apresenta o `HashMap` para criar um catálogo de produtos, onde cada item (a **chave** `String`) está associado a um preço (o **valor** `Double`). Demonstra operações essenciais como a inserção de dados com `put()`, a busca de um valor pela chave com `get()`, e a iteração sobre todos os registros .
  
