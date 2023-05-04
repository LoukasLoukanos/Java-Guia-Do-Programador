## **Referências para métodos**

Referências de métodos em Java são uma forma concisa e funcional de referenciar um método existente em uma classe, sem a necessidade de definir uma nova classe ou interface para implementar esse método.

Em vez de implementar uma nova classe ou interface para definir o método, você pode usar uma referência a um método existente como um parâmetro para outro método ou expressão lambda. Isso torna o código mais legível e conciso, além de reduzir a quantidade de código necessário para implementar a funcionalidade desejada.

Existem diferentes tipos de referências de método em Java, incluindo referências a métodos estáticos e de instância, bem como referências a construtores. As referências de método são frequentemente usadas como argumentos para outros métodos, como em expressões lambda e programação funcional. Elas permitem que os métodos sejam passados como objetos, o que oferece uma grande flexibilidade na programação.

### ***Tipos de referências de métodos e sua sintaxe:***
| Tipo de Referência | Sintaxe |
| -------- | -------- |
| Método estático | NomeClasse::MetodoEstatico |
| Método de isntância de objeto específico | objeto::metodoInstancia |
| Método de isntância de objeto arbitrário de tipo | NomeClasse::metodoInstancia |
| Construtor | NomeClasse::new |


#### ***Referência de método estático: é usada para referenciar um método estático de uma classe. Exemplo:***

```java
public class Exemplo {
   public static int dobro(int n) {
      return n * 2;
   }
   
   public static void main(String[] args) {
      // referência de método estático
      IntFunction<Integer> metodo = Exemplo::dobro;
      
      // chamada do método usando a referência
      int resultado = metodo.apply(5);
   }
}
```

#### ***Referência de método de instância de objeto específico: é usada para referenciar um método de instância de um objeto específico. Exemplo:***

```java
public class Exemplo {
   private int valor;
   
   public Exemplo(int valor) {
      this.valor = valor;
   }
   
   public int triplo() {
      return valor * 3;
   }
   
   public static void main(String[] args) {
      // referência de método de instância de objeto específico
      Exemplo e = new Exemplo(5);
      IntSupplier metodo = e::triplo;
      
      // chamada do método usando a referência
      int resultado = metodo.getAsInt();
   }
}
```

#### ***Referência de método de instância de objeto arbitrário de tipo: é usada para referenciar um método de instância de um objeto arbitrário de um tipo específico. Exemplo:***

```java
public class Exemplo {
   private int valor;
   
   public Exemplo(int valor) {
      this.valor = valor;
   }
   
   public int triplo() {
      return valor * 3;
   }
   
   public static void main(String[] args) {
      // referência de método de instância de objeto arbitrário de tipo
      IntFunction<Integer> metodo = Exemplo::triplo;
      
      // chamada do método usando a referência
      int resultado = metodo.apply(new Exemplo(5));
   }
}
```

#### ***Referência de construtor: é usada para referenciar um construtor de uma classe. Exemplo:***

```java
public class Exemplo {
   private int valor;
   
   public Exemplo(int valor) {
      this.valor = valor;
   }
   
   public static void main(String[] args) {
      // referência de construtor
      IntFunction<Exemplo> construtor = Exemplo::new;
      
      // criação de um objeto usando a referência de construtor
      Exemplo e = construtor.apply(5);
   }
}
```
