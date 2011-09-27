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

package es.emergya.negocio.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import es.emergya.negocio.model.LineaDeFactura;

import java.util.List;

/**
 * The persistence utility for the linea de factura service. This utility wraps {@link LineaDeFacturaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adiaz
 * @see LineaDeFacturaPersistence
 * @see LineaDeFacturaPersistenceImpl
 * @generated
 */
public class LineaDeFacturaUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(LineaDeFactura lineaDeFactura) {
		getPersistence().clearCache(lineaDeFactura);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<LineaDeFactura> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LineaDeFactura> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LineaDeFactura> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static LineaDeFactura remove(LineaDeFactura lineaDeFactura)
		throws SystemException {
		return getPersistence().remove(lineaDeFactura);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static LineaDeFactura update(LineaDeFactura lineaDeFactura,
		boolean merge) throws SystemException {
		return getPersistence().update(lineaDeFactura, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static LineaDeFactura update(LineaDeFactura lineaDeFactura,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(lineaDeFactura, merge, serviceContext);
	}

	/**
	* Caches the linea de factura in the entity cache if it is enabled.
	*
	* @param lineaDeFactura the linea de factura to cache
	*/
	public static void cacheResult(
		es.emergya.negocio.model.LineaDeFactura lineaDeFactura) {
		getPersistence().cacheResult(lineaDeFactura);
	}

	/**
	* Caches the linea de facturas in the entity cache if it is enabled.
	*
	* @param lineaDeFacturas the linea de facturas to cache
	*/
	public static void cacheResult(
		java.util.List<es.emergya.negocio.model.LineaDeFactura> lineaDeFacturas) {
		getPersistence().cacheResult(lineaDeFacturas);
	}

	/**
	* Creates a new linea de factura with the primary key. Does not add the linea de factura to the database.
	*
	* @param lineaDeacturaId the primary key for the new linea de factura
	* @return the new linea de factura
	*/
	public static es.emergya.negocio.model.LineaDeFactura create(
		long lineaDeacturaId) {
		return getPersistence().create(lineaDeacturaId);
	}

	/**
	* Removes the linea de factura with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param lineaDeacturaId the primary key of the linea de factura to remove
	* @return the linea de factura that was removed
	* @throws es.emergya.negocio.NoSuchLineaDeFacturaException if a linea de factura with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.emergya.negocio.model.LineaDeFactura remove(
		long lineaDeacturaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchLineaDeFacturaException {
		return getPersistence().remove(lineaDeacturaId);
	}

	public static es.emergya.negocio.model.LineaDeFactura updateImpl(
		es.emergya.negocio.model.LineaDeFactura lineaDeFactura, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(lineaDeFactura, merge);
	}

	/**
	* Finds the linea de factura with the primary key or throws a {@link es.emergya.negocio.NoSuchLineaDeFacturaException} if it could not be found.
	*
	* @param lineaDeacturaId the primary key of the linea de factura to find
	* @return the linea de factura
	* @throws es.emergya.negocio.NoSuchLineaDeFacturaException if a linea de factura with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.emergya.negocio.model.LineaDeFactura findByPrimaryKey(
		long lineaDeacturaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchLineaDeFacturaException {
		return getPersistence().findByPrimaryKey(lineaDeacturaId);
	}

	/**
	* Finds the linea de factura with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param lineaDeacturaId the primary key of the linea de factura to find
	* @return the linea de factura, or <code>null</code> if a linea de factura with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.emergya.negocio.model.LineaDeFactura fetchByPrimaryKey(
		long lineaDeacturaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(lineaDeacturaId);
	}

	/**
	* Finds all the linea de facturas.
	*
	* @return the linea de facturas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.emergya.negocio.model.LineaDeFactura> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the linea de facturas.
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
	public static java.util.List<es.emergya.negocio.model.LineaDeFactura> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the linea de facturas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of linea de facturas to return
	* @param end the upper bound of the range of linea de facturas to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of linea de facturas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.emergya.negocio.model.LineaDeFactura> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the linea de facturas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the linea de facturas.
	*
	* @return the number of linea de facturas
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static LineaDeFacturaPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LineaDeFacturaPersistence)PortletBeanLocatorUtil.locate(es.emergya.negocio.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					LineaDeFacturaPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(LineaDeFacturaPersistence persistence) {
		_persistence = persistence;
	}

	private static LineaDeFacturaPersistence _persistence;
}