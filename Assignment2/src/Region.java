public class Region extends Thread {

    private String regionName;			// The name of the area
    private int regionNum;			// The number of the area
    private int overallSales;			// Overall sales of the area
    private Oil[] oil;                // The types of oil sold in the area

    public Region(String regionName, int regionNum, int totalSales, Oil[] oil) {
        this.regionName = regionName;
        this.regionNum = regionNum;
        this.overallSales = totalSales;
        this.oil = oil;
    } //SOLVED

    public String getRegionName() {
        return regionName;
    }

    public int getRegionNum() {
        return regionNum;
    }
    public int getOverallSales() {
        return overallSales;
    }

    public void generateSales() {
        int remainingSales = overallSales;
        while (remainingSales > 0) {
            int randomOilIndex = (int) (Math.random() * oil.length);
            int randomQuantity = (int) (Math.random() * 11); // Random quantity between 0 and 10 liters
            int totalPrice = oil[randomOilIndex].getPrice(randomQuantity);
            Sale sale = new Sale(regionNum, randomQuantity, totalPrice); //come back to this
            oil[randomOilIndex].addSale(sale);
            remainingSales--;
        }
    } //SOLVED



    public void run() {
        generateSales();
    }
}
