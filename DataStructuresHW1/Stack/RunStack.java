package Stack;

public class RunStack {

	public static void main(String[] args) {
		Stack<Integer> stack =new Stack<Integer>();
		stack.push(2);
		stack.push(8);
		stack.push(5);
		stack.push(2);
		stack.push(8);
		stack.push(99);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		stack.push(10);
		System.out.println("Stack size: "+stack.size());
	}

}
