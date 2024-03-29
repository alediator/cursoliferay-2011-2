package es.emergya.negocio.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;

/**
 * The utility for the linea de factura local service. This utility wraps {@link es.emergya.negocio.service.impl.LineaDeFacturaLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link es.emergya.negocio.service.impl.LineaDeFacturaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adiaz
 * @see LineaDeFacturaLocalService
 * @see es.emergya.negocio.service.base.LineaDeFacturaLocalServiceBaseImpl
 * @see es.emergya.negocio.service.impl.LineaDeFacturaLocalServiceImpl
 * @generated
 */
public class LineaDeFacturaLocalServiceUtil {
    private static LineaDeFacturaLocalService _service;

    /**
    * Adds the linea de factura to the database. Also notifies the appropriate model listeners.
    *
    * @param lineaDeFactura the linea de factura to add
    * @return the linea de factura that was added
    * @throws SystemException if a system exception occurred
    */
    public static es.emergya.negocio.model.LineaDeFactura addLineaDeFactura(
        es.emergya.negocio.model.LineaDeFactura lineaDeFactura)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addLineaDeFactura(lineaDeFactura);
    }

    /**
    * Creates a new linea de factura with the primary key. Does not add the linea de factura to the database.
    *
    * @param lineaDeacturaId the primary key for the new linea de factura
    * @return the new linea de factura
    */
    public static es.emergya.negocio.model.LineaDeFactura createLineaDeFactura(
        long lineaDeacturaId) {
        return getService().createLineaDeFactura(lineaDeacturaId);
    }

    /**
    * Deletes the linea de factura with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param lineaDeacturaId the primary key of the linea de factura to delete
    * @throws PortalException if a linea de factura with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static void deleteLineaDeFactura(long lineaDeacturaId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().deleteLineaDeFactura(lineaDeacturaId);
    }

    /**
    * Deletes the linea de factura from the database. Also notifies the appropriate model listeners.
    *
    * @param lineaDeFactura the linea de factura to delete
    * @throws SystemException if a system exception occurred
    */
    public static void deleteLineaDeFactura(
        es.emergya.negocio.model.LineaDeFactura lineaDeFactura)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deleteLineaDeFactura(lineaDeFactura);
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query to search with
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Counts the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query to search with
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Gets the linea de factura with the primary key.
    *
    * @param lineaDeacturaId the primary key of the linea de factura to get
    * @return the linea de factura
    * @throws PortalException if a linea de factura with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.emergya.negocio.model.LineaDeFactura getLineaDeFactura(
        long lineaDeacturaId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getLineaDeFactura(lineaDeacturaId);
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
    public static java.util.List<es.emergya.negocio.model.LineaDeFactura> getLineaDeFacturas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLineaDeFacturas(start, end);
    }

    /**
    * Gets the number of linea de facturas.
    *
    * @return the number of linea de facturas
    * @throws SystemException if a system exception occurred
    */
    public static int getLineaDeFacturasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLineaDeFacturasCount();
    }

    /**
    * Updates the linea de factura in the database. Also notifies the appropriate model listeners.
    *
    * @param lineaDeFactura the linea de factura to update
    * @return the linea de factura that was updated
    * @throws SystemException if a system exception occurred
    */
    public static es.emergya.negocio.model.LineaDeFactura updateLineaDeFactura(
        es.emergya.negocio.model.LineaDeFactura lineaDeFactura)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateLineaDeFactura(lineaDeFactura);
    }

    /**
    * Updates the linea de factura in the database. Also notifies the appropriate model listeners.
    *
    * @param lineaDeFactura the linea de factura to update
    * @param merge whether to merge the linea de factura with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the linea de factura that was updated
    * @throws SystemException if a system exception occurred
    */
    public static es.emergya.negocio.model.LineaDeFactura updateLineaDeFactura(
        es.emergya.negocio.model.LineaDeFactura lineaDeFactura, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateLineaDeFactura(lineaDeFactura, merge);
    }

    public static void clearService() {
        _service = null;
    }

    public static LineaDeFacturaLocalService getService() {
        if (_service == null) {
            Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
                    LineaDeFacturaLocalService.class.getName());
            ClassLoader portletClassLoader = (ClassLoader) PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
                    "portletClassLoader");

            ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
                    portletClassLoader);

            _service = new LineaDeFacturaLocalServiceClp(classLoaderProxy);

            ClpSerializer.setClassLoader(portletClassLoader);
        }

        return _service;
    }

    public void setService(LineaDeFacturaLocalService service) {
        _service = service;
    }
}
