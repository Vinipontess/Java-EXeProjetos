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

### `Herancas.java`

Este exercício demonstra um dos pilares da **Programação Orientada a Objetos (POO)**: a **Herança**. Ele define uma classe base (`Funcionario`) com atributos e métodos comuns e, em seguida, uma subclasse (`Gerente`) que **estende** (`extends`) `Funcionario`, herdando suas características e adicionando novos atributos e comportamentos específicos. O código destaca o uso da palavra-chave `super()` no construtor da subclasse para chamar o construtor da classe pai, garantindo a inicialização correta dos atributos herdados.

### `Polimorfismo.java`

Aprofundando nos conceitos de **POO**, este código é um exemplo prático de **Polimorfismo**. Ele evolui o exemplo anterior ao transformar `Funcionario` em uma **classe abstrata** (`abstract class`) com um **método abstrato** (`abstract double calcularSalario()`). As subclasses `Gerente` e `Programador` são, então, obrigadas a **sobrescrever** (`@Override`) este método, cada uma com sua própria lógica de cálculo. O polimorfismo é demonstrado no método estático `imprimirSalario`, que aceita um objeto do tipo genérico `Funcionario` e invoca o método `calcularSalario()` correto em tempo de execução, dependendo se o objeto real é um `Gerente` ou um `Programador`.

