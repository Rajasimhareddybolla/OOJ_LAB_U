
import java.util.Scanner;

class student_info {
	String Usn_no;
	String name;
	int marks[];
	int credits[];
	int no_sub;
	Scanner input = new Scanner(System.in);

	public void get_data() {

		System.out.println("Enter your name");
		name = input.nextLine();
		System.out.println("Enter your usn");
		Usn_no = input.nextLine();
		System.out.println("no_subjs");
		no_sub = input.nextInt();
		credits = new int[no_sub];
		marks = new int[no_sub];
		for (int i = 0; i < no_sub; i++) {
			System.out.print("Enter Mark");
			marks[i] = input.nextInt();
			System.out.print("Enter Credits");
			credits[i] = input.nextInt();
		}
		System.out.println();
	}

	public float get_sgpa() {

		int total_credits = 0;
		int s_grade = 0;
		for (int i = 0; i < no_sub; i++) {
			total_credits += credits[i];
			s_grade += credit_cal(marks[i]) * credits[i];
		}
		float sgpa = (float) s_grade / total_credits;
		return sgpa;
	}

	public int credit_cal(int marks) {
		if (marks >= 90) {
			return 10;
		} else if (marks > 80) {
			return 9;
		} else if (marks > 70) {
			return 8;
		} else if (marks > 60) {
			return 7;
		} else if (marks > 50) {
			return 6;
		} else if (marks > 40) {
			return 5;
		}
		return 0;
	}
}

public class student {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter no of students ");
		int student_no = input.nextInt();
		for (int i = 0; i < student_no; i++) {
			student_info stud = new student_info();
			stud.get_data();
			System.out.println("SGPA");
			System.out.println(stud.get_sgpa());
		}
		System.out.println("B.RAJA SIMHA REDDY");
		System.out.println("1BM23CS070");

	}
}