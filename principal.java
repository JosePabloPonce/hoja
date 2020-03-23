import java.io.IOException;

public class principal {
	
	public static void main(String[] args) throws IOException {
		
		operaciones controlador = new operaciones();
		
		System.out.println(controlador.leerarchivoalista("dictionary.txt"));
		
	}

}
