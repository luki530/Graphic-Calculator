package pl.com.tt.arithmetic.tree;

public class Value extends Node {
	
	private double value;
	
	public Value(double value){
		this.value = value;
		this.priority = 0;
		
	}

	public Value() {
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public Double calculate() {
		return value;
	}

}
