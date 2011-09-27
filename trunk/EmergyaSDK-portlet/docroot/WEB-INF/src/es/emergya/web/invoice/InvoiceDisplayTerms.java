package es.emergya.web.invoice;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.util.ParamUtil;

public class InvoiceDisplayTerms extends DisplayTerms{

	// Paso 1: creamos el constructor
	public InvoiceDisplayTerms(PortletRequest portletRequest) {
		super(portletRequest);

		// Paso 4: Recuperacion de parametros de la peticion 
		descripcion = ParamUtil.getString(portletRequest, DESCRIPTION);
		nombreCliente = ParamUtil.getString(portletRequest, NOMBRE_CLIENTE);
		importeTotal = ParamUtil.getDouble(portletRequest, IMPORTE_TOTAL);
	}
	
	// Paso 2: Literales que representan los nombres de cada campo
	public static String DESCRIPTION= "Descripción";
	public static String NOMBRE_CLIENTE = "Nombre de cliente";
	public static String IMPORTE_TOTAL= "Importe total";
	
	// Paso 3: Atributos para cada campo que se va a mostrar en la tabla
	protected String descripcion;
	protected String nombreCliente;
	protected double importeTotal;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public double getImporteTotal() {
		return importeTotal;
	}
	public void setImporteTotal(double importeTotal) {
		this.importeTotal = importeTotal;
	}

}
