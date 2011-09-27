<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>

<portlet:defineObjects />
<theme:defineObjects />


<p>
	Soy el usuario logado <img
		src="<%=themeDisplay.getPathImage()%>/user_portrait?screenName=<%=user.getUserId()%>&companyId=<%=company.getCompanyId()%>"
		alt="feo"></img>
</p>
