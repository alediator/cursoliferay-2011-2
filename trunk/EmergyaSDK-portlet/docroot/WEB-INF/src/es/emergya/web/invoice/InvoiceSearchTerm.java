/**
 * 
 */
package es.emergya.web.invoice;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.dao.search.DAOParamUtil;

/**
 * Esta clase se suele utilizar para el manejo de parametros especiales p.e fechas
 * 
 * @author adiaz
 *
 */
public class InvoiceSearchTerm extends InvoiceDisplayTerms {

	// Paso 1: Constructor
	public InvoiceSearchTerm(PortletRequest portletRequest) {
		super(portletRequest);
		
		// Paso 2: Envolvemos la recuperacion de parametros
		descripcion = DAOParamUtil.getString(portletRequest, DESCRIPCION);
		nombreCliente = DAOParamUtil.getString(portletRequest, NOMBRE_CLIENTE);
		//importeTotal = DAOParamUtil.getDouble(portletRequest, IMPORTE_TOTAL); getDouble no existe
	}

}
