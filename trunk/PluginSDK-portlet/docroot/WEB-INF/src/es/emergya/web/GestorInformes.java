package es.emergya.web;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import es.emergya.negocio.service.InformeLocalServiceUtil;

/**
 * Portlet implementation class GestorInformes
 */
public class GestorInformes extends MVCPortlet {
	
	private static Log log = LogFactoryUtil.getLog(GestorInformes.class);
 
	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		
		viewJSP = ParamUtil.getString(renderRequest, "view-jsp", getInitParameter("view-jsp"));
		
		log.info("view-jsp --> " + viewJSP);

		super.doView(renderRequest, renderResponse);
	}
	
	@ProcessAction(name="guardarInforme")
	public void guardarInforme(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		String titulo = ParamUtil.getString(actionRequest, "titulo");
		String descripcion = ParamUtil.getString(actionRequest, "descripcion");
		String contenido = ParamUtil.getString(actionRequest, "contenido");
		
		try {
			InformeLocalServiceUtil.createInforme(titulo, contenido, descripcion,
					new Date(), PortalUtil.getUserId(actionRequest),
					PortalUtil.getCompanyId(actionRequest),
					PortalUtil.getScopeGroupId(actionRequest));
		} catch (Exception e) {
			log.error(e);
			throw new PortletException(e);
		}
	}

}
