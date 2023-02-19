package jandl.jgp4;
import jandl.jgp4.geom.*;
/* GRAÇAS AO CONCEITO DA HERANÇA podemos ter os conceitos: POLIMORFISMO, UPCASTING e DOWNCASTING:
  
  ♦ O POLIMORFISMO é a capacidade de objetos de diferentes classes responderem de forma diferente ao mesmo método. 
  Isso é possível porque esses objetos podem herdar o mesmo método da superclasse, mas podem implementá-lo de 
  maneiras diferentes em cada subclasse.

  ♦ O UPCASTING é a conversão de um objeto de uma subclasse para um objeto de sua superclasse. Isso é possível porque a subclasse herda todos os métodos e atributos da superclasse, o que significa que um objeto da subclasse pode ser tratado como se fosse um objeto da superclasse.

  ♦ O DOWNCASTING é a conversão de um objeto de uma superclasse para um objeto de sua subclasse. Isso é possível se o objeto for realmente uma instância da subclasse. Nesse caso, é possível acessar os métodos e atributos específicos da subclasse que não estão presentes na superclasse.


  Resumidamente:
  • POLIMORFISMO: Objetos de diferentes classes podem responder de forma diferente a um mesmo método.

  • UPCASTING: Conversão de uma instância de uma subclasse para uma instância da superclasse.
    → Ocorre quando uma instância de uma subclasse é atribuída a uma variável do tipo da superclasse.
	→ útil para tratar objetos de subclasses como objetos da superclasse.
	→ é sempre possível.
	"UPCASTING" em termos de hierarquia de classes, de forma metafórica = "subida" na hierarquia

  • DOWNCASTING: Conversão de uma instância da superclasse para uma instância da subclasse. 
    → Ocorre quando uma instância de uma superclasse é atribuída a uma variável do tipo de uma subclasse.
	→ Útil para tratar objetos da superclasse como objetos de subclasses.
  	→ so é possível se o objeto for uma instância da subclasse, é importante usar "instanceof" → ver P0425InstanceOf.
	"DOWNCASTING" em termos de hierarquia de classes, de forma metafórica, = "descida" na hierarquia
*/

public class P0424TestaFormas {
	/* Por exemplo, temos a classe mais geral P0407Forma que é a superclasse das classes 
	  mais específicas P0408Circunferencia, P0409Retangulo e P0410Triangulo. Ao instanciar 
	  objetos dessas subclasses obtemos a herança da superclasse, e, graças ao mecanismo de 
	  polimorfismo, é permitido que uma superclasse possa ser referenciada por uma subclasse, 
	  ou seja, um objeto de uma subclasse pode ser tratado como um objeto da superclasse. Isso 
	  significa que um método em uma superclasse pode ser usado por um objeto de uma subclasse 
	  sem a necessidade de escrever um método específico para a subclasse.*/
	public static void main (String a[]) {

		// UPCASTING (Conversão de uma instância de uma subclasse para uma instância da superclasse)
		P0408Circunferencia c = new P0408Circunferencia(3.45); 
		P0407Forma f = c; // UPCASTING → a instância da subclasse P0408Circunferencia 'c' foi atribuída à variável do tipo da superclasse P0407Forma 'f'.
		

		// UPCASTING (Conversão de uma instância de uma subclasse para uma instância da superclasse)
		P0407Forma f1 = new P0409Retangulo(1.0, 2.0); // UPCASTING → a instância da subclasse P0409Retangulo foi diretamente atribuída à variável do tipo da superclasse P0407Forma 'f1' (mais prático e limpo).
		

		// DOWNCASTING (Conversão de uma instância da superclasse para uma instância da subclasse)
		P0409Retangulo r = (P0409Retangulo) f1; //DOWNCASTING → a instância da superclasse P0407Forma 'f1' foi atribuída à variável do tipo de subclasse P0409Retangulo 'r'


		//POLIMORFISMO: Objetos de diferentes classes ('f' da superclasse P0407Forma e 'r' da subclasse P0409Retangulo) respondem de forma diferente a um mesmo método .area()
		System.out.println("area circulo = "+ f.area()); // ressaltando que 'f' virou objeto da superclasse P0407Forma graças ao UPCASTING
		System.out.println("area retangulo = "+ r.area()); // ressaltando que 'r' virou objeto da superclasse P0407Forma graças ao DOWNCASTING



		/* Na prática, ao instanciar um objeto de uma subclasse, tanto com a sintaxe 'Subclasse obj = new Subclasse()'
		quanto com a sintaxe 'Superclasse obj = new Subclasse()', estamos criando um objeto da subclasse que é convertido 
		implicitamente para um objeto da superclasse através do UPCASTING.
		• 'Subclasse obj = new Subclasse();' → Usando essa sintaxe, a referência para o objeto criado é armazenada em uma 
		variável de tipo Subclasse. Isso significa que podemos utilizar essa referência para acessar todos os métodos e 
		atributos da classe Subclasse e da sua superclasse, bem como eventuais métodos e atributos que tenham sido 
		adicionados apenas na subclasse.
		• 'Superclasse obj = new Subclasse();' → Usando essa sintaxe, a referência para o objeto criado é armazenada em uma 
		variável de tipo Superclasse. Isso significa que podemos utilizar essa referência para acessar apenas os métodos e 
		atributos que foram definidos na classe Superclasse, além dos métodos herdados pela classe Subclasse. Eventuais 
		métodos e atributos adicionados apenas na subclasse não estarão acessíveis através dessa referência, a não ser que 
		façamos um DOWNCASTING da superclasse para a subclasse. Nesse caso, teremos acesso a todos os métodos e atributos 
		apenas da subclasse, inclusive aqueles que foram adicionados exclusivamente nela.*/
		


		// UPCASTING (Conversão de uma instância de uma subclasse para uma instância da superclasse)
		P0408Circunferencia c2 = new P0408Circunferencia(1.5); // UPCASTING → a instância da subclasse P0408Circunferencia foi diretamente atribuída à variável do tipo da superclasse P0407Forma 'c2'.
		System.out.println("areaCirc = "+ c2.area());


		// UPCASTING (Conversão de uma instância de uma subclasse para uma instância da superclasse)
		P0409Retangulo r2 = new P0409Retangulo(2.5, 4.0); // UPCASTING → a instância da subclasse P0409Retangulo foi diretamente atribuída à variável do tipo da superclasse P0407Forma 'r2'.
		System.out.println("areaRet = "+ r2.area());


		//POLIMORFISMO: Objetos de diferentes classes ('c2' da subclasse P0408Circunferencia e 'r2' da subclasse P0409Retangulo) respondem de forma diferente a um mesmo método .area()
		P0407Forma formas[] = new P0407Forma[3]; 
		formas[0] = c2; // ressaltando que 'c2' virou objeto da superclasse P0407Forma graças ao UPCASTING
		formas[1] = r2; // ressaltando que 'r2' virou objeto da superclasse P0407Forma graças ao UPCASTING
		formas[2] = new P0410Triangulo(1.0, 2.0, 2.0); // virou objeto da superclasse P0407Forma polo UPCASTING

		for (int i=0; i<formas.length; i++) {
			System.out.println(formas[i]);
			System.out.println("area = "+ formas[i].area());
		}
	}
}


/* Para entender melhor os conceitos de POLIMORFISMO, UPCASTING e DOWNCASTING vamos supor 
que temos três classes em um sistema de gerenciamento de animais: Animal, Cachorro e Gato:

	A classe Animal é a superclasse e possui um método chamado "emitirSom()". As classes Cachorro e Gato são 
	classes filhas de Animal e possuem seus próprios métodos "emitirSom()", que sobrescrevem o método da classe 
	pai para emitir o som característico de cada animal.

	Exemplo de classe Animal:
	public class Animal {
    	public void emitirSom() {
    		System.out.println("Animal emitindo som");
        }
	}
		
	Exemplo de classe Cachorro:
	public class Cachorro extends Animal {
    	@Override
    	public void emitirSom() {
    		System.out.println("Au au");
    	}
	}

	Exemplo de classe Gato:
	public class Gato extends Animal {
	    @Override
	    public void emitirSom() {
	        System.out.println("Miau");
	    }
	}

	Agora, vamos imaginar que em outra parte do sistema, temos um método que recebe um Animal como parâmetro. 
	Esse método pode ser utilizado tanto com um Cachorro quanto com um Gato.

	POLIMORFISMO ocorre quando objetos de diferentes classes responderem de forma diferente ao mesmo método.
	Por exemplo o método "fazerAnimalEmitirSom()" pode receber qualquer instância de Animal, seja um Cachorro ou um Gato, 
	e chamar o método "emitirSom()" específico da subclasse.
	Exemplo de POLIMORFISMO:___________________________
	public void fazerAnimalEmitirSom(Animal animal) {
	    animal.emitirSom(); // POLIMORFISMO → objetos de diferentes classes responderem de forma diferente ao mesmo método
	}

	O UPCASTING ocorre quando uma instância de uma subclasse é atribuída a uma variável do tipo da superclasse, 
	nisso temos uma conversão de uma instância de uma subclasse para uma instância da superclasse.
	Exemplo de UPCASTING:___________________________
	Cachorro cachorro = new Cachorro();
	Animal animal = cachorro; // UPCASTING → instância de uma subclasse é atribuída a uma variável do tipo da superclasse

	O DOWNCASTING ocorre quando uma instância de uma superclasse é atribuída a uma variável do tipo de uma subclasse, 
	nisso temos uma conversão de uma instância da superclasse para uma instância da subclasse. 
	Exemplo de DOWNCASTING:___________________________
	Animal animal = new Cachorro();
	Cachorro cachorro = (Cachorro) animal; // DOWNCASTING → instância de uma superclasse é atribuída a uma variável do tipo de uma subclasse



	É importante lembrar que o downcasting pode gerar uma exceção se a instância original não for compatível com a 
	subclasse em questão. Portanto, é necessário fazer uma verificação antes de realizar o downcasting para evitar 
	possíveis erros. A verificação de tipo adequada no downcasting envolve o uso do operador instanceof para verificar 
	se a instância da superclasse pode ser convertida em uma instância da subclasse.

	Por exemplo, se tivermos uma instância de Animal chamada animal1, e quisermos convertê-la em uma instância de 
	Cachorro, devemos fazer a verificação de tipo da seguinte forma:

	if (animal1 instanceof Cachorro) {
    	Cachorro cachorro1 = (Cachorro) animal1; // downcasting
    	// garantimos que só realizaremos o downcasting quando a instância da superclasse for realmente 
		// uma instância da subclasse desejada, evitando assim possíveis erros de tipo em tempo de execução.
	} else {
    	// tratamento de exceção ou outra ação apropriada
	}
	↓
	→ ver P0425InstanceOf*/
