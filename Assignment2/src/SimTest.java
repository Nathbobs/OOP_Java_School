public class SimTest {

    private static final String INPUTFILE = "resource/inputfile.txt";
    private static final String OUTPUTFILE = "resource/outputfile.txt";


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        OilSim eSim = new OilSim(INPUTFILE, OUTPUTFILE);
        eSim.runSimulation();

    }
}