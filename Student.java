package StudentDataBase;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses;
	private int costOfCourse=700;
	private int tuitionBalance;
	private static int id=1000;
	private String course;
	
	public Student() {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Firstname : ");
		this.firstName=in.nextLine();
		System.out.print("Enter Lastname : ");
		this.lastName=in.nextLine();
		
		System.out.println("select GradeYear  : \n 1 for firstyear\n 2 for secondyear\n 3 for thirdyear\n 4 for fourth year ");

		this.gradeYear=in.nextInt();
			
		setStudentId();
		System.out.println("Details :"+this.firstName+" "+this.lastName+" "+this.gradeYear+" "+studentId);
		enrolment();
		System.out.print("courses enrolled: "+this.courses);
		
	}
	
	private void setStudentId() {
		id++;
		this.studentId=gradeYear+""+id;
	}
	
	private void enrolment() {
		do {
			
			System.out.println("Enter Course Name(Q to exit): ");
			Scanner in=new Scanner(System.in);
			course=in.nextLine().toUpperCase();
			if(course.equals("Q")) {
				System.out.println("breaks!!!!");
				break;
			}
			else {
				courses=courses+"\n"+course;
				tuitionBalance=tuitionBalance+costOfCourse;
				}
			
			}while(1!=0);
	}
	public void viewBalancepayment() {
		System.out.println("\nremaining paybalance: "+this.tuitionBalance);
	}
	
	public void payment(int amount) {
		tuitionBalance=tuitionBalance-amount;
		System.out.println("payment Success of rupees "+amount);
		viewBalancepayment();
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", gradeYear=" + gradeYear
				+ ", studentId=" + studentId + ", courses=" + courses + ", costOfCourse=" + costOfCourse
				+ ", tuitionBalance=" + tuitionBalance + "]";
	}
	
	
	

}
