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
 * The interface for the factura local service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link FacturaLocalServiceUtil} to access the factura local service. Add custom service methods to {@link es.emergya.negocio.service.impl.FacturaLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adiaz
 * @see FacturaLocalServiceUtil
 * @see es.emergya.negocio.service.base.FacturaLocalServiceBaseImpl
 * @see es.emergya.negocio.service.impl.FacturaLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface FacturaLocalService {
	/**
	* Adds the factura to the database. Also notifies the appropriate model listeners.
	*
	* @param factura the factura to add
	* @return the factura that was added
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Factura addFactura(
		es.emergya.negocio.model.Factura factura)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new factura with the primary key. Does not add the factura to the database.
	*
	* @param facturaId the primary key for the new factura
	* @return the new factura
	*/
	public es.emergya.negocio.model.Factura createFactura(long facturaId);

	/**
	* Deletes the factura with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param facturaId the primary key of the factura to delete
	* @throws PortalException if a factura with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteFactura(long facturaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the factura from the database. Also notifies the appropriate model listeners.
	*
	* @param factura the factura to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteFactura(es.emergya.negocio.model.Factura factura)
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
	* Gets the factura with the primary key.
	*
	* @param facturaId the primary key of the factura to get
	* @return the factura
	* @throws PortalException if a factura with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public es.emergya.negocio.model.Factura getFactura(long facturaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets a range of all the facturas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facturas to return
	* @param end the upper bound of the range of facturas to return (not inclusive)
	* @return the range of facturas
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<es.emergya.negocio.model.Factura> getFacturas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the number of facturas.
	*
	* @return the number of facturas
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getFacturasCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the factura in the database. Also notifies the appropriate model listeners.
	*
	* @param factura the factura to update
	* @return the factura that was updated
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Factura updateFactura(
		es.emergya.negocio.model.Factura factura)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the factura in the database. Also notifies the appropriate model listeners.
	*
	* @param factura the factura to update
	* @param merge whether to merge the factura with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the factura that was updated
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Factura updateFactura(
		es.emergya.negocio.model.Factura factura, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new factura parameters. Adds to database
	*
	* @param nombreCliente
	* @param importeTotal
	* @param descripcion
	* @return the new factura
	* @throws SystemException
	*/
	public es.emergya.negocio.model.Factura createFactura(
		java.lang.String nombreCliente, double importeTotal,
		java.lang.String descripcion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the facturas where nombreCliente = &#63;.
	*
	* @param nombreCliente the nombre cliente to search with
	* @return the matching facturas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Factura> findByNombreCliente(
		java.lang.String nombreCliente)
		throws com.liferay.portal.kernel.exception.SystemException;
}