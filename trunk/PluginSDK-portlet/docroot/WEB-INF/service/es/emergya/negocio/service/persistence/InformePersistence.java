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

import es.emergya.negocio.model.Informe;

/**
 * The persistence interface for the informe service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link InformeUtil} to access the informe persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adiaz
 * @see InformePersistenceImpl
 * @see InformeUtil
 * @generated
 */
public interface InformePersistence extends BasePersistence<Informe> {
	/**
	* Caches the informe in the entity cache if it is enabled.
	*
	* @param informe the informe to cache
	*/
	public void cacheResult(es.emergya.negocio.model.Informe informe);

	/**
	* Caches the informes in the entity cache if it is enabled.
	*
	* @param informes the informes to cache
	*/
	public void cacheResult(
		java.util.List<es.emergya.negocio.model.Informe> informes);

	/**
	* Creates a new informe with the primary key. Does not add the informe to the database.
	*
	* @param informeId the primary key for the new informe
	* @return the new informe
	*/
	public es.emergya.negocio.model.Informe create(long informeId);

	/**
	* Removes the informe with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param informeId the primary key of the informe to remove
	* @return the informe that was removed
	* @throws es.emergya.negocio.NoSuchInformeException if a informe with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Informe remove(long informeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchInformeException;

	public es.emergya.negocio.model.Informe updateImpl(
		es.emergya.negocio.model.Informe informe, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the informe with the primary key or throws a {@link es.emergya.negocio.NoSuchInformeException} if it could not be found.
	*
	* @param informeId the primary key of the informe to find
	* @return the informe
	* @throws es.emergya.negocio.NoSuchInformeException if a informe with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Informe findByPrimaryKey(long informeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchInformeException;

	/**
	* Finds the informe with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param informeId the primary key of the informe to find
	* @return the informe, or <code>null</code> if a informe with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Informe fetchByPrimaryKey(long informeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the informes where titulo = &#63;.
	*
	* @param titulo the titulo to search with
	* @return the matching informes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Informe> findByTitulo(
		java.lang.String titulo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the informes where titulo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param titulo the titulo to search with
	* @param start the lower bound of the range of informes to return
	* @param end the upper bound of the range of informes to return (not inclusive)
	* @return the range of matching informes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Informe> findByTitulo(
		java.lang.String titulo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the informes where titulo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param titulo the titulo to search with
	* @param start the lower bound of the range of informes to return
	* @param end the upper bound of the range of informes to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching informes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Informe> findByTitulo(
		java.lang.String titulo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first informe in the ordered set where titulo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param titulo the titulo to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching informe
	* @throws es.emergya.negocio.NoSuchInformeException if a matching informe could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Informe findByTitulo_First(
		java.lang.String titulo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchInformeException;

	/**
	* Finds the last informe in the ordered set where titulo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param titulo the titulo to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching informe
	* @throws es.emergya.negocio.NoSuchInformeException if a matching informe could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Informe findByTitulo_Last(
		java.lang.String titulo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchInformeException;

	/**
	* Finds the informes before and after the current informe in the ordered set where titulo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param informeId the primary key of the current informe
	* @param titulo the titulo to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next informe
	* @throws es.emergya.negocio.NoSuchInformeException if a informe with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Informe[] findByTitulo_PrevAndNext(
		long informeId, java.lang.String titulo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchInformeException;

	/**
	* Finds all the informes where userId = &#63;.
	*
	* @param userId the user id to search with
	* @return the matching informes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Informe> findByU(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the informes where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param start the lower bound of the range of informes to return
	* @param end the upper bound of the range of informes to return (not inclusive)
	* @return the range of matching informes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Informe> findByU(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the informes where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param start the lower bound of the range of informes to return
	* @param end the upper bound of the range of informes to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching informes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Informe> findByU(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first informe in the ordered set where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching informe
	* @throws es.emergya.negocio.NoSuchInformeException if a matching informe could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Informe findByU_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchInformeException;

	/**
	* Finds the last informe in the ordered set where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching informe
	* @throws es.emergya.negocio.NoSuchInformeException if a matching informe could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Informe findByU_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchInformeException;

	/**
	* Finds the informes before and after the current informe in the ordered set where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param informeId the primary key of the current informe
	* @param userId the user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next informe
	* @throws es.emergya.negocio.NoSuchInformeException if a informe with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Informe[] findByU_PrevAndNext(
		long informeId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchInformeException;

	/**
	* Finds all the informes where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching informes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Informe> findByG(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the informes where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of informes to return
	* @param end the upper bound of the range of informes to return (not inclusive)
	* @return the range of matching informes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Informe> findByG(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the informes where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of informes to return
	* @param end the upper bound of the range of informes to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching informes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Informe> findByG(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first informe in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching informe
	* @throws es.emergya.negocio.NoSuchInformeException if a matching informe could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Informe findByG_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchInformeException;

	/**
	* Finds the last informe in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching informe
	* @throws es.emergya.negocio.NoSuchInformeException if a matching informe could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Informe findByG_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchInformeException;

	/**
	* Finds the informes before and after the current informe in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param informeId the primary key of the current informe
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next informe
	* @throws es.emergya.negocio.NoSuchInformeException if a informe with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Informe[] findByG_PrevAndNext(
		long informeId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchInformeException;

	/**
	* Finds all the informes where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the matching informes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Informe> findByC(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the informes where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param start the lower bound of the range of informes to return
	* @param end the upper bound of the range of informes to return (not inclusive)
	* @return the range of matching informes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Informe> findByC(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the informes where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param start the lower bound of the range of informes to return
	* @param end the upper bound of the range of informes to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching informes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Informe> findByC(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first informe in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching informe
	* @throws es.emergya.negocio.NoSuchInformeException if a matching informe could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Informe findByC_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchInformeException;

	/**
	* Finds the last informe in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching informe
	* @throws es.emergya.negocio.NoSuchInformeException if a matching informe could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Informe findByC_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchInformeException;

	/**
	* Finds the informes before and after the current informe in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param informeId the primary key of the current informe
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next informe
	* @throws es.emergya.negocio.NoSuchInformeException if a informe with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Informe[] findByC_PrevAndNext(
		long informeId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchInformeException;

	/**
	* Finds all the informes where userId = &#63; and companyId = &#63;.
	*
	* @param userId the user id to search with
	* @param companyId the company id to search with
	* @return the matching informes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Informe> findByU_C(
		long userId, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the informes where userId = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param companyId the company id to search with
	* @param start the lower bound of the range of informes to return
	* @param end the upper bound of the range of informes to return (not inclusive)
	* @return the range of matching informes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Informe> findByU_C(
		long userId, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the informes where userId = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param companyId the company id to search with
	* @param start the lower bound of the range of informes to return
	* @param end the upper bound of the range of informes to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching informes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Informe> findByU_C(
		long userId, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first informe in the ordered set where userId = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching informe
	* @throws es.emergya.negocio.NoSuchInformeException if a matching informe could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Informe findByU_C_First(long userId,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchInformeException;

	/**
	* Finds the last informe in the ordered set where userId = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching informe
	* @throws es.emergya.negocio.NoSuchInformeException if a matching informe could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Informe findByU_C_Last(long userId,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchInformeException;

	/**
	* Finds the informes before and after the current informe in the ordered set where userId = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param informeId the primary key of the current informe
	* @param userId the user id to search with
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next informe
	* @throws es.emergya.negocio.NoSuchInformeException if a informe with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Informe[] findByU_C_PrevAndNext(
		long informeId, long userId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchInformeException;

	/**
	* Finds all the informes where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user id to search with
	* @param groupId the group id to search with
	* @return the matching informes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Informe> findByU_G(
		long userId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the informes where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of informes to return
	* @param end the upper bound of the range of informes to return (not inclusive)
	* @return the range of matching informes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Informe> findByU_G(
		long userId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the informes where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of informes to return
	* @param end the upper bound of the range of informes to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching informes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Informe> findByU_G(
		long userId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first informe in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching informe
	* @throws es.emergya.negocio.NoSuchInformeException if a matching informe could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Informe findByU_G_First(long userId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchInformeException;

	/**
	* Finds the last informe in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching informe
	* @throws es.emergya.negocio.NoSuchInformeException if a matching informe could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Informe findByU_G_Last(long userId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchInformeException;

	/**
	* Finds the informes before and after the current informe in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param informeId the primary key of the current informe
	* @param userId the user id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next informe
	* @throws es.emergya.negocio.NoSuchInformeException if a informe with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Informe[] findByU_G_PrevAndNext(
		long informeId, long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchInformeException;

	/**
	* Finds all the informes where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user id to search with
	* @param groupId the group id to search with
	* @return the matching informes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Informe> findByU_C_G(
		long userId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the informes where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of informes to return
	* @param end the upper bound of the range of informes to return (not inclusive)
	* @return the range of matching informes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Informe> findByU_C_G(
		long userId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the informes where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of informes to return
	* @param end the upper bound of the range of informes to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching informes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Informe> findByU_C_G(
		long userId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first informe in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching informe
	* @throws es.emergya.negocio.NoSuchInformeException if a matching informe could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Informe findByU_C_G_First(long userId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchInformeException;

	/**
	* Finds the last informe in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching informe
	* @throws es.emergya.negocio.NoSuchInformeException if a matching informe could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Informe findByU_C_G_Last(long userId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchInformeException;

	/**
	* Finds the informes before and after the current informe in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param informeId the primary key of the current informe
	* @param userId the user id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next informe
	* @throws es.emergya.negocio.NoSuchInformeException if a informe with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.emergya.negocio.model.Informe[] findByU_C_G_PrevAndNext(
		long informeId, long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.emergya.negocio.NoSuchInformeException;

	/**
	* Finds all the informes.
	*
	* @return the informes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Informe> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the informes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of informes to return
	* @param end the upper bound of the range of informes to return (not inclusive)
	* @return the range of informes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Informe> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the informes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of informes to return
	* @param end the upper bound of the range of informes to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of informes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.emergya.negocio.model.Informe> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the informes where titulo = &#63; from the database.
	*
	* @param titulo the titulo to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTitulo(java.lang.String titulo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the informes where userId = &#63; from the database.
	*
	* @param userId the user id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByU(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the informes where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the informes where companyId = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the informes where userId = &#63; and companyId = &#63; from the database.
	*
	* @param userId the user id to search with
	* @param companyId the company id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByU_C(long userId, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the informes where userId = &#63; and groupId = &#63; from the database.
	*
	* @param userId the user id to search with
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByU_G(long userId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the informes where userId = &#63; and groupId = &#63; from the database.
	*
	* @param userId the user id to search with
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByU_C_G(long userId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the informes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the informes where titulo = &#63;.
	*
	* @param titulo the titulo to search with
	* @return the number of matching informes
	* @throws SystemException if a system exception occurred
	*/
	public int countByTitulo(java.lang.String titulo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the informes where userId = &#63;.
	*
	* @param userId the user id to search with
	* @return the number of matching informes
	* @throws SystemException if a system exception occurred
	*/
	public int countByU(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the informes where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching informes
	* @throws SystemException if a system exception occurred
	*/
	public int countByG(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the informes where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the number of matching informes
	* @throws SystemException if a system exception occurred
	*/
	public int countByC(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the informes where userId = &#63; and companyId = &#63;.
	*
	* @param userId the user id to search with
	* @param companyId the company id to search with
	* @return the number of matching informes
	* @throws SystemException if a system exception occurred
	*/
	public int countByU_C(long userId, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the informes where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user id to search with
	* @param groupId the group id to search with
	* @return the number of matching informes
	* @throws SystemException if a system exception occurred
	*/
	public int countByU_G(long userId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the informes where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user id to search with
	* @param groupId the group id to search with
	* @return the number of matching informes
	* @throws SystemException if a system exception occurred
	*/
	public int countByU_C_G(long userId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the informes.
	*
	* @return the number of informes
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}