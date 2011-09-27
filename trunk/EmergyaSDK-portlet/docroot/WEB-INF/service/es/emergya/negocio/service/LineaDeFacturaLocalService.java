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

package es.emergya.negocio.service;

import com.liferay.portal.kernel.annotation.Isolation;
import com.liferay.portal.kernel.annotation.Propagation;
import com.liferay.portal.kernel.annotation.Transactional;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The interface for the linea de factura local service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link LineaDeFacturaLocalServiceUtil} to access the linea de factura local service. Add custom service methods to {@link es.emergya.negocio.service.impl.LineaDeFacturaLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adiaz
 * @see LineaDeFacturaLocalServiceUtil
 * @see es.emergya.negocio.service.base.LineaDeFacturaLocalServiceBaseImpl
 * @see es.emergya.negocio.service.impl.LineaDeFacturaLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface LineaDeFacturaLocalService {
	/**
	* Adds the linea de factura to the database. Also notifies the appropriate model listeners.
	*
	* @param lineaDeFactura the linea de factura to add
	* @return the linea de factura that was added
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.LineaDeFactura addLineaDeFactura(
		es.emergya.negocio.model.LineaDeFactura lineaDeFactura)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new linea de factura with the primary key. Does not add the linea de factura to the database.
	*
	* @param lineaDeacturaId the primary key for the new linea de factura
	* @return the new linea de factura
	*/
	public es.emergya.negocio.model.LineaDeFactura createLineaDeFactura(
		long lineaDeacturaId);

	/**
	* Deletes the linea de factura with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param lineaDeacturaId the primary key of the linea de factura to delete
	* @throws PortalException if a linea de factura with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteLineaDeFactura(long lineaDeacturaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the linea de factura from the database. Also notifies the appropriate model listeners.
	*
	* @param lineaDeFactura the linea de factura to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteLineaDeFactura(
		es.emergya.negocio.model.LineaDeFactura lineaDeFactura)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the linea de factura with the primary key.
	*
	* @param lineaDeacturaId the primary key of the linea de factura to get
	* @return the linea de factura
	* @throws PortalException if a linea de factura with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public es.emergya.negocio.model.LineaDeFactura getLineaDeFactura(
		long lineaDeacturaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets a range of all the linea de facturas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of linea de facturas to return
	* @param end the upper bound of the range of linea de facturas to return (not inclusive)
	* @return the range of linea de facturas
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<es.emergya.negocio.model.LineaDeFactura> getLineaDeFacturas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the number of linea de facturas.
	*
	* @return the number of linea de facturas
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getLineaDeFacturasCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the linea de factura in the database. Also notifies the appropriate model listeners.
	*
	* @param lineaDeFactura the linea de factura to update
	* @return the linea de factura that was updated
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.LineaDeFactura updateLineaDeFactura(
		es.emergya.negocio.model.LineaDeFactura lineaDeFactura)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the linea de factura in the database. Also notifies the appropriate model listeners.
	*
	* @param lineaDeFactura the linea de factura to update
	* @param merge whether to merge the linea de factura with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the linea de factura that was updated
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.LineaDeFactura updateLineaDeFactura(
		es.emergya.negocio.model.LineaDeFactura lineaDeFactura, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;
}