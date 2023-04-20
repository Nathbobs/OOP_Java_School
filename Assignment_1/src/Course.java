

public class Course {
	public String name; //name of the course
	public String professor;// used to store the name of the professor
	public String roomNumber;//name of the classroom where class is held
	public boolean isValid;//used to determine whether a valid subject slot is available or not.

	public Course() {
		Course name = new Course();
		Course professor = new Course();
		Course roomNumber = new Course();
	}

	public Course(String name, String tutor, String room) {
		name = this.name;
		tutor = professor;
		room = roomNumber;

	}

	public Course(String name) {
		name = this.name;
	}

	public Course(Course copy) {

		name = copy.name;
	}
	public String getStateProfessor() {
		return professor ;
	}
	public String getStateName() {
		return name ;
	}
	public String getStateRoomNumber() {
		return roomNumber ;
	}

	public void setState(String tutor, String room) {
		tutor = this.professor;
		room = this.roomNumber;
	}

	public boolean equals(Course s) {
		return ((name.equals(s.name)) && (professor.equals(s.professor) && (roomNumber.equals(s.roomNumber))));
	}

	public String toString() {
		name = name.toString();
		return name;
	}

	public String getDetails() {
		String details = (name + professor + roomNumber.toString() );

		return details;
	}
}