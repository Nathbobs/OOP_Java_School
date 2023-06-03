public class Region /* your code */ {

	private String regionName;			// The name of the area
	private int regionNum;			// The number of the area
	private int overallSales;			// Overall sales of the area
	private Oil[] oil;	// An array of the candidates of the election
	
	public Region(String regionName, int regionNum, int totalSales, Oil[] oil) {
		/* your code */
	}
	
	public String getRegionName() {
		return regionName;
	}
	
	public int getRegionNum() {
		return regionNum;
	}
	
	public void generateSales() {
		/* your code */
	}
	
	
	public void run() {
		generateSales();
	}
}
