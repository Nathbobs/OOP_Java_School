public class Date {
    private String month;
    private int day;
    private int year; // a four digit number.

    public Date(){
        month = "January";
        day = 1;
        year = 1000;
    }
    public Date (String month, int day, int year){
        setDate(month,day,year);
    }
    public Date (int month, int day, int year){
        String strMonth = Integer.toString(month);
        setDate(strMonth,day,year);
    }
    public Date (int year) {
        setDate(1,1,year);
    }

}
