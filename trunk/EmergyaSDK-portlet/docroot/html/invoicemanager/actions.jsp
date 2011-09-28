<%@page import="es.emergya.negocio.model.Factura"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>

<portlet:defineObjects />
<theme:defineObjects />

<%
	ResultRow fila = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Factura f = (Factura) fila.getObject();
%>

<portlet:renderURL var="editFactura">
	<portlet:param name="facturaId" value="<%= new Long(f.getFacturaId()).toString()%>"></portlet:param>
	<portlet:param name="view-jsp" value="/html/invoicemanager/edit.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="borrarFactura" 
	var="borrarFactura">
	<portlet:param name="facturaId" value="<%= new Long(f.getFacturaId()).toString()%>"></portlet:param>
	<portlet:param name="view-jsp" value="/html/invoicemanager/view.jsp"></portlet:param>
</portlet:actionURL>

<portlet:actionURL name="imprimirPorConsola" 
	var="imprimirPorConsola">
	<portlet:param name="facturaId" value="<%= new Long(f.getFacturaId()).toString()%>"></portlet:param>
	<portlet:param name="view-jsp" value="/html/invoicemanager/view.jsp"></portlet:param>
</portlet:actionURL>

<liferay-ui:icon-menu>
	<liferay-ui:icon image="edit" 
		label="Editar Factura"
		url="<%=  editFactura %>">
	</liferay-ui:icon>
	<liferay-ui:icon image="delete" 
		label="Borrar Factura"
		url="<%=  borrarFactura %>">
	</liferay-ui:icon>
	<liferay-ui:icon image="print" 
		label="Imprimir Consola"
		url="<%=  imprimirPorConsola %>">
	</liferay-ui:icon>
</liferay-ui:icon-menu>