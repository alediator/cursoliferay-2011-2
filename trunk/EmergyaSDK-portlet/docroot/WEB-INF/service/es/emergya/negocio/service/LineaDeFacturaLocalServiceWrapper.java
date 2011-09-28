package es.emergya.negocio.service;

/**
 * <p>
 * This class is a wrapper for {@link LineaDeFacturaLocalService}.
 * </p>
 *
 * @author    adiaz
 * @see       LineaDeFacturaLocalService
 * @generated
 */
public class LineaDeFacturaLocalServiceWrapper
    implements LineaDeFacturaLocalService {
    private LineaDeFacturaLocalService _lineaDeFacturaLocalService;

    public LineaDeFacturaLocalServiceWrapper(
        LineaDeFacturaLocalService lineaDeFacturaLocalService) {
        _lineaDeFacturaLocalService = lineaDeFacturaLocalService;
    }

    /**
    * Adds the linea de factura to the database. Also notifies the appropriate model listeners.
    *
    * @param lineaDeFactura the linea de factura to add
    * @return the linea de factura that was added
    * @throws SystemException if a system exception occurred
    */
    public es.emergya.negocio.model.LineaDeFactura addLineaDeFactura(
        es.emergya.negocio.model.LineaDeFactura lineaDeFactura)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lineaDeFacturaLocalService.addLineaDeFactura(lineaDeFactura);
    }

    /**
    * Creates a new linea de factura with the primary key. Does not add the linea de factura to the database.
    *
    * @param lineaDeacturaId the primary key for the new linea de factura
    * @return the new linea de factura
    */
    public es.emergya.negocio.model.LineaDeFactura createLineaDeFactura(
        long lineaDeacturaId) {
        return _lineaDeFacturaLocalService.createLineaDeFactura(lineaDeacturaId);
    }

    /**
    * Deletes the linea de factura with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param lineaDeacturaId the primary key of the linea de factura to delete
    * @throws PortalException if a linea de factura with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public void deleteLineaDeFactura(long lineaDeacturaId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _lineaDeFacturaLocalService.deleteLineaDeFactura(lineaDeacturaId);
    }

    /**
    * Deletes the linea de factura from the database. Also notifies the appropriate model listeners.
    *
    * @param lineaDeFactura the linea de factura to delete
    * @throws SystemException if a system exception occurred
    */
    public void deleteLineaDeFactura(
        es.emergya.negocio.model.LineaDeFactura lineaDeFactura)
        throws com.liferay.portal.kernel.exception.SystemException {
        _lineaDeFacturaLocalService.deleteLineaDeFactura(lineaDeFactura);
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query to search with
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lineaDeFacturaLocalService.dynamicQuery(dynamicQuery);
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
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _lineaDeFacturaLocalService.dynamicQuery(dynamicQuery, start, end);
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
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lineaDeFacturaLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
    * Counts the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query to search with
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lineaDeFacturaLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Gets the linea de factura with the primary key.
    *
    * @param lineaDeacturaId the primary key of the linea de factura to get
    * @return the linea de factura
    * @throws PortalException if a linea de factura with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.emergya.negocio.model.LineaDeFactura getLineaDeFactura(
        long lineaDeacturaId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lineaDeFacturaLocalService.getLineaDeFactura(lineaDeacturaId);
    }

    /**
    * Gets a range of all the linea de facturas.
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
    public java.util.List<es.emergya.negocio.model.LineaDeFactura> getLineaDeFacturas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lineaDeFacturaLocalService.getLineaDeFacturas(start, end);
    }

    /**
    * Gets the number of linea de facturas.
    *
    * @return the number of linea de facturas
    * @throws SystemException if a system exception occurred
    */
    public int getLineaDeFacturasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lineaDeFacturaLocalService.getLineaDeFacturasCount();
    }

    /**
    * Updates the linea de factura in the database. Also notifies the appropriate model listeners.
    *
    * @param lineaDeFactura the linea de factura to update
    * @return the linea de factura that was updated
    * @throws SystemException if a system exception occurred
    */
    public es.emergya.negocio.model.LineaDeFactura updateLineaDeFactura(
        es.emergya.negocio.model.LineaDeFactura lineaDeFactura)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lineaDeFacturaLocalService.updateLineaDeFactura(lineaDeFactura);
    }

    /**
    * Updates the linea de factura in the database. Also notifies the appropriate model listeners.
    *
    * @param lineaDeFactura the linea de factura to update
    * @param merge whether to merge the linea de factura with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the linea de factura that was updated
    * @throws SystemException if a system exception occurred
    */
    public es.emergya.negocio.model.LineaDeFactura updateLineaDeFactura(
        es.emergya.negocio.model.LineaDeFactura lineaDeFactura, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lineaDeFacturaLocalService.updateLineaDeFactura(lineaDeFactura,
            merge);
    }

    public LineaDeFacturaLocalService getWrappedLineaDeFacturaLocalService() {
        return _lineaDeFacturaLocalService;
    }
}
