package concurrencia;

public class Lote {
	private int id;
	private int[] tareas;

	public Lote(int id, int [] tareas) { 
		this.id = id;
		this.tareas = tareas;
	}
	public int getId() { 
		return this.id;
	}
	public int getTareas() { 
		return this.tareas.length;
	}
	public int getTarea(int i) { 
		return this.tareas[i];
	} 
}