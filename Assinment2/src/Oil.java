public abstract class Oil /* your code */ {
	private String name;
	private int numSales = 0;
	private Sale[] sales;
	protected int costPerLiter = 0;

	
	public Oil(String name, int maxSales, int cpl) {
		/* your code */
	}
	
	public String toString() {
		return /* your code */
	}
	
	public int totalSales(int regionNum) {
		/* your code */
	}
	public int totalCost(int regionNum) {
		/* your code */
	}
	
	public int totalQuantity(int regionNum) {
		/* your code */
	}
	
	public /* your code */ int getPrice(int quantity);
	
	
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		Oil tmp = (Oil)obj;
		return /* your code */
	}
	
	public /* your code */ void addSale(Sale s) {
		// TODO Auto-generated method stub
		sales[numSales++] = s;	
	}

}
