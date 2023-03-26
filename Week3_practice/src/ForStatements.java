public class ForStatements {
    public static void main(String[] args) {
        int rowNum, columnNum;
        for (rowNum = 1; rowNum <= 3; rowNum++){
            for (columnNum = 1; columnNum <= 2; columnNum++)
                System.out.println("row " + rowNum + " column " + columnNum);
            System.out.println();
        }
    }
}
