<%@page import="com.liferay.portal.service.RoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Role"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>

<portlet:defineObjects />
<theme:defineObjects />


<table>
  <thead>
    <th>Nombre</th>
    <th>PK</th>
  </thead>


<%

	List<Role> roles = RoleLocalServiceUtil.getUserRoles(user.getUserId());//(List<Role>) user.getRoles();
	
	for(Role role: roles){

%>


  <tr>
    <td><%= role.getName()%></td>
    <td><%= role.getPrimaryKey()%></td>
  </tr>
  
<%
	}
%>

</table>

<portlet:renderURL var="addRole">
	<portlet:param name="view-jsp" 
		value="/html/visorroles/addRole.jsp">
	</portlet:param>
</portlet:renderURL>

<form action="<%= addRole%>" method="post">
	<input type="submit" value="Add Role" />
</form>