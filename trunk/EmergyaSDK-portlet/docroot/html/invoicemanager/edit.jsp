<%@page import="es.emergya.negocio.model.Factura"%>
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
	<liferay-util:param name="toolbarItem" value="add"></liferay-util:param>
</liferay-util:include>

<portlet:renderURL var="backURL">
	<liferay-util:param name="view-jsp" value="/html/invoicemanager/view.jsp"></liferay-util:param>
</portlet:renderURL>

<portlet:actionURL name="modifyFactura" var="modifyFactura">
</portlet:actionURL>

<liferay-ui:header title="Modificar Factura"
					backURL="<%= backURL %>">
</liferay-ui:header>

<%
	Factura f = (Factura) renderRequest.getAttribute("factura");
%>

<form method="post" action="<%= modifyFactura %>">
	<div style="height:250px">
		<input type="hidden" name="facturaId" value=<%= f.getFacturaId()%> />
		<div><div style="float:left;padding-right:50px;width:100px;"><label>Descripcion</label></div><div style="float:right"><input type="text" name="descripcion" value=<%= f.getDescripcion()%> /></div></div>
		<div style="clear:both"><div style="float:left;padding-right:50px;width:100px;"><label style="padding-right:50px;width:100px;">Nombre de Cliente</label></div><div style="float:right"><input type="text" name="nombreCliente" value=<%= f.getNombreCliente()%> /></div></div>
		<div style="clear:both"><div style="float:left;padding-right:50px;width:100px;"><label style="padding-right:50px;width:100px;">Importe Total</label></div><div style="float:right"><input type="text" name="importeTotal" value=<%= f.getImporteTotal()%> ></textarea></div></div>
		<div style="clear:both"><input type="submit" value="Modificar Factura" /></div>
	</div>
</form>