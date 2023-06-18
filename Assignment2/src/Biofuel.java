public class Biofuel extends Oil { //SOLVED

    private int discount = 0;


    public Biofuel(String name, int maxSales, int cpl, int disc) {
        super(name, maxSales, cpl);
        discount = disc;
        //SOLVED
    }

    public String toString() {
        return "Name: " + super.getName() + "\nTotal Sales: " + super.getnumSales() + "\nDiscount: " + discount
                + "\nPrice: " + getPrice(1); // Assuming quantity of 1 for price calculation
    } //SOLVED



    public int getPrice(int quantity) {
        int totalPrice = quantity * super.costPerLiter;
        totalPrice -= discount;
        return totalPrice;
    }
} //SOLVED
