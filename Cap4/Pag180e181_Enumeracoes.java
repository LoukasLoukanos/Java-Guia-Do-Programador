public class Pag180e181_Enumeracoes {
    /* Um tipo enumerado (enumeration) é um conjunto de contantes utilizadas com frequencia para definir valores que não 
    sofrem alterações. Para declarar um tipo enumerado utiliza-se a palavra reservada enum. Cada declaração enum gera uma 
    classe que define variáveis estáticas e finais para cada constante e implementa as interfaces Comparable e Serializable. 
    Também contém os métodos: values(), que retorna um arranjo das constantes; valueOf(String), que retorna a constante 
    indicada pela String, além de equals(object), hasCode() e toString().
    
    
    ♦ Os cinco maiores benefícios de usar enumerações:
    1. Legibilidade: O uso de enums torna o código mais legível, já que é possível atribuir um nome significativo para cada valor possível. 
    Isso torna mais fácil entender o propósito das variáveis e dos parâmetros que são definidos como enums.
    
    2. Segurança de tipo: Ao usar enums, é possível ter mais segurança de tipo do que ao usar constantes ou valores literais, já que apenas 
    os valores definidos dentro da enumeração podem ser atribuídos a variáveis do tipo enum.
    
    3. Evolução: Se você precisar adicionar ou remover um valor de enumeração, não é necessário alterar o código em todos os lugares em que 
    a enumeração é usada. Isso significa que a manutenção do código é mais fácil e menos propensa a erros.
    
    4. Código mais claro e fácil de manter: Ao usar enumerações, o código se torna mais claro e fácil de manter, pois os valores possíveis 
    são agrupados em um único lugar e podem ser referenciados por um nome significativo. Isso também torna o código mais fácil de ler e entender.
    
    5. Melhoria na produtividade: Com o uso de enumerações, a produtividade é melhorada, já que é possível escrever menos código e evitar erros 
    comuns relacionados a digitação, como erros de ortografia ou de formatação.
    
    
    → Desvantagens de NÃO utilizar Enumerações: seu código é compilado junto das classes que a utilizam, assim a adição de 
    constantes exige uma nova compilação; o uso das constantes requer o nome da classe como prefixo; as constantes não podem 
    ser facilmente traduzidas em texto informativo; só podem ser usadas como valores primitivos; e, dado que as constantes são 
    nomes associados a inteiros, não permitem checagem de tipo, pois se confundem com outras constantes definidas do mesmo modo.
    
    → Vantagens de UTILIZAR Enumerações: elas podem ser usadas como objetos, constituem um espaço de definição próprio, cada grupo 
    de constantes define um tipo de dados diferente, checado durante a compilação, seu código, compilado separado das classes 
    clientes, pode ser alterado livremente, os nomes das constan- tes são automaticamente usados como texto informativo. */

    
    // • Declaração SEM uso de Enumerações:
    public static final int COMPACTAR_SEM_ENUMERACAO = 0;
    public static final int DESCOMPACTAR_SEM_ENUMERACAO = 1;

    // • Declaração COM uso de Enumerações:
    public enum Com_enum {
        COMPACTAR_COM_ENUMERACAO, DESCOMPACTAR_COM_ENUMERACAO
    };

    /* • Declaração COM uso de Enumerações sofisticado:
    Podem ser construídos como uma classe, desde que sejam observadas algumas regras:
    (I) as constantes da enumeração devem ser colocadas no início da classe e
    deve-se usar os construtores disponíveis;
    (II) os campos devem ser declarados como final;
    (III) os construtores não devem possuir um especificador de acesso e devem
    suportar as constantes declaradas;
    (IV) os métodos gerados automaticamente não podem ser sobrepostos. */
    public enum Com_enum_sofisticado {
        COMPACTAR("Compactacao", 0), // regra (I)
        DESCOMPACTAR("Descompactacao", 1);

        private final String nome; // regra (II)
        private final int valor;

        Com_enum_sofisticado(String n, int v) { // regra (III)
            nome = n;
            valor = v;
        }

        public int getValor() {
            return valor;
        }

        public String getNome() {
            return nome;
        }

        public String toString() {
            return nome + "(" + valor + ")";
        }
    }

    // Operação COM uso de Enumerações:
    public static void main(String a[]) {
        // ♦ Operação COM uso de Enumerações simples:
        for (Com_enum opcao : Com_enum.values()) {
            System.out.println(opcao);
        }

        // ♦ Operação COM uso de Enumerações sofisticado:
        for (Com_enum_sofisticado constante : Com_enum_sofisticado.values()) {
            // usa operaçõres da enumeração
            System.out.printf("%-25s #%02d: %-20s\n", constante,
                    constante.getValor(), constante.getNome());
            switch (constante) {
                case COMPACTAR_COM_ENUMERACAO:
                    System.out.println("Opcao de compactacao");
                    break;
                case DESCOMPACTAR_COM_ENUMERACAO:
                    System.out.println("Opcao de descompactacao");
                    break;
            }
        }
    }
}
// outros exemplos para facilitar a compreenção:___________________________
// Sem Enumeração:
public class SemEnum {
    public static final int SEGUNDA_FEIRA = 1;
    public static final int TERCA_FEIRA = 2;
    public static final int QUARTA_FEIRA = 3;
    public static final int QUINTA_FEIRA = 4;
    public static final int SEXTA_FEIRA = 5;
    public static final int SABADO = 6;
    public static final int DOMINGO = 7;
    
    public static void main(String[] args) {
        int diaDaSemana = SEGUNDA_FEIRA;
        
        if (diaDaSemana == SABADO || diaDaSemana == DOMINGO) {
            System.out.println("Hoje é fim de semana!");
        } else {
            System.out.println("Hoje é dia útil.");
        }
    }
}

// Com enumeração:
public class ComEnum {
    public enum DiaDaSemana {
        SEGUNDA_FEIRA, TERCA_FEIRA, QUARTA_FEIRA, QUINTA_FEIRA, SEXTA_FEIRA, SABADO, DOMINGO;
    }
    
    public static void main(String[] args) {
        DiaDaSemana diaDaSemana = DiaDaSemana.SEGUNDA_FEIRA;
        
        if (diaDaSemana == DiaDaSemana.SABADO || diaDaSemana == DiaDaSemana.DOMINGO) {
            System.out.println("Hoje é fim de semana!");
        } else {
            System.out.println("Hoje é dia útil.");
        }
    }
}
