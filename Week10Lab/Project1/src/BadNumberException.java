public class BadNumberException  extends Exception{
    private int badNumber;

    public BadNumberException(int number) {
        super("Bad Number");
        badNumber = number;
    }
    public BadNumberException() {
        super("BadNumberException");
    }
    public BadNumberException(String message) {
        super(message);
    }
    public int getNumber() {
        return badNumber;
    }
}
