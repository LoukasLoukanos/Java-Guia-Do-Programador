package jandl.jgp4;

import java.util.Arrays;

/* "Implementa" (e não "realiza") a interface FUNCIONAL P0422Funcional, pois
   assume o compromisso de implementar o método FUNCIONAL que fora declarado.
   
   ♦ fixando:
   → As classes IMPLEMENTAM (e não "realizam") interfaces e PROVIDEN seus próprios métodos 
   para atender as especificações definidas pela interface. Portanto, o correto é dizer que 
   as classes IMPLEMENTAM interfaces. A palavra "realizar" não é usada no contexto de 
   implementação de interface em Java. */
public class P0423RealizaFuncional implements P0422Funcional {
	protected Object[] array;
	
	public P0423RealizaFuncional () { 
		this(10); 
	}
	public P0423RealizaFuncional (int tam) { 
		array = new Object[tam];
	}
	// Realização da interface P0422Funcional ao implementar o método funcional
	public void sort() {
		Arrays.sort(array);
	}
	public Object get(int index) {
		return array[index];
	}
	public void set(int index, Object value) {
		array[index] = value;
	}
	@Override
	public String toString() {
		return Arrays.toString(array);
	}
}
