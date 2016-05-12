import java.util.Stack;

/*
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 */
public class Q150_RPN {

	public static void main(String[] args) {
		String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
		System.out.println(new Q150_RPN().evalRPN(tokens));

	}
	
	public double evalRPN(String[] tokens) {
		if(tokens.length == 0)
			return 0;
		if(tokens.length == 1)
			return Integer.parseInt(tokens[0]);
		if(tokens.length == 2)
			return Integer.parseInt(tokens[0] + tokens[1]);
		
		Stack<Double> s = new Stack<>();
		
        for(int i = 0; i < tokens.length; i++){
        	if(isOps(tokens[i])){
        		s.push(op(s.pop(),s.pop(),tokens[i]));
        	}else{
        		s.push(Double.parseDouble(tokens[i]));
        	}
        }
        return s.pop();
    }
	
	private boolean isOps(String s){
//		System.out.println("-".matches("[-|*|/|+]"));
		return s.matches("[-|*|/|+]");
	}
	
	private double op(double d2, double d1, String op){
		switch (op) {
		case "+":
			return d1 + d2;
		case "-":
			return d1 - d2;
		case "*":
			return d1 * d2;
		case "/":
			return d1 / d2;
		default:
			return 0;
		}
	}

}
