package es.emergya.web.invoice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import com.liferay.portal.kernel.dao.search.SearchContainer;

import es.emergya.negocio.model.Factura;

public class InvoiceSearch extends SearchContainer<Factura>{

	// Paso 1: crear el construtor

	public InvoiceSearch(PortletRequest portletRequest, PortletURL iteratorURL) {
		
		
		
		
		super(portletRequest, null, null, DEFAULT_CUR_PARAM, DEFAULT_CUR, 5, iteratorURL, headerNames, EMPTY_RESULTS_MESSAGE);
		
	}
	
	// Paso 2: se definen los nombres de la cabeceras de la tabla
	static List<String> headerNames = new ArrayList<String>();
	
	// Paso 3: Se definen los nombres de las cabecereas que van a ser ordenadas de la tabla
	static Map<String, String> orderableHeaders = new HashMap<String, String>();
	
	static {
		headerNames.add("Nombre del cliente");
		headerNames.add("Importe total");
		headerNames.add("Descripcion");
		
		orderableHeaders.put("Nombre del cliente", "Nombre del cliente");
		orderableHeaders.put("Importe total", "Importe total");
		orderableHeaders.put("Descripcion", "Descripcion");
	}
	
	public static final String EMPTY_RESULTS_MESSAGE = "No hay facturas disponibles";
	
	
}
