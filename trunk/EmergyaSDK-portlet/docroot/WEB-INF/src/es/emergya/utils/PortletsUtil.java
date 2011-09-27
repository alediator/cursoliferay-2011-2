/**
 * 
 */
package es.emergya.utils;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.model.Role;
import com.liferay.portal.service.RoleLocalServiceUtil;

/**
 * @author adiaz
 *
 */
public class PortletsUtil {
	
	/**
	 * Obtengo los posibles roles a add to user
	 * 
	 * @param userId id del usuario al que se le puede add
	 * 
	 * @return lista de roles del sistema a los que no pertenece el usuario
	 */
	public static List<Role> getPosibleRoles(long userId){
		List<Role> roles = new ArrayList<Role>();
		try{
			roles.addAll(RoleLocalServiceUtil.getRoles(0, RoleLocalServiceUtil.getRolesCount()));
			roles.removeAll(RoleLocalServiceUtil.getUserRoles(userId));
		}catch (Exception e){
			e.printStackTrace();
		}
		return roles;
	}

}
