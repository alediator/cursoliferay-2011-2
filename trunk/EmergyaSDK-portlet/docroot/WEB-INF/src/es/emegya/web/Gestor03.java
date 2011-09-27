package es.emegya.web;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class Gestor03
 */
public class Gestor03 extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
//		List<Organization> organizations = null;
//		
//		try {
//			int organizationsCount = OrganizationLocalServiceUtil.getOrganizationsCount();
//			if(organizationsCount > 0){
//				organizations = OrganizationLocalServiceUtil.getOrganizations(0,organizationsCount);
//			}
//		} catch (SystemException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		renderRequest.setAttribute("organizations", organizations);
		
		viewJSP = (String) (renderRequest.getAttribute("view-jsp") != null ? renderRequest.getAttribute("view-jsp") : viewJSP);
		super.doView(renderRequest, renderResponse);
	}
 
	
	
}
