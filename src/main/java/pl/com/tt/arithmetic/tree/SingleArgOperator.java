package pl.com.tt.arithmetic.tree;

public class SingleArgOperator extends Node {

	private Node childNode;
	private String operationType;

	public SingleArgOperator(Node childNode, String operationType) {
		this.childNode = childNode;
		this.operationType = operationType;
		if (operationType.equals("sin") || operationType.equals("cos") || operationType.equals("sqrt")) {
			this.setPriority(4);
		} else if (operationType.equals("abs")) {
			this.setPriority(5);
		}
	}


	public Node getChildNode() {
		return childNode;
	}

	public void setChildNode(Node childNode) {
		this.childNode = childNode;
	}

	@Override
	public Double calculate() {
		switch (operationType) {
		case "sin":
			return Math.sin(Math.toRadians(childNode.calculate()));
		case "cos":
			return Math.cos(childNode.calculate());
		case "abs":
			return Math.abs(childNode.calculate());
		case "sqrt":
			return Math.sqrt(childNode.calculate());
		default:
			return null;
		}
	}

}
