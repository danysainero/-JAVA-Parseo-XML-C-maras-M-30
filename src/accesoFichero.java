import java.io.File;
import java.io.IOException;
import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class accesoFichero 
{

	public static Trafico parsearXML() 
	{
		Trafico t=null;
		SAXBuilder builder = new SAXBuilder();
		String ruta="C:\\XML_M30\\trafico.xml";
		String totalVehiculosCalle30=null, totalVehiculoTunel=null, velocidadMediaSuperficie=null, velocidadMediaTunel=null;
		
		try 
		{
			Document documento=builder.build(new File(ruta));
			Element elemento_raiz=documento.getRootElement();
			List<Element>elemento_dato_global=elemento_raiz.getChildren("DatoGlobal");
			
			for (Element element : elemento_dato_global) {
				String nombre=element.getChild("nombre").getValue();
				
				if(nombre.equals("totalVehiculosTunel")) {
					totalVehiculoTunel=element.getChild("VALOR").getValue();
				}
				if(nombre.equals("totalVehiculosCalle30")) {
					totalVehiculosCalle30=element.getChild("VALOR").getValue();
				}
				if(nombre.equals("velocidadMediaTunel")) {
					velocidadMediaTunel=element.getChild("VALOR").getValue();
				}
				if(nombre.equals("velocidadMediaSuperficie")) {
					velocidadMediaSuperficie=element.getChild("VALOR").getValue();
				}
			}			
			t=new Trafico(Integer.parseInt(totalVehiculoTunel), Integer.parseInt(totalVehiculosCalle30), Float.parseFloat(velocidadMediaTunel),Float.parseFloat(velocidadMediaSuperficie));                   
		} 
		catch (JDOMException | IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}
}
