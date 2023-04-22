//import java.util.Calendar;
//
//public class TimeTableNew {
//	Course[][] timeTable = new Course[5][10];
//	Course subject = new Course();
//
//	public enum DAYS {//Make DAYS of Enum type. It is from Monday to Friday.
//		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
//	}
//
//	public TimeTableNew() {
//		/*Create a timeTable variable to store the subjects in the students' timetables.
//		This variable is a two-dimensional array and stores objects of the Course class.*/
//		/* Write the code */
//	}
//
//	private void initialize() {
//		/*Create an Initialize() method. This method can only be accessed within this class and initializes the timetable as follows.
//		1. This array has 5 rows (days) and 10 columns (periods).
//		2. All timetables in lecture 4 (column 3) are fixed to LUNCH. Here isValid field of the Course class should be set to false.
//		3. All timetables in lecture 8 (column 7) are fixed to DINNER. Here isValid field of the Course class should be set to false.
//		4. All other time slots are initialized with ----. Here isValid field of the Course class should be set to true.*/
//		/* Write the code */
//	}
//
//	public String getSchedule(String day, int period) {
//
//		/* Create a method called getSchedule(). This method receives DAY and period as arguments, stores the information about the subject in that time period in a String, and returns it.
//(Hint: Call getDetail() of Subject class after String with “At that time you have:” value)
// */
//		/* Write the code */
//	}
//
//	public boolean setSchedule(String day, int period, String name, String tutor, String room) {
//		/* Create a method called setSchedule(). This method receives DAY, period, name, tutor, and room as arguments. This method stores the subject information at the appropriate day and time. This method returns true on success and false on failure.
//		NOTE: If the user tries to save the subject during LUNCH or DINNER, false is returned. */
//		/* Write the code */
//	}
//
//	public String toString() {
//		/* Create a method called toString().
//		This method returns the format for the timetable as a String (see output sample below). */
//		/* Write the code */
//	}
//
//	public String oneDaySchedule(String day) {
//		/* Create a method called oneDaySchedule().
//		This method receives a day of the week as an input and returns the timetable for that day in String format. */
//		/* Write the code */
//	}
//
//	public String subjectSchedule(String sub) {
//		/*Create a subjectSchedule() method that receives name of class as input and returns day, period, tutor information as follows */
//		/* Write the code */
//	}
//
//	public Calendar setInputDate()
//	{
//		/*  Create a setInputDate() method. This method receives the date of the day (year month day) it wants to know as input and stores the date information in the Calendar class object. And returns an object of the Calendar class.
//			Hint1: The input is a String type of ‘20230417’. Using the Wrapper class, the year, month, and day can be separated and stored in the Calendar class object.
//			Hint2: See the bottom of the document for how to use the Calendar class. */
//		/* Write the code */
//	}
//}