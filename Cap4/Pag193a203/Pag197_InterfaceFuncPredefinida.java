/* Interfaces funcionais predefinidas tornam mais fácil a criação de funções lambda e métodos de referência em Java, 
 * uma vez que não é necessário criar uma nova interface funcional para cada tipo de função.
 * 
 * Algumas dessas interfaces incluem:
 * 
 * Predicate<T>: uma interface que representa uma função que recebe um objeto do tipo T como entrada e retorna um valor booleano.
 * → assinatura: boolean test(T t)
 * 
 * Function<T, R>: uma interface que representa uma função que recebe um objeto do tipo T como entrada e retorna um objeto do tipo R como saída
 * → assinatura: R apply(T t)
 * 
 * Consumer<T>: uma interface que representa uma função que recebe um objeto do tipo T como entrada e não retorna nenhum valor.
 * → assinatura: void accept(T t)
 * 
 * Supplier<T>: uma interface que representa uma função que não recebe nenhuma entrada e retorna um objeto do tipo T como saída.
 * → assinatura: T get()
 * 
 * UnaryOperator<T>: uma interface que representa uma função que recebe um objeto do tipo T como entrada e retorna um objeto do mesmo tipo como saída
 * → assinatura: T apply(T t)
 * 
 * BinaryOperator<T>: uma interface que representa uma função que recebe dois objetos do tipo T como entrada e retorna um objeto do mesmo tipo como saída 
 * → assinatura: T apply(T t1, T t2)
 * 
 * IntToDoubleFunction: uma interface funcional em Java que representa uma função que recebe um valor inteiro como entrada e retorna um valor double como saída.
 * → assinatura: double applyAsDouble(int value)
 * 
 * BiFunction: interface que representa uma função que recebe dois argumentos de entrada de tipos diferentes e retorna um resultado de um tipo especificado
 * → assinatura: R apply(T t, U u) */

import java.util.function.BiFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.IntPredicate;
// ↑, ou importar tudo ↓
import java.util.function.*;

import java.util.Calendar;

public class Pag197_InterfaceFuncPredefinida {
	public static void main(String[] args) {

		// Funcão double (int)
		IntToDoubleFunction i2df = (l) -> l / (l + 1.0);
		System.out.println("res = " + i2df.applyAsDouble(4));		

		// Função Double (Double, Double): índice de massa corpórea
		BiFunction<Double, Double, Double> imc;
		imc = (m, h) -> m / Math.pow(h, 2);
		System.out.printf("IMC(m:%.2f|h:%.2f) = %.3f\n",
				81.5, 1.69, imc.apply(81.5, 1.69));

		// Operador unário int(int) para sucessor: f(n) = n + 1
		IntUnaryOperator suc = (n) -> n + 1;
		System.out.println("suc(0) = " + suc.applyAsInt(0));
		System.out.println("suc(suc(0)) = "
			+ suc.andThen(suc).applyAsInt(0));
			
		// Operadores unários double(double)
		DoubleUnaryOperator half = (v) -> v / 2;
		DoubleUnaryOperator plus1 = (v) -> v + 1;

		// Uso em composição anterior e posterior
		System.out.println("plus1(half(3))) = "
				+ half.andThen(plus1).applyAsDouble(3));
		System.out.println("half(plus1(3))) = "
				+ half.compose(plus1).applyAsDouble(3));

		// Define supplier (produtor) de número do mês corrente
		IntSupplier numMes = () -> Calendar.getInstance().get(Calendar.MONTH) + 1;

		// Define consumer (consumidor) de inteiros
		IntConsumer ref = (v) -> System.out.printf("consumed(%d)",v);

		// Uso de supplier e consumer
		int mes = numMes.getAsInt();
		System.out.println("Supplier::Mes=" + mes);
		System.out.print("Consumer::");
		ref.accept(mes);
		System.out.println();

		// Predicado: n é potência de dois
		IntPredicate potDois = (n) -> (Math.log(n) / Math.log(2)) % 2 == 0;

		// Predicado: n > 100
		IntPredicate cemOuMenos = (n) -> n <= 100;

		// Aplicação separada dos predicados
		System.out.println("potDois(10): " + potDois.test(10));
		System.out.println("potDois(1024): " + potDois.test(1024));
		System.out.println("cemOuMenos(10): " + cemOuMenos.test(10));
		System.out.println("cemOuMenos(1024): " + cemOuMenos.test(1024));

		// Aplicação combinada dos predicados com encadeamento de métodos
		System.out.println("potDois(1024) AND cemOuMenos(1024): "
				+ potDois.and(cemOuMenos).test(1024));
		System.out.println("cemOuMenos(10) OR potDois(10): "
				+ cemOuMenos.or(potDois).test(10));

		// Métodos com assinatura double (double)
		DoubleUnaryOperator f_cbrt = Math::cbrt;
		DoubleFunction<Double> f_exp = Math::exp;
		Function<Double, Double> f_log = Math::log;
		System.out.println("cbrt(8.0)=" + f_cbrt.applyAsDouble(8.0));
		System.out.println("exp(1.0)=" + f_exp.apply(1.0));
		System.out.println("log(64.0)=" + f_log.apply(64.0));
	
		// Métodos com assinatura double (double, double)
		DoubleBinaryOperator f_max = Math::max;
		BinaryOperator<Double> f_min = Math::min;
		P0444Calculavel f_pow = Math::pow;
		System.out.println("max(2.5, 5.2)=" + f_max.applyAsDouble(2.5, 5.2));
		System.out.println("min(2.5, 5.2)=" + f_min.apply(2.5, 5.2));
		System.out.println("pow(16.0, 0.5)=" + f_pow.calcular(16.0, 0.5));
	
		// Expressões lambda equivalentes
		DoubleUnaryOperator f_cbrt2 = v -> Math.cbrt(v);
		BinaryOperator<Double> f_min2 = (a, b) -> a < b ? a : b;
		System.out.println("cbrt2(512)=" + f_cbrt2.applyAsDouble(512));
		System.out.println("min2(2.5, 5.2)=" + f_min2.apply(2.5, 5.2));
	}
}
