import java.util.*;


public class StudentRecommender {

	public static void main (String args[]) {
	
		StudentDB studDb = new StudentDB();
		List<Student> students = new ArrayList<Student>();
		List<Student> recommendedStudents = new ArrayList<Student>();

           StudentRecommender studRec = new StudentRecommender();
		studRec.createStudent();
		
		recommendedStudents = studDb.getStudentList();
		System.out.println(recommendedStudents.size());
			
		for(Student display : recommendedStudents) {
           System.out.println("Recommended Students"+ display.getFirstName());
	     }
	}

public void createStudent(){

StudentDB studDb = new StudentDB();

int num=1;
String fname = "";
String lname = "";
String email = "";
int bklog = 0;


System.out.println("Please enter student's details: First name, Last name, emailId and number of backlogs");

while(num >0)
{		
 Scanner sc = new Scanner(System.in);
 fname = sc.nextLine();
 lname = sc.nextLine();
 email = sc.nextLine();
 bklog = sc.nextInt();
 Student std = new Student(fname,lname,email,bklog);
 if (bklog == 0)
  studDb.addStudent(std);
 else
  studDb.removeStudent(std);
 System.out.println("Press 1 to add more students,      else press 0");
 num = sc.nextInt();
}
		
}

}



