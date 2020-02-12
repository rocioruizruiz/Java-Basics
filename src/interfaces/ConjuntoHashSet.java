package interfaces;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoHashSet implements Conjunto{
	private Set<String> conjunto;
	
	public ConjuntoHashSet() {
		this.conjunto = new HashSet<String>();
	}

	public boolean empty() {
		return this.conjunto.isEmpty();
	}

	public void insert(String clave) {
		this.conjunto.add(clave);
	}

	public boolean conteins(String clave) {
		return this.conjunto.contains(clave);
	}

	public void inicialize() {
		this.conjunto.clear();
	}

}
