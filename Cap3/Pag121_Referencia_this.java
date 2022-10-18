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
