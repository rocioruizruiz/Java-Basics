package patrones.Adapter;

public class Programa {
	//ancho = x2 - x1
	//alto = y2-y1
	
	public static void dibujaRectanguloTipo1(RectanguloTipo1 r) {
		System.out.println("Rectangulo (" + r.getX() + ", " + r.getY() + ") ancho " + r.getAncho() + ", alto " + r.getAlto());
	}
	public static void dibujaRectanguloTipo2(RectanguloTipo2 r) {
		System.out.println("Rectangulo (" + r.getX1() + ", " + r.getY1() + "), (" + r.getX2() + ", " + r.getY2() + ")");
	}

	public static void main(String[] args) {
		RectanguloTipo2 rectangulo = new Rectangle2(5, 5, 125, 55);
		
		dibujaRectanguloTipo2(rectangulo); //Dibujo del formato antiguo
		dibujaRectanguloTipo1(new RectanguloAdapter(rectangulo)); //Con el adaptador te pasa el antiguo al nuevo formato

	}

}
