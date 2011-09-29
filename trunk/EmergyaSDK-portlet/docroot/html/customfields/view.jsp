<%@page import="java.util.Enumeration"%>
<%@page import="com.liferay.portlet.expando.model.ExpandoBridge"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>

<portlet:defineObjects />
<theme:defineObjects />


<%
	ExpandoBridge expandoBridge = user.getExpandoBridge();

	Enumeration<String> enumeration = expandoBridge.getAttributeNames();
	while(enumeration.hasMoreElements()){
		String attribute= enumeration.nextElement();
%>

	<div><liferay-ui:message key="<%= attribute%>"></liferay-ui:message>: <%= expandoBridge.getAttribute(attribute) %></div>
<% } %>