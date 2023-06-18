public class Diesel extends Oil { //SOLVED

    private int vat = 0;
    private int envtax = 0;

    public Diesel(String name, int maxSales, int cpl, int vt) { //removed ent
        super(name, maxSales, cpl);
        vat = vt;
//        envtax = ent;
    } //SOLVED

    public String toString() {
        return "Name: " + super.getName() + "\nTotal Sales: " + super.getnumSales() + "\nVAT: " + vat + "%"
                + "\nEnvTax: " + envtax + "%" + "\nPrice: " + getPrice(1); // Assuming quantity of 1 for price calculation
    } //SOLVED



    public int getPrice(int quantity) {
        double totalCostPerLiter = super.costPerLiter + (super.costPerLiter * (vat / 100.0))
                + (super.costPerLiter * (envtax / 100.0));
        int totalPrice = (int) (quantity * totalCostPerLiter);
        return totalPrice;
    }
} //SOLVED
