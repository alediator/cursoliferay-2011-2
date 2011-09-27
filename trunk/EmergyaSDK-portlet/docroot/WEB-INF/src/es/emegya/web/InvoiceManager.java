package es.emegya.web;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

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

}
