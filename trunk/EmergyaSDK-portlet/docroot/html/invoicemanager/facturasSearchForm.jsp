<%@page import="javax.portlet.WindowState"%>
<%@page import="es.emergya.web.invoice.InvoiceSearch"%>
<%@page import="es.emergya.web.invoice.InvoiceDisplayTerms"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>

<portlet:defineObjects />
<theme:defineObjects />

<%
	InvoiceDisplayTerms displayTerms = null;
	try{
		displayTerms = (InvoiceDisplayTerms) ((InvoiceSearch) renderRequest.getAttribute("liferay-ui:search:searchContainer")).getDisplayTerms();
	}catch (Exception e){
		e.printStackTrace();
	}
	
	WindowState windowState = renderRequest.getWindowState();
%>

<% if(windowState.equals(WindowState.MAXIMIZED)){ %>
	<aui:script>
		Liferay.Util.focusFormField(document.<portlet:namespace />fm.<portlet:namespace />
		<%= InvoiceDisplayTerms.DESCRIPCION %>);
	</aui:script>
<% } %>

<liferay-ui:search-toggle displayTerms="<%= displayTerms%>" id="facturasIId" buttonLabel="search">
	<aui:fieldset>
		<aui:column>
			<aui:input name="<%= InvoiceDisplayTerms.DESCRIPCION %>"
				value="<%= displayTerms.getDescripcion()%>"
				label="<%= InvoiceDisplayTerms.DESCRIPCION %>">
			</aui:input>
			<aui:input name="<%= InvoiceDisplayTerms.NOMBRE_CLIENTE %>"
				value="<%= displayTerms.getNombreCliente()%>"
				label="<%= InvoiceDisplayTerms.NOMBRE_CLIENTE %>">
			</aui:input>
		</aui:column>
		<aui:column>
			<aui:input name="<%= InvoiceDisplayTerms.IMPORTE_TOTAL %>"
				value="<%= displayTerms.getImporteTotal()%>"
				label="<%= InvoiceDisplayTerms.IMPORTE_TOTAL %>">
			</aui:input>
		</aui:column>
	</aui:fieldset>
</liferay-ui:search-toggle>
