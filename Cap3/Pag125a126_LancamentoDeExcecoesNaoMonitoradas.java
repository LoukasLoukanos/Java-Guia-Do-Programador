public class Pag125a126_LancamentoDeExcecoesNaoMonitoradas {
        //Este código é a versão do código Pag120_Referencia_this com a 
        //diretiva throw com uso Lancamento de Excecoes Nao Monitoradas


        // campos privados
        private double largura, altura;
    
        // construtor default aciona o outro construtor com this (só é permitido usar this com esse propósito quando é a primeira linha de código do construtor que aciona o outro)
        public Pag125a126_LancamentoDeExcecoesNaoMonitoradas () { 
            this (2, 1); // uso explícito de this (na primeira linha de código → OBRIGATÓRIO) que aciona o outro método construtor, parametrizado↓ (ou seja, caso não tenha parâmetros de entrada, por padrão será definido largura=2, altura=1)
        }
        // construtor parametrizado
        public Pag125a126_LancamentoDeExcecoesNaoMonitoradas (double largura, double altura) { // largura e altura são parâmetros com nomes intuitivos e poderiam ter quaisquer outros nomes. Nesse caso os parâmetros largura e altura não são os campos definidos acima↑, na verdade eles estão ocultos no escopo do método, a menos que sejam referenciados nesse caso como this.largura e this.altura. Os nomes iguais, aqui, sem a referência this, são tratados como variáveis locais.
            this.setTamanho(largura, altura); // uso explícito de this no método setTamanho (largura e altura são parâmetros tratados como variáveis locais)
        }
        // Define tamanho
        public void setTamanho(double largura, double altura) {
            // verifica valor dos parâmetros
            if (largura>=0 && altura>=0) {
                // campos recebem valor das variáveis locais
                this.largura = largura; //aqui this.largura é a referência o campo largura, e largura é o parâmetro recebido nesse escopo como variável local, que nesse caso tem o mesmo nome do campo largura apenas para ser mais intuitivo pois poderia ser outro nome qualquer...
                this.altura = altura;
            } else {
                //se dimensões inadequadas lacça exceção não monitorada
                throw new RuntimeException("Dimensões inválidas");
            }
        }
        // retorna valor do campo this.largura
        public double getLargura () { 
            return largura; // uso implícito de this (como não teve parâmetro com o mesmo nome do campo largura, então implicitamente estamos nos referindo ao próprio campo largura, e nesse caso não precisamos usar this para nos referismos.)
        }
        // retorna valor do campo this.altura
        public double getAltura () {
            return altura; // uso implícito de this
        }

        @Override
        public String toString () {
            return "[largura=" + largura + ", altura=" + altura + "]";
        }
    }