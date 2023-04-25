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
import java.util.Calendar;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;

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
	}
}
