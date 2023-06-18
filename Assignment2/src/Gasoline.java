public class Gasoline extends Oil {

    private int vat = 0;


    public Gasoline(String name, int maxSales, int cpl, int vt) {
        super(name, maxSales, cpl);
        vat = vt;
        //SOLVED

    }

    public String toString() {
        return "Name: " + super.getName() + "\nTotal Sales: " + super.getnumSales() + "\nVAT: " + vat + "%"
                + "\nPrice: " + getPrice(1); // Assuming quantity of 1 for price calculation
    } //SOLVED



    public int getPrice(int quantity) {
        double totalCostPerLiter = super.costPerLiter + (super.costPerLiter * (vat / 100.0));
        int totalPrice = (int) (quantity * totalCostPerLiter);
        return totalPrice;
    }
} //SOLVED