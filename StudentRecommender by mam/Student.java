import java.util.*;

public class Student
{
		private String firstName ="";
		private String lastName ="";
		private String emailId ="";
		private int backlogCount = 0;
		
		Student(String firstName, String lastName, String 	    	id, int bkCnt){
		emailId = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.backlogCount = bkCnt;
		}

		public String getFirstName()
		{
			return this.firstName;
		}

		public String getLastName()
		{
			return this.lastName;
		}

		public String getEmailId()
		{
			return this.emailId;
		}
			
		public int getBackLogCount()
		{
			return this.backlogCount ;
		}
		
  
}