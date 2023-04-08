/* Interfaces genéricas em Java oferecem uma maneira de definir comportamentos genéricos que podem ser implementados por diferentes 
 * tipos de objetos. Isso permite que o código seja mais flexível e reutilizável, já que não está vinculado a um tipo específico de objeto.
 *
 * Por exemplo, se você tiver uma interface genérica para ordenar objetos, poderá implementá-la para diferentes tipos de objetos, como 
 * inteiros, strings ou objetos personalizados. Isso torna o código mais modular e fácil de manter.
 * 
 * Além disso, as interfaces genéricas em Java permitem que você escreva código genérico, que pode ser usado com diferentes tipos de objetos 
 * sem precisar reescrever o código para cada tipo. Isso pode economizar muito tempo e tornar o código mais fácil de ler e manter.*/

 public interface Pag188_Checker<R, T> { // interface genérica
	R check(T left, T right); // método abstrato
}
