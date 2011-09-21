package es.emergya.negocio.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
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

import es.emergya.negocio.NoSuchInformeException;
import es.emergya.negocio.model.Informe;
import es.emergya.negocio.model.impl.InformeImpl;
import es.emergya.negocio.model.impl.InformeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the informe service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link InformeUtil} to access the informe persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adiaz
 * @see InformePersistence
 * @see InformeUtil
 * @generated
 */
public class InformePersistenceImpl extends BasePersistenceImpl<Informe>
    implements InformePersistence {
    public static final String FINDER_CLASS_NAME_ENTITY = InformeImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
        ".List";
    public static final FinderPath FINDER_PATH_FIND_BY_TITULO = new FinderPath(InformeModelImpl.ENTITY_CACHE_ENABLED,
            InformeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
            "findByTitulo",
            new String[] {
                String.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_COUNT_BY_TITULO = new FinderPath(InformeModelImpl.ENTITY_CACHE_ENABLED,
            InformeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
            "countByTitulo", new String[] { String.class.getName() });
    public static final FinderPath FINDER_PATH_FIND_BY_U = new FinderPath(InformeModelImpl.ENTITY_CACHE_ENABLED,
            InformeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
            "findByU",
            new String[] {
                Long.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_COUNT_BY_U = new FinderPath(InformeModelImpl.ENTITY_CACHE_ENABLED,
            InformeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
            "countByU", new String[] { Long.class.getName() });
    public static final FinderPath FINDER_PATH_FIND_BY_G = new FinderPath(InformeModelImpl.ENTITY_CACHE_ENABLED,
            InformeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
            "findByG",
            new String[] {
                Long.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_COUNT_BY_G = new FinderPath(InformeModelImpl.ENTITY_CACHE_ENABLED,
            InformeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
            "countByG", new String[] { Long.class.getName() });
    public static final FinderPath FINDER_PATH_FIND_BY_C = new FinderPath(InformeModelImpl.ENTITY_CACHE_ENABLED,
            InformeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
            "findByC",
            new String[] {
                Long.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_COUNT_BY_C = new FinderPath(InformeModelImpl.ENTITY_CACHE_ENABLED,
            InformeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
            "countByC", new String[] { Long.class.getName() });
    public static final FinderPath FINDER_PATH_FIND_BY_U_C = new FinderPath(InformeModelImpl.ENTITY_CACHE_ENABLED,
            InformeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
            "findByU_C",
            new String[] {
                Long.class.getName(), Long.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_COUNT_BY_U_C = new FinderPath(InformeModelImpl.ENTITY_CACHE_ENABLED,
            InformeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
            "countByU_C",
            new String[] { Long.class.getName(), Long.class.getName() });
    public static final FinderPath FINDER_PATH_FIND_BY_U_G = new FinderPath(InformeModelImpl.ENTITY_CACHE_ENABLED,
            InformeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
            "findByU_G",
            new String[] {
                Long.class.getName(), Long.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_COUNT_BY_U_G = new FinderPath(InformeModelImpl.ENTITY_CACHE_ENABLED,
            InformeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
            "countByU_G",
            new String[] { Long.class.getName(), Long.class.getName() });
    public static final FinderPath FINDER_PATH_FIND_BY_U_C_G = new FinderPath(InformeModelImpl.ENTITY_CACHE_ENABLED,
            InformeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
            "findByU_C_G",
            new String[] {
                Long.class.getName(), Long.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_COUNT_BY_U_C_G = new FinderPath(InformeModelImpl.ENTITY_CACHE_ENABLED,
            InformeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
            "countByU_C_G",
            new String[] { Long.class.getName(), Long.class.getName() });
    public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(InformeModelImpl.ENTITY_CACHE_ENABLED,
            InformeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(InformeModelImpl.ENTITY_CACHE_ENABLED,
            InformeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
            "countAll", new String[0]);
    private static final String _SQL_SELECT_INFORME = "SELECT informe FROM Informe informe";
    private static final String _SQL_SELECT_INFORME_WHERE = "SELECT informe FROM Informe informe WHERE ";
    private static final String _SQL_COUNT_INFORME = "SELECT COUNT(informe) FROM Informe informe";
    private static final String _SQL_COUNT_INFORME_WHERE = "SELECT COUNT(informe) FROM Informe informe WHERE ";
    private static final String _FINDER_COLUMN_TITULO_TITULO_1 = "informe.titulo IS NULL";
    private static final String _FINDER_COLUMN_TITULO_TITULO_2 = "informe.titulo = ?";
    private static final String _FINDER_COLUMN_TITULO_TITULO_3 = "(informe.titulo IS NULL OR informe.titulo = ?)";
    private static final String _FINDER_COLUMN_U_USERID_2 = "informe.userId = ?";
    private static final String _FINDER_COLUMN_G_GROUPID_2 = "informe.groupId = ?";
    private static final String _FINDER_COLUMN_C_COMPANYID_2 = "informe.companyId = ?";
    private static final String _FINDER_COLUMN_U_C_USERID_2 = "informe.userId = ? AND ";
    private static final String _FINDER_COLUMN_U_C_COMPANYID_2 = "informe.companyId = ?";
    private static final String _FINDER_COLUMN_U_G_USERID_2 = "informe.userId = ? AND ";
    private static final String _FINDER_COLUMN_U_G_GROUPID_2 = "informe.groupId = ?";
    private static final String _FINDER_COLUMN_U_C_G_USERID_2 = "informe.userId = ? AND ";
    private static final String _FINDER_COLUMN_U_C_G_GROUPID_2 = "informe.groupId = ?";
    private static final String _ORDER_BY_ENTITY_ALIAS = "informe.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Informe exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Informe exists with the key {";
    private static Log _log = LogFactoryUtil.getLog(InformePersistenceImpl.class);
    @BeanReference(type = InformePersistence.class)
    protected InformePersistence informePersistence;
    @BeanReference(type = ResourcePersistence.class)
    protected ResourcePersistence resourcePersistence;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;

    /**
     * Caches the informe in the entity cache if it is enabled.
     *
     * @param informe the informe to cache
     */
    public void cacheResult(Informe informe) {
        EntityCacheUtil.putResult(InformeModelImpl.ENTITY_CACHE_ENABLED,
            InformeImpl.class, informe.getPrimaryKey(), informe);
    }

    /**
     * Caches the informes in the entity cache if it is enabled.
     *
     * @param informes the informes to cache
     */
    public void cacheResult(List<Informe> informes) {
        for (Informe informe : informes) {
            if (EntityCacheUtil.getResult(
                        InformeModelImpl.ENTITY_CACHE_ENABLED,
                        InformeImpl.class, informe.getPrimaryKey(), this) == null) {
                cacheResult(informe);
            }
        }
    }

    /**
     * Clears the cache for all informes.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    public void clearCache() {
        CacheRegistryUtil.clear(InformeImpl.class.getName());
        EntityCacheUtil.clearCache(InformeImpl.class.getName());
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
    }

    /**
     * Clears the cache for the informe.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    public void clearCache(Informe informe) {
        EntityCacheUtil.removeResult(InformeModelImpl.ENTITY_CACHE_ENABLED,
            InformeImpl.class, informe.getPrimaryKey());
    }

    /**
     * Creates a new informe with the primary key. Does not add the informe to the database.
     *
     * @param informeId the primary key for the new informe
     * @return the new informe
     */
    public Informe create(long informeId) {
        Informe informe = new InformeImpl();

        informe.setNew(true);
        informe.setPrimaryKey(informeId);

        return informe;
    }

    /**
     * Removes the informe with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the informe to remove
     * @return the informe that was removed
     * @throws com.liferay.portal.NoSuchModelException if a informe with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public Informe remove(Serializable primaryKey)
        throws NoSuchModelException, SystemException {
        return remove(((Long) primaryKey).longValue());
    }

    /**
     * Removes the informe with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param informeId the primary key of the informe to remove
     * @return the informe that was removed
     * @throws es.emergya.negocio.NoSuchInformeException if a informe with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public Informe remove(long informeId)
        throws NoSuchInformeException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Informe informe = (Informe) session.get(InformeImpl.class,
                    new Long(informeId));

            if (informe == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + informeId);
                }

                throw new NoSuchInformeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    informeId);
            }

            return remove(informe);
        } catch (NoSuchInformeException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Informe removeImpl(Informe informe) throws SystemException {
        informe = toUnwrappedModel(informe);

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.delete(session, informe);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

        EntityCacheUtil.removeResult(InformeModelImpl.ENTITY_CACHE_ENABLED,
            InformeImpl.class, informe.getPrimaryKey());

        return informe;
    }

    public Informe updateImpl(es.emergya.negocio.model.Informe informe,
        boolean merge) throws SystemException {
        informe = toUnwrappedModel(informe);

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.update(session, informe, merge);

            informe.setNew(false);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

        EntityCacheUtil.putResult(InformeModelImpl.ENTITY_CACHE_ENABLED,
            InformeImpl.class, informe.getPrimaryKey(), informe);

        return informe;
    }

    protected Informe toUnwrappedModel(Informe informe) {
        if (informe instanceof InformeImpl) {
            return informe;
        }

        InformeImpl informeImpl = new InformeImpl();

        informeImpl.setNew(informe.isNew());
        informeImpl.setPrimaryKey(informe.getPrimaryKey());

        informeImpl.setInformeId(informe.getInformeId());
        informeImpl.setCompanyId(informe.getCompanyId());
        informeImpl.setUserId(informe.getUserId());
        informeImpl.setGroupId(informe.getGroupId());
        informeImpl.setTitulo(informe.getTitulo());
        informeImpl.setDescripcion(informe.getDescripcion());
        informeImpl.setContenido(informe.getContenido());
        informeImpl.setFechaCreacion(informe.getFechaCreacion());

        return informeImpl;
    }

    /**
     * Finds the informe with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the informe to find
     * @return the informe
     * @throws com.liferay.portal.NoSuchModelException if a informe with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public Informe findByPrimaryKey(Serializable primaryKey)
        throws NoSuchModelException, SystemException {
        return findByPrimaryKey(((Long) primaryKey).longValue());
    }

    /**
     * Finds the informe with the primary key or throws a {@link es.emergya.negocio.NoSuchInformeException} if it could not be found.
     *
     * @param informeId the primary key of the informe to find
     * @return the informe
     * @throws es.emergya.negocio.NoSuchInformeException if a informe with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public Informe findByPrimaryKey(long informeId)
        throws NoSuchInformeException, SystemException {
        Informe informe = fetchByPrimaryKey(informeId);

        if (informe == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + informeId);
            }

            throw new NoSuchInformeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                informeId);
        }

        return informe;
    }

    /**
     * Finds the informe with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the informe to find
     * @return the informe, or <code>null</code> if a informe with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public Informe fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        return fetchByPrimaryKey(((Long) primaryKey).longValue());
    }

    /**
     * Finds the informe with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param informeId the primary key of the informe to find
     * @return the informe, or <code>null</code> if a informe with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public Informe fetchByPrimaryKey(long informeId) throws SystemException {
        Informe informe = (Informe) EntityCacheUtil.getResult(InformeModelImpl.ENTITY_CACHE_ENABLED,
                InformeImpl.class, informeId, this);

        if (informe == null) {
            Session session = null;

            try {
                session = openSession();

                informe = (Informe) session.get(InformeImpl.class,
                        new Long(informeId));
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (informe != null) {
                    cacheResult(informe);
                }

                closeSession(session);
            }
        }

        return informe;
    }

    /**
     * Finds all the informes where titulo = &#63;.
     *
     * @param titulo the titulo to search with
     * @return the matching informes
     * @throws SystemException if a system exception occurred
     */
    public List<Informe> findByTitulo(String titulo) throws SystemException {
        return findByTitulo(titulo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    public List<Informe> findByTitulo(String titulo, int start, int end)
        throws SystemException {
        return findByTitulo(titulo, start, end, null);
    }

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
    public List<Informe> findByTitulo(String titulo, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        Object[] finderArgs = new Object[] {
                titulo,
                
                String.valueOf(start), String.valueOf(end),
                String.valueOf(orderByComparator)
            };

        List<Informe> list = (List<Informe>) FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_TITULO,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_INFORME_WHERE);

            if (titulo == null) {
                query.append(_FINDER_COLUMN_TITULO_TITULO_1);
            } else {
                if (titulo.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_TITULO_TITULO_3);
                } else {
                    query.append(_FINDER_COLUMN_TITULO_TITULO_2);
                }
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(InformeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (titulo != null) {
                    qPos.add(titulo);
                }

                list = (List<Informe>) QueryUtil.list(q, getDialect(), start,
                        end);
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_TITULO,
                        finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_TITULO,
                        finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
    }

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
    public Informe findByTitulo_First(String titulo,
        OrderByComparator orderByComparator)
        throws NoSuchInformeException, SystemException {
        List<Informe> list = findByTitulo(titulo, 0, 1, orderByComparator);

        if (list.isEmpty()) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("titulo=");
            msg.append(titulo);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            throw new NoSuchInformeException(msg.toString());
        } else {
            return list.get(0);
        }
    }

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
    public Informe findByTitulo_Last(String titulo,
        OrderByComparator orderByComparator)
        throws NoSuchInformeException, SystemException {
        int count = countByTitulo(titulo);

        List<Informe> list = findByTitulo(titulo, count - 1, count,
                orderByComparator);

        if (list.isEmpty()) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("titulo=");
            msg.append(titulo);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            throw new NoSuchInformeException(msg.toString());
        } else {
            return list.get(0);
        }
    }

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
    public Informe[] findByTitulo_PrevAndNext(long informeId, String titulo,
        OrderByComparator orderByComparator)
        throws NoSuchInformeException, SystemException {
        Informe informe = findByPrimaryKey(informeId);

        Session session = null;

        try {
            session = openSession();

            Informe[] array = new InformeImpl[3];

            array[0] = getByTitulo_PrevAndNext(session, informe, titulo,
                    orderByComparator, true);

            array[1] = informe;

            array[2] = getByTitulo_PrevAndNext(session, informe, titulo,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Informe getByTitulo_PrevAndNext(Session session, Informe informe,
        String titulo, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_INFORME_WHERE);

        if (titulo == null) {
            query.append(_FINDER_COLUMN_TITULO_TITULO_1);
        } else {
            if (titulo.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_TITULO_TITULO_3);
            } else {
                query.append(_FINDER_COLUMN_TITULO_TITULO_2);
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
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
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
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        }
        else {
            query.append(InformeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (titulo != null) {
            qPos.add(titulo);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByValues(informe);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Informe> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Finds all the informes where userId = &#63;.
     *
     * @param userId the user id to search with
     * @return the matching informes
     * @throws SystemException if a system exception occurred
     */
    public List<Informe> findByU(long userId) throws SystemException {
        return findByU(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    public List<Informe> findByU(long userId, int start, int end)
        throws SystemException {
        return findByU(userId, start, end, null);
    }

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
    public List<Informe> findByU(long userId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        Object[] finderArgs = new Object[] {
                userId,
                
                String.valueOf(start), String.valueOf(end),
                String.valueOf(orderByComparator)
            };

        List<Informe> list = (List<Informe>) FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_U,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_INFORME_WHERE);

            query.append(_FINDER_COLUMN_U_USERID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(InformeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(userId);

                list = (List<Informe>) QueryUtil.list(q, getDialect(), start,
                        end);
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_U,
                        finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_U,
                        finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
    }

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
    public Informe findByU_First(long userId,
        OrderByComparator orderByComparator)
        throws NoSuchInformeException, SystemException {
        List<Informe> list = findByU(userId, 0, 1, orderByComparator);

        if (list.isEmpty()) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("userId=");
            msg.append(userId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            throw new NoSuchInformeException(msg.toString());
        } else {
            return list.get(0);
        }
    }

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
    public Informe findByU_Last(long userId, OrderByComparator orderByComparator)
        throws NoSuchInformeException, SystemException {
        int count = countByU(userId);

        List<Informe> list = findByU(userId, count - 1, count, orderByComparator);

        if (list.isEmpty()) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("userId=");
            msg.append(userId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            throw new NoSuchInformeException(msg.toString());
        } else {
            return list.get(0);
        }
    }

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
    public Informe[] findByU_PrevAndNext(long informeId, long userId,
        OrderByComparator orderByComparator)
        throws NoSuchInformeException, SystemException {
        Informe informe = findByPrimaryKey(informeId);

        Session session = null;

        try {
            session = openSession();

            Informe[] array = new InformeImpl[3];

            array[0] = getByU_PrevAndNext(session, informe, userId,
                    orderByComparator, true);

            array[1] = informe;

            array[2] = getByU_PrevAndNext(session, informe, userId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Informe getByU_PrevAndNext(Session session, Informe informe,
        long userId, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_INFORME_WHERE);

        query.append(_FINDER_COLUMN_U_USERID_2);

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
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
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
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        }
        else {
            query.append(InformeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(userId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByValues(informe);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Informe> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Finds all the informes where groupId = &#63;.
     *
     * @param groupId the group id to search with
     * @return the matching informes
     * @throws SystemException if a system exception occurred
     */
    public List<Informe> findByG(long groupId) throws SystemException {
        return findByG(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    public List<Informe> findByG(long groupId, int start, int end)
        throws SystemException {
        return findByG(groupId, start, end, null);
    }

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
    public List<Informe> findByG(long groupId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        Object[] finderArgs = new Object[] {
                groupId,
                
                String.valueOf(start), String.valueOf(end),
                String.valueOf(orderByComparator)
            };

        List<Informe> list = (List<Informe>) FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_INFORME_WHERE);

            query.append(_FINDER_COLUMN_G_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(InformeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                list = (List<Informe>) QueryUtil.list(q, getDialect(), start,
                        end);
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G,
                        finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G,
                        finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
    }

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
    public Informe findByG_First(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchInformeException, SystemException {
        List<Informe> list = findByG(groupId, 0, 1, orderByComparator);

        if (list.isEmpty()) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("groupId=");
            msg.append(groupId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            throw new NoSuchInformeException(msg.toString());
        } else {
            return list.get(0);
        }
    }

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
    public Informe findByG_Last(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchInformeException, SystemException {
        int count = countByG(groupId);

        List<Informe> list = findByG(groupId, count - 1, count,
                orderByComparator);

        if (list.isEmpty()) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("groupId=");
            msg.append(groupId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            throw new NoSuchInformeException(msg.toString());
        } else {
            return list.get(0);
        }
    }

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
    public Informe[] findByG_PrevAndNext(long informeId, long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchInformeException, SystemException {
        Informe informe = findByPrimaryKey(informeId);

        Session session = null;

        try {
            session = openSession();

            Informe[] array = new InformeImpl[3];

            array[0] = getByG_PrevAndNext(session, informe, groupId,
                    orderByComparator, true);

            array[1] = informe;

            array[2] = getByG_PrevAndNext(session, informe, groupId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Informe getByG_PrevAndNext(Session session, Informe informe,
        long groupId, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_INFORME_WHERE);

        query.append(_FINDER_COLUMN_G_GROUPID_2);

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
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
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
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        }
        else {
            query.append(InformeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByValues(informe);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Informe> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Finds all the informes where companyId = &#63;.
     *
     * @param companyId the company id to search with
     * @return the matching informes
     * @throws SystemException if a system exception occurred
     */
    public List<Informe> findByC(long companyId) throws SystemException {
        return findByC(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    public List<Informe> findByC(long companyId, int start, int end)
        throws SystemException {
        return findByC(companyId, start, end, null);
    }

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
    public List<Informe> findByC(long companyId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        Object[] finderArgs = new Object[] {
                companyId,
                
                String.valueOf(start), String.valueOf(end),
                String.valueOf(orderByComparator)
            };

        List<Informe> list = (List<Informe>) FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_C,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_INFORME_WHERE);

            query.append(_FINDER_COLUMN_C_COMPANYID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(InformeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(companyId);

                list = (List<Informe>) QueryUtil.list(q, getDialect(), start,
                        end);
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_C,
                        finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_C,
                        finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
    }

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
    public Informe findByC_First(long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchInformeException, SystemException {
        List<Informe> list = findByC(companyId, 0, 1, orderByComparator);

        if (list.isEmpty()) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("companyId=");
            msg.append(companyId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            throw new NoSuchInformeException(msg.toString());
        } else {
            return list.get(0);
        }
    }

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
    public Informe findByC_Last(long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchInformeException, SystemException {
        int count = countByC(companyId);

        List<Informe> list = findByC(companyId, count - 1, count,
                orderByComparator);

        if (list.isEmpty()) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("companyId=");
            msg.append(companyId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            throw new NoSuchInformeException(msg.toString());
        } else {
            return list.get(0);
        }
    }

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
    public Informe[] findByC_PrevAndNext(long informeId, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchInformeException, SystemException {
        Informe informe = findByPrimaryKey(informeId);

        Session session = null;

        try {
            session = openSession();

            Informe[] array = new InformeImpl[3];

            array[0] = getByC_PrevAndNext(session, informe, companyId,
                    orderByComparator, true);

            array[1] = informe;

            array[2] = getByC_PrevAndNext(session, informe, companyId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Informe getByC_PrevAndNext(Session session, Informe informe,
        long companyId, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_INFORME_WHERE);

        query.append(_FINDER_COLUMN_C_COMPANYID_2);

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
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
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
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        }
        else {
            query.append(InformeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(companyId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByValues(informe);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Informe> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Finds all the informes where userId = &#63; and companyId = &#63;.
     *
     * @param userId the user id to search with
     * @param companyId the company id to search with
     * @return the matching informes
     * @throws SystemException if a system exception occurred
     */
    public List<Informe> findByU_C(long userId, long companyId)
        throws SystemException {
        return findByU_C(userId, companyId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

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
    public List<Informe> findByU_C(long userId, long companyId, int start,
        int end) throws SystemException {
        return findByU_C(userId, companyId, start, end, null);
    }

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
    public List<Informe> findByU_C(long userId, long companyId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        Object[] finderArgs = new Object[] {
                userId, companyId,
                
                String.valueOf(start), String.valueOf(end),
                String.valueOf(orderByComparator)
            };

        List<Informe> list = (List<Informe>) FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_U_C,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_INFORME_WHERE);

            query.append(_FINDER_COLUMN_U_C_USERID_2);

            query.append(_FINDER_COLUMN_U_C_COMPANYID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(InformeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(userId);

                qPos.add(companyId);

                list = (List<Informe>) QueryUtil.list(q, getDialect(), start,
                        end);
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_U_C,
                        finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_U_C,
                        finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
    }

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
    public Informe findByU_C_First(long userId, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchInformeException, SystemException {
        List<Informe> list = findByU_C(userId, companyId, 0, 1,
                orderByComparator);

        if (list.isEmpty()) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("userId=");
            msg.append(userId);

            msg.append(", companyId=");
            msg.append(companyId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            throw new NoSuchInformeException(msg.toString());
        } else {
            return list.get(0);
        }
    }

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
    public Informe findByU_C_Last(long userId, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchInformeException, SystemException {
        int count = countByU_C(userId, companyId);

        List<Informe> list = findByU_C(userId, companyId, count - 1, count,
                orderByComparator);

        if (list.isEmpty()) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("userId=");
            msg.append(userId);

            msg.append(", companyId=");
            msg.append(companyId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            throw new NoSuchInformeException(msg.toString());
        } else {
            return list.get(0);
        }
    }

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
    public Informe[] findByU_C_PrevAndNext(long informeId, long userId,
        long companyId, OrderByComparator orderByComparator)
        throws NoSuchInformeException, SystemException {
        Informe informe = findByPrimaryKey(informeId);

        Session session = null;

        try {
            session = openSession();

            Informe[] array = new InformeImpl[3];

            array[0] = getByU_C_PrevAndNext(session, informe, userId,
                    companyId, orderByComparator, true);

            array[1] = informe;

            array[2] = getByU_C_PrevAndNext(session, informe, userId,
                    companyId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Informe getByU_C_PrevAndNext(Session session, Informe informe,
        long userId, long companyId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_INFORME_WHERE);

        query.append(_FINDER_COLUMN_U_C_USERID_2);

        query.append(_FINDER_COLUMN_U_C_COMPANYID_2);

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
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
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
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        }
        else {
            query.append(InformeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(userId);

        qPos.add(companyId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByValues(informe);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Informe> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Finds all the informes where userId = &#63; and groupId = &#63;.
     *
     * @param userId the user id to search with
     * @param groupId the group id to search with
     * @return the matching informes
     * @throws SystemException if a system exception occurred
     */
    public List<Informe> findByU_G(long userId, long groupId)
        throws SystemException {
        return findByU_G(userId, groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

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
    public List<Informe> findByU_G(long userId, long groupId, int start, int end)
        throws SystemException {
        return findByU_G(userId, groupId, start, end, null);
    }

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
    public List<Informe> findByU_G(long userId, long groupId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        Object[] finderArgs = new Object[] {
                userId, groupId,
                
                String.valueOf(start), String.valueOf(end),
                String.valueOf(orderByComparator)
            };

        List<Informe> list = (List<Informe>) FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_U_G,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_INFORME_WHERE);

            query.append(_FINDER_COLUMN_U_G_USERID_2);

            query.append(_FINDER_COLUMN_U_G_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(InformeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(userId);

                qPos.add(groupId);

                list = (List<Informe>) QueryUtil.list(q, getDialect(), start,
                        end);
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_U_G,
                        finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_U_G,
                        finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
    }

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
    public Informe findByU_G_First(long userId, long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchInformeException, SystemException {
        List<Informe> list = findByU_G(userId, groupId, 0, 1, orderByComparator);

        if (list.isEmpty()) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("userId=");
            msg.append(userId);

            msg.append(", groupId=");
            msg.append(groupId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            throw new NoSuchInformeException(msg.toString());
        } else {
            return list.get(0);
        }
    }

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
    public Informe findByU_G_Last(long userId, long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchInformeException, SystemException {
        int count = countByU_G(userId, groupId);

        List<Informe> list = findByU_G(userId, groupId, count - 1, count,
                orderByComparator);

        if (list.isEmpty()) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("userId=");
            msg.append(userId);

            msg.append(", groupId=");
            msg.append(groupId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            throw new NoSuchInformeException(msg.toString());
        } else {
            return list.get(0);
        }
    }

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
    public Informe[] findByU_G_PrevAndNext(long informeId, long userId,
        long groupId, OrderByComparator orderByComparator)
        throws NoSuchInformeException, SystemException {
        Informe informe = findByPrimaryKey(informeId);

        Session session = null;

        try {
            session = openSession();

            Informe[] array = new InformeImpl[3];

            array[0] = getByU_G_PrevAndNext(session, informe, userId, groupId,
                    orderByComparator, true);

            array[1] = informe;

            array[2] = getByU_G_PrevAndNext(session, informe, userId, groupId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Informe getByU_G_PrevAndNext(Session session, Informe informe,
        long userId, long groupId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_INFORME_WHERE);

        query.append(_FINDER_COLUMN_U_G_USERID_2);

        query.append(_FINDER_COLUMN_U_G_GROUPID_2);

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
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
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
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        }
        else {
            query.append(InformeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(userId);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByValues(informe);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Informe> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Finds all the informes where userId = &#63; and groupId = &#63;.
     *
     * @param userId the user id to search with
     * @param groupId the group id to search with
     * @return the matching informes
     * @throws SystemException if a system exception occurred
     */
    public List<Informe> findByU_C_G(long userId, long groupId)
        throws SystemException {
        return findByU_C_G(userId, groupId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

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
    public List<Informe> findByU_C_G(long userId, long groupId, int start,
        int end) throws SystemException {
        return findByU_C_G(userId, groupId, start, end, null);
    }

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
    public List<Informe> findByU_C_G(long userId, long groupId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        Object[] finderArgs = new Object[] {
                userId, groupId,
                
                String.valueOf(start), String.valueOf(end),
                String.valueOf(orderByComparator)
            };

        List<Informe> list = (List<Informe>) FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_U_C_G,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_INFORME_WHERE);

            query.append(_FINDER_COLUMN_U_C_G_USERID_2);

            query.append(_FINDER_COLUMN_U_C_G_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(InformeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(userId);

                qPos.add(groupId);

                list = (List<Informe>) QueryUtil.list(q, getDialect(), start,
                        end);
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_U_C_G,
                        finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_U_C_G,
                        finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
    }

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
    public Informe findByU_C_G_First(long userId, long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchInformeException, SystemException {
        List<Informe> list = findByU_C_G(userId, groupId, 0, 1,
                orderByComparator);

        if (list.isEmpty()) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("userId=");
            msg.append(userId);

            msg.append(", groupId=");
            msg.append(groupId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            throw new NoSuchInformeException(msg.toString());
        } else {
            return list.get(0);
        }
    }

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
    public Informe findByU_C_G_Last(long userId, long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchInformeException, SystemException {
        int count = countByU_C_G(userId, groupId);

        List<Informe> list = findByU_C_G(userId, groupId, count - 1, count,
                orderByComparator);

        if (list.isEmpty()) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("userId=");
            msg.append(userId);

            msg.append(", groupId=");
            msg.append(groupId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            throw new NoSuchInformeException(msg.toString());
        } else {
            return list.get(0);
        }
    }

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
    public Informe[] findByU_C_G_PrevAndNext(long informeId, long userId,
        long groupId, OrderByComparator orderByComparator)
        throws NoSuchInformeException, SystemException {
        Informe informe = findByPrimaryKey(informeId);

        Session session = null;

        try {
            session = openSession();

            Informe[] array = new InformeImpl[3];

            array[0] = getByU_C_G_PrevAndNext(session, informe, userId,
                    groupId, orderByComparator, true);

            array[1] = informe;

            array[2] = getByU_C_G_PrevAndNext(session, informe, userId,
                    groupId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Informe getByU_C_G_PrevAndNext(Session session, Informe informe,
        long userId, long groupId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_INFORME_WHERE);

        query.append(_FINDER_COLUMN_U_C_G_USERID_2);

        query.append(_FINDER_COLUMN_U_C_G_GROUPID_2);

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
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
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
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        }
        else {
            query.append(InformeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(userId);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByValues(informe);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Informe> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Finds all the informes.
     *
     * @return the informes
     * @throws SystemException if a system exception occurred
     */
    public List<Informe> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    public List<Informe> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

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
    public List<Informe> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        Object[] finderArgs = new Object[] {
                String.valueOf(start), String.valueOf(end),
                String.valueOf(orderByComparator)
            };

        List<Informe> list = (List<Informe>) FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_INFORME);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_INFORME.concat(InformeModelImpl.ORDER_BY_JPQL);
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (orderByComparator == null) {
                    list = (List<Informe>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);
                } else {
                    list = (List<Informe>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Removes all the informes where titulo = &#63; from the database.
     *
     * @param titulo the titulo to search with
     * @throws SystemException if a system exception occurred
     */
    public void removeByTitulo(String titulo) throws SystemException {
        for (Informe informe : findByTitulo(titulo)) {
            remove(informe);
        }
    }

    /**
     * Removes all the informes where userId = &#63; from the database.
     *
     * @param userId the user id to search with
     * @throws SystemException if a system exception occurred
     */
    public void removeByU(long userId) throws SystemException {
        for (Informe informe : findByU(userId)) {
            remove(informe);
        }
    }

    /**
     * Removes all the informes where groupId = &#63; from the database.
     *
     * @param groupId the group id to search with
     * @throws SystemException if a system exception occurred
     */
    public void removeByG(long groupId) throws SystemException {
        for (Informe informe : findByG(groupId)) {
            remove(informe);
        }
    }

    /**
     * Removes all the informes where companyId = &#63; from the database.
     *
     * @param companyId the company id to search with
     * @throws SystemException if a system exception occurred
     */
    public void removeByC(long companyId) throws SystemException {
        for (Informe informe : findByC(companyId)) {
            remove(informe);
        }
    }

    /**
     * Removes all the informes where userId = &#63; and companyId = &#63; from the database.
     *
     * @param userId the user id to search with
     * @param companyId the company id to search with
     * @throws SystemException if a system exception occurred
     */
    public void removeByU_C(long userId, long companyId)
        throws SystemException {
        for (Informe informe : findByU_C(userId, companyId)) {
            remove(informe);
        }
    }

    /**
     * Removes all the informes where userId = &#63; and groupId = &#63; from the database.
     *
     * @param userId the user id to search with
     * @param groupId the group id to search with
     * @throws SystemException if a system exception occurred
     */
    public void removeByU_G(long userId, long groupId)
        throws SystemException {
        for (Informe informe : findByU_G(userId, groupId)) {
            remove(informe);
        }
    }

    /**
     * Removes all the informes where userId = &#63; and groupId = &#63; from the database.
     *
     * @param userId the user id to search with
     * @param groupId the group id to search with
     * @throws SystemException if a system exception occurred
     */
    public void removeByU_C_G(long userId, long groupId)
        throws SystemException {
        for (Informe informe : findByU_C_G(userId, groupId)) {
            remove(informe);
        }
    }

    /**
     * Removes all the informes from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    public void removeAll() throws SystemException {
        for (Informe informe : findAll()) {
            remove(informe);
        }
    }

    /**
     * Counts all the informes where titulo = &#63;.
     *
     * @param titulo the titulo to search with
     * @return the number of matching informes
     * @throws SystemException if a system exception occurred
     */
    public int countByTitulo(String titulo) throws SystemException {
        Object[] finderArgs = new Object[] { titulo };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_TITULO,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_INFORME_WHERE);

            if (titulo == null) {
                query.append(_FINDER_COLUMN_TITULO_TITULO_1);
            } else {
                if (titulo.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_TITULO_TITULO_3);
                } else {
                    query.append(_FINDER_COLUMN_TITULO_TITULO_2);
                }
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (titulo != null) {
                    qPos.add(titulo);
                }

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TITULO,
                    finderArgs, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Counts all the informes where userId = &#63;.
     *
     * @param userId the user id to search with
     * @return the number of matching informes
     * @throws SystemException if a system exception occurred
     */
    public int countByU(long userId) throws SystemException {
        Object[] finderArgs = new Object[] { userId };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_U,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_INFORME_WHERE);

            query.append(_FINDER_COLUMN_U_USERID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(userId);

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_U, finderArgs,
                    count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Counts all the informes where groupId = &#63;.
     *
     * @param groupId the group id to search with
     * @return the number of matching informes
     * @throws SystemException if a system exception occurred
     */
    public int countByG(long groupId) throws SystemException {
        Object[] finderArgs = new Object[] { groupId };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_INFORME_WHERE);

            query.append(_FINDER_COLUMN_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G, finderArgs,
                    count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Counts all the informes where companyId = &#63;.
     *
     * @param companyId the company id to search with
     * @return the number of matching informes
     * @throws SystemException if a system exception occurred
     */
    public int countByC(long companyId) throws SystemException {
        Object[] finderArgs = new Object[] { companyId };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_C,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_INFORME_WHERE);

            query.append(_FINDER_COLUMN_C_COMPANYID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(companyId);

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C, finderArgs,
                    count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Counts all the informes where userId = &#63; and companyId = &#63;.
     *
     * @param userId the user id to search with
     * @param companyId the company id to search with
     * @return the number of matching informes
     * @throws SystemException if a system exception occurred
     */
    public int countByU_C(long userId, long companyId)
        throws SystemException {
        Object[] finderArgs = new Object[] { userId, companyId };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_U_C,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_INFORME_WHERE);

            query.append(_FINDER_COLUMN_U_C_USERID_2);

            query.append(_FINDER_COLUMN_U_C_COMPANYID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(userId);

                qPos.add(companyId);

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_U_C, finderArgs,
                    count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Counts all the informes where userId = &#63; and groupId = &#63;.
     *
     * @param userId the user id to search with
     * @param groupId the group id to search with
     * @return the number of matching informes
     * @throws SystemException if a system exception occurred
     */
    public int countByU_G(long userId, long groupId) throws SystemException {
        Object[] finderArgs = new Object[] { userId, groupId };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_U_G,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_INFORME_WHERE);

            query.append(_FINDER_COLUMN_U_G_USERID_2);

            query.append(_FINDER_COLUMN_U_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(userId);

                qPos.add(groupId);

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_U_G, finderArgs,
                    count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Counts all the informes where userId = &#63; and groupId = &#63;.
     *
     * @param userId the user id to search with
     * @param groupId the group id to search with
     * @return the number of matching informes
     * @throws SystemException if a system exception occurred
     */
    public int countByU_C_G(long userId, long groupId)
        throws SystemException {
        Object[] finderArgs = new Object[] { userId, groupId };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_U_C_G,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_INFORME_WHERE);

            query.append(_FINDER_COLUMN_U_C_G_USERID_2);

            query.append(_FINDER_COLUMN_U_C_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(userId);

                qPos.add(groupId);

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_U_C_G,
                    finderArgs, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Counts all the informes.
     *
     * @return the number of informes
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

                Query q = session.createQuery(_SQL_COUNT_INFORME);

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
     * Initializes the informe persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.es.emergya.negocio.model.Informe")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Informe>> listenersList = new ArrayList<ModelListener<Informe>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Informe>) InstanceFactory.newInstance(
                            listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(InformeImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
    }
}
