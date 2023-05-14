package Labs.Lab5;

public class SimpleColor {
	private int r;
	private int g;
	private int b;
	
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
			if (r < 0 || r > 255) {
				throw new ColorException();
			} else {
				this.r = r;
			}
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		if (g < 0 || g > 255) {
			throw new ColorException();
		} else {
			this.g = g;
		}
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		if (b < 0 || b > 255) {
			throw new ColorException();
		} else {
			this.b = b;
		}
	}

	public void setColor(int r, int g, int b) {
		setR(r);
		setG(g);
		setB(b);
	}
	public SimpleColor() {}
	
	public SimpleColor(int r, int g, int b) {
		setR(r);
		setG(g);
		setB(b);
	}
	public SimpleColor(SimpleColor b) {
		this(b.r,b.g,b.b);
	}

	@Override
	public String toString() {
		return "(" + getR() + "," + getG() + "," +getB() +")";
	}

	public boolean equals(SimpleColor obj) {
		SimpleColor that = new SimpleColor(obj);
		if (this.getR() == that.getR()&& this.getG() == that.getG() && this.getB() == that.getB()){
			return true;
		}
		return false;
	}
}
