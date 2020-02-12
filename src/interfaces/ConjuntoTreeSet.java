package interfaces;

import java.util.TreeSet;

public class ConjuntoTreeSet implements Conjunto {
	private TreeSet<String> conjunto;
	
	public ConjuntoTreeSet() {
		this.conjunto = new TreeSet<String>();
	}
	@Override
	public boolean empty() {
		return this.conjunto.isEmpty();
	}

	@Override
	public void insert(String clave) {
		this.conjunto.add(clave);
		
	}

	@Override
	public boolean conteins(String clave) {
		return this.conjunto.contains(clave);
	}

	@Override
	public void inicialize() {
		this.conjunto.clear();
		
	}
	
}
