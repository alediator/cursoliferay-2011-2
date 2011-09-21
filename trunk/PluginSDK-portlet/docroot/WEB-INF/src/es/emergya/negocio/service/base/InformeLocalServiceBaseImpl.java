package es.emergya.negocio.service.base;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import es.emergya.negocio.model.Informe;
import es.emergya.negocio.service.InformeLocalService;
import es.emergya.negocio.service.persistence.InformePersistence;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the informe local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link es.emergya.negocio.service.impl.InformeLocalServiceImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link es.emergya.negocio.service.InformeLocalServiceUtil} to access the informe local service.
 * </p>
 *
 * @author adiaz
 * @see es.emergya.negocio.service.impl.InformeLocalServiceImpl
 * @see es.emergya.negocio.service.InformeLocalServiceUtil
 * @generated
 */
public abstract class InformeLocalServiceBaseImpl implements InformeLocalService {
    @BeanReference(type = InformeLocalService.class)
    protected InformeLocalService informeLocalService;
    @BeanReference(type = InformePersistence.class)
    protected InformePersistence informePersistence;
    @BeanReference(type = CounterLocalService.class)
    protected CounterLocalService counterLocalService;
    @BeanReference(type = ResourceLocalService.class)
    protected ResourceLocalService resourceLocalService;
    @BeanReference(type = ResourceService.class)
    protected ResourceService resourceService;
    @BeanReference(type = ResourcePersistence.class)
    protected ResourcePersistence resourcePersistence;
    @BeanReference(type = UserLocalService.class)
    protected UserLocalService userLocalService;
    @BeanReference(type = UserService.class)
    protected UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;

    /**
     * Adds the informe to the database. Also notifies the appropriate model listeners.
     *
     * @param informe the informe to add
     * @return the informe that was added
     * @throws SystemException if a system exception occurred
     */
    public Informe addInforme(Informe informe) throws SystemException {
        informe.setNew(true);

        return informePersistence.update(informe, false);
    }

    /**
     * Creates a new informe with the primary key. Does not add the informe to the database.
     *
     * @param informeId the primary key for the new informe
     * @return the new informe
     */
    public Informe createInforme(long informeId) {
        return informePersistence.create(informeId);
    }

    /**
     * Deletes the informe with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param informeId the primary key of the informe to delete
     * @throws PortalException if a informe with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public void deleteInforme(long informeId)
        throws PortalException, SystemException {
        informePersistence.remove(informeId);
    }

    /**
     * Deletes the informe from the database. Also notifies the appropriate model listeners.
     *
     * @param informe the informe to delete
     * @throws SystemException if a system exception occurred
     */
    public void deleteInforme(Informe informe) throws SystemException {
        informePersistence.remove(informe);
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query to search with
     * @return the matching rows
     * @throws SystemException if a system exception occurred
     */
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return informePersistence.findWithDynamicQuery(dynamicQuery);
    }

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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return informePersistence.findWithDynamicQuery(dynamicQuery, start, end);
    }

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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return informePersistence.findWithDynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
     * Counts the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query to search with
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return informePersistence.countWithDynamicQuery(dynamicQuery);
    }

    /**
     * Gets the informe with the primary key.
     *
     * @param informeId the primary key of the informe to get
     * @return the informe
     * @throws PortalException if a informe with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public Informe getInforme(long informeId)
        throws PortalException, SystemException {
        return informePersistence.findByPrimaryKey(informeId);
    }

    /**
     * Gets a range of all the informes.
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
    public List<Informe> getInformes(int start, int end)
        throws SystemException {
        return informePersistence.findAll(start, end);
    }

    /**
     * Gets the number of informes.
     *
     * @return the number of informes
     * @throws SystemException if a system exception occurred
     */
    public int getInformesCount() throws SystemException {
        return informePersistence.countAll();
    }

    /**
     * Updates the informe in the database. Also notifies the appropriate model listeners.
     *
     * @param informe the informe to update
     * @return the informe that was updated
     * @throws SystemException if a system exception occurred
     */
    public Informe updateInforme(Informe informe) throws SystemException {
        informe.setNew(false);

        return informePersistence.update(informe, true);
    }

    /**
     * Updates the informe in the database. Also notifies the appropriate model listeners.
     *
     * @param informe the informe to update
     * @param merge whether to merge the informe with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
     * @return the informe that was updated
     * @throws SystemException if a system exception occurred
     */
    public Informe updateInforme(Informe informe, boolean merge)
        throws SystemException {
        informe.setNew(false);

        return informePersistence.update(informe, merge);
    }

    /**
     * Gets the informe local service.
     *
     * @return the informe local service
     */
    public InformeLocalService getInformeLocalService() {
        return informeLocalService;
    }

    /**
     * Sets the informe local service.
     *
     * @param informeLocalService the informe local service
     */
    public void setInformeLocalService(InformeLocalService informeLocalService) {
        this.informeLocalService = informeLocalService;
    }

    /**
     * Gets the informe persistence.
     *
     * @return the informe persistence
     */
    public InformePersistence getInformePersistence() {
        return informePersistence;
    }

    /**
     * Sets the informe persistence.
     *
     * @param informePersistence the informe persistence
     */
    public void setInformePersistence(InformePersistence informePersistence) {
        this.informePersistence = informePersistence;
    }

    /**
     * Gets the counter local service.
     *
     * @return the counter local service
     */
    public CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Gets the resource local service.
     *
     * @return the resource local service
     */
    public ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Gets the resource remote service.
     *
     * @return the resource remote service
     */
    public ResourceService getResourceService() {
        return resourceService;
    }

    /**
     * Sets the resource remote service.
     *
     * @param resourceService the resource remote service
     */
    public void setResourceService(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    /**
     * Gets the resource persistence.
     *
     * @return the resource persistence
     */
    public ResourcePersistence getResourcePersistence() {
        return resourcePersistence;
    }

    /**
     * Sets the resource persistence.
     *
     * @param resourcePersistence the resource persistence
     */
    public void setResourcePersistence(ResourcePersistence resourcePersistence) {
        this.resourcePersistence = resourcePersistence;
    }

    /**
     * Gets the user local service.
     *
     * @return the user local service
     */
    public UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Gets the user remote service.
     *
     * @return the user remote service
     */
    public UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     * Gets the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query to perform
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = informePersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
