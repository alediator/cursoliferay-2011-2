<%--
/**
* Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
*
* This library is free software; you can redistribute it and/or modify it under
* the terms of the GNU Lesser General Public License as published by the Free
* Software Foundation; either version 2.1 of the License, or (at your option)
* any later version.
*
* This library is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
* FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
* details.
*/
--%>

<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="javax.portlet.PortletRequest"%>
<%@page import="java.util.Map"%>
<%@page import="com.liferay.portal.kernel.exception.SystemException"%>
<%@page import="com.liferay.portal.service.OrganizationLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.model.Organization"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<%

List<Organization> organizations = null;

try {
	int organizationsCount = OrganizationLocalServiceUtil.getOrganizationsCount();
	if(organizationsCount > 0){
		organizations = OrganizationLocalServiceUtil.getOrganizations(0,organizationsCount);
	}
} catch (SystemException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

%>

<table>
	<thead>
		<th>Name</th>
		<th>Type</th>
		<th>Country Id</th>
		<th>PK</th>
	</thead>
	<% 
	
	for(Organization org: organizations){
	
	%>	
	<tr>
		<td><%= org.getName()%></td>
		<td><%= org.getType()%></td>
		<td><%= org.getCountryId()%></td>
		<td><%= org.getPrimaryKey()%></td>
	</tr>
	<%
	}
	%>
</table>

<%
	Map<String, String> userInfo = (Map<String, String>) renderRequest.getAttribute(PortletRequest.USER_INFO);
	User user = null;
	try {
		user = UserLocalServiceUtil.getUserById(Long.decode(userInfo.get("liferay.user.id")));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
%>

<div style="padding-top:20px;">
<table>
	<thead>
		<th>Property</th>
		<th>Value</th>
	</thead>
	<tr>
		<td>FirtName: </td>
		<td><%= user != null ? user.getFirstName(): ""%></td>
	</tr>
	<tr>
		<td>FullName: </td>
		<td><%= user != null ? user.getFullName(): ""%></td>
	</tr>
	<tr>
		<td>JobTitle: </td>
		<td><%= user != null ? user.getJobTitle(): ""%></td>
	</tr>
</table>
</div>