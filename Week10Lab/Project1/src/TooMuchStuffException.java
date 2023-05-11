public class TooMuchStuffException extends Exception {

    private int inputNumber;

    public TooMuchStuffException(int inputNum/* my code */) {
//        TooMuchStuffException inputNumber = new TooMuchStuffException();
        inputNumber = inputNum;
        /* my code */
    }

    public TooMuchStuffException() {
        super("Too Much Stuff");
        /* my code */
    }

    public TooMuchStuffException(String message/* my code */) {
        super(message);
        /* my code */
    }

    public int getNumber() {
        /* my code */
        return inputNumber;
    }

}
