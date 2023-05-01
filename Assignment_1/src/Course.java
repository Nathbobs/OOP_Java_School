

public class Course {
	public String name; //name of the course
	public String professor;// used to store the name of the professor
	public String roomNumber;//name of the classroom where class is held
	public static boolean isValid;//used to determine whether a valid subject slot is available or not.

	public Course() {
		name = "----";
		professor = "";
		roomNumber = "";
		isValid = true;
	}

	public Course(String name, String professor, String room) { ///this is proven to be equals to null(correct later)
		this.name = name;
		this.professor = professor;
		this.roomNumber = room;

	}

	public Course(String name) {
		this.name = name;
	}


	public Course(Course copy) {
		this.name = copy.name;
		this.professor = copy.professor;
		this.roomNumber = copy.roomNumber;
		this.isValid = copy.isValid;
	}

	public static boolean isValid() {
		return isValid;
	}

	public String getProfessor() {
		return professor ;
	}
	public String getName() {
		return name ;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoomNumber() {

		return roomNumber ;
	}

	public void setProfessor(String professor) {
		this.professor = professor ;
	}
	public void setRoomNumber(String room) {
		this.roomNumber = room;
	}
	public void getIsValid(boolean isValid) {
		this.isValid = isValid;
	}
	public void setIsValid(boolean isValid) {
		this.isValid = isValid;
	}

	public boolean equals(Course s) {
		return ((name.equals(s.name)) && (professor.equals(s.professor) && (roomNumber.equals(s.roomNumber))));
	}

	public String toString() {
		return name;
	}

	public String getDetails() {
		return "Name : " + name + " \n" +"Tutor : " + professor + "\n"+ "Room : " + roomNumber;
	}
}