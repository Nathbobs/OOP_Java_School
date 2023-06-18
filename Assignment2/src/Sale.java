
public class Sale {

    public int regionNum;
    public int liters;
    public int cost;

    public Sale(int areaNum, int quantity, int price) {
        this.regionNum = areaNum;
        this.cost = price;
        this.liters = quantity;
    }


    public int getRegion() { //new method to fix Oil.Java problem
        return regionNum;
    }

    public int getQuantity() { //new method to fix Oil.Java problem
        return liters;
    }
}
