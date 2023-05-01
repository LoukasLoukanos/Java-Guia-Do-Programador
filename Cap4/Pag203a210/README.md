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