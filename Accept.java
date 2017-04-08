import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Accept {

	public static void main(String[] args) {
		StudentData student = new StudentData();
		
		System.out.println("Enter Student Details using below template: ");
		System.out.println("Enter - ID, Surname, Initials, CourseCode, Gender");
		System.out.println("SSSSSSSNNNNNNNNIICCCCG");
		student.setFirstName("Sandeep");
		student.setLastName("Surineni");
		student.setStudentId("A7");
		student.setCourseCode("CS");
		
		student.setDate(new Date());
		System.out.println("Name is: "+student.getFirstName()+" "+student.lastName);
		System.out.println("Student Id: "+student.studentId);
		System.out.println("Course Code: "+student.getCourseCode());
		
		//DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:MM:ss a");
		DateFormat date = new SimpleDateFormat("dd MM yyyy");
		DateFormat time = new SimpleDateFormat("hh:MM a");
		System.out.println("Date: "+date.format(student.getDate()));
		System.out.println("Time: "+time.format(student.getDate()));
		
		Calendar cal = Calendar.getInstance();
		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
		System.out.println("Today is "+dayOfYear);
		
		formatDate(student.getDate());
		extractDayOftheYear(student.getDate());
		extractTime(student.getDate());
		System.out.println("Date is: "+student.getDate());
		
	}

   private static void extractTime(Date date) {

	}

	private static void extractDayOftheYear(Date date) {
		
		
	}

	private static void formatDate(Date date) {
		
		
	}

}
