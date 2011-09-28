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

import es.emergya.negocio.model.Factura;
import es.emergya.negocio.service.FacturaLocalServiceUtil;

/**
 * Portlet implementation class InvoiceManager
 */
public class InvoiceManager extends MVCPortlet {

	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {

		Long facturaId = ParamUtil.getLong(renderRequest, "facturaId");

		try {
			if (facturaId != null) {
				Factura factura = FacturaLocalServiceUtil.getFactura(facturaId);
				renderRequest.setAttribute("factura", factura);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		viewJSP = ParamUtil.getString(renderRequest, "view-jsp",
				getInitParameter("view-jsp"));

		super.doView(renderRequest, renderResponse);
	}

	@ProcessAction(name = "addFactura")
	public void addFactura(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		try {
			String descripcion = ParamUtil.getString(actionRequest,
					"descripcion");
			String nombreCliente = ParamUtil.getString(actionRequest,
					"nombreCliente");
			Double importeTotal = ParamUtil.getDouble(actionRequest,
					"importeTotal");

			FacturaLocalServiceUtil.createFactura(nombreCliente, importeTotal,
					descripcion);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@ProcessAction(name = "borrarFactura")
	public void borrarFactura(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		try {
			Long facturaId = ParamUtil.getLong(actionRequest, "facturaId");

			FacturaLocalServiceUtil.deleteFactura(facturaId);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@ProcessAction(name = "imprimirPorConsola")
	public void imprimirPorConsola(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		try {
			Long facturaId = ParamUtil.getLong(actionRequest, "facturaId");

			Factura factura = FacturaLocalServiceUtil.getFactura(facturaId);

			System.out.println("Factura --> " + factura);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@ProcessAction(name = "modifyFactura")
	public void modifyFactura(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		try {
			String descripcion = ParamUtil.getString(actionRequest,
					"descripcion");
			String nombreCliente = ParamUtil.getString(actionRequest,
					"nombreCliente");
			Double importeTotal = ParamUtil.getDouble(actionRequest,
					"importeTotal");
			Long facturaId = ParamUtil.getLong(actionRequest, "facturaId");

			Factura factura = FacturaLocalServiceUtil.getFactura(facturaId);

			factura.setDescripcion(descripcion);
			factura.setNombreCliente(nombreCliente);
			factura.setImporteTotal(importeTotal);

			FacturaLocalServiceUtil.updateFactura(factura);

			actionRequest.setAttribute("factura", factura);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
