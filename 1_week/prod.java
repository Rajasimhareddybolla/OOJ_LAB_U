
import java.util.Scanner;
public class prod{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.println("enter a and b no's");
	int a = input.nextInt();
	int b = input.nextInt();
	int prodd  = a + b ;

	System.out.println("sum :"+prodd);

	input.close();

}
}