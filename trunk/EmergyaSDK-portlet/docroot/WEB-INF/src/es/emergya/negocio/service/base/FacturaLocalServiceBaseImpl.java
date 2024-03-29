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

import es.emergya.negocio.model.Factura;
import es.emergya.negocio.service.FacturaLocalService;
import es.emergya.negocio.service.LineaDeFacturaLocalService;
import es.emergya.negocio.service.persistence.FacturaPersistence;
import es.emergya.negocio.service.persistence.LineaDeFacturaPersistence;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the factura local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link es.emergya.negocio.service.impl.FacturaLocalServiceImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link es.emergya.negocio.service.FacturaLocalServiceUtil} to access the factura local service.
 * </p>
 *
 * @author adiaz
 * @see es.emergya.negocio.service.impl.FacturaLocalServiceImpl
 * @see es.emergya.negocio.service.FacturaLocalServiceUtil
 * @generated
 */
public abstract class FacturaLocalServiceBaseImpl implements FacturaLocalService {
    @BeanReference(type = FacturaLocalService.class)
    protected FacturaLocalService facturaLocalService;
    @BeanReference(type = FacturaPersistence.class)
    protected FacturaPersistence facturaPersistence;
    @BeanReference(type = LineaDeFacturaLocalService.class)
    protected LineaDeFacturaLocalService lineaDeFacturaLocalService;
    @BeanReference(type = LineaDeFacturaPersistence.class)
    protected LineaDeFacturaPersistence lineaDeFacturaPersistence;
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
     * Adds the factura to the database. Also notifies the appropriate model listeners.
     *
     * @param factura the factura to add
     * @return the factura that was added
     * @throws SystemException if a system exception occurred
     */
    public Factura addFactura(Factura factura) throws SystemException {
        factura.setNew(true);

        return facturaPersistence.update(factura, false);
    }

    /**
     * Creates a new factura with the primary key. Does not add the factura to the database.
     *
     * @param facturaId the primary key for the new factura
     * @return the new factura
     */
    public Factura createFactura(long facturaId) {
        return facturaPersistence.create(facturaId);
    }

    /**
     * Deletes the factura with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param facturaId the primary key of the factura to delete
     * @throws PortalException if a factura with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public void deleteFactura(long facturaId)
        throws PortalException, SystemException {
        facturaPersistence.remove(facturaId);
    }

    /**
     * Deletes the factura from the database. Also notifies the appropriate model listeners.
     *
     * @param factura the factura to delete
     * @throws SystemException if a system exception occurred
     */
    public void deleteFactura(Factura factura) throws SystemException {
        facturaPersistence.remove(factura);
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
        return facturaPersistence.findWithDynamicQuery(dynamicQuery);
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
        return facturaPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
        return facturaPersistence.findWithDynamicQuery(dynamicQuery, start,
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
        return facturaPersistence.countWithDynamicQuery(dynamicQuery);
    }

    /**
     * Gets the factura with the primary key.
     *
     * @param facturaId the primary key of the factura to get
     * @return the factura
     * @throws PortalException if a factura with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public Factura getFactura(long facturaId)
        throws PortalException, SystemException {
        return facturaPersistence.findByPrimaryKey(facturaId);
    }

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
    public List<Factura> getFacturas(int start, int end)
        throws SystemException {
        return facturaPersistence.findAll(start, end);
    }

    /**
     * Gets the number of facturas.
     *
     * @return the number of facturas
     * @throws SystemException if a system exception occurred
     */
    public int getFacturasCount() throws SystemException {
        return facturaPersistence.countAll();
    }

    /**
     * Updates the factura in the database. Also notifies the appropriate model listeners.
     *
     * @param factura the factura to update
     * @return the factura that was updated
     * @throws SystemException if a system exception occurred
     */
    public Factura updateFactura(Factura factura) throws SystemException {
        factura.setNew(false);

        return facturaPersistence.update(factura, true);
    }

    /**
     * Updates the factura in the database. Also notifies the appropriate model listeners.
     *
     * @param factura the factura to update
     * @param merge whether to merge the factura with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
     * @return the factura that was updated
     * @throws SystemException if a system exception occurred
     */
    public Factura updateFactura(Factura factura, boolean merge)
        throws SystemException {
        factura.setNew(false);

        return facturaPersistence.update(factura, merge);
    }

    /**
     * Gets the factura local service.
     *
     * @return the factura local service
     */
    public FacturaLocalService getFacturaLocalService() {
        return facturaLocalService;
    }

    /**
     * Sets the factura local service.
     *
     * @param facturaLocalService the factura local service
     */
    public void setFacturaLocalService(FacturaLocalService facturaLocalService) {
        this.facturaLocalService = facturaLocalService;
    }

    /**
     * Gets the factura persistence.
     *
     * @return the factura persistence
     */
    public FacturaPersistence getFacturaPersistence() {
        return facturaPersistence;
    }

    /**
     * Sets the factura persistence.
     *
     * @param facturaPersistence the factura persistence
     */
    public void setFacturaPersistence(FacturaPersistence facturaPersistence) {
        this.facturaPersistence = facturaPersistence;
    }

    /**
     * Gets the linea de factura local service.
     *
     * @return the linea de factura local service
     */
    public LineaDeFacturaLocalService getLineaDeFacturaLocalService() {
        return lineaDeFacturaLocalService;
    }

    /**
     * Sets the linea de factura local service.
     *
     * @param lineaDeFacturaLocalService the linea de factura local service
     */
    public void setLineaDeFacturaLocalService(
        LineaDeFacturaLocalService lineaDeFacturaLocalService) {
        this.lineaDeFacturaLocalService = lineaDeFacturaLocalService;
    }

    /**
     * Gets the linea de factura persistence.
     *
     * @return the linea de factura persistence
     */
    public LineaDeFacturaPersistence getLineaDeFacturaPersistence() {
        return lineaDeFacturaPersistence;
    }

    /**
     * Sets the linea de factura persistence.
     *
     * @param lineaDeFacturaPersistence the linea de factura persistence
     */
    public void setLineaDeFacturaPersistence(
        LineaDeFacturaPersistence lineaDeFacturaPersistence) {
        this.lineaDeFacturaPersistence = lineaDeFacturaPersistence;
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
            DataSource dataSource = facturaPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
