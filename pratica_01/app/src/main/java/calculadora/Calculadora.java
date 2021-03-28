package calculadora;


import java.math.BigDecimal;
import java.math.RoundingMode;


public class Calculadora {

  public double raizNesima(double radicando, double indice) {
    return raizNesima(radicando, indice, 8);
  }

  public double raizNesima(
          double radicando, double indice, int roundPlaces) {
    double sinalRadicando = Math.signum(radicando);

    radicando *= sinalRadicando;

    if (sinalRadicando < 0 && indice % 2 == 0) {
      // Caso Invalido
      return Double.NaN;
    }

    double resultado = Math.pow(radicando, 1.0/indice) * sinalRadicando;

    return Double.isNaN(resultado)? resultado : round(resultado, roundPlaces);
  }

  private static double round(double value, int places) {
    if (places < 0) throw new IllegalArgumentException();

    BigDecimal bd = new BigDecimal(Double.toString(value));
    bd = bd.setScale(places, RoundingMode.HALF_EVEN);
    return bd.doubleValue();
  }

}
