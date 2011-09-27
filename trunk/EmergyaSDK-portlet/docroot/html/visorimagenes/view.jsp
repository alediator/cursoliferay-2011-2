<%@page import="com.liferay.portal.kernel.servlet.ImageServletTokenUtil"%>
<%@page import="com.liferay.portlet.imagegallery.service.IGImageLocalServiceUtil"%>
<%@page import="com.liferay.portlet.imagegallery.model.IGImage"%>
<%@page import="com.liferay.portlet.imagegallery.model.IGFolderConstants"%>
<%@page import="com.liferay.portlet.imagegallery.model.IGFolder"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portlet.imagegallery.service.IGFolderLocalServiceUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>

<portlet:defineObjects />
<theme:defineObjects />

<table>
  <tr>
    <th>Name</th>
    <th style="padding-left:50px;">Description</th>
    <th style="padding-left:50px;">Images</th>
  </tr>

<%
	// Paso 1: Recuperar todas las carpetas asociadas a 
	// la comunididad en la que se encuentra el portlet
	List<IGFolder> folders = (List<IGFolder>) IGFolderLocalServiceUtil
			.getFolders(themeDisplay.getScopeGroupId(),
					IGFolderConstants.DEFAULT_PARENT_FOLDER_ID);

	for (IGFolder folder : folders) {
%>

  <tr>
    <td><%=folder.getName()%></td>
    <td style="padding-left:50px;"><%=folder.getDescription()%></td>
    
<%
    	List<IGImage> images = IGImageLocalServiceUtil.getImages(
    				themeDisplay.getScopeGroupId(), folder.getFolderId());
    %>
    <td style="padding-left:50px;">
    	<table>
    		<tr>
    			<th>Name</th>
    			<th style="padding-left:50px;">Size</th>
    			<th style="padding-left:50px;">Image</th>
    		</tr>
    		<%
    			for (IGImage image : images) {
    		%>
    		<tr>
			    <td><%=image.getName()%></td>
			    <td style="padding-left:50px;"><%=image.getImageSize()%></td>
					<td style="padding-left: 50px;"><img
						src="<%=themeDisplay.getPathImage()%>/image_gallery?img_id=<%=image.getLargeImageId()%>&t=<%=ImageServletTokenUtil.getToken(image
							.getLargeImageId())%>"
						alt="nohay" height="150"/>
					</td>
				</tr>
			<%
				}
			%>
    	</table>
	</td>

  </tr>
  
<%
  	}
  %>
</table>