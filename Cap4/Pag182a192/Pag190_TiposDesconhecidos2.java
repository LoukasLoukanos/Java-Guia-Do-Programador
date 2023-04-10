import java.util.List;
import java.util.ArrayList;

public class Pag190_TiposDesconhecidos2 {
    public static void main(String[] args) {
        List<? extends Number> lista = new ArrayList<Integer>(); // cria uma lista que contém objetos que são do tipo Number ou suas subclasses, com o tipo definido como Integer na criação da lista

        lista.add(10); // ↓
        /* tenta adicionar um inteiro à lista, o que não é permitido pelo tipo definido na criação da lista. → erro de compilação no código. 
         * O editor está destacando a linha como um erro porque o método add() não pode ser chamado em um objeto do tipo List<?>. Isso ocorre 
         * porque o uso do coringa <?> indica que o tipo de objeto contido na lista é desconhecido e não pode ser determinado em tempo de 
         * compilação, o que impede a chamada de métodos que dependem do tipo. Para corrigir esse erro, é necessário especificar o tipo correto 
         * da lista ou usar um coringa limitado que permita a chamada do método add() com tipos específicos.*/
    
        Number numero = lista.get(0); // obtém o primeiro elemento da lista e armazena em uma variável do tipo Number
        System.out.println(numero); // imprime o valor armazenado na variável
    }
}
