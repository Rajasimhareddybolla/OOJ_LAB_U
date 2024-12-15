
import java.util.Scanner;
public class first{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.println("enter a and b no's");
	int a = input.nextInt();
	int b = input.nextInt();
	int sum  = a + b ;
	int sub = a - b ;
	System.out.println("sum :"+sum);
	System.out.println("sub :"+sub);
	input.close();

}
}