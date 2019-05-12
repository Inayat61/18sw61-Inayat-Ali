class UseStudent{
	public static void main(String args[]){
		Student s1=new Student(24,"Mariam");
		Student s2=new Student(25,"Maria");
		Student s3=new Student(26,"Ayesha");
		
		Student[] students={s1,s2,s3};
		s1.useArray(students);
		System.out.println(students[0].getName());
	}
}