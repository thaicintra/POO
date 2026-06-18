package ads.poo;

/**
 * Exceção Base
 * O compilador OBRIGA quem chama a fazer try-catch ou declarar throws
 * Todas as exceções da biblioteca herdam dela
 */

public class BibliotecaException extends Exception {
    public BibliotecaException(String message) {
        super(message);
    }
}
