package pl.com.tt.arithmetic.tree;

public abstract class Node {
	
	public abstract Double calculate();
	protected int priority;
	
	
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	

}
