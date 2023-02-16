package jandl.jgp4;

import java.util.Arrays;

/* "Implementa" (realiza é mais propício) a interface FUNCIONAL P0422Funcional, assumindo o
 * compromisso de implementar ('implementar' pois tem o compromisso de 'realizar' a interface...) 
 * o método FUNCIONAL que fora declarado.
 * 
 * ♦ fixando:
 * → Classes REALIZAM interfaces
 * → Classes que REALIZAM interfaces IMPLEMENTAM seus métodos
*/
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
