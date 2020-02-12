package patrones.Adapter;

//A lo que queremos traducir
public class RectanguloAdapter implements RectanguloTipo1 {
	
	private RectanguloTipo2 rectangulo;
	public RectanguloAdapter(RectanguloTipo2 rectangulo) {
		this.rectangulo = rectangulo;
	}
	@Override
	public int getX() {
		return this.rectangulo.getX1();
	}
	@Override
	public int getY() {
		return this.rectangulo.getY1();
	}
	@Override
	public int getAncho() {
		return this.rectangulo.getX2() - this.rectangulo.getX1();
	}
	@Override
	public int getAlto() {
		return this.rectangulo.getY2() - this.rectangulo.getY1();
	}

}
