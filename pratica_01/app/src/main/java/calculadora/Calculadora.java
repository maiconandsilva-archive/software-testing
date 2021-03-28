package calculadora;


public class Calculadora {
  public double raizNesima(double radicando, double indice) {
    double sinalRadicando = Math.signum(radicando);

    radicando *= sinalRadicando;

    if (sinalRadicando < 0 && indice % 2 == 0) {
      // Caso Invalido
      return Double.NaN;
    }
    return Math.pow(radicando, 1.0/indice) * sinalRadicando;
  }
}
