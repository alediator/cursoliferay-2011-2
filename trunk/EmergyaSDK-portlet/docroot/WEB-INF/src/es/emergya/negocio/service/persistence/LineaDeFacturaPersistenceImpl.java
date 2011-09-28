package es.emergya.negocio.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import es.emergya.negocio.NoSuchLineaDeFacturaException;
import es.emergya.negocio.model.LineaDeFactura;
import es.emergya.negocio.model.impl.LineaDeFacturaImpl;
import es.emergya.negocio.model.impl.LineaDeFacturaModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the linea de factura service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link LineaDeFacturaUtil} to access the linea de factura persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adiaz
 * @see LineaDeFacturaPersistence
 * @see LineaDeFacturaUtil
 * @generated
 */
public class LineaDeFacturaPersistenceImpl extends BasePersistenceImpl<LineaDeFactura>
    implements LineaDeFacturaPersistence {
    public static final String FINDER_CLASS_NAME_ENTITY = LineaDeFacturaImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
        ".List";
    public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(LineaDeFacturaModelImpl.ENTITY_CACHE_ENABLED,
            LineaDeFacturaModelImpl.FINDER_CACHE_ENABLED,
            FINDER_CLASS_NAME_LIST, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LineaDeFacturaModelImpl.ENTITY_CACHE_ENABLED,
            LineaDeFacturaModelImpl.FINDER_CACHE_ENABLED,
            FINDER_CLASS_NAME_LIST, "countAll", new String[0]);
    private static final String _SQL_SELECT_LINEADEFACTURA = "SELECT lineaDeFactura FROM LineaDeFactura lineaDeFactura";
    private static final String _SQL_COUNT_LINEADEFACTURA = "SELECT COUNT(lineaDeFactura) FROM LineaDeFactura lineaDeFactura";
    private static final String _ORDER_BY_ENTITY_ALIAS = "lineaDeFactura.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LineaDeFactura exists with the primary key ";
    private static Log _log = LogFactoryUtil.getLog(LineaDeFacturaPersistenceImpl.class);
    @BeanReference(type = FacturaPersistence.class)
    protected FacturaPersistence facturaPersistence;
    @BeanReference(type = LineaDeFacturaPersistence.class)
    protected LineaDeFacturaPersistence lineaDeFacturaPersistence;
    @BeanReference(type = ResourcePersistence.class)
    protected ResourcePersistence resourcePersistence;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;

    /**
     * Caches the linea de factura in the entity cache if it is enabled.
     *
     * @param lineaDeFactura the linea de factura to cache
     */
    public void cacheResult(LineaDeFactura lineaDeFactura) {
        EntityCacheUtil.putResult(LineaDeFacturaModelImpl.ENTITY_CACHE_ENABLED,
            LineaDeFacturaImpl.class, lineaDeFactura.getPrimaryKey(),
            lineaDeFactura);
    }

    /**
     * Caches the linea de facturas in the entity cache if it is enabled.
     *
     * @param lineaDeFacturas the linea de facturas to cache
     */
    public void cacheResult(List<LineaDeFactura> lineaDeFacturas) {
        for (LineaDeFactura lineaDeFactura : lineaDeFacturas) {
            if (EntityCacheUtil.getResult(
                        LineaDeFacturaModelImpl.ENTITY_CACHE_ENABLED,
                        LineaDeFacturaImpl.class,
                        lineaDeFactura.getPrimaryKey(), this) == null) {
                cacheResult(lineaDeFactura);
            }
        }
    }

    /**
     * Clears the cache for all linea de facturas.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    public void clearCache() {
        CacheRegistryUtil.clear(LineaDeFacturaImpl.class.getName());
        EntityCacheUtil.clearCache(LineaDeFacturaImpl.class.getName());
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
    }

    /**
     * Clears the cache for the linea de factura.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    public void clearCache(LineaDeFactura lineaDeFactura) {
        EntityCacheUtil.removeResult(LineaDeFacturaModelImpl.ENTITY_CACHE_ENABLED,
            LineaDeFacturaImpl.class, lineaDeFactura.getPrimaryKey());
    }

    /**
     * Creates a new linea de factura with the primary key. Does not add the linea de factura to the database.
     *
     * @param lineaDeacturaId the primary key for the new linea de factura
     * @return the new linea de factura
     */
    public LineaDeFactura create(long lineaDeacturaId) {
        LineaDeFactura lineaDeFactura = new LineaDeFacturaImpl();

        lineaDeFactura.setNew(true);
        lineaDeFactura.setPrimaryKey(lineaDeacturaId);

        return lineaDeFactura;
    }

    /**
     * Removes the linea de factura with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the linea de factura to remove
     * @return the linea de factura that was removed
     * @throws com.liferay.portal.NoSuchModelException if a linea de factura with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public LineaDeFactura remove(Serializable primaryKey)
        throws NoSuchModelException, SystemException {
        return remove(((Long) primaryKey).longValue());
    }

    /**
     * Removes the linea de factura with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param lineaDeacturaId the primary key of the linea de factura to remove
     * @return the linea de factura that was removed
     * @throws es.emergya.negocio.NoSuchLineaDeFacturaException if a linea de factura with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public LineaDeFactura remove(long lineaDeacturaId)
        throws NoSuchLineaDeFacturaException, SystemException {
        Session session = null;

        try {
            session = openSession();

            LineaDeFactura lineaDeFactura = (LineaDeFactura) session.get(LineaDeFacturaImpl.class,
                    new Long(lineaDeacturaId));

            if (lineaDeFactura == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                        lineaDeacturaId);
                }

                throw new NoSuchLineaDeFacturaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    lineaDeacturaId);
            }

            return remove(lineaDeFactura);
        } catch (NoSuchLineaDeFacturaException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected LineaDeFactura removeImpl(LineaDeFactura lineaDeFactura)
        throws SystemException {
        lineaDeFactura = toUnwrappedModel(lineaDeFactura);

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.delete(session, lineaDeFactura);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

        EntityCacheUtil.removeResult(LineaDeFacturaModelImpl.ENTITY_CACHE_ENABLED,
            LineaDeFacturaImpl.class, lineaDeFactura.getPrimaryKey());

        return lineaDeFactura;
    }

    public LineaDeFactura updateImpl(
        es.emergya.negocio.model.LineaDeFactura lineaDeFactura, boolean merge)
        throws SystemException {
        lineaDeFactura = toUnwrappedModel(lineaDeFactura);

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.update(session, lineaDeFactura, merge);

            lineaDeFactura.setNew(false);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

        EntityCacheUtil.putResult(LineaDeFacturaModelImpl.ENTITY_CACHE_ENABLED,
            LineaDeFacturaImpl.class, lineaDeFactura.getPrimaryKey(),
            lineaDeFactura);

        return lineaDeFactura;
    }

    protected LineaDeFactura toUnwrappedModel(LineaDeFactura lineaDeFactura) {
        if (lineaDeFactura instanceof LineaDeFacturaImpl) {
            return lineaDeFactura;
        }

        LineaDeFacturaImpl lineaDeFacturaImpl = new LineaDeFacturaImpl();

        lineaDeFacturaImpl.setNew(lineaDeFactura.isNew());
        lineaDeFacturaImpl.setPrimaryKey(lineaDeFactura.getPrimaryKey());

        lineaDeFacturaImpl.setLineaDeacturaId(lineaDeFactura.getLineaDeacturaId());
        lineaDeFacturaImpl.setDetalle(lineaDeFactura.getDetalle());
        lineaDeFacturaImpl.setImporte(lineaDeFactura.getImporte());
        lineaDeFacturaImpl.setFacturaId(lineaDeFactura.getFacturaId());

        return lineaDeFacturaImpl;
    }

    /**
     * Finds the linea de factura with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the linea de factura to find
     * @return the linea de factura
     * @throws com.liferay.portal.NoSuchModelException if a linea de factura with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public LineaDeFactura findByPrimaryKey(Serializable primaryKey)
        throws NoSuchModelException, SystemException {
        return findByPrimaryKey(((Long) primaryKey).longValue());
    }

    /**
     * Finds the linea de factura with the primary key or throws a {@link es.emergya.negocio.NoSuchLineaDeFacturaException} if it could not be found.
     *
     * @param lineaDeacturaId the primary key of the linea de factura to find
     * @return the linea de factura
     * @throws es.emergya.negocio.NoSuchLineaDeFacturaException if a linea de factura with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public LineaDeFactura findByPrimaryKey(long lineaDeacturaId)
        throws NoSuchLineaDeFacturaException, SystemException {
        LineaDeFactura lineaDeFactura = fetchByPrimaryKey(lineaDeacturaId);

        if (lineaDeFactura == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + lineaDeacturaId);
            }

            throw new NoSuchLineaDeFacturaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                lineaDeacturaId);
        }

        return lineaDeFactura;
    }

    /**
     * Finds the linea de factura with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the linea de factura to find
     * @return the linea de factura, or <code>null</code> if a linea de factura with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public LineaDeFactura fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        return fetchByPrimaryKey(((Long) primaryKey).longValue());
    }

    /**
     * Finds the linea de factura with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param lineaDeacturaId the primary key of the linea de factura to find
     * @return the linea de factura, or <code>null</code> if a linea de factura with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public LineaDeFactura fetchByPrimaryKey(long lineaDeacturaId)
        throws SystemException {
        LineaDeFactura lineaDeFactura = (LineaDeFactura) EntityCacheUtil.getResult(LineaDeFacturaModelImpl.ENTITY_CACHE_ENABLED,
                LineaDeFacturaImpl.class, lineaDeacturaId, this);

        if (lineaDeFactura == null) {
            Session session = null;

            try {
                session = openSession();

                lineaDeFactura = (LineaDeFactura) session.get(LineaDeFacturaImpl.class,
                        new Long(lineaDeacturaId));
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (lineaDeFactura != null) {
                    cacheResult(lineaDeFactura);
                }

                closeSession(session);
            }
        }

        return lineaDeFactura;
    }

    /**
     * Finds all the linea de facturas.
     *
     * @return the linea de facturas
     * @throws SystemException if a system exception occurred
     */
    public List<LineaDeFactura> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<LineaDeFactura> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    public List<LineaDeFactura> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        Object[] finderArgs = new Object[] {
                String.valueOf(start), String.valueOf(end),
                String.valueOf(orderByComparator)
            };

        List<LineaDeFactura> list = (List<LineaDeFactura>) FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_LINEADEFACTURA);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_LINEADEFACTURA;
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (orderByComparator == null) {
                    list = (List<LineaDeFactura>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);
                } else {
                    list = (List<LineaDeFactura>) QueryUtil.list(q,
                            getDialect(), start, end);
                }
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(FINDER_PATH_FIND_ALL,
                        finderArgs);
                } else {
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
     * Removes all the linea de facturas from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    public void removeAll() throws SystemException {
        for (LineaDeFactura lineaDeFactura : findAll()) {
            remove(lineaDeFactura);
        }
    }

    /**
     * Counts all the linea de facturas.
     *
     * @return the number of linea de facturas
     * @throws SystemException if a system exception occurred
     */
    public int countAll() throws SystemException {
        Object[] finderArgs = new Object[0];

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                finderArgs, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_LINEADEFACTURA);

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
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
     * Initializes the linea de factura persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.es.emergya.negocio.model.LineaDeFactura")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<LineaDeFactura>> listenersList = new ArrayList<ModelListener<LineaDeFactura>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<LineaDeFactura>) InstanceFactory.newInstance(
                            listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(LineaDeFacturaImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
    }
}
