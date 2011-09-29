<%@page import="com.liferay.portal.model.User"%>
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

<h1>Etiquetas jsp</h1>
<liferay-ui:custom-attribute-list 
	classPK="<%= user != null ? user.getUserId() : 0%>" 
	className="<%= com.liferay.portal.model.User.class.getName()%>"
	editable="<%= true%>"
	label="<%= true%>">
</liferay-ui:custom-attribute-list>