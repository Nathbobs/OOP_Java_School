public class ExpiredSale extends Sale{
    private double expired;

    public ExpiredSale() {
        super();
        setExpired(0);
    }

    public ExpiredSale(String theName, double thePrice, double theExpired) {
        super(theName, thePrice);
        setExpired(theExpired);
    }

    public void setExpired(double theExpired) {
        expired = theExpired;
    }

    public String toString() { return (getName() + " Price = $" + getPrice() + " Expired = " + expired + " left\n" + " Deliver Fee = $" + deliverFee()); }

    public double deliverFee() {
        /* your code */
        if ( expired >= 10)
            return 3;
        else if ( expired >= 3 && expired < 10)
            return 2;
        else if ( expired >= 1 && expired < 3)
            return 10;
        else
            return -1;
    }

}

