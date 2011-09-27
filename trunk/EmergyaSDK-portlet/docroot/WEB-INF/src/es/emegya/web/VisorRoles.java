package es.emegya.web;

import java.io.IOException;

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
import com.liferay.portal.model.Role;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class VisorRoles
 */
public class VisorRoles extends MVCPortlet {
	private static Log log = LogFactoryUtil.getLog(VisorRoles.class);
 
	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		
		log.info("view-jsp --> " + renderRequest.getParameter("view-jsp"));
	
		viewJSP = (String) (renderRequest.getParameter("view-jsp") != null ? renderRequest
				.getParameter("view-jsp") : getInitParameter("view-jsp"));
		super.doView(renderRequest, renderResponse);
	}
 

	/**
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws IOException
	 * @throws PortletException
	 */
	@ProcessAction(name="actualizarRoles")
	public void actualizarRoles(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		log.info("Starting actualizarRoles...");
		try {
			//Paso 1: Recuperar el usuario
			Long userId = Long.decode(actionRequest.getParameter("userId"));
			
			//Paso 2: Recuperar el rol
			Role role = RoleLocalServiceUtil.getRole(Long.decode(actionRequest.getParameter("roleSelected")));
			
			long[] rolesIds = {role.getRoleId()};
		

			log.info("Adding " + role.getName() + " to " +userId);
			
			//Add role
			RoleLocalServiceUtil.addUserRoles(userId, rolesIds);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
