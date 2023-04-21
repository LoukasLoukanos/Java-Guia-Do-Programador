/* Interface funcional em Java é uma interface que possui apenas um único método abstrato, também conhecida como interface SAM (Single Abstract Method).
 * Essa interface é utilizada em conjunto com expressões lambda, permitindo a criação de uma implementação da interface sem a necessidade de escrever 
 * uma classe completa que a implemente.
 * 
 * As interfaces funcionais são utilizadas para criar código mais conciso e legível, facilitando a implementação de funções que serão passadas como 
 * argumentos para outras funções ou que serão utilizadas em conjunto com Streams, por exemplo. Desde o lançamento do Java 8, as interfaces funcionais 
 * têm sido amplamente utilizadas em várias bibliotecas e frameworks do Java. */
@FunctionalInterface
public interface Pag195_InterfaceFuncional {
	double calcular(double a, double b);
}
