## **Modo genérico em Java**

O modo genérico em Java é uma técnica que permite escrever classes e métodos que possam trabalhar com diferentes tipos de dados, de forma genérica e flexível. Em outras palavras, é uma forma de criar código reutilizável e que possa ser adaptado a diferentes situações sem a necessidade de escrever várias versões do mesmo código. Embora o modo genérico possa ajudar a reduzir a necessidade de sobrecarga de métodos em algumas situações, não é uma solução direta para o problema de overload, que ocorre quando há dois ou mais métodos com o mesmo nome e diferentes parâmetros de entrada.</br></br>

### **Razões pelas quais é recomendado usar o modo genérico em Java:**
O uso de genéricos em Java, sempre que possível, pode trazer muitos benefícios ao código, como *segurança de tipo, reutilização de código, clareza do código e facilidade de manutenção*.

 - ***Segurança de tipo:*** o uso de genéricos em Java ajuda a garantir que o tipo correto seja usado em cada situação. Isso ajuda a evitar erros de compilação e execução relacionados a tipos.

 - ***Reutilização de código:*** o uso de genéricos em Java pode tornar o código mais flexível e reutilizável, permitindo que ele seja usado com diferentes tipos de objetos. Isso pode economizar tempo e esforço na codificação.

 - ***Clareza do código:*** o uso de genéricos em Java pode tornar o código mais claro e fácil de entender, especialmente quando se trabalha com coleções de objetos.

 - ***Facilidade de manutenção:*** o uso de genéricos em Java pode tornar o código mais fácil de manter, pois permite que as alterações sejam feitas em um único lugar em vez de em vários lugares no código.</br></br>


### **Situações em que pode ser usado o modo genérico em Java:**
O modo genérico em Java pode ser usado em *classes, interfaces, métodos, campos, coleções e arrays*.

 - ***Classes genéricas:*** é possível criar classes genéricas que podem ser usadas com diferentes tipos de objetos. Por exemplo, uma classe de lista genérica que pode ser usada com diferentes tipos de objetos.

 - ***Interfaces genéricas:*** interfaces genéricas podem ser usadas para definir comportamentos genéricos que podem ser implementados por diferentes tipos de objetos. Por exemplo, uma interface genérica para ordenação de objetos.

 - ***Métodos genéricos:*** é possível criar métodos genéricos que podem ser usados com diferentes tipos de objetos. Por exemplo, um método de busca genérico que pode ser usado para pesquisar diferentes tipos de objetos.

 - ***Campos genéricos:*** campos genéricos podem ser usados em classes e interfaces genéricas para representar tipos genéricos de objetos. Por exemplo, um campo de lista genérica em uma classe de usuário que pode conter diferentes tipos de objetos.

 - ***Coleções genéricas:*** a biblioteca padrão do Java inclui muitas coleções genéricas, como List, Set e Map, que podem ser usadas para armazenar e manipular diferentes tipos de objetos.

 - ***Arrays genéricos:*** a partir do Java 5, é possível criar arrays genéricos usando sintaxe de varargs. Isso permite que você crie arrays que podem armazenar diferentes tipos de objetos.</br></br>

### **Sintaxes básicas para usar genéricos em Java:**
→ Obs: Letras coringa são convenções e podem ser substituídas por outras letras ou palavras que fazem mais sentido no contexto do código. O importante é usar uma letra ou palavra que seja clara e fácil de entender para quem está lendo o código.

#### **As letras coringa usadas para o modo genérico em Java são:**
`E`: usada para representar um elemento em uma coleção, como em `List<E>` ou `Set<E>`;</br>
`K`: usada para representar uma chave em um mapa, como em `Map<K, V>`;</br>
`V`: usada para representar um valor em um mapa, como em `Map<K, V>`;</br>
`N`: usada para representar um número, como em `Number` ou `Comparable<N>`;</br>
`T`: usada para representar um tipo em geral, como em `Class<T>` ou `Comparable<T>`;</br>
`S`: usada para representar um segundo tipo em geral, como em `Map<S, T>`.</br>

A sintaxe básica para usar genéricos em Java envolve a adição de um tipo genérico entre colchetes (<>). O tipo genérico pode ser usado em *classes, interfaces, métodos, campos, coleções e arrays*.

 - ***Classes genéricas:***
```java
class NomeDaClasse<T> {
   // código da classe
}
```

 - ***Interfaces genéricas:***
```java
interface NomeDaInterface<T> {
    // código da interface
}
```

 - ***Métodos genéricos:***
```java
<T> retornoDoMetodo nomeDoMetodo(T parametro) {
    // código do método
}
```

 - ***Campos genéricos:***
```java
class NomeDaClasse<T> {
    T nomeDoCampo;
}
```

 - ***Coleções genéricas:***
```java
List<T> lista = new ArrayList<>();
```

 - ***Arrays genéricos:***
```java
T[] array = (T[]) new Object[tamanho];
```
</br>

### **Exemplo**: 
Classe genérica chamada "Lista", que armazena uma lista de elementos de qualquer tipo:
```java
public class Lista<T> {
    private T[] elementos;
    
    public Lista(T[] elementos) {
        this.elementos = elementos;
    }
    
    public T get(int indice) {
        return elementos[indice];
    }
    
    public void set(int indice, T elemento) {
        elementos[indice] = elemento;
    }
}
```
Nesse exemplo, a classe "Lista" é parametrizada pelo tipo "T", que pode ser substituído por qualquer tipo concreto no momento da utilização da classe. </br>

Podemos criar uma lista de strings da seguinte forma:
```java
String[] elementos = {"foo", "bar", "baz"};
Lista<String> lista = new Lista<String>(elementos);
```
Dessa forma, a lista criada aceitará apenas strings como elementos, garantindo a segurança de tipos em tempo de compilação.