<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>

<portlet:defineObjects />
<theme:defineObjects />

<%
	String toolbarItem = ParamUtil.getString(renderRequest, "toolbarItem");
%>

<portlet:renderURL var="viewFacturasURL">
	<portlet:param name="view-jsp" value="/html/invoicemanager/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:renderURL var="addFacturaURL">
	<portlet:param name="view-jsp" value="/html/invoicemanager/add.jsp"></portlet:param>
</portlet:renderURL>

<div class="lfr-portlet-toolbar">
	<span class="lfr-toolbar-button view-button <%= toolbarItem.equals("view-all") ? "current" : ""%>">	
		<a href="<%= viewFacturasURL %>">Mostrar todo</a>
	</span>
	<span class="lfr-toolbar-button add-button <%= toolbarItem.equals("add") ? "current" : ""%>">	
		<a href="<%= addFacturaURL %>">Crear Facturas</a>
	</span>
</div>