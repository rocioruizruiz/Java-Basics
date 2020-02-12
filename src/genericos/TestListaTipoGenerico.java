package genericos;

import java.util.Vector;

public class TestListaTipoGenerico {
	
	public static void imprimeElementos(Vector<?> v) {
		TipoGenerico<?> x;
		
		for(Object o: v) {
			x = (TipoGenerico<?>) o;
			
			System.out.println(x.getValor());
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		
		Vector <TipoGenerico<Integer>> v1 = new Vector <TipoGenerico<Integer>>();
		
		v1.add(new TipoGenerico<Integer>(10));
		v1.add(new TipoGenerico<Integer>(20));
		v1.add(new TipoGenerico<Integer>(30));
		
		imprimeElementos(v1);
		
		
		Vector <TipoGenerico<String>> v2 = new Vector <TipoGenerico<String>>();
		
		v2.add(new TipoGenerico<String>("a"));
		v2.add(new TipoGenerico<String>("e"));
		v2.add(new TipoGenerico<String>("i"));
		v2.add(new TipoGenerico<String>("o"));
		v2.add(new TipoGenerico<String>("u"));
		
		imprimeElementos(v2);

	}

}
