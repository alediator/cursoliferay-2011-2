package es.emergya.negocio.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import es.emergya.negocio.model.LineaDeFactura;

/**
 * The persistence interface for the linea de factura service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link LineaDeFacturaUtil} to access the linea de factura persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adiaz
 * @see LineaDeFacturaPersistenceImpl
 * @see LineaDeFacturaUtil
 * @generated
 */
public interface LineaDeFacturaPersistence extends BasePersistence<LineaDeFactura> {
    /**
    * Caches the linea de factura in the entity cache if it is enabled.
    *
    * @param lineaDeFactura the linea de factura to cache
    */
    public void cacheResult(
        es.emergya.negocio.model.LineaDeFactura lineaDeFactura);

    /**
    * Caches the linea de facturas in the entity cache if it is enabled.
    *
    * @param lineaDeFacturas the linea de facturas to cache
    */
    public void cacheResult(
        java.util.List<es.emergya.negocio.model.LineaDeFactura> lineaDeFacturas);

    /**
    * Creates a new linea de factura with the primary key. Does not add the linea de factura to the database.
    *
    * @param lineaDeacturaId the primary key for the new linea de factura
    * @return the new linea de factura
    */
    public es.emergya.negocio.model.LineaDeFactura create(long lineaDeacturaId);

    /**
    * Removes the linea de factura with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param lineaDeacturaId the primary key of the linea de factura to remove
    * @return the linea de factura that was removed
    * @throws es.emergya.negocio.NoSuchLineaDeFacturaException if a linea de factura with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.emergya.negocio.model.LineaDeFactura remove(long lineaDeacturaId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.emergya.negocio.NoSuchLineaDeFacturaException;

    public es.emergya.negocio.model.LineaDeFactura updateImpl(
        es.emergya.negocio.model.LineaDeFactura lineaDeFactura, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Finds the linea de factura with the primary key or throws a {@link es.emergya.negocio.NoSuchLineaDeFacturaException} if it could not be found.
    *
    * @param lineaDeacturaId the primary key of the linea de factura to find
    * @return the linea de factura
    * @throws es.emergya.negocio.NoSuchLineaDeFacturaException if a linea de factura with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.emergya.negocio.model.LineaDeFactura findByPrimaryKey(
        long lineaDeacturaId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.emergya.negocio.NoSuchLineaDeFacturaException;

    /**
    * Finds the linea de factura with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param lineaDeacturaId the primary key of the linea de factura to find
    * @return the linea de factura, or <code>null</code> if a linea de factura with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.emergya.negocio.model.LineaDeFactura fetchByPrimaryKey(
        long lineaDeacturaId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Finds all the linea de facturas.
    *
    * @return the linea de facturas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.emergya.negocio.model.LineaDeFactura> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.emergya.negocio.model.LineaDeFactura> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.emergya.negocio.model.LineaDeFactura> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the linea de facturas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Counts all the linea de facturas.
    *
    * @return the number of linea de facturas
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
