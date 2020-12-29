package StudentDataBase;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.println("Enter Number of students : ");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		Student student[]=new Student[n];
		for(int i=0;i<n;i++) {
			student[i]=new Student();
			student[i].viewBalancepayment();
			student[i].payment(600);
			
		}
		for(int i=0;i<n;i++) {
			System.out.println(student[i].toString());
			
		}
		// TODO Auto-generated method stub
		 
	}

}
