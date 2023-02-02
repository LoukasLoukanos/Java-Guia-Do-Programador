package jandl.jgp4.engine;

public interface P0411Imprimivel {
	public static final String INICIO = "<inicio>"; // declarar as constantes de interfaces como public, static e final é redundante ↓
	// String MEIO = "<meio>"; → esta constante da interface seria declarada implicitamente como public, static e final
	public static final String FIM = "<fim>"; // redundante
	
	public abstract void imprimir (); // declarar os métodos de interfaces como public e abstract é redundante ↓
	//void imprimirFinalizar (); → este método da interface seria declarado implicitamente como public e abstract
	public abstract void imprimirNoConsole (); // redundante
}
