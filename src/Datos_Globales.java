import java.util.ArrayList;

public class Datos_Globales {

	private ArrayList<Trafico> lista_trafico=new ArrayList();

	public Datos_Globales(ArrayList<Trafico> lista_trafico) {
		super();
		this.lista_trafico = lista_trafico;
	}

	public ArrayList<Trafico> getLista_trafico() {
		return lista_trafico;
	}

	public void setLista_trafico(ArrayList<Trafico> lista_trafico) {
		this.lista_trafico = lista_trafico;
	}
	
	
}
