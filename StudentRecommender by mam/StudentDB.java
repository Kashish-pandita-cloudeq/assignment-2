import java.util.*;

public class StudentDB
{
	List<Student> studentArr;
	public StudentDB(){
		studentArr = new ArrayList<Student>() ;
	}

	public void addStudent(Student std){
		studentArr.add(std);
	}
	public void removeStudent(Student std){
		studentArr.remove(std);
	}
	public List getStudentList(){
		return studentArr;
	}

}
