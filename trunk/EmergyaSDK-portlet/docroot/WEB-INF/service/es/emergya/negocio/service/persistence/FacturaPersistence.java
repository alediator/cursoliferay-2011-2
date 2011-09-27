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

import com.liferay.portal.service.persistence.BasePersistence;

import es.emergya.negocio.model.Factura;

/**
 * The persistence interface for the factura service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link FacturaUtil} to access the factura persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adiaz
 * @see FacturaPersistenceImpl
 * @see FacturaUtil
 * @generated
 */
public interface FacturaPersistence extends BasePersistence<Factura> {
	/**
	* Caches the factura in the entity cache if it is enabled.
	*
	* @param factura the factura to cache
	*/
	public void cacheResult(es.emergya.negocio.model.Factura factura);

	/**
	* Caches the facturas in the entity cache if it is enabled.
	*
	* @param facturas the facturas to cache
	*/
	public void cacheResult(
		java.util.List<es.emergya.negocio.model.Factura> facturas);

	/**
	* Creates a new factura with the primary key. Does not add the factura to the database.
	*
	* @param facturaId the primary key for the new factura
	* @return the new factura
	*/
	public es.emergya.negocio.model.Factura create(long facturaId);

	/**
	* Removes the factura with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param facturaId the primary key of the factura to remove
	* @return the factura that was removed
	* @throws es.emergya.negocio.NoSuchFacturaException if a factura with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Factura remove(long facturaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchFacturaException;

	public es.emergya.negocio.model.Factura updateImpl(
		es.emergya.negocio.model.Factura factura, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the factura with the primary key or throws a {@link es.emergya.negocio.NoSuchFacturaException} if it could not be found.
	*
	* @param facturaId the primary key of the factura to find
	* @return the factura
	* @throws es.emergya.negocio.NoSuchFacturaException if a factura with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Factura findByPrimaryKey(long facturaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchFacturaException;

	/**
	* Finds the factura with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param facturaId the primary key of the factura to find
	* @return the factura, or <code>null</code> if a factura with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Factura fetchByPrimaryKey(long facturaId)
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

	/**
	* Finds a range of all the facturas where nombreCliente = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param nombreCliente the nombre cliente to search with
	* @param start the lower bound of the range of facturas to return
	* @param end the upper bound of the range of facturas to return (not inclusive)
	* @return the range of matching facturas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Factura> findByNombreCliente(
		java.lang.String nombreCliente, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the facturas where nombreCliente = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param nombreCliente the nombre cliente to search with
	* @param start the lower bound of the range of facturas to return
	* @param end the upper bound of the range of facturas to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching facturas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Factura> findByNombreCliente(
		java.lang.String nombreCliente, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first factura in the ordered set where nombreCliente = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param nombreCliente the nombre cliente to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching factura
	* @throws es.emergya.negocio.NoSuchFacturaException if a matching factura could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Factura findByNombreCliente_First(
		java.lang.String nombreCliente,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchFacturaException;

	/**
	* Finds the last factura in the ordered set where nombreCliente = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param nombreCliente the nombre cliente to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching factura
	* @throws es.emergya.negocio.NoSuchFacturaException if a matching factura could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Factura findByNombreCliente_Last(
		java.lang.String nombreCliente,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchFacturaException;

	/**
	* Finds the facturas before and after the current factura in the ordered set where nombreCliente = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param facturaId the primary key of the current factura
	* @param nombreCliente the nombre cliente to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next factura
	* @throws es.emergya.negocio.NoSuchFacturaException if a factura with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Factura[] findByNombreCliente_PrevAndNext(
		long facturaId, java.lang.String nombreCliente,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchFacturaException;

	/**
	* Finds all the facturas.
	*
	* @return the facturas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Factura> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the facturas.
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
	public java.util.List<es.emergya.negocio.model.Factura> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the facturas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facturas to return
	* @param end the upper bound of the range of facturas to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of facturas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Factura> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facturas where nombreCliente = &#63; from the database.
	*
	* @param nombreCliente the nombre cliente to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByNombreCliente(java.lang.String nombreCliente)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the facturas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the facturas where nombreCliente = &#63;.
	*
	* @param nombreCliente the nombre cliente to search with
	* @return the number of matching facturas
	* @throws SystemException if a system exception occurred
	*/
	public int countByNombreCliente(java.lang.String nombreCliente)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the facturas.
	*
	* @return the number of facturas
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets all the linea de facturas associated with the factura.
	*
	* @param pk the primary key of the factura to get the associated linea de facturas for
	* @return the linea de facturas associated with the factura
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.LineaDeFactura> getLineaDeFacturas(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets a range of all the linea de facturas associated with the factura.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the factura to get the associated linea de facturas for
	* @param start the lower bound of the range of facturas to return
	* @param end the upper bound of the range of facturas to return (not inclusive)
	* @return the range of linea de facturas associated with the factura
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.LineaDeFactura> getLineaDeFacturas(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets an ordered range of all the linea de facturas associated with the factura.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the factura to get the associated linea de facturas for
	* @param start the lower bound of the range of facturas to return
	* @param end the upper bound of the range of facturas to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of linea de facturas associated with the factura
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.LineaDeFactura> getLineaDeFacturas(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the number of linea de facturas associated with the factura.
	*
	* @param pk the primary key of the factura to get the number of associated linea de facturas for
	* @return the number of linea de facturas associated with the factura
	* @throws SystemException if a system exception occurred
	*/
	public int getLineaDeFacturasSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Determines if the linea de factura is associated with the factura.
	*
	* @param pk the primary key of the factura
	* @param lineaDeFacturaPK the primary key of the linea de factura
	* @return <code>true</code> if the linea de factura is associated with the factura; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaDeFactura(long pk, long lineaDeFacturaPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Determines if the factura has any linea de facturas associated with it.
	*
	* @param pk the primary key of the factura to check for associations with linea de facturas
	* @return <code>true</code> if the factura has any linea de facturas associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsLineaDeFacturas(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;
}