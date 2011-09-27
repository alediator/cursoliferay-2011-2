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

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.jdbc.MappingSqlQuery;
import com.liferay.portal.kernel.dao.jdbc.MappingSqlQueryFactoryUtil;
import com.liferay.portal.kernel.dao.jdbc.RowMapper;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import es.emergya.negocio.NoSuchFacturaException;
import es.emergya.negocio.model.Factura;
import es.emergya.negocio.model.impl.FacturaImpl;
import es.emergya.negocio.model.impl.FacturaModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the factura service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link FacturaUtil} to access the factura persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adiaz
 * @see FacturaPersistence
 * @see FacturaUtil
 * @generated
 */
public class FacturaPersistenceImpl extends BasePersistenceImpl<Factura>
	implements FacturaPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = FacturaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_NOMBRECLIENTE = new FinderPath(FacturaModelImpl.ENTITY_CACHE_ENABLED,
			FacturaModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByNombreCliente",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_NOMBRECLIENTE = new FinderPath(FacturaModelImpl.ENTITY_CACHE_ENABLED,
			FacturaModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByNombreCliente", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(FacturaModelImpl.ENTITY_CACHE_ENABLED,
			FacturaModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FacturaModelImpl.ENTITY_CACHE_ENABLED,
			FacturaModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the factura in the entity cache if it is enabled.
	 *
	 * @param factura the factura to cache
	 */
	public void cacheResult(Factura factura) {
		EntityCacheUtil.putResult(FacturaModelImpl.ENTITY_CACHE_ENABLED,
			FacturaImpl.class, factura.getPrimaryKey(), factura);
	}

	/**
	 * Caches the facturas in the entity cache if it is enabled.
	 *
	 * @param facturas the facturas to cache
	 */
	public void cacheResult(List<Factura> facturas) {
		for (Factura factura : facturas) {
			if (EntityCacheUtil.getResult(
						FacturaModelImpl.ENTITY_CACHE_ENABLED,
						FacturaImpl.class, factura.getPrimaryKey(), this) == null) {
				cacheResult(factura);
			}
		}
	}

	/**
	 * Clears the cache for all facturas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(FacturaImpl.class.getName());
		EntityCacheUtil.clearCache(FacturaImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the factura.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(Factura factura) {
		EntityCacheUtil.removeResult(FacturaModelImpl.ENTITY_CACHE_ENABLED,
			FacturaImpl.class, factura.getPrimaryKey());
	}

	/**
	 * Creates a new factura with the primary key. Does not add the factura to the database.
	 *
	 * @param facturaId the primary key for the new factura
	 * @return the new factura
	 */
	public Factura create(long facturaId) {
		Factura factura = new FacturaImpl();

		factura.setNew(true);
		factura.setPrimaryKey(facturaId);

		return factura;
	}

	/**
	 * Removes the factura with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the factura to remove
	 * @return the factura that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a factura with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Factura remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the factura with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param facturaId the primary key of the factura to remove
	 * @return the factura that was removed
	 * @throws es.emergya.negocio.NoSuchFacturaException if a factura with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Factura remove(long facturaId)
		throws NoSuchFacturaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Factura factura = (Factura)session.get(FacturaImpl.class,
					new Long(facturaId));

			if (factura == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + facturaId);
				}

				throw new NoSuchFacturaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					facturaId);
			}

			return remove(factura);
		}
		catch (NoSuchFacturaException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Factura removeImpl(Factura factura) throws SystemException {
		factura = toUnwrappedModel(factura);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, factura);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(FacturaModelImpl.ENTITY_CACHE_ENABLED,
			FacturaImpl.class, factura.getPrimaryKey());

		return factura;
	}

	public Factura updateImpl(es.emergya.negocio.model.Factura factura,
		boolean merge) throws SystemException {
		factura = toUnwrappedModel(factura);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, factura, merge);

			factura.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(FacturaModelImpl.ENTITY_CACHE_ENABLED,
			FacturaImpl.class, factura.getPrimaryKey(), factura);

		return factura;
	}

	protected Factura toUnwrappedModel(Factura factura) {
		if (factura instanceof FacturaImpl) {
			return factura;
		}

		FacturaImpl facturaImpl = new FacturaImpl();

		facturaImpl.setNew(factura.isNew());
		facturaImpl.setPrimaryKey(factura.getPrimaryKey());

		facturaImpl.setFacturaId(factura.getFacturaId());
		facturaImpl.setNombreCliente(factura.getNombreCliente());
		facturaImpl.setImporteTotal(factura.getImporteTotal());
		facturaImpl.setDescripcion(factura.getDescripcion());

		return facturaImpl;
	}

	/**
	 * Finds the factura with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the factura to find
	 * @return the factura
	 * @throws com.liferay.portal.NoSuchModelException if a factura with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Factura findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the factura with the primary key or throws a {@link es.emergya.negocio.NoSuchFacturaException} if it could not be found.
	 *
	 * @param facturaId the primary key of the factura to find
	 * @return the factura
	 * @throws es.emergya.negocio.NoSuchFacturaException if a factura with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Factura findByPrimaryKey(long facturaId)
		throws NoSuchFacturaException, SystemException {
		Factura factura = fetchByPrimaryKey(facturaId);

		if (factura == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + facturaId);
			}

			throw new NoSuchFacturaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				facturaId);
		}

		return factura;
	}

	/**
	 * Finds the factura with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the factura to find
	 * @return the factura, or <code>null</code> if a factura with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Factura fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the factura with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param facturaId the primary key of the factura to find
	 * @return the factura, or <code>null</code> if a factura with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Factura fetchByPrimaryKey(long facturaId) throws SystemException {
		Factura factura = (Factura)EntityCacheUtil.getResult(FacturaModelImpl.ENTITY_CACHE_ENABLED,
				FacturaImpl.class, facturaId, this);

		if (factura == null) {
			Session session = null;

			try {
				session = openSession();

				factura = (Factura)session.get(FacturaImpl.class,
						new Long(facturaId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (factura != null) {
					cacheResult(factura);
				}

				closeSession(session);
			}
		}

		return factura;
	}

	/**
	 * Finds all the facturas where nombreCliente = &#63;.
	 *
	 * @param nombreCliente the nombre cliente to search with
	 * @return the matching facturas
	 * @throws SystemException if a system exception occurred
	 */
	public List<Factura> findByNombreCliente(String nombreCliente)
		throws SystemException {
		return findByNombreCliente(nombreCliente, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

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
	public List<Factura> findByNombreCliente(String nombreCliente, int start,
		int end) throws SystemException {
		return findByNombreCliente(nombreCliente, start, end, null);
	}

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
	public List<Factura> findByNombreCliente(String nombreCliente, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				nombreCliente,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Factura> list = (List<Factura>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_NOMBRECLIENTE,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_FACTURA_WHERE);

			if (nombreCliente == null) {
				query.append(_FINDER_COLUMN_NOMBRECLIENTE_NOMBRECLIENTE_1);
			}
			else {
				if (nombreCliente.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_NOMBRECLIENTE_NOMBRECLIENTE_3);
				}
				else {
					query.append(_FINDER_COLUMN_NOMBRECLIENTE_NOMBRECLIENTE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(FacturaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (nombreCliente != null) {
					qPos.add(nombreCliente);
				}

				list = (List<Factura>)QueryUtil.list(q, getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_NOMBRECLIENTE,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_NOMBRECLIENTE,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

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
	public Factura findByNombreCliente_First(String nombreCliente,
		OrderByComparator orderByComparator)
		throws NoSuchFacturaException, SystemException {
		List<Factura> list = findByNombreCliente(nombreCliente, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("nombreCliente=");
			msg.append(nombreCliente);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchFacturaException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

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
	public Factura findByNombreCliente_Last(String nombreCliente,
		OrderByComparator orderByComparator)
		throws NoSuchFacturaException, SystemException {
		int count = countByNombreCliente(nombreCliente);

		List<Factura> list = findByNombreCliente(nombreCliente, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("nombreCliente=");
			msg.append(nombreCliente);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchFacturaException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

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
	public Factura[] findByNombreCliente_PrevAndNext(long facturaId,
		String nombreCliente, OrderByComparator orderByComparator)
		throws NoSuchFacturaException, SystemException {
		Factura factura = findByPrimaryKey(facturaId);

		Session session = null;

		try {
			session = openSession();

			Factura[] array = new FacturaImpl[3];

			array[0] = getByNombreCliente_PrevAndNext(session, factura,
					nombreCliente, orderByComparator, true);

			array[1] = factura;

			array[2] = getByNombreCliente_PrevAndNext(session, factura,
					nombreCliente, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Factura getByNombreCliente_PrevAndNext(Session session,
		Factura factura, String nombreCliente,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FACTURA_WHERE);

		if (nombreCliente == null) {
			query.append(_FINDER_COLUMN_NOMBRECLIENTE_NOMBRECLIENTE_1);
		}
		else {
			if (nombreCliente.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NOMBRECLIENTE_NOMBRECLIENTE_3);
			}
			else {
				query.append(_FINDER_COLUMN_NOMBRECLIENTE_NOMBRECLIENTE_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(FacturaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (nombreCliente != null) {
			qPos.add(nombreCliente);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(factura);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Factura> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the facturas.
	 *
	 * @return the facturas
	 * @throws SystemException if a system exception occurred
	 */
	public List<Factura> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	public List<Factura> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

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
	public List<Factura> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Factura> list = (List<Factura>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FACTURA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FACTURA.concat(FacturaModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Factura>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Factura>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_ALL,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_ALL, finderArgs,
						list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the facturas where nombreCliente = &#63; from the database.
	 *
	 * @param nombreCliente the nombre cliente to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByNombreCliente(String nombreCliente)
		throws SystemException {
		for (Factura factura : findByNombreCliente(nombreCliente)) {
			remove(factura);
		}
	}

	/**
	 * Removes all the facturas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Factura factura : findAll()) {
			remove(factura);
		}
	}

	/**
	 * Counts all the facturas where nombreCliente = &#63;.
	 *
	 * @param nombreCliente the nombre cliente to search with
	 * @return the number of matching facturas
	 * @throws SystemException if a system exception occurred
	 */
	public int countByNombreCliente(String nombreCliente)
		throws SystemException {
		Object[] finderArgs = new Object[] { nombreCliente };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_NOMBRECLIENTE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FACTURA_WHERE);

			if (nombreCliente == null) {
				query.append(_FINDER_COLUMN_NOMBRECLIENTE_NOMBRECLIENTE_1);
			}
			else {
				if (nombreCliente.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_NOMBRECLIENTE_NOMBRECLIENTE_3);
				}
				else {
					query.append(_FINDER_COLUMN_NOMBRECLIENTE_NOMBRECLIENTE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (nombreCliente != null) {
					qPos.add(nombreCliente);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_NOMBRECLIENTE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the facturas.
	 *
	 * @return the number of facturas
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Object[] finderArgs = new Object[0];

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FACTURA);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Gets all the linea de facturas associated with the factura.
	 *
	 * @param pk the primary key of the factura to get the associated linea de facturas for
	 * @return the linea de facturas associated with the factura
	 * @throws SystemException if a system exception occurred
	 */
	public List<es.emergya.negocio.model.LineaDeFactura> getLineaDeFacturas(
		long pk) throws SystemException {
		return getLineaDeFacturas(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

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
	public List<es.emergya.negocio.model.LineaDeFactura> getLineaDeFacturas(
		long pk, int start, int end) throws SystemException {
		return getLineaDeFacturas(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_LINEADEFACTURAS = new FinderPath(es.emergya.negocio.model.impl.LineaDeFacturaModelImpl.ENTITY_CACHE_ENABLED,
			es.emergya.negocio.model.impl.LineaDeFacturaModelImpl.FINDER_CACHE_ENABLED,
			es.emergya.negocio.service.persistence.LineaDeFacturaPersistenceImpl.FINDER_CLASS_NAME_LIST,
			"getLineaDeFacturas",
			new String[] {
				Long.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

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
	public List<es.emergya.negocio.model.LineaDeFactura> getLineaDeFacturas(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				pk, String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<es.emergya.negocio.model.LineaDeFactura> list = (List<es.emergya.negocio.model.LineaDeFactura>)FinderCacheUtil.getResult(FINDER_PATH_GET_LINEADEFACTURAS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETLINEADEFACTURAS.concat(ORDER_BY_CLAUSE)
												 .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETLINEADEFACTURAS;
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("lineaDeFactura",
					es.emergya.negocio.model.impl.LineaDeFacturaImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<es.emergya.negocio.model.LineaDeFactura>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_LINEADEFACTURAS,
						finderArgs);
				}
				else {
					lineaDeFacturaPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_LINEADEFACTURAS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_LINEADEFACTURAS_SIZE = new FinderPath(es.emergya.negocio.model.impl.LineaDeFacturaModelImpl.ENTITY_CACHE_ENABLED,
			es.emergya.negocio.model.impl.LineaDeFacturaModelImpl.FINDER_CACHE_ENABLED,
			es.emergya.negocio.service.persistence.LineaDeFacturaPersistenceImpl.FINDER_CLASS_NAME_LIST,
			"getLineaDeFacturasSize", new String[] { Long.class.getName() });

	/**
	 * Gets the number of linea de facturas associated with the factura.
	 *
	 * @param pk the primary key of the factura to get the number of associated linea de facturas for
	 * @return the number of linea de facturas associated with the factura
	 * @throws SystemException if a system exception occurred
	 */
	public int getLineaDeFacturasSize(long pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_LINEADEFACTURAS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETLINEADEFACTURASSIZE);

				q.addScalar(COUNT_COLUMN_NAME,
					com.liferay.portal.kernel.dao.orm.Type.LONG);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_GET_LINEADEFACTURAS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_LINEADEFACTURA = new FinderPath(es.emergya.negocio.model.impl.LineaDeFacturaModelImpl.ENTITY_CACHE_ENABLED,
			es.emergya.negocio.model.impl.LineaDeFacturaModelImpl.FINDER_CACHE_ENABLED,
			es.emergya.negocio.service.persistence.LineaDeFacturaPersistenceImpl.FINDER_CLASS_NAME_LIST,
			"containsLineaDeFactura",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Determines if the linea de factura is associated with the factura.
	 *
	 * @param pk the primary key of the factura
	 * @param lineaDeFacturaPK the primary key of the linea de factura
	 * @return <code>true</code> if the linea de factura is associated with the factura; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsLineaDeFactura(long pk, long lineaDeFacturaPK)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, lineaDeFacturaPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_LINEADEFACTURA,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsLineaDeFactura.contains(pk,
							lineaDeFacturaPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_LINEADEFACTURA,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Determines if the factura has any linea de facturas associated with it.
	 *
	 * @param pk the primary key of the factura to check for associations with linea de facturas
	 * @return <code>true</code> if the factura has any linea de facturas associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsLineaDeFacturas(long pk) throws SystemException {
		if (getLineaDeFacturasSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Initializes the factura persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.es.emergya.negocio.model.Factura")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Factura>> listenersList = new ArrayList<ModelListener<Factura>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Factura>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		containsLineaDeFactura = new ContainsLineaDeFactura(this);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(FacturaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = FacturaPersistence.class)
	protected FacturaPersistence facturaPersistence;
	@BeanReference(type = LineaDeFacturaPersistence.class)
	protected LineaDeFacturaPersistence lineaDeFacturaPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	protected ContainsLineaDeFactura containsLineaDeFactura;

	protected class ContainsLineaDeFactura {
		protected ContainsLineaDeFactura(FacturaPersistenceImpl persistenceImpl) {
			super();

			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSLINEADEFACTURA,
					new int[] { java.sql.Types.BIGINT, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(long facturaId, long lineaDeacturaId) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						new Long(facturaId), new Long(lineaDeacturaId)
					});

			if (results.size() > 0) {
				Integer count = results.get(0);

				if (count.intValue() > 0) {
					return true;
				}
			}

			return false;
		}

		private MappingSqlQuery<Integer> _mappingSqlQuery;
	}

	private static final String _SQL_SELECT_FACTURA = "SELECT factura FROM Factura factura";
	private static final String _SQL_SELECT_FACTURA_WHERE = "SELECT factura FROM Factura factura WHERE ";
	private static final String _SQL_COUNT_FACTURA = "SELECT COUNT(factura) FROM Factura factura";
	private static final String _SQL_COUNT_FACTURA_WHERE = "SELECT COUNT(factura) FROM Factura factura WHERE ";
	private static final String _SQL_GETLINEADEFACTURAS = "SELECT {lineaDeFactura.*} FROM lineaDeFactura INNER JOIN factura ON (factura.facturaId = lineaDeFactura.facturaId) WHERE (factura.facturaId = ?)";
	private static final String _SQL_GETLINEADEFACTURASSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM lineaDeFactura WHERE facturaId = ?";
	private static final String _SQL_CONTAINSLINEADEFACTURA = "SELECT COUNT(*) AS COUNT_VALUE FROM lineaDeFactura WHERE facturaId = ? AND lineaDeacturaId = ?";
	private static final String _FINDER_COLUMN_NOMBRECLIENTE_NOMBRECLIENTE_1 = "factura.nombreCliente IS NULL";
	private static final String _FINDER_COLUMN_NOMBRECLIENTE_NOMBRECLIENTE_2 = "factura.nombreCliente = ?";
	private static final String _FINDER_COLUMN_NOMBRECLIENTE_NOMBRECLIENTE_3 = "(factura.nombreCliente IS NULL OR factura.nombreCliente = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "factura.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Factura exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Factura exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(FacturaPersistenceImpl.class);
}