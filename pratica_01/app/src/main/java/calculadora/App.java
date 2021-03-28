package calculadora;


public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        try {
            System.out.println(calculadora.raizNesima(
                    Double.parseDouble(args[0]), Double.parseDouble(args[1])));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: radicando and indice not specified");
            System.err.println("Use: gradle run --args='[radicando] [indice]'");
        }
    }
}
