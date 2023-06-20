public abstract class Oil  implements Comparable {
    private String name;
    private int numSales = 0;
    private Sale[] sales;
    protected int costPerLiter = 0;


    public Oil(String name, int maxSales, int cpl) {
        this.name = name;
        sales = new Sale[maxSales];
        costPerLiter = cpl;
        //SOLVED
    }

    public String getName() {
        return name;
    }
    public int getnumSales() {
        return numSales;
    }

    public String toString() {
        return "Name : " + name + "\nSales : " + numSales ; //SOLVED
    }

    public int totalSales(int regionNum) {
        int salesInRegion = 0;
        for (Sale sale : sales) {
            if (sale != null && sale.getRegion() == regionNum) { //fixed this in Sale.java
                salesInRegion++;
            }
        }
        return salesInRegion;
    } //SOLVED
    public int totalCost(int regionNum) {
        int totalCost = 0;
        for (Sale sale : sales) {
            if (sale != null && sale.getRegion() == regionNum) {
                totalCost += sale.getQuantity() * costPerLiter;
            }
        }
        return totalCost;
    } //SOLVED
    public int totalQuantity(int regionNum) {
        int totalQuantity = 0;
        for (Sale sale : sales) {
            if (sale != null && sale.getRegion() == regionNum) {
                totalQuantity += sale.getQuantity();
            }
        }
        return totalQuantity;
    } //SOLVED
    public abstract int getPrice(int quantity); //SOLVED


    //@Override
    public int compareTo(Object obj) {
        // TODO Auto-generated method stub
        Oil tmp = (Oil)obj;
        return Integer.compare(((Oil) obj).numSales, this.numSales); //SOLVED partially.
    }

    public synchronized void addSale(Sale s) { //corrected
        if ( numSales < sales.length){
        // TODO Auto-generated method stub
        sales[numSales++] = s;
    }
    }

}