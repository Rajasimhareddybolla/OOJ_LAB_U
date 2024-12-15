import java.util.Scanner;
public class quad{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter a b c constants in the quad equaion");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		float det = b*b -4*a*c;
		if (det < 0){
			System.out.println("roots are imaginert ");
			}	
		else {
			double root1 = (-b+Math.sqrt(det) )/ (2*a);
			double root2 =( -b - Math.sqrt(det))/ (2*a);
			if (det == 0){
				System.out.println("roots are same ");
				System.out.println("root 1 = " + root1 +"\n root2 -"+root2);
			}
			else{
				System.out.println("roots are real and distinct ");
				System.out.println("root 1 = " + root1 +"\n root2 -"+root2);
			}

			}
	}
}