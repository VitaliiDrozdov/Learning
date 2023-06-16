package Calculator;

public class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException() {
    }

    public DivisionByZeroException(String message) {
        super(message);
    }

}
