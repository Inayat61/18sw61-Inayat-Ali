class Student{
	private int rollno;
	private String name;
	
	public Student(int rollno, String name){
		this.rollno=rollno;
		this.name=name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setRollno(int rollno){
		this.rollno=rollno;
	}
	
	public int getRollno(){
		return rollno;
	}
	
	public void useArray(Student[] std){
		std[0].setName("Sheeraz");
	}
}