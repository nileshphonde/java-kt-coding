class ClassDemo {

	public static void main(String args[]) {

		Student s = new Student();
		s.setId(10);
		s.setName("nilesh");
		System.out.println("Id = " + s.getId());
		System.out.println("Name = " + s.getName());
		
		Student obj = new Student(20, "shiva");
		System.out.println("Id = " + obj.getId() + "\tName = " + obj.getName());
	}
}

class Student {

	int id;
	String name;

	Student() {
		System.out.println("Student created!");
	}

	Student(int id, String name) {
		System.out.println("Student created!");
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}