<%@page import="es.emergya.utils.PortletsUtil"%>
<%@page import="com.liferay.portal.service.RoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Role"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>

<portlet:defineObjects />
<theme:defineObjects />

<portlet:renderURL var="volver"></portlet:renderURL>

<portlet:actionURL var="actualizarRoles" name="actualizarRoles">
	<portlet:param name="userId" value="<%= new Long(user.getUserId()).toString()%>"></portlet:param>
</portlet:actionURL>

<form action="<%= actualizarRoles%>" method="post">

	<select name="roleSelected" id="roleSelected">
<%

	for(Role role: PortletsUtil.getPosibleRoles(user.getUserId())){

%>

		<option title="<%= role.getName()%>" value="<%= role.getRoleId()%>"><%= role.getName()%></option>
  
<%
	}
%>
	</select>
	<input type="submit" value="Add"/>
</form>


<form action="<%= volver%>">
	<input type="submit" value="Volver"/>
</form>