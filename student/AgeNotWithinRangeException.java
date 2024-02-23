package student;

public class AgeNotWithinRangeException extends Exception {
    private static final long serialVersionUID = 1L; 
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

