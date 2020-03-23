import java.util.ArrayList;

public class Association <K,V> {
	
	
	private K ingles;
	private V espanol;

	
	public Association(K ingles, V espanol) {
		this.ingles = ingles;
		this.espanol = espanol;
	}

	

	public K getIngles() {
		return ingles;
	}

	public void setIngles(K ingles) {
		this.ingles = ingles;
	}

	public V getEspanol() {
		return espanol;
	}

	public void setEspanol(V espanol) {
		this.espanol = espanol;
	}
	
	public int comparar(K ingles) {
		return ((String) ingles).toUpperCase().compareTo( ((String) ingles).toUpperCase() ) ;
		
	}

	
	
	

}
