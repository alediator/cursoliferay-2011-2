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

<%@page import="es.emergya.web.invoice.InvoiceDisplayTerms"%>
<%@page import="es.emergya.negocio.service.FacturaLocalServiceUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="es.emergya.web.invoice.InvoiceSearch"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>

<portlet:defineObjects />
<theme:defineObjects />

	<liferay-util:include 
		page="/html/invoicemanager/botonera.jsp" 
		servletContext="<%= this.getServletContext() %>">
		<liferay-util:param name="toolbarItem" value="view-all"></liferay-util:param>
	</liferay-util:include>
	
<%
	PortletURL portletUrl = renderResponse.createRenderURL();
	String actionPortletUrl = portletUrl.toString();
	InvoiceSearch invoiceContainer = new es.emergya.web.invoice.InvoiceSearch(renderRequest, portletUrl);
%>

<form method="post" action="<%= actionPortletUrl %>">
	<liferay-ui:search-container searchContainer="<%= invoiceContainer %>">
		<liferay-ui:search-container-results>
			<%
				total = FacturaLocalServiceUtil.getFacturasCount();
				results = FacturaLocalServiceUtil.getFacturas(0,total);
				
				pageContext.setAttribute("results", results);
				pageContext.setAttribute("total", total);
			%>
		</liferay-ui:search-container-results>
		
		<liferay-ui:search-container-row 
			className="es.emergya.negocio.model.Factura" 
			keyProperty="facturaId"
			modelVar="f">
			<liferay-ui:search-container-column-text
				name="<%= es.emergya.web.invoice.InvoiceDisplayTerms.DESCRIPCION %>" 
				value="<%= f.getDescripcion()%>"
				orderable="<%= false%>">
			</liferay-ui:search-container-column-text>
			<liferay-ui:search-container-column-text
				name="<%= es.emergya.web.invoice.InvoiceDisplayTerms.NOMBRE_CLIENTE %>" 
				value="<%= f.getNombreCliente()%>"
				orderable="<%= false%>">
			</liferay-ui:search-container-column-text>
			<liferay-ui:search-container-column-text
				name="<%= es.emergya.web.invoice.InvoiceDisplayTerms.IMPORTE_TOTAL %>" 
				value="<%= new Double (f.getImporteTotal()).toString()%>"
				orderable="<%= false%>">
			</liferay-ui:search-container-column-text>
		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
</form>