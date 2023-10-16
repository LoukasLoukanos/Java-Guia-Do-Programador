## **Pág. 103 à 113............Classes, objetos e instanciação | Visibilidade | Campos | Métodos | Métodos de acesso (getters, e setters) | Construtores**
<details>
<summary></summary>

### ***MÉTODOS***
É comum que os métodos sejam referidos conforme o efeito que produzem: 
 - métodos de alteração (ou mutação): modificam o valor dos campos de um objeto, alterando seu estado;
 - métodos de observação: apenas retornam um valor contido num campo do objeto, ou o resultado de algum cálculo, sem que o estado do objeto seja alterado;
 - métodos de produção: são capazes de retornar um outro objeto, do mesmo tipo, contendo uma cópia ou uma parte dos dados que contém;
 - métodos de criação (usualmente criados na forma de construtores): permitem a criação de novos objetos;
 - métodos de destruição: são responsáveis pela remoção de um objeto da memória.

#### **Exemplo:**

```java
 public class Pag103a113_Metodos {
	//___SIMPLES_____________________________________________
	public int hor, min, seg;
	public void setHorar(int h, int m, int s) {
		hor = h;
		min = m;
		seg = s;
	}
	public String toString() {
		return hor + ":" + min + ":" + seg;
	}

    //___MELHORADA___________________________________________
	// três atributos int de acesso restrito
	private int hora, minu, segu; 
	// métodos de acesso (leitura) dos campos restritos
	public int getHoras () {
		return hora;
	}
	public int getMinutos () {
		return minu;
	}
	public int getSegundos () { 
		return segu;
	}
	// métodos de alteração (escrita) dos campos restritos
	public void setHoras (int h) {
		if(h>=0 && h<24) hor = h;
	}
	public void setMinutos (int m) {
		if(m>=0 && m<60) min = m;
	}
	public void setSegundos (int s) {
		if(s>=0 && s<60) seg = s;
	}
	public void setHorario (int h, int m, int s) {
		setHoras(h);
		setMinutos(m);
		setSegundos(s);
	}
	// representação textual dos objetos Hora
	public String toString_ () {
		return String.format("%02d:%02d:%02d",
			getHoras(), getMinutos(), getSegundos());
	}
	
}


import java.util.Scanner;

public class Pag103a113_TesteDaClasseMetodos {
	public static void main (String a[]) {
        //EXEMPLO DE INSTÂNCIA DE OBJETOS DA CLASSE:_____________________
	    // declara e instancia objeto tipo Pag103a113_Metodos
	    Pag103a113_Metodos obj_horario = new Pag103a113_Metodos (); 
    
	    // ajusta objeto com valores válidos
	    obj_horario.setHorario(15, 30, 10);
	    
	    // exibe hora
	    System.out.println("Hora: "+ obj_horario.toString()); 
    
	    // prepara console
	    Scanner sc = new Scanner(System.in); 
	    // lê valores de hora, minuto e segundo em variáveis auxiliares
	    System.out.print("Horas ? ");
	    int h = sc.nextInt();
	    System.out.print("Minutos ? ");	
	    int m = sc.nextInt();
	    System.out.print("Segundos ? ");
	    int s = sc.nextInt();
	    sc.close();
    
	    // ajusta objeto com valores dados
	    obj_horario.setHorario(h, m, s);
    
	    // exibe hora
	    System.out.println("Hora: "+ obj_horario.toString());
	    if (obj_horario.getHoras()>=18 || obj_horario.getHoras()<6) {
	    	System.out.println("E noite!");
	    } else {
	    	System.out.println("E dia!");
        }
	}
}

```

</details>
</br>


## **Pág. 114 à 116............Representação de classes com UML | Sobrecarga de métodos e construtores**
<details>
<summary></summary>

### ***overload*** ou *sobrecarga de método*: mudança da assinatura do método.
### ***override*** ou *sobreposição de método*: mudança do corpo do método.

#### **Exemplo:**

```java
public class Pag114a116_Overload {
	// campos públicos: não existem restrições p/ valores de x e y
	public double x, y;
	// constr. default: ponto definido na origem (0, 0)
	public Pag114a116_Overload ( ) {
		x = 0; y = 0;
	}
	// constr. parametrizado: ponto definido na instanciação
	public Pag114a116_Overload (double px, double py) {
		x = px; y = py;
	}
	// determina distância entre instância e coordenada dada
	public double distancia (double px, double py) {
		return Math.sqrt(Math.pow(x - px, 2) + Math.pow(y - py, 2));
	}
	// determina distância entre instância e ponto dado
	public double distancia (Pag114a116_Overload p) {
		return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
	}
	// fornece representação textual dos objetos
	public String toString( ) {
		return "Pag114a116_Overload[x="+ x + ",y="+ y + "]";
	}
}

```

</details>
</br>


## **Pág. 117 e 118............Membros estáticos**
<details>
<summary></summary>

#### **Exemplo:**

```java
public class Pag117e118_MembrosEstaticos {
	// armazena número de instâncias da classe
	private static int instancias = 0;

	// armazena último valor usado por metodo dobro(int)
	public int ultimoValor;
	
	// construtor que atualiza no. de instâncias (construtores não podem ser declarados estáticos)
	public Pag117e118_MembrosEstaticos () {
		instancias++;
	
	}
	//_____Membros estáticos podem ser usados diretamente por meio de suas classes ou de suas instâncias:_____

	// método estático que retorna no. de instâncias (estático → :. poderá ser usado sem a necessidade de instanciação)
	public static int getInstancias () {
		return instancias;
	
	}
	// método não estático que calcula o dobro (NÃO estático → :. será acessível apenas por meio de instâncias da classe)
	public int dobro (int valor) {
		ultimoValor = valor; return 2*valor;
	}

	//uso direto dO método estático getInstancias() a partir de sua classe, sem a necessidade de instanciação (PREFERENCIAL)
	int x = Pag117e118_MembrosEstaticos.getInstancias();

	//uso do método estático getInstancias() a partir de uma instância de sua classe 
	Pag117e118_MembrosEstaticos obj = new Pag117e118_MembrosEstaticos();
	//int y = obj.getInstancias();

}

```

</details>
</br>


## **Pág. 119............Constantes**
<details>
<summary></summary>

#### **Exemplo:**

```java
public class Pag119_MembrosEstaticos {
	@SuppressWarnings("static-access") //esta notação é necessária para que o compilador não "reclame" do acesso a membros estáticos por meio de variáveis de intância. 

	//O método main(String[]) é declarado estático para que a JVM não necessite realizar a intanciaçõa de objetos, simplificando o procedimento de início das aplicações
	public static void main (String args[ ]) {
		//_____Membros estáticos podem ser usados diretamente por meio de suas classes ou de suas instâncias:_____

		//uso direto do método estático getInstancias() da classe Pag117e118_MembrosEstaticos, sem a necessidade de instanciação (estático pode ser usado sem a necessidade de instanciação) → (MANEIRA PREFERENCIAL)
		System.out.println("Numero de Instancias = " + Pag117e118_MembrosEstaticos.getInstancias()); //getInstancias() retorna no. de instâncias


		//uso do mesmo método estático getInstancias() a partir de uma instância de sua classe (maneira NÃO preferencial)
		Pag117e118_MembrosEstaticos obj = new Pag117e118_MembrosEstaticos(); 
		System.out.println("Numero de Instancias = " + obj.getInstancias()); //getInstancias() retorna no. de instâncias

		// uso de método não estático dobro() da classe Pag117e118_MembrosEstaticos, acessível graças à intanciação de sua classe ao objeto 'obj'↑ (NÃO estático so poderá ser acessível por meio de instâncias da classe)
		int x = 7; // declara e inicializa variável inteira com valor arbitrário
		System.out.println("O dobro de "+ x + " = "+ obj.dobro(x) ); //dobro() calcula o dobro
	}
}

```

</details>
</br>


## **Pág. 120 e 121............Referência this**
<details>
<summary></summary>

#### **Exemplo:**

```java
public class Pag120_Referencia_this {
	// campos privados
	private double largura, altura;

	// construtor default aciona o outro construtor com this (só é permitido usar this com esse propósito quando é a primeira linha de código do construtor que aciona o outro)
	public Pag120_Referencia_this () { 
		this (2, 1); // uso explícito de this (na primeira linha de código → OBRIGATÓRIO) que aciona o outro método construtor, parametrizado↓ (ou seja, caso não tenha parâmetros de entrada, por padrão será definido largura=2, altura=1)
	}
	// construtor parametrizado
	public Pag120_Referencia_this (double largura, double altura) { // largura e altura são parâmetros com nomes intuitivos e poderiam ter quaisquer outros nomes. Nesse caso os parâmetros largura e altura não são os campos definidos acima↑, na verdade eles estão ocultos no escopo do método, a menos que sejam referenciados nesse caso como this.largura e this.altura. Os nomes iguais, aqui, sem a referência this, são tratados como variáveis locais.
		this.setTamanho(largura, altura); // uso explícito de this no método setTamanho (largura e altura são parâmetros tratados como variáveis locais)
	}
	// Define tamanho
	public void setTamanho(double largura, double altura) {
		// verifica valor dos parâmetros
		if (largura>=0 && altura>=0) {
			// campos recebem valor das variáveis locais
			this.largura = largura; //aqui this.largura é a referência o campo largura, e largura é o parâmetro recebido nesse escopo como variável local, que nesse caso tem o mesmo nome do campo largura apenas para ser mais intuitivo pois poderia ser outro nome qualquer...
			this.altura = altura;
		}
	}
	// retorna valor do campo this.largura
	public double getLargura () { 
		return largura; // uso implícito de this (como não teve parâmetro com o mesmo nome do campo largura, então implicitamente estamos nos referindo ao próprio campo largura, e nesse caso não precisamos usar this para nos referismos.)
	}
	// retorna valor do campo this.altura
	public double getAltura () {
		return altura; // uso implícito de this
} }

public class Pag121_Referencia_this {
	public static void main(String arg[]) {
		// variáveis auxiliares recebem conversão dos argumentos
		double larg = Double.parseDouble(arg[0]); // 1o arg
		double alt = Double.parseDouble(arg[1]);  // 2o arg
		
		// cria objeto
		Pag120_Referencia_this retangulo = new Pag120_Referencia_this (larg, alt);
		
		// uso implícito de Retangulo.toString() exibe info do objeto
		System.out.println("Pag120_Referencia_this[" + retangulo.getLargura() + "x"
				+ retangulo.getAltura() + "]");
	}
}

```

</details>
</br>



## **Pág. 122 e 124............Finalizadores e coleta de lixo**
<details>
<summary></summary>

#### **Exemplo:**

```java
public class Pag123_FinalizadoresEColetaDeLixo {
	private static int instancias=0;
	private int id;
	protected long[] data;
	public Pag123_FinalizadoresEColetaDeLixo  () {
		id = instancias++;
		data = new long[1_000_000];
		System.out.println("Objeto.Objeto() [id="+id+"]");
	}
	
	public static int getInstancias() {
		return instancias;
	}
	
	public int getId () { 
		return id; 
	}
	
	@Override
	protected void finalize () {
		instancias--;
		System.out.println("Objeto.finalize() [id="+id+"]");
	}
}

public class Pag124_TesteDaClasseFinalizadoresEColetDeLixo {
	public static void main (String a[]) {
		System.out.println("Instancias = "+ Pag123_FinalizadoresEColetaDeLixo.getInstancias());
		for (int i=0; i<10; i++) {
			Pag123_FinalizadoresEColetaDeLixo o = new Pag123_FinalizadoresEColetaDeLixo ();
			System.out.println(o);
		}
		System.out.println("Instancias = "+ Pag123_FinalizadoresEColetaDeLixo.getInstancias());
		System.gc(); // aciona garbage collector
		System.out.println("Instancias = "+ Pag123_FinalizadoresEColetaDeLixo.getInstancias());
	}
}

```

</details>
</br>


## **Pág. 125 e 131............Exceções**
<details>
<summary></summary>

#### **Exemplo:**

```java
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

//###################################################################

public class Pag127_ExcecoesMonitoradas {
	// dimensões são campos privados
	private double largura, altura;
	// construtor default aciona outro construtor com this
	public Pag127_ExcecoesMonitoradas () throws Exception {
		this (2, 1);
	}
	// construtor parametrizado
	public Pag127_ExcecoesMonitoradas (double larg, double alt) throws Exception {
		this.setTamanho(larg, alt);
	}
	// métodos
	public void setTamanho (double largura, double altura) throws Exception {
		// verifica valor das variáveis locais
		if (largura>=0 && altura>=0) { 
			// campos recebem valor das variáveis locais
			this.largura = largura; // uso explícito de this
			this.altura = altura;
		} else {

			//→→→→→→→→→→ Se dimensões inadequadas lança exceção monitorada ←←←←←←←←←←←←←←←←←←
			throw new Exception("Dimensoes invalidas.");
			
	}	}
	// uso implícito de this: retorna valor de this.largura
	public double getLargura () {
		return largura;
	}
	// uso implícito de this: retorna valor de this.altura
	public double getAltura () {
		return altura;
	}
	@Override
	public String toString () {
		return "P0312Retangulo[largura=" + largura + 
			",altura=" + altura + "]";
	}
}

//###################################################################

public class Pag128e129_ControleSimples_e_Seletivo_de_Excecoes {
	public static void main (String arg[]) {
		//tratamento genérico de exceções, ou seja, sem controle seletivo (uso de apenas um catch)______________________________
		try {
			// variáveis auxiliares recebem conversão dos argumentos
			double larg = Double.parseDouble(arg[0]); // 1o arg
			double alt = Double.parseDouble(arg[1]);  // 2o arg
			// cria objeto
			Pag125a126_LancamentoDeExcecoesNaoMonitoradas retangulo = new Pag125a126_LancamentoDeExcecoesNaoMonitoradas(larg, alt);
			// uso implícito de Retangulo2.toString() exibe info do objeto
			System.out.println(retangulo);
		} catch (Exception exc) {
			// exibe erros ocorridos durante a execução
			System.out.println("Erro durante a execucao:\n"+ exc);
		}

		//tratamento qualificado de exceções, ou seja, com controle seletivo (uso de vários catch)_______________________________
		try {
			// variáveis auxiliares recebem conversão dos argumentos
			double larg = Double.parseDouble(arg[0]); // 1o arg
			double alt = Double.parseDouble(arg[1]);  // 2o arg
			// cria objeto
			Pag127_ExcecoesMonitoradas retangulo = new Pag127_ExcecoesMonitoradas(larg, alt);
			// uso implícito de Retangulo3.toString() exibe info do objeto
			System.out.println(retangulo);
		} catch (ArrayIndexOutOfBoundsException exc) {
			// trata a falta de argumentos
			System.out.println("Numero insuficiente de argumentos.");
		} catch (NumberFormatException exc) {
			// trata erros de conversão
			System.out.println("Argumento(s) invalido(s).");
		} catch (Exception exc) {
			// trata erros de instanciação do retângulo
			System.out.println("Dimensoes invalidas.");
		}
	}
}

//###################################################################

//____________________________________________________________________________________________________________________________
//VER Código atualizado FinalRethrow com a versão 7 do Java (código repetitivo simplificado): Pag132_TratamentoDeExcecoes.java
public class Pag130_RelancamentoDeExcecoes_ABSOLETO { // VER ABSOLETO Rethrow SIMPLIFICADO: Pag131_RelancamentoDeExcecoes_ABSOLETO.java
	@SuppressWarnings("deprecation")
	public static Object create (String className)
		throws ClassNotFoundException, IllegalAccessException {
		try {
			Class<?> classe = Class.forName(className);
			return classe.newInstance();
		} catch (ClassNotFoundException e) {
			throw e; // rethrow
		} catch (InstantiationException e) {
			// tratamento local
			System.out.println(e + "\nObjeto nao criado");
			return null;
		} catch (IllegalAccessException e) {
			throw e; // rethrow
		}
	}
	public static void main(String... a) {
		try {
			Object o = create(a[0]);
			if (o != null) {
				System.out.println("Objeto: " + o.getClass());
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e + "\nFalta argumento com nome da classe!");
		// multi-catch
		} catch (ClassNotFoundException | IllegalAccessException e) {
			System.out.println(e);
		}
	}
}

//###################################################################

//____________________________________________________________________________________________________________________________
//VER Código atualizado FinalRethrow com a versão 7 do Java (código repetitivo simplificado): Pag132_TratamentoDeExcecoes.java
public class Pag131_RelancamentoDeExcecoes_ABSOLETO { // VER ABSOLETO Rethrow: Pag130_RelancamentoDeExcecoes_ABSOLETO.java
	@SuppressWarnings("deprecation")
	public static Object create (String className)
		throws Exception {
		try {
			Class<?> classe = Class.forName(className);
			return classe.newInstance();
		} catch (ClassNotFoundException e) {
			throw e; // rethrow
		} catch (InstantiationException e) {
			// tratamento local
			System.out.println(e + "\nObjeto nao criado");
			return null;
		} catch (IllegalAccessException e) {
			throw e; // rethrow
		}
	}
	public static void main(String... a) {
		try {
			Object o = create(a[0]);
			if (o != null) {
				System.out.println("Objeto: " + o.getClass());
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e + "\nFalta argumento com nome da classe!");
		// catch genérico
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

//###################################################################

//_______________________________________________________________________________________________________________
//__________Código atualizado FinalRethrow com a versão 7 do Java (código repetitivo simplificado):______________
public class Pag132_RelancamentoDeExcecoes_ATUALIZADO {
	//VER Rethrow ABSOLETOS: Pag130_RelancamentoDeExcecoes_ABSOLETO.java e Pag131_RelancamentoDeExcecoes_ABSOLETO.java
	@SuppressWarnings("deprecation")
	public static Object create (String className)
		throws Exception {
		try {
			Class<?> classe = Class.forName(className);
			return classe.newInstance();
		} catch (InstantiationException e) {
			// tratamento local
			System.out.println(e + "\nObjeto nao criado");
			return null;
		} catch (final Exception e) {
			throw e; // final rethrow
		}
	}
	public static void main(String... a) {
		try {
			Object o = create(a[0]);
			if (o != null) {
				System.out.println("Objeto: " + o.getClass());
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e + "\nFalta argumento com nome da classe!");
		// multi-catch
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

```

</details>
</br>


## **Pág. 132 à 142............Criação de pacotes e módulos | String, StringBuffer e StringBuilder**
<details>
<summary></summary>

ver diretórios:
 - <a href="#">pag133e134_pacotes</a>
 - <a href="#">pag139a142_modulos</a>

#### **Exemplo:**

```java
import pag133e134_pacotes.src.CriaPacote; // uso simples da diretiva import → com pack.subpack.Classe
import java.lang.Math; // uso simples da diretiva import
import static java.lang.Math.*; // uso da diretiva import com static (permite usar contantes declaradas em classes externas sem que sejam qualificadas → linha 25, diferente da linha 18) * nesse caso importa tudo da classe .Math

public class Pag137e138_Importacao {
	public static void main(String[] args) {

		// uso da importação da linha 1_____________
		for(int n=0; n<10; n++) {
			System.out.printf("Fibo: %6d Arit: %6d Geom: %6d\n",
				CriaPacote.fibonacci(n),
				CriaPacote.aritmetica(0, 2, n),
				CriaPacote.geometrica(1, 3, n));


		// uso da importação da linha 2_____________
		double raio = Double.parseDouble(args[0]);
		double perim = 2 * Math.PI * raio; // uso da constante PI de forma qualificada (referenciando a classe .Math antes)
		System.out.println("raio = " + raio + ", perim = " + perim);
		}


		// uso da importação da linha 3_____________
		double raio = Double.parseDouble(args[0]);
		double perim = 2 * PI * raio; // uso da constante PI de forma abreviada (sem referenciar a classe .Math antes)
		System.out.println("raio = " + raio + ", perim = " + perim);
	}
}
```

</details>
</br>
