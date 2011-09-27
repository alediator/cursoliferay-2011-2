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
 * This class is a wrapper for {@link LineaDeFactura}.
 * </p>
 *
 * @author    adiaz
 * @see       LineaDeFactura
 * @generated
 */
public class LineaDeFacturaWrapper implements LineaDeFactura {
	public LineaDeFacturaWrapper(LineaDeFactura lineaDeFactura) {
		_lineaDeFactura = lineaDeFactura;
	}

	public long getPrimaryKey() {
		return _lineaDeFactura.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_lineaDeFactura.setPrimaryKey(pk);
	}

	public long getLineaDeacturaId() {
		return _lineaDeFactura.getLineaDeacturaId();
	}

	public void setLineaDeacturaId(long lineaDeacturaId) {
		_lineaDeFactura.setLineaDeacturaId(lineaDeacturaId);
	}

	public java.lang.String getDetalle() {
		return _lineaDeFactura.getDetalle();
	}

	public void setDetalle(java.lang.String detalle) {
		_lineaDeFactura.setDetalle(detalle);
	}

	public double getImporte() {
		return _lineaDeFactura.getImporte();
	}

	public void setImporte(double importe) {
		_lineaDeFactura.setImporte(importe);
	}

	public long getFacturaId() {
		return _lineaDeFactura.getFacturaId();
	}

	public void setFacturaId(long facturaId) {
		_lineaDeFactura.setFacturaId(facturaId);
	}

	public LineaDeFactura toEscapedModel() {
		return _lineaDeFactura.toEscapedModel();
	}

	public boolean isNew() {
		return _lineaDeFactura.isNew();
	}

	public void setNew(boolean n) {
		_lineaDeFactura.setNew(n);
	}

	public boolean isCachedModel() {
		return _lineaDeFactura.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_lineaDeFactura.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _lineaDeFactura.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_lineaDeFactura.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _lineaDeFactura.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _lineaDeFactura.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_lineaDeFactura.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _lineaDeFactura.clone();
	}

	public int compareTo(LineaDeFactura lineaDeFactura) {
		return _lineaDeFactura.compareTo(lineaDeFactura);
	}

	public int hashCode() {
		return _lineaDeFactura.hashCode();
	}

	public java.lang.String toString() {
		return _lineaDeFactura.toString();
	}

	public java.lang.String toXmlString() {
		return _lineaDeFactura.toXmlString();
	}

	public LineaDeFactura getWrappedLineaDeFactura() {
		return _lineaDeFactura;
	}

	private LineaDeFactura _lineaDeFactura;
}