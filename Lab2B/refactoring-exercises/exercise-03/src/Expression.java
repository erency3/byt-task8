public class Expression {
//written methods caseAdd, Susbtract, multiply and divide so it will be easier if we want to make a change in one of them 
	private char op;

	private Expression left;

	private Expression right;

	private int constant;

	public Expression(int constant) {
		this.op = 'c';
		this.constant = constant;
	}

	public Expression(char op, Expression left, Expression right) {
		this.op = op;
		this.left = left;
		this.right = right;
	}

	public int evaluate() {
		switch (op) {
		case 'c':
			return constant;
		case '+':
		return caseAdd();
		case '-':
			return caseSubstract();
		case '*':
			return caseMultiply();
		case '/':
			return caseDivide();
		default:
			throw new IllegalStateException();
		}
	}
	
	public int caseAdd() {
		return left.evaluate() + right.evaluate();
	}

	public int caseSubstract() {
		return left.evaluate() - right.evaluate();
	}

	public int caseMultiply() {
		return left.evaluate() * right.evaluate();
	}

	public int caseDivide() {
		return left.evaluate() / right.evaluate();
	}
}
