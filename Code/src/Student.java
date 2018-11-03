
public class Student {
	private int id;
	private String name;
	private String course;
	
	@Override
	public boolean equals(Object object){
		if(this==object){
			return true;
		}
		if(object instanceof Student){
			Student s = (Student) object;
//			if(this.name!=null){
//				
//			}
			if(this.id == s.id && 
					this.name.equals(s.name) 
					&& this.course.equals(s.course)){
			return true;	
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "Id "+id+" Name "+name+" Course  "+course;
	}
	
	public Student(int id, String name, String course){
		this.id = id;
		this.name = name;
		this.course = course;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	

}
