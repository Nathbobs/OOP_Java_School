import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class OilSim {

	private String outputFile;
	private int overallSales;
	private Oil[] oiltypes;
	private Region[] regions;
	
	public OilSim(String inputFile, String outputFile) {
		this.outputFile = outputFile;
		try {
			int tmpCandidate = 0;
			int tmpRegion = 0;
			
			Scanner inputStream = /* your code */
			while(/* your code */) {
				String tmpToken = inputStream.next();
				switch(tmpToken) {
				case "TOTALSALES":
					this.overallSales = /* your code */
					break;
				case "OIL":
					this.oiltypes = /* your code */
					break;
				case "REGIONS":
					this.regions = /* your code */
					break;
				case "GASOLINE":
					this.oiltypes[tmpCandidate++] = /* your code */
					break;
				case "DIESEL":
					this.oiltypes[tmpCandidate++] = /* your code */
					break;
				case "BIOFUEL":
					this.oiltypes[tmpCandidate++] = /* your code */
					break;
				default:
					if(inputStream.hasNextInt())
						this.regions[tmpRegion++] = /* your code */
					break;
					
				}
			}
			inputStream.close();
		} catch(/* your code */) {
			System.out.println("Can't read the file");
		}
	}
	
	public void saveData() {
		Arrays.sort(oiltypes);
		try {
			PrintWriter outputStream = /* your code */
			for(int i=0; i<oiltypes.length; i++) {
				/* your code */
				for(int j=0; j<regions.length; j++) {
					/* your code */
				}
				outputStream.println("\n=================================");	
			}
			outputStream.close();
		} catch (/* your code */) {
			
		}
	}
	
	public void runSimulation() {
		for(int i=0; i<regions.length; i++)
			regions[i].run();
		for(int j=0; j<regions.length; j++) {
			try {
				regions[j].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Interrupted");
			}
		}
		saveData();
	}
}
