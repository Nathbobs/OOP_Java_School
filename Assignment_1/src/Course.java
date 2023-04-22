

public class Course {
	public String name; //name of the course
	public String professor;// used to store the name of the professor
	public String roomNumber;//name of the classroom where class is held
	public boolean isValid;//used to determine whether a valid subject slot is available or not.

	public Course() {
		name = "----";
		professor = "";
		roomNumber = "";
		isValid = true;
	}

	public Course(String name, String tutor, String room) { ///this is proven to be equals to null(correct later)
		name = this.name;
		tutor = this.professor;
		room = this.roomNumber;

	}

	public Course(String name) {

		name = this.name;
	}

	public Course(Course copy) {
		name = copy.name;
		professor = copy.professor;
		roomNumber = copy.roomNumber;
		isValid = copy.isValid;
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
		return "Name : " + name;
	}

	public String getDetails() {
		return "Name : " + name + " \n" +"Tutor : " + professor + "\n"+ "Room : " + roomNumber;
	}
}