package tn.design.pattern.chain;

public class Request {

	private int x;
	private int y;
	private Opearation operation;

	public Request(int x, int y, Opearation operation) {
		super();
		this.x = x;
		this.y = y;
		this.operation = operation;
	}

	public Opearation getOperation() {
		return operation;
	}

	public void setOperation(Opearation operation) {
		this.operation = operation;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
