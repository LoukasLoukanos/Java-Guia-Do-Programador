/* Quando não se especifica a limitação de tipos na parametrização de um tipo genérico em Java com o uso de letras coringas
 * como <T>, <S>, etc, é assumido o tipo "Object" como limite, o que significa, na prática, que não há nenhum limite definido. 
 * O coringa (wildcard) "?" indica que não há limitação de tipos na definição do tipo genérico. Isso significa que o TIPO é 
 * DESCNHECIDEO, podendo ser QUALQUER e/ou DIFERENTES tipos utilizados.
 * 
 * Por exemplo, ao definir uma lista genérica, pode-se usar o coringa para permitir que a lista possa armazenar objetos de qualquer tipo:
 * → List<?> lista = new ArrayList<>();
 * Nesse caso, não se sabe qual é o tipo exato de objeto que será armazenado na lista, mas isso 
 * não é importante para algumas operações, como percorrer a lista ou verificar seu tamanho.
 *
 *  
 * EXEMPLOS: Pag190_TiposDesconhecidos1↓ e Pag190_TiposDesconhecidos2 →... */

import java.util.List;
import java.util.ArrayList;

public class Pag190_TiposDesconhecidos1 {
    public static void main(String[] args) {
        List<?> lista = new ArrayList<String>(); // cria uma lista que pode conter qualquer tipo de objeto

        lista.add("Exemplo de String"); // tenta adicionar uma String à lista () ↓
        lista.add(10); // tenta adicionar um inteiro à lista, o que não é permitido pelo tipo definido na criação da lista ↓
        /* → erro de compilação no código. O editor está destacando a linha como um erro porque o método add() não pode ser 
         * chamado em um objeto do tipo List<?>. Isso ocorre porque o uso do coringa <?> indica que o tipo de objeto contido na 
         * lista é desconhecido e não pode ser determinado em tempo de compilação, o que impede a chamada de métodos que dependem 
         * do tipo. Para corrigir esse erro, é necessário especificar o tipo correto da lista ou usar um coringa limitado que 
         * permita a chamada do método add() com tipos específicos.*/

        System.out.println(lista.get(0)); // imprime o primeiro elemento da lista
    }
}
