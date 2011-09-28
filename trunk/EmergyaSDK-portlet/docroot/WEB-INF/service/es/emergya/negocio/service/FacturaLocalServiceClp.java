package es.emergya.negocio.service;

import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;


public class FacturaLocalServiceClp implements FacturaLocalService {
    private ClassLoaderProxy _classLoaderProxy;
    private MethodKey _addFacturaMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
            "addFactura", es.emergya.negocio.model.Factura.class);
    private MethodKey _createFacturaMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
            "createFactura", long.class);
    private MethodKey _deleteFacturaMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
            "deleteFactura", long.class);
    private MethodKey _deleteFacturaMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
            "deleteFactura", es.emergya.negocio.model.Factura.class);
    private MethodKey _dynamicQueryMethodKey4 = new MethodKey(_classLoaderProxy.getClassName(),
            "dynamicQuery", com.liferay.portal.kernel.dao.orm.DynamicQuery.class);
    private MethodKey _dynamicQueryMethodKey5 = new MethodKey(_classLoaderProxy.getClassName(),
            "dynamicQuery",
            com.liferay.portal.kernel.dao.orm.DynamicQuery.class, int.class,
            int.class);
    private MethodKey _dynamicQueryMethodKey6 = new MethodKey(_classLoaderProxy.getClassName(),
            "dynamicQuery",
            com.liferay.portal.kernel.dao.orm.DynamicQuery.class, int.class,
            int.class, com.liferay.portal.kernel.util.OrderByComparator.class);
    private MethodKey _dynamicQueryCountMethodKey7 = new MethodKey(_classLoaderProxy.getClassName(),
            "dynamicQueryCount",
            com.liferay.portal.kernel.dao.orm.DynamicQuery.class);
    private MethodKey _getFacturaMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
            "getFactura", long.class);
    private MethodKey _getFacturasMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
            "getFacturas", int.class, int.class);
    private MethodKey _getFacturasCountMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
            "getFacturasCount");
    private MethodKey _updateFacturaMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
            "updateFactura", es.emergya.negocio.model.Factura.class);
    private MethodKey _updateFacturaMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
            "updateFactura", es.emergya.negocio.model.Factura.class,
            boolean.class);
    private MethodKey _createFacturaMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
            "createFactura", java.lang.String.class, double.class,
            java.lang.String.class);
    private MethodKey _findByNombreClienteMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
            "findByNombreCliente", java.lang.String.class);
    private MethodKey _searchMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
            "search", long.class, java.lang.String.class, int.class, int.class,
            com.liferay.portal.kernel.util.OrderByComparator.class);
    private MethodKey _searchCountMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
            "searchCount", long.class, java.lang.String.class, int.class,
            int.class, com.liferay.portal.kernel.util.OrderByComparator.class);
    private MethodKey _searchMethodKey17 = new MethodKey(_classLoaderProxy.getClassName(),
            "search", long.class, java.lang.String.class,
            java.lang.String.class, java.lang.Long.class, int.class, int.class,
            com.liferay.portal.kernel.util.OrderByComparator.class,
            boolean.class);
    private MethodKey _searchCountMethodKey18 = new MethodKey(_classLoaderProxy.getClassName(),
            "searchCount", long.class, java.lang.String.class,
            java.lang.String.class, java.lang.Long.class, int.class, int.class,
            com.liferay.portal.kernel.util.OrderByComparator.class,
            boolean.class);

    public FacturaLocalServiceClp(ClassLoaderProxy classLoaderProxy) {
        _classLoaderProxy = classLoaderProxy;
    }

    public es.emergya.negocio.model.Factura addFactura(
        es.emergya.negocio.model.Factura factura)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_addFacturaMethodKey0,
                factura);

        try {
            returnObj = _classLoaderProxy.invoke(methodHandler);
        } catch (Throwable t) {
            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (es.emergya.negocio.model.Factura) ClpSerializer.translateOutput(returnObj);
    }

    public es.emergya.negocio.model.Factura createFactura(long facturaId) {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_createFacturaMethodKey1,
                facturaId);

        try {
            returnObj = _classLoaderProxy.invoke(methodHandler);
        } catch (Throwable t) {
            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (es.emergya.negocio.model.Factura) ClpSerializer.translateOutput(returnObj);
    }

    public void deleteFactura(long facturaId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        MethodHandler methodHandler = new MethodHandler(_deleteFacturaMethodKey2,
                facturaId);

        try {
            _classLoaderProxy.invoke(methodHandler);
        } catch (Throwable t) {
            if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
                throw (com.liferay.portal.kernel.exception.PortalException) t;
            }

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }
    }

    public void deleteFactura(es.emergya.negocio.model.Factura factura)
        throws com.liferay.portal.kernel.exception.SystemException {
        MethodHandler methodHandler = new MethodHandler(_deleteFacturaMethodKey3,
                factura);

        try {
            _classLoaderProxy.invoke(methodHandler);
        } catch (Throwable t) {
            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }
    }

    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_dynamicQueryMethodKey4,
                dynamicQuery);

        try {
            returnObj = _classLoaderProxy.invoke(methodHandler);
        } catch (Throwable t) {
            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List) ClpSerializer.translateOutput(returnObj);
    }

    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_dynamicQueryMethodKey5,
                dynamicQuery, start, end);

        try {
            returnObj = _classLoaderProxy.invoke(methodHandler);
        } catch (Throwable t) {
            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List) ClpSerializer.translateOutput(returnObj);
    }

    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_dynamicQueryMethodKey6,
                dynamicQuery, start, end, orderByComparator);

        try {
            returnObj = _classLoaderProxy.invoke(methodHandler);
        } catch (Throwable t) {
            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List) ClpSerializer.translateOutput(returnObj);
    }

    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_dynamicQueryCountMethodKey7,
                dynamicQuery);

        try {
            returnObj = _classLoaderProxy.invoke(methodHandler);
        } catch (Throwable t) {
            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return ((Long) returnObj).longValue();
    }

    public es.emergya.negocio.model.Factura getFactura(long facturaId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_getFacturaMethodKey8,
                facturaId);

        try {
            returnObj = _classLoaderProxy.invoke(methodHandler);
        } catch (Throwable t) {
            if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
                throw (com.liferay.portal.kernel.exception.PortalException) t;
            }

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (es.emergya.negocio.model.Factura) ClpSerializer.translateOutput(returnObj);
    }

    public java.util.List<es.emergya.negocio.model.Factura> getFacturas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_getFacturasMethodKey9,
                start, end);

        try {
            returnObj = _classLoaderProxy.invoke(methodHandler);
        } catch (Throwable t) {
            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<es.emergya.negocio.model.Factura>) ClpSerializer.translateOutput(returnObj);
    }

    public int getFacturasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_getFacturasCountMethodKey10);

        try {
            returnObj = _classLoaderProxy.invoke(methodHandler);
        } catch (Throwable t) {
            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return ((Integer) returnObj).intValue();
    }

    public es.emergya.negocio.model.Factura updateFactura(
        es.emergya.negocio.model.Factura factura)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_updateFacturaMethodKey11,
                factura);

        try {
            returnObj = _classLoaderProxy.invoke(methodHandler);
        } catch (Throwable t) {
            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (es.emergya.negocio.model.Factura) ClpSerializer.translateOutput(returnObj);
    }

    public es.emergya.negocio.model.Factura updateFactura(
        es.emergya.negocio.model.Factura factura, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_updateFacturaMethodKey12,
                factura, merge);

        try {
            returnObj = _classLoaderProxy.invoke(methodHandler);
        } catch (Throwable t) {
            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (es.emergya.negocio.model.Factura) ClpSerializer.translateOutput(returnObj);
    }

    public es.emergya.negocio.model.Factura createFactura(
        java.lang.String nombreCliente, double importeTotal,
        java.lang.String descripcion)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_createFacturaMethodKey13,
                nombreCliente, importeTotal, descripcion);

        try {
            returnObj = _classLoaderProxy.invoke(methodHandler);
        } catch (Throwable t) {
            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (es.emergya.negocio.model.Factura) ClpSerializer.translateOutput(returnObj);
    }

    public java.util.List<es.emergya.negocio.model.Factura> findByNombreCliente(
        java.lang.String nombreCliente)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_findByNombreClienteMethodKey14,
                nombreCliente);

        try {
            returnObj = _classLoaderProxy.invoke(methodHandler);
        } catch (Throwable t) {
            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<es.emergya.negocio.model.Factura>) ClpSerializer.translateOutput(returnObj);
    }

    public java.util.List<es.emergya.negocio.model.Factura> search(
        long companyId, java.lang.String keywords, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator comparator) {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_searchMethodKey15,
                companyId, keywords, start, end, comparator);

        try {
            returnObj = _classLoaderProxy.invoke(methodHandler);
        } catch (Throwable t) {
            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<es.emergya.negocio.model.Factura>) ClpSerializer.translateOutput(returnObj);
    }

    public int searchCount(long companyId, java.lang.String keywords,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator comparator) {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_searchCountMethodKey16,
                companyId, keywords, start, end, comparator);

        try {
            returnObj = _classLoaderProxy.invoke(methodHandler);
        } catch (Throwable t) {
            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return ((Integer) returnObj).intValue();
    }

    public java.util.List<es.emergya.negocio.model.Factura> search(
        long companyId, java.lang.String descripcion,
        java.lang.String nombreCliente, java.lang.Long importeFactura,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator comparator, boolean and) {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_searchMethodKey17,
                companyId, descripcion, nombreCliente, importeFactura, start,
                end, comparator, and);

        try {
            returnObj = _classLoaderProxy.invoke(methodHandler);
        } catch (Throwable t) {
            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<es.emergya.negocio.model.Factura>) ClpSerializer.translateOutput(returnObj);
    }

    public int searchCount(long companyId, java.lang.String descripcion,
        java.lang.String nombreCliente, java.lang.Long importeFactura,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator comparator, boolean and) {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_searchCountMethodKey18,
                companyId, descripcion, nombreCliente, importeFactura, start,
                end, comparator, and);

        try {
            returnObj = _classLoaderProxy.invoke(methodHandler);
        } catch (Throwable t) {
            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return ((Integer) returnObj).intValue();
    }

    public ClassLoaderProxy getClassLoaderProxy() {
        return _classLoaderProxy;
    }
}
