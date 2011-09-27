package es.emegya.web;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import es.emergya.negocio.service.FacturaLocalServiceUtil;

/**
 * Portlet implementation class InvoiceManager
 */
public class InvoiceManager extends MVCPortlet {
 
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		
		viewJSP = ParamUtil.getString(renderRequest, "view-jsp",
				getInitParameter("view-jsp"));
		
		super.doView(renderRequest, renderResponse);
	}
	
	@ProcessAction(name="addFactura")
	public void addFactura(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		try{
			String descripcion = ParamUtil.getString(actionRequest, "descripcion");
			String nombreCliente = ParamUtil.getString(actionRequest, "nombreCliente");
			Double importeTotal = ParamUtil.getDouble(actionRequest, "importeTotal");
			
			FacturaLocalServiceUtil.createFactura(nombreCliente, importeTotal, descripcion);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
