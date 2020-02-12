package patrones.Adapter;

public class Rectangle1 implements RectanguloTipo1{
	
	private int x;
	private int y;
	private int ancho;
	private int alto;
	
	public Rectangle1(int x, int y, int ancho, int alto) {
		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;
	}

	@Override
	public int getX() {
		return this.x;
	}

	@Override
	public int getY() {
		return this.y;
	}

	@Override
	public int getAncho() {
		return this.ancho;
	}

	@Override
	public int getAlto() {
		return this.alto;
	}
	

}
