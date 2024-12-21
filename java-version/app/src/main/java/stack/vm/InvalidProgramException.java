package stack.vm;

public class InvalidProgramException extends RuntimeException {

    public InvalidProgramException(String message) {
        super(message);
    }
}