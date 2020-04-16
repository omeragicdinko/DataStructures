package DijkstraTwoStackAlgorithm;
import java.util.Scanner;

public class RunProg {

	public static void main(String[] args) throws Exception {
		
		
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter your expresion here:");
		
		String exp=reader.nextLine();
		
		int result = DjikstraAlgorithm.solve(exp);
		System.out.println("Your result is: " + result);
		
		reader.close();
	}
	

}
