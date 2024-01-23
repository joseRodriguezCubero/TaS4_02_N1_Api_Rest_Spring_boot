package cat.itacademy.barcelonactiva.rodriguez.jose.s04.t02.n01.model.exceptions;

import java.io.Serial;

public class FruitAlreadyExistException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;

    public FruitAlreadyExistException(String msg) {
        super(msg);
    }
}