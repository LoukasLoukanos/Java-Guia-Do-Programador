public class Pag94_AnotacoesJava {
	public static void main(String[] args) {
		System.out.println("Valor aleatorio: " + Anotacoes.random());
	}
}
// As anotações são meetainformações incluída no código do programa, com o objetivo de fornecer indicações para 
// ferramentas que vão manipulá-lo, ou seja, servem como diretivas para compiladores, IDEs ou outros programas.
class Anotacoes {
	@Deprecated //marca o método anotado como absoleto, isto é, que não deveria ser utilizado
	public static double random() { return Math.random(); }
	
	@Override // indica que o método anotado sobrepõe outro existente em sua superclasse (o compilador gera erro casso não ocorra a sobreposição)
	// •Override(Sobreposição de Métodos):reescrever o método herdado da superclasse com a mesma assinatura, alterando o corpo do método
    // •Overload(Sobrecarga de Métodos):escrever vários métodos com o mesmo nome, com parâmetros e assinaturas(identificação) diferentes
	
	@SuppressWarnings("unused") // ordena que o compilador suprima os avisos gerados por um elemento (classe, método ou diretiva) e seus subelementos.
	public String toString() {
		int x;
		return "ExemploAnotação";
	}
}
