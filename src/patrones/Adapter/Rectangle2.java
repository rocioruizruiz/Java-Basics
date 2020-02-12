package patrones.Adapter;

public class Rectangle2 implements RectanguloTipo2 {
	
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	
	public Rectangle2(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		
	}

	@Override
	public int getX1() {
		return this.x1;
	}

	@Override
	public int getY1() {
		return this.y1;
	}

	@Override
	public int getX2() {
		return this.x2;
	}

	@Override
	public int getY2() {
		return this.y2;
	}

}
