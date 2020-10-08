package pl.com.tt.arithmetic.tree;

public class DoubleArgOperator extends Node {

	private String operationType;

	private Node firstChildNode;
	private Node secondChildNode;

	public DoubleArgOperator(Node firstChildNode, Node secondChildNode, String operationType) {
		this.firstChildNode = firstChildNode;
		this.secondChildNode = secondChildNode;
		this.operationType = operationType;
		if (operationType.equals("+") || operationType.equals("-")) {
			this.setPriority(1);
		} else if (operationType.equals("*") || operationType.equals("/")) {
			this.setPriority(2);
		} else if (operationType.equals("^")) {
			this.setPriority(3);
		}
	}

	public Node getFirstChildNode() {
		return firstChildNode;
	}

	public void setFirstChildNode(Node firstChildNode) {
		this.firstChildNode = firstChildNode;
	}

	public Node getSecondChildNode() {
		return secondChildNode;
	}

	public void setSecondChildNode(Node secondChildNode) {
		this.secondChildNode = secondChildNode;
	}

	@Override
	public Double calculate() {
		switch (operationType) {
		case "+":
			return firstChildNode.calculate() + secondChildNode.calculate();

		case "-":
			return firstChildNode.calculate() - secondChildNode.calculate();

		case "*":
			return firstChildNode.calculate() * secondChildNode.calculate();
		case "/":
			return firstChildNode.calculate() / secondChildNode.calculate();
		case "^":
			return Math.pow(firstChildNode.calculate(),secondChildNode.calculate());

		default:
			return null;
		}

	}

}
