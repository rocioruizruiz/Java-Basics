package patrones.Composite;

//Componente tiene tres subclases. Boton, componente y ventana.

public class Programa {
	public static void main (String args[]){
		
		Componente textbox = new Objeto("Textbox"); 
		Componente combobox = new Objeto("Combobox"); 
		Componente aceptar = new Boton("Ok"); 
		Componente label = new Objeto("Etiqueta"); 
		Componente cancelar = new Boton("Cancel");
		Componente ventana = new Ventana();
		
		
		Ventana menu = new Ventana();
		
		menu.agrega(label); 
		menu.agrega(textbox); 
		menu.agrega(combobox); 
		menu.agrega(aceptar);
		menu.agrega(cancelar);
		menu.agrega(ventana);
		
		
		ActuadorComponentes ac = new ActuadorComponentes();
		//aqui mueves 3 objetos individualmente
		ac.desplaza(label, 5, 5); 
		ac.desplaza(textbox, 10, 10);
		ac.desplaza(combobox, 0, 10);
		
		//aqui mueves todos los objetos que contiene la ventana, es decir, los anteriores pero con una sola funcion.
		ac.desplaza(menu, 50, 50);
	} 
}