public class Pag196_RealizaFuncional implements Pag195_InterfaceFuncional {
	@Override
	public double calcular(double a, double b) {
		return 0.4*a + 0.6*b;
	}
	/* Como é muito provável que a classe Pag196_RealizaFuncional seja usada somente uma vez, uma classe anônima seria uma alternativa possível 
 	 * para suprir um objeto Pag195_InterfaceFuncional para o método efetuar Calculo, como segue:
 	 * obs: Embora essa alternativa evite a implementação de uma classe especifica, como Pag196_RealizaFuncional, sua legibilidade é questionável.
 	 * double res = efetuarCalculo(new Pag195_InterfaceFuncional () {
 	 * 	public double calcular (double a, double b) { 
 	 * 		return 0.4*a + 0.6*b; 
 	 * 	}
 	 * }, x, y);
 	 * 
	 *
 	 * Aqui surgem as vantagens das expressões lambda. Como se deseja definir uma função de cálculo para o método efetuarCalculo, a passagem de 
 	 * funcionalidade poderia ser feita com uma expressão lambda pura, como no trecho seguinte, que elimina a necessidade da classe 
 	 * Pag196_RealizaFuncional ou do uso de uma classe anônima como acima↑. Isso funciona porque o compilador pode determinar a assinatura da 
	 * expressão lambda fornecida como sendo double (double, double), a qual é compatível com o único método requerido pela interface 
	 * P9444Calculavel (que é funcional), tornando possivel o uso dessa lambda em substituição a um objeto que implemente a interface: */
	double res = efetuarCalculo((a, b) -> 0.4*a + 0.6*b, x, y);
}
