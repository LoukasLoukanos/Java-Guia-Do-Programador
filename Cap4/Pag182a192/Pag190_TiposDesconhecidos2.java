import java.util.List;
import java.util.ArrayList;
/* Quando não ocorre a indicação da Limitação de Tipos na parametrização de um tipo genérico, é tomado o tipo object 
 * com tal limite, o que significa, de fato, nenhum limite, como no exemplo 'Pag190_TiposDesconhecidos1.java'
 * 
 * Ainda abrangendo o assunto Tipos Desconhecidos; temos então o conceito de Limitação de Tipos Superitor (upper bound) 
 * e Inferior (lower bound) com o uso da palavra reservada extends e super, respectivamente:
 * 
 * ♦ Limitação Superior (upper bound): 
 * A indicação de que o tipo empregado em tempo de execução deva ser uma subclasse desse 
 * tipo ou uma realização dessa interface. Essa indicação é feita com o uso do caractere 
 * curinga <?> e da palavra reservada extends, estabelecendo a sintaxe da seguinte forma:
 * → TipoGenerico<? extends AbstractList>
 * Com isso, TipoGenerico só aceita elementos da classe Abstractlist ou de suas subclas ses (ArrayList e 
 * Vector, por exemplo), o que garante a existência de um conjunto minimo de operações para os elementos do
 * genérico, no caso aquelas disponíveis na classe Abstractlist, que estarão presentes em suas subclasses.
 * 
 * ♦ Limitação inferior (lower bound):
 * Com o uso do caractere curinga <?> e da palavra reservada super, aplica-se a sintaxe:
 * → TipoGenerico<? super Integer>
 * Nessa situação, TipoGenerico só pode ser parametrizado com Integer ou suas superclasses. Isso significa 
 * que o programador não quer (ou não pode) contar com nenhuma especificidade das subclasses do parámetro de 
 * tipo, restringindo-se às características dos tipos dos quais é derivado.*/

public class Pag190_TiposDesconhecidos2 {
    public static void main(String[] args) {
        // Tipo Desconhecido (coringa <?>) com Limitação Superior ou Upper Bound (palavra reservada extends)
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
