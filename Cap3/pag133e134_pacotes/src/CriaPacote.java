package pag133e134_pacotes.src;
//package diretório.subdiretório (onde se encontra o código fonte Code.java)

public class CriaPacote {

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
//Code.fibonacci(10) → retorna o 10°­ termo da sequência
//Code.aritmetica(0, 2, 4) → retorna o 4° termo da PA de inicio 0 e razão 2
//Code.geometrica(1, 0.5, 8) → retorna o 8° termo da PG de inicio 1 e razão 0.5
