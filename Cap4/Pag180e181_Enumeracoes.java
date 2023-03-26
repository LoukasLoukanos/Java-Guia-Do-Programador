public class Pag180e181_Enumeracoes {
    /* Um tipo enumerado (enumeration) é um conjunto de contantes utilizadas com frequencia para definir valores que não 
    sofrem alterações. Para declarar um tipo enumerado utiliza-se a palavra reservada enum. Cada declaração enum gera uma 
    classe que define variáveis estáticas e finais para cada constante e implementa as interfaces Comparable e Serializable. 
    Também contém os métodos: values(), que retorna um arranjo das constantes; valueOf(String), que retorna a constante 
    indicada pela String, além de equals(object), hasCode() e toString().
    
    → Desvantagens de NÃO utilizar Enumerações: seu código é compilado junto das classes que a utilizam, assim a adição de 
    constantes exige uma nova compilação; o uso das constantes requer o nome da classe como prefixo; as cons- tantes não podem 
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
