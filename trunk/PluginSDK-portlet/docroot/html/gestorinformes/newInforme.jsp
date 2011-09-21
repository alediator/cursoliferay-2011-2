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

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<portlet:actionURL var="guardarInforme" name="guardarInforme">
</portlet:actionURL>

<form action="<%= guardarInforme%>" method="post">
<div style="height:250px">
	<div><div style="float:left;padding-right:50px;width:100px;"><label>Titulo</label></div><div style="float:right"><input type="text" name="titulo" /></div></div>
	<div style="clear:both"><div style="float:left;padding-right:50px;width:100px;"><label style="padding-right:50px;width:100px;">Descripcion</label></div><div style="float:right"><input type="text" name="descripcion" /></div></div>
	<div style="clear:both"><div style="float:left;padding-right:50px;width:100px;"><label style="padding-right:50px;width:100px;">Contenido</label></div><div style="float:right"><textarea rows="10" cols="40" name="contenido" ></textarea></div></div>
	<div style="clear:both"><input type="submit" value="Guardar Informe" /></div>
</div>
</form>
