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
	<liferay-util:param name="toolbarItem" value="edit"></liferay-util:param>
</liferay-util:include>

<portlet:actionURL name="editFactura" var="editFactura">
</portlet:actionURL>

<form method="post" action="<%= editFactura %>">
</form>