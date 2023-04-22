import java.util.Calendar;

public class TimeTable {
	Course[][] timeTable = new Course[5][10];
	Course subject = new Course();

	public enum DAYS {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
	}

	public TimeTable() {
		initialize();
	}

	private void initialize() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 3) {
					timeTable[i][j] = new Course("LUNCH", "", "");
					timeTable[i][j].isValid = false;
				} else if (j == 7) {
					timeTable[i][j] = new Course("DINNER", "", "");
					timeTable[i][j].isValid = false;
				} else {
					timeTable[i][j] = new Course("----", "", "");
					timeTable[i][j].isValid = true;
				}
			}
		}
	}

	public String getSchedule(String day, int period) {
		int dayIndex = DAYS.valueOf(day.toUpperCase()).ordinal();
		Course course = timeTable[dayIndex][period - 1];
		return "At that time you have: " + course.getDetails();
	}

	public boolean setSchedule(String day, int period, String name, String tutor, String room) {
		int dayIndex = DAYS.valueOf(day.toUpperCase()).ordinal();
		if (period == 4 || period == 8) {
			return false;
		}
		timeTable[dayIndex][period - 1] = new Course(name, tutor, room);
		return true;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("TimeTable:\n");
		for (int i = 0; i < 5; i++) {
			sb.append(DAYS.values()[i]).append(": ");
			for (int j = 0; j < 10; j++) {
				sb.append(timeTable[i][j].name).append(", ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public String oneDaySchedule(String day) {
		int dayIndex = DAYS.valueOf(day.toUpperCase()).ordinal();
		StringBuilder sb = new StringBuilder();
		sb.append("One Day Schedule for ").append(day.toUpperCase()).append(":\n");
		for (int i = 0; i < 10; i++) {
			sb.append("Period ").append(i + 1).append(": ").append(timeTable[dayIndex][i].name).append(", ")
					.append(timeTable[dayIndex][i].professor).append(", ").append(timeTable[dayIndex][i].roomNumber)
					.append("\n");
		}
		return sb.toString();
	}

	public String subjectSchedule(String sub) {
		StringBuilder sb = new StringBuilder();
		sb.append("Subject Schedule for ").append(sub).append(":\n");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				if (timeTable[i][j].name.equals(sub)) {
					sb.append(DAYS.values()[i]).append(" Period ").append(j + 1).append(": ")
							.append(timeTable[i][j].professor).append("\n");
				}
			}
		}
		return sb.toString();
	}

	public Calendar setInputDate() {
		// Create a Calendar instance
		Calendar calendar = Calendar.getInstance();

		// Parse the input date string into year, month, and day values
		int year = Integer.parseInt(date.substring(0, 4));
		int month = Integer.parseInt(date.substring(4, 6));
		int day = Integer.parseInt(date.substring(6));

		// Set the parsed year, month, and day values into the Calendar object
		calendar.set(year, month - 1, day);

		// Return the Calendar object
		return calendar;
	}

}

