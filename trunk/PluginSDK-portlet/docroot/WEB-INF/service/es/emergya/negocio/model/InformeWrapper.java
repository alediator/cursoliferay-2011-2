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

package es.emergya.negocio.model;

/**
 * <p>
 * This class is a wrapper for {@link Informe}.
 * </p>
 *
 * @author    adiaz
 * @see       Informe
 * @generated
 */
public class InformeWrapper implements Informe {
	public InformeWrapper(Informe informe) {
		_informe = informe;
	}

	public long getPrimaryKey() {
		return _informe.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_informe.setPrimaryKey(pk);
	}

	public long getInformeId() {
		return _informe.getInformeId();
	}

	public void setInformeId(long informeId) {
		_informe.setInformeId(informeId);
	}

	public long getCompanyId() {
		return _informe.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		_informe.setCompanyId(companyId);
	}

	public long getUserId() {
		return _informe.getUserId();
	}

	public void setUserId(long userId) {
		_informe.setUserId(userId);
	}

	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _informe.getUserUuid();
	}

	public void setUserUuid(java.lang.String userUuid) {
		_informe.setUserUuid(userUuid);
	}

	public long getGroupId() {
		return _informe.getGroupId();
	}

	public void setGroupId(long groupId) {
		_informe.setGroupId(groupId);
	}

	public java.lang.String getTitulo() {
		return _informe.getTitulo();
	}

	public void setTitulo(java.lang.String titulo) {
		_informe.setTitulo(titulo);
	}

	public java.lang.String getDescripcion() {
		return _informe.getDescripcion();
	}

	public void setDescripcion(java.lang.String descripcion) {
		_informe.setDescripcion(descripcion);
	}

	public java.lang.String getContenido() {
		return _informe.getContenido();
	}

	public void setContenido(java.lang.String contenido) {
		_informe.setContenido(contenido);
	}

	public java.util.Date getFechaCreacion() {
		return _informe.getFechaCreacion();
	}

	public void setFechaCreacion(java.util.Date fechaCreacion) {
		_informe.setFechaCreacion(fechaCreacion);
	}

	public es.emergya.negocio.model.Informe toEscapedModel() {
		return _informe.toEscapedModel();
	}

	public boolean isNew() {
		return _informe.isNew();
	}

	public void setNew(boolean n) {
		_informe.setNew(n);
	}

	public boolean isCachedModel() {
		return _informe.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_informe.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _informe.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_informe.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _informe.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _informe.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_informe.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _informe.clone();
	}

	public int compareTo(es.emergya.negocio.model.Informe informe) {
		return _informe.compareTo(informe);
	}

	public int hashCode() {
		return _informe.hashCode();
	}

	public java.lang.String toString() {
		return _informe.toString();
	}

	public java.lang.String toXmlString() {
		return _informe.toXmlString();
	}

	public Informe getWrappedInforme() {
		return _informe;
	}

	private Informe _informe;
}