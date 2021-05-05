package calculadora;

import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
* <h1>Casos de teste para a operacao <i>raiz n-esima</i></h1>
* <ol>
* 	<li> radicando negativo </li>
* 	<li> radicando positivo </li>
* 	<li> radicando zero     </li>
* 	<li> indice    negativo </li>
* 	<li> indice    positivo </li>
* 	<li> indice    zero     </li>
* 	<li> resultado valido   </li>
* 	<li> resultado invalido </li>
* </ol>
*/

public class CalculadoraTest {
	private final Calculadora calculadora = new Calculadora();

	@ParameterizedTest
	@CsvFileSource(resources = {"/CalculadoraTest.csv"})
	public void testRaizNesima(
			double radicando, double indice, double resultado) {
		assertEquals(resultado,
				calculadora.raizNesima(radicando, indice), 0.000001,
				String.format("Raiz %.5f de %.5f", indice, radicando));
	}

	@ParameterizedTest
	@CsvFileSource(resources = {"/CalculadoraTestNaN.csv"})
	public void testRaizNesimaNaN(double radicando, double indice) {
		testRaizNesima(radicando, indice, Double.NaN);
	}
}
