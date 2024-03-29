package es.emergya.negocio.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import es.emergya.negocio.model.Factura;

import java.util.List;

/**
 * The persistence utility for the factura service. This utility wraps {@link FacturaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see FacturaPersistence
 * @see FacturaPersistenceImpl
 * @generated
 */
public class FacturaUtil {
    private static FacturaPersistence _persistence;

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Factura factura) {
        getPersistence().clearCache(factura);
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
    public static List<Factura> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Factura> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Factura> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
     */
    public static Factura remove(Factura factura) throws SystemException {
        return getPersistence().remove(factura);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
     */
    public static Factura update(Factura factura, boolean merge)
        throws SystemException {
        return getPersistence().update(factura, merge);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
     */
    public static Factura update(Factura factura, boolean merge,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(factura, merge, serviceContext);
    }

    /**
    * Caches the factura in the entity cache if it is enabled.
    *
    * @param factura the factura to cache
    */
    public static void cacheResult(es.emergya.negocio.model.Factura factura) {
        getPersistence().cacheResult(factura);
    }

    /**
    * Caches the facturas in the entity cache if it is enabled.
    *
    * @param facturas the facturas to cache
    */
    public static void cacheResult(
        java.util.List<es.emergya.negocio.model.Factura> facturas) {
        getPersistence().cacheResult(facturas);
    }

    /**
    * Creates a new factura with the primary key. Does not add the factura to the database.
    *
    * @param facturaId the primary key for the new factura
    * @return the new factura
    */
    public static es.emergya.negocio.model.Factura create(long facturaId) {
        return getPersistence().create(facturaId);
    }

    /**
    * Removes the factura with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param facturaId the primary key of the factura to remove
    * @return the factura that was removed
    * @throws es.emergya.negocio.NoSuchFacturaException if a factura with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.emergya.negocio.model.Factura remove(long facturaId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.emergya.negocio.NoSuchFacturaException {
        return getPersistence().remove(facturaId);
    }

    public static es.emergya.negocio.model.Factura updateImpl(
        es.emergya.negocio.model.Factura factura, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(factura, merge);
    }

    /**
    * Finds the factura with the primary key or throws a {@link es.emergya.negocio.NoSuchFacturaException} if it could not be found.
    *
    * @param facturaId the primary key of the factura to find
    * @return the factura
    * @throws es.emergya.negocio.NoSuchFacturaException if a factura with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.emergya.negocio.model.Factura findByPrimaryKey(
        long facturaId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.emergya.negocio.NoSuchFacturaException {
        return getPersistence().findByPrimaryKey(facturaId);
    }

    /**
    * Finds the factura with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param facturaId the primary key of the factura to find
    * @return the factura, or <code>null</code> if a factura with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.emergya.negocio.model.Factura fetchByPrimaryKey(
        long facturaId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(facturaId);
    }

    /**
    * Finds all the facturas where nombreCliente = &#63;.
    *
    * @param nombreCliente the nombre cliente to search with
    * @return the matching facturas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.emergya.negocio.model.Factura> findByNombreCliente(
        java.lang.String nombreCliente)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNombreCliente(nombreCliente);
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
    public static java.util.List<es.emergya.negocio.model.Factura> findByNombreCliente(
        java.lang.String nombreCliente, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNombreCliente(nombreCliente, start, end);
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
    public static java.util.List<es.emergya.negocio.model.Factura> findByNombreCliente(
        java.lang.String nombreCliente, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByNombreCliente(nombreCliente, start, end,
            orderByComparator);
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
    public static es.emergya.negocio.model.Factura findByNombreCliente_First(
        java.lang.String nombreCliente,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.emergya.negocio.NoSuchFacturaException {
        return getPersistence()
                   .findByNombreCliente_First(nombreCliente, orderByComparator);
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
    public static es.emergya.negocio.model.Factura findByNombreCliente_Last(
        java.lang.String nombreCliente,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.emergya.negocio.NoSuchFacturaException {
        return getPersistence()
                   .findByNombreCliente_Last(nombreCliente, orderByComparator);
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
    public static es.emergya.negocio.model.Factura[] findByNombreCliente_PrevAndNext(
        long facturaId, java.lang.String nombreCliente,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.emergya.negocio.NoSuchFacturaException {
        return getPersistence()
                   .findByNombreCliente_PrevAndNext(facturaId, nombreCliente,
            orderByComparator);
    }

    /**
    * Finds all the facturas.
    *
    * @return the facturas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.emergya.negocio.model.Factura> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<es.emergya.negocio.model.Factura> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
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
    public static java.util.List<es.emergya.negocio.model.Factura> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the facturas where nombreCliente = &#63; from the database.
    *
    * @param nombreCliente the nombre cliente to search with
    * @throws SystemException if a system exception occurred
    */
    public static void removeByNombreCliente(java.lang.String nombreCliente)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByNombreCliente(nombreCliente);
    }

    /**
    * Removes all the facturas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Counts all the facturas where nombreCliente = &#63;.
    *
    * @param nombreCliente the nombre cliente to search with
    * @return the number of matching facturas
    * @throws SystemException if a system exception occurred
    */
    public static int countByNombreCliente(java.lang.String nombreCliente)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByNombreCliente(nombreCliente);
    }

    /**
    * Counts all the facturas.
    *
    * @return the number of facturas
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    /**
    * Gets all the linea de facturas associated with the factura.
    *
    * @param pk the primary key of the factura to get the associated linea de facturas for
    * @return the linea de facturas associated with the factura
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.emergya.negocio.model.LineaDeFactura> getLineaDeFacturas(
        long pk) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getLineaDeFacturas(pk);
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
    public static java.util.List<es.emergya.negocio.model.LineaDeFactura> getLineaDeFacturas(
        long pk, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getLineaDeFacturas(pk, start, end);
    }

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
    public static java.util.List<es.emergya.negocio.model.LineaDeFactura> getLineaDeFacturas(
        long pk, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .getLineaDeFacturas(pk, start, end, orderByComparator);
    }

    /**
    * Gets the number of linea de facturas associated with the factura.
    *
    * @param pk the primary key of the factura to get the number of associated linea de facturas for
    * @return the number of linea de facturas associated with the factura
    * @throws SystemException if a system exception occurred
    */
    public static int getLineaDeFacturasSize(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getLineaDeFacturasSize(pk);
    }

    /**
    * Determines if the linea de factura is associated with the factura.
    *
    * @param pk the primary key of the factura
    * @param lineaDeFacturaPK the primary key of the linea de factura
    * @return <code>true</code> if the linea de factura is associated with the factura; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public static boolean containsLineaDeFactura(long pk, long lineaDeFacturaPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().containsLineaDeFactura(pk, lineaDeFacturaPK);
    }

    /**
    * Determines if the factura has any linea de facturas associated with it.
    *
    * @param pk the primary key of the factura to check for associations with linea de facturas
    * @return <code>true</code> if the factura has any linea de facturas associated with it; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public static boolean containsLineaDeFacturas(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().containsLineaDeFacturas(pk);
    }

    public static FacturaPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (FacturaPersistence) PortletBeanLocatorUtil.locate(es.emergya.negocio.service.ClpSerializer.SERVLET_CONTEXT_NAME,
                    FacturaPersistence.class.getName());
        }

        return _persistence;
    }

    public void setPersistence(FacturaPersistence persistence) {
        _persistence = persistence;
    }
}
