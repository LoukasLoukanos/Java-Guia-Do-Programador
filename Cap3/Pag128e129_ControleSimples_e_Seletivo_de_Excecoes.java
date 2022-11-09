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
