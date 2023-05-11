## **Registro (record)**

Em Java, um registro (ou record, em inglês) é um novo tipo de classe introduzido a partir do Java 16. Ele é usado para representar dados imutáveis e é projetado para tornar a criação e o uso de objetos de dados simples e concisos.

Um registro em Java é declarado usando a palavra-chave "record" e define um conjunto fixo de campos que são inicializados no construtor do registro. Ele também fornece implementações padrão para métodos como equals(), hashCode() e toString().

Além disso, um registro em Java pode ser desestruturado, o que significa que seus campos podem ser acessados individualmente sem a necessidade de chamar métodos getters ou definir variáveis locais separadas para cada campo.

Em resumo, um registro em Java é uma classe simples e concisa que é usada para representar dados imutáveis e é projetada para ser fácil de criar, usar e manipular.

#### ***Exemplo simples de como criar um registro em Java::***

```java
public record Pessoa(String nome, int idade) {}

// Criando uma nova pessoa
Pessoa pessoa = new Pessoa("João", 30);

// Acessando os campos do registro
System.out.println("Nome: " + pessoa.nome());
System.out.println("Idade: " + pessoa.idade());

// Desestruturando o registro
String nome = pessoa.nome();
int idade = pessoa.idade();
System.out.println(nome + " tem " + idade + " anos.");

```
