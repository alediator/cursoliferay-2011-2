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

<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="es.emergya.negocio.service.InformeLocalServiceUtil"%>
<%@page import="es.emergya.negocio.model.Informe"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>

<portlet:defineObjects />
<theme:defineObjects />

<%
	int numeroInformes = InformeLocalServiceUtil.getInformesCount();
	if( numeroInformes > 0){
%>

<table>
  <tr>
    <th>Titulo</th>
    <th style="padding-left:50;">Descripcion</th>
    <th style="padding-left:50;">Autor</th>
  </tr>
  
  <%
	for(Informe informe: InformeLocalServiceUtil.getInformes(0, numeroInformes)){  
  %>
  <tr>
    <td><%= informe.getTitulo()%></td>
    <td style="padding-left:50;"><%= informe.getDescripcion()%></td>
    <td style="padding-left:50;"><%= UserLocalServiceUtil.getUserById(informe.getUserId()).getFullName()%></td>
  </tr>
  <%
	}
  %>
</table>

<%

	}else{

%>

<h3>No hay informes disponibles</h3>

<% } %>