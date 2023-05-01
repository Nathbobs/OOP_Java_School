import java.util.Calendar;
public class TimeTable {
	Course[][] timeTable = new Course[5][10];
	Course subject = new Course();

	public enum DAYS {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
	}

	public TimeTable() {
		timeTable = new Course[5][10];
		initialize();
	}


	private void initialize() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 3) {
					timeTable[i][j] = new Course("LUNCH", "LUNCH", "LUNCH");
					timeTable[i][j].getIsValid(false);
				} else if (j == 7) {
					timeTable[i][j] = new Course("DINNER", "DINNER", "DINNER");
					timeTable[i][j].getIsValid(false);
				} else {
					timeTable[i][j] = new Course("----", "----", "----");
					timeTable[i][j].getIsValid(true);
				}
			}
		}
	}

	public String getSchedule(DAYS day, int period) {
		String output = "At that time you have:\n";
		output += timeTable[day.ordinal()][period].getDetails();
		return output;
	}

	public boolean setSchedule(DAYS day, int period, String name, String tutor, String room) {
		if (period == 3 || period == 7) {
			return false;
		}
		timeTable[day.ordinal()][period].setName(name);
		timeTable[day.ordinal()][period].setProfessor(tutor);
		timeTable[day.ordinal()][period].setRoomNumber(room);
		timeTable[day.ordinal()][period].getIsValid(true);;
		return true;
	}

	public String toString() {
		String result = String.format("%-15s%-15s%-15s%-15s%-15s%n", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY");
		for (int i = 0; i < timeTable[0].length; i++) {
			String row = "";
			for (int j = 0; j < timeTable.length; j++) {
				Course course = timeTable[j][i];
				String subject = "--------";
				if (Course.isValid()) {
					subject = course.getName();
				} else {
					subject = course.getName().toUpperCase();
				}
				row += String.format("%-15s", subject);
			}
			result += String.format("%-15s%n", row);
		}
		return result;
	}

	public String oneDaySchedule(DAYS day) {
		String output = day.toString() + "\n";
		for (int i = 0; i < 10; i++) {
			output += timeTable[day.ordinal()][i].getName() + "\n";
		}
		return output;
	}

	public String subjectSchedule(String name) {
		String output = "";
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				if (timeTable[i][j].getName().equals(name)) {
					output += "SUBJECT: " + name + "\n";
					output += "Day : " + DAYS.values()[i] + "\n";
					output += "Lecture : " + j + "\n";
					output += "Professor: " + timeTable[i][j].getProfessor() + "\n";
					output += "Room No : " + timeTable[i][j].getRoomNumber() + "\n";
					return output;
				}
			}
		}
		return output;
	}

	public Calendar setInputDate() {
		// Create a Calendar instance
		Calendar calendar = Calendar.getInstance();

		// Parse the input date string into year, month, and day values
		int year = Integer.parseInt("". substring(0, 4));
		int month = Integer.parseInt("".substring(4, 6));
		int day = Integer.parseInt("".substring(6));

		// Set the parsed year, month, and day values into the Calendar object
		calendar.set(year, month - 1, day);

		// Return the Calendar object
		return calendar;
	}

}

