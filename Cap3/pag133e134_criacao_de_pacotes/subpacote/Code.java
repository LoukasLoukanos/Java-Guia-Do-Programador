package pag133e134_criacao_de_pacotes.subpacote;
//package diretório.subdiretório (onde se encontra o código fonte Code.java)

public class Code {

    public static long fibonacci(int n) {
		if (n<0) {
			throw new RuntimeException("Valor invalido: " + n);
		}
		switch(n) {
			case 0: return 0L;
			case 1: return 1L;
			default: 
				long fn_2 = 0, fn_1 = 1, fn = 0;
				for(int t = 2; t<=n; t++) {
					fn = fn_1 + fn_2;
					fn_2 = fn_1;
					fn_1 = fn;
				}
				return fn;
		}
	}


    public static long aritmetica(int ini, int razao, int nTermos) {
		long res = ini;
		for(int t=0; t<nTermos; t++, res += razao);
		return res;
	}

	
	public static long geometrica(int ini, int razao, int nTermos) {
		long res = ini;
		for(int t=0; t<nTermos; t++, res *= razao);
		return res;
	}
}
