package DijkstraTwoStackAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class DjikstraAlgorithm{
	
	private int leftParenthesesCounter;
	private int rightParenthesesCounter;
	private Stack<Integer> integerStack;
	private Stack<String> operationStack;
	private int operationCounter;
	
	public DjikstraAlgorithm () {
		this.leftParenthesesCounter=0;
		this.rightParenthesesCounter=0;
		this.integerStack=new Stack<Integer>();
		this.operationStack=new Stack<String>();
		this.operationCounter=0;
	}
	
	public static int solve(String expression) throws Exception{
		DjikstraAlgorithm alg = new DjikstraAlgorithm();
		ArrayList<String> myList = new ArrayList<String>(Arrays.asList(expression.split(" ")));	
		for(String i : myList) {
			if(i.equals("(")) {
				alg.leftParenthesesCounter++;
			}
			else if(i.equals(")")) {
				alg.rightParenthesesCounter++;
				int secondOperand=alg.integerStack.pop();
				int firstOperand=alg.integerStack.pop();
				String operation=alg.operationStack.pop();
				int res;
				if(operation.equals("*")){
					res=firstOperand*secondOperand;
					alg.integerStack.push(res);
				}
				else if(operation.equals("/")){
					res=firstOperand/secondOperand;
					alg.integerStack.push(res);
				}
				else if(operation.equals("+")){
					res=firstOperand+secondOperand;
					alg.integerStack.push(res);
				}
				else if(operation.equals("-")){
					res=firstOperand-secondOperand;
					alg.integerStack.push(res);
				}
				else if(operation.equals("%")){
					res=firstOperand%secondOperand;
					alg.integerStack.push(res);
				}
			}
			else if(i.equals("+") || i.equals("*") || i.equals("-") || i.equals("%") || i.equals("/")) {
				alg.operationStack.push(i);
				alg.operationCounter++;
			}	
			else{
				alg.integerStack.push(Integer.parseInt(i));
			}
		}
		
		if(myList.get(0).equals("^(") ||  alg.leftParenthesesCounter!=alg.operationCounter || alg.leftParenthesesCounter!=alg.rightParenthesesCounter) {
			throw new Exception("Parentheses are not perfectly balanced");
		}
		else {
			return alg.integerStack.pop();
		}
		
		
	}
}
