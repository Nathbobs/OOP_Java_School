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

            Scanner inputStream = new Scanner(new FileInputStream(inputFile)); //SOLVED
            while(inputStream.hasNext()) { //SOLVED
                String tmpToken = inputStream.next();
                switch(tmpToken) {
                    case "TOTALSALES":
                        this.overallSales = inputStream.nextInt(); //SOLVED
                        break;
                    case "OIL":
                        this.oiltypes = new Oil[inputStream.nextInt()]; //SOLVED
                        break;
                    case "REGIONS":
                        this.regions = new Region[inputStream.nextInt()]; //SOLVED
                        break;
//                    case "GASOLINE":
//                        this.oiltypes[tmpCandidate++] = new Gasoline(inputStream.next(), inputStream.nextInt(), inputStream.nextInt(), inputStream.nextInt()); //SOLVED partially
//                        break;
                    case "GASOLINE":
                        int gasCpl = inputStream.nextInt();
                        int gasVat = inputStream.nextInt();
                        this.oiltypes[tmpCandidate++] = new Gasoline(tmpToken, overallSales, gasCpl, gasVat);
                        break; //SOLVED partially too
//                    case "DIESEL":
//                        this.oiltypes[tmpCandidate++] = new Diesel(inputStream.next(), inputStream.nextInt(), inputStream.nextInt(), inputStream.nextInt()); //SOLVED partially
//                        break;
                    case "DIESEL":
                        int dieselCpl = inputStream.nextInt();
                        int dieselVat = inputStream.nextInt();
                        int dieselEnvTax = inputStream.nextInt();
                        this.oiltypes[tmpCandidate++] = new Diesel(tmpToken, overallSales, dieselCpl, dieselVat); //SOLVED partially too
                        break; //SOLVED partially too
//                    case "BIOFUEL":
//                        this.oiltypes[tmpCandidate++] = new Biofuel(inputStream.next(),inputStream.nextInt(), inputStream.nextInt(), inputStream.nextInt()); //SOLVED partially
//                        break;
                    case "BIOFUEL":
                        int bioCpl = inputStream.nextInt();
                        int bioDiscount = inputStream.nextInt();
                        this.oiltypes[tmpCandidate++] = new Biofuel(tmpToken, overallSales, bioCpl, bioDiscount);
                        break; //SOLVED partially too
//                    default:
//                        if(inputStream.hasNextInt())
//                            this.regions[tmpRegion++] =
//                        break;
                    default:
                        if (inputStream.hasNextInt()) {
                           // String regionName = tmpToken; //to be corrected
                            int regionNum = inputStream.nextInt();
                            //this.regions[tmpRegion++] = new Region(regionName, regionNum, overallSales, oiltypes); //to be corrected
                            this.regions[tmpRegion++] = new Region(tmpToken, regionNum, overallSales, oiltypes); //correction
                        }
                        break; //SOLVED partially too

                }
            }
            inputStream.close();
        } catch(FileNotFoundException e) {
            System.out.println("Can't read the file");
        }
    }

    public void saveData() {
        Arrays.sort(oiltypes);

        try {
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(outputFile));
            System.out.println("----------------------------------");
            System.out.println("Name: Nathaniel Abegunde 		Student Number: 2022055741");
            System.out.println("----------------------------------");
            for(int i=0; i<oiltypes.length; i++) {
                outputStream.println(oiltypes[i].toString());
                for(int j=0; j<regions.length; j++) {
                    outputStream.println("\nRegion: " + regions[j].getRegionName());
                    outputStream.println("Regional Sales: " + oiltypes[i].totalSales(regions[j].getRegionNum()));
                    outputStream.println("Total Cost: " + oiltypes[i].totalCost(regions[j].getRegionNum()));
                    outputStream.println("Total Quantity: " + oiltypes[i].totalQuantity(regions[j].getRegionNum()));
                }
                outputStream.println("\n=================================");
            }
            outputStream.close();
        } catch(FileNotFoundException e) {
            System.out.println("Can't write to the file");

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
