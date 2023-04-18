## **Expressões lambda**

As expressões lambda foram incluídas no Java 8 como uma maneira concisa de definir métodos diretamente no local de sua utilização nos casos em que essa funcionalidade será usada apenas uma vez.

A vantagem das expressões lambda em Java é sua simplicidade, na sintaxe, uma expressão lambda (ou apenas um lambda) é uma função anônima, ou seja, um método sem a declaração do próprio nome; no qual são omitidos seu modificador de acesso e o tipo do valor de retorno; e cuja lista tipada de parâmetros formais torna-se uma lista simples de parâmetros.

### ***Regras, normas e permissões da sintaxe:***

 - Os parenteses iniciais podem ser omitidos quando a expressão lambda con- tém um único parâmetro, mas são obrigatórios quando um parâmetro não é requerido ou quando são dois ou mais.

 - Os tipos dos parâmetros não precisam ser indicados quando o compilador pode inferi-los a partir do contexto de uso da expressão. 

 - Quando a expressão contém somente uma expressão (forma pura), não é necessária a diretiva return.

 - As chaves são necessárias apenas quando a expressão lambda inclui várias diretivas, o que exige o uso explícito da diretiva return.

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

// exemplo 3:
(var x) -> Math.pow(x, 2) + 2*x + 1 //O uso de var pode ser mais flexível, pois permite tornar um parâmetro final, o que impede sua alteração dentro do lambda.
```
