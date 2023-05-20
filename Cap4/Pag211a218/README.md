## **Registro (record)**

Em Java, um registro (ou record, em inglês) é um novo tipo de classe introduzido a partir do Java 16. Ele é usado para representar dados imutáveis e é projetado para tornar a criação e o uso de objetos de dados simples e concisos.

Um registro em Java é declarado usando a palavra-chave "record" e define um conjunto fixo de campos que são inicializados no construtor do registro. Ele também fornece implementações padrão para métodos como equals(), hashCode() e toString().

Além disso, um registro em Java pode ser desestruturado, o que significa que seus campos podem ser acessados individualmente sem a necessidade de chamar métodos getters ou definir variáveis locais separadas para cada campo.

Em resumo, um registro em Java é uma classe simples e concisa que é usada para representar dados imutáveis e é projetada para ser fácil de criar, usar e manipular.

#### ***Exemplo simples de uso de registro em Java:***

```java
public record Pessoa(String nome, int idade) {}

// Criando uma nova pessoa
Pessoa pessoa = new Pessoa("João", 30);

// Acessando os campos do registro
System.out.println("Nome: " + pessoa.nome());
System.out.println("Idade: " + pessoa.idade());

// Desestruturando o registro
String nome = pessoa.nome();
int idade = pessoa.idade();
System.out.println(nome + " tem " + idade + " anos.");

```

## **Formatadores**

Os formatadores em Java são uma ferramenta importante para garantir a legibilidade e a padronização na exibição de dados em um programa, facilitando a compreensão do usuário e tornando a interface mais amigável.

Existem vários tipos de formatadores em Java, cada um com uma finalidade específica. Alguns dos principais tipos de formatadores são:
 - DecimalFormat: utilizado para formatar números de acordo com um padrão definido pelo desenvolvedor.
 - SimpleDateFormat: utilizado para formatar datas e horas em diferentes padrões.
 - MessageFormat: utilizado para formatar mensagens de texto, substituindo variáveis ou argumentos por valores específicos.
 - ChoiceFormat: utilizado para formatar valores numéricos em diferentes formas, dependendo do seu valor.
 - NumberFormat: utilizado como classe base para formatadores de números, permitindo que diferentes tipos de números sejam formatados.
 - DateTimeFormatter: introduzido no Java 8, utilizado para formatar datas e horas de acordo com padrões definidos.
 - DecimalStyle: introduzido no Java 8, utilizado para definir as configurações de formatação de números decimais, como separador de milhar e separador decimal.
 
#### ***Exemplo simples de uso de formatadores em Java:***

```java
import java.text.DecimalFormat; // para utilizar DecimalFormat
import java.util.Locale; // para utilizar o Locale.US

// Formata um número decimal usando um objeto do tipo DecimalFormat → linha 72
// Formata um número decimal usando a classe String.format → linha 77
public class ExemploFormatador {

    public static void main(String[] args) {
        
        double numero = 12345.6789;

        // objeto DecimalFormat com o padrão "#,##0.00", que significa que o número deve ser formatado com separador de milhar e duas casas decimais
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String numeroFormatado = df.format(numero); // chamamos o método format() do objeto df, passando o número a ser formatado como parâmetro
        System.out.println(numeroFormatado); // exibe "12.345,68"

        // utilizamos a classe String.format com o padrão "%.2f" e Locale.US para garantir a formatação correta em inglês
        String numeroFormatado = String.format(Locale.US, "%.2f", numero);
        System.out.println(numeroFormatado); // exibe "12345.68"
    }
}
```

 - #### ***Caracteres usados pelo formatador Decimal.format:***
   | Caractere | Posição | Significado ou efeito produzido |
   | - | - | - |
   | 0 | Número | Digito |
   | # | Número | Digito, zero à esquerda ausente |
   | . | Número | Separador decimal |
   | - | Número | Sinal negativo |
   | , | Número | Separador de grupo |
   | E | Número | Separa mantissa e expoente da notação científica |
   | ; | Separador | Separa os subpadrões positivo e negativo |
   | % | Prefixo ou sufixo | Multiplica por 100 e exibe como porcentagem |
   | \u2030 | Prefixo ou sufixo | Multiplica por 1000 e exibe como valor por mil |
   | \u00A4 | Prefixo ou sufixo | Símbolo local de moeda (se duplicado, mostra símbolo internacional da moeda) |
   | ' | Prefixo ou sufixo | Delimitador para uso de caractere especial no padrão |
   
 - #### ***Caracteres usados pelo formatador String.format:***
   | Conversão | Tipo | Resultado |
   | - | - | - |
   | b, B | geral | Se arg é null, resulta false; se boolean, resulta seu valor, senão true. |
   | h, H | geral | Produz Integer.toHexString(arg.hashCode()). |
   | s, S | geral | Produz arg.toString ou arg formatTo. |
   | c, C | caractere | Caractere Unicode correspondente. |
   | d | inteiro | Inteiro decimal correspondente. |
   | o | inteiro | Inteiro octal correspondente. |
   | x, X | inteiro | Inteiro hexadecimal correspondente. |
   | e, E | ponto-flutuante | Real decimal em notação científica. |
   | f | ponto-flutuante | Real decimal com precisão padrão ou indicada. |
   | g, G | ponto-flutuante | Real decimal em notação científica computadorizada. |
   | a, A | ponto-flutuante | Real hexadecimal correspondente. |
   | t, T | data-hora | Produza conversão de data-hora como toString. |
   | % | porcentagem | Produz o próprio literal %. |
   | n | quebra de linha | Resulta na quebra de linha especifica da plataforma. |
