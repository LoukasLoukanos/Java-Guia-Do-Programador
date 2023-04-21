## **Expressões lambda**

As expressões lambda foram incluídas no Java 8 como uma maneira concisa de definir métodos diretamente no local de sua utilização nos casos em que essa funcionalidade será usada apenas uma vez.

A vantagem das expressões lambda em Java é sua simplicidade, na sintaxe, uma expressão lambda (ou apenas um lambda) é uma função anônima, ou seja, um método sem a declaração do próprio nome; no qual são omitidos seu modificador de acesso e o tipo do valor de retorno; e cuja lista tipada de parâmetros formais torna-se uma lista simples de parâmetros.

### ***Regras, normas e permissões da sintaxe:***

 - Os parenteses iniciais podem ser omitidos quando a expressão lambda contém um único parâmetro, mas são obrigatórios quando um parâmetro não é requerido ou quando são dois ou mais.

 - Os tipos dos parâmetros não precisam ser indicados quando o compilador pode inferi-los a partir do contexto de uso da expressão.

 - Quando a expressão contém somente uma expressão (forma pura), não é necessária a diretiva return.

 - As chaves são necessárias apenas quando a expressão lambda inclui várias diretivas, o que exige o uso explícito da diretiva return.

#### **Exemplos:**

```java
// SINTAXE BASE:
(listaParânetros) -> expressão

// exemplo 1:
(a) -> 2*a*a - 0.5*a - 1.3

// exemplo 2:
(int n) -> {
    int soma = 0;
    for (int i=1; i<=n; i++) soma += i;
    return soma;
}

// exemplo 3: O uso de var permite tornar um parâmetro final, o que impede sua alteração dentro do lambda.
(var x) -> Math.pow(x, 2) + 2*x + 1 

// exemplo 4: Ordenação de uma lista de objetos com base em um atributo específico:
List<Pessoa> pessoas = Arrays.asList(new Pessoa("João", 30), new Pessoa("Maria", 25), new Pessoa("Pedro", 35));
Collections.sort(pessoas, (p1, p2) -> p1.getIdade() - p2.getIdade());
System.out.println(pessoas);
// output: [Pessoa [nome=Maria, idade=25], Pessoa [nome=João, idade=30], Pessoa [nome=Pedro, idade=35]]

// exemplo 5: Filtragem de itens em uma lista com base em uma condição específica:
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
List<Integer> filtro = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
System.out.println(filtro);
// output: [2, 4, 6, 8, 10]

// exemplo 6 : Mapeamento de valores de uma lista para outra lista com base em uma função específica:
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> mapeamento = numeros.stream().map(n -> n * n).collect(Collectors.toList());
System.out.println(mapeamento);
// output: [1, 4, 9, 16, 25]

// exemplo 7: Redução de uma lista em um único valor com base em uma função específica:
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
int reducao = numeros.stream().reduce(0, (a, b) -> a + b);
System.out.println(reducao);
// output: 15
```
