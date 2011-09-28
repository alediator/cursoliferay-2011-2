package es.emergya.negocio.service;

import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;


public class LineaDeFacturaLocalServiceClp implements LineaDeFacturaLocalService {
    private ClassLoaderProxy _classLoaderProxy;
    private MethodKey _addLineaDeFacturaMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
            "addLineaDeFactura", es.emergya.negocio.model.LineaDeFactura.class);
    private MethodKey _createLineaDeFacturaMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
            "createLineaDeFactura", long.class);
    private MethodKey _deleteLineaDeFacturaMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
            "deleteLineaDeFactura", long.class);
    private MethodKey _deleteLineaDeFacturaMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
            "deleteLineaDeFactura",
            es.emergya.negocio.model.LineaDeFactura.class);
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
    private MethodKey _getLineaDeFacturaMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
            "getLineaDeFactura", long.class);
    private MethodKey _getLineaDeFacturasMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
            "getLineaDeFacturas", int.class, int.class);
    private MethodKey _getLineaDeFacturasCountMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
            "getLineaDeFacturasCount");
    private MethodKey _updateLineaDeFacturaMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
            "updateLineaDeFactura",
            es.emergya.negocio.model.LineaDeFactura.class);
    private MethodKey _updateLineaDeFacturaMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
            "updateLineaDeFactura",
            es.emergya.negocio.model.LineaDeFactura.class, boolean.class);

    public LineaDeFacturaLocalServiceClp(ClassLoaderProxy classLoaderProxy) {
        _classLoaderProxy = classLoaderProxy;
    }

    public es.emergya.negocio.model.LineaDeFactura addLineaDeFactura(
        es.emergya.negocio.model.LineaDeFactura lineaDeFactura)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_addLineaDeFacturaMethodKey0,
                lineaDeFactura);

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

        return (es.emergya.negocio.model.LineaDeFactura) ClpSerializer.translateOutput(returnObj);
    }

    public es.emergya.negocio.model.LineaDeFactura createLineaDeFactura(
        long lineaDeacturaId) {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_createLineaDeFacturaMethodKey1,
                lineaDeacturaId);

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

        return (es.emergya.negocio.model.LineaDeFactura) ClpSerializer.translateOutput(returnObj);
    }

    public void deleteLineaDeFactura(long lineaDeacturaId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        MethodHandler methodHandler = new MethodHandler(_deleteLineaDeFacturaMethodKey2,
                lineaDeacturaId);

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

    public void deleteLineaDeFactura(
        es.emergya.negocio.model.LineaDeFactura lineaDeFactura)
        throws com.liferay.portal.kernel.exception.SystemException {
        MethodHandler methodHandler = new MethodHandler(_deleteLineaDeFacturaMethodKey3,
                lineaDeFactura);

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

    public es.emergya.negocio.model.LineaDeFactura getLineaDeFactura(
        long lineaDeacturaId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_getLineaDeFacturaMethodKey8,
                lineaDeacturaId);

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

        return (es.emergya.negocio.model.LineaDeFactura) ClpSerializer.translateOutput(returnObj);
    }

    public java.util.List<es.emergya.negocio.model.LineaDeFactura> getLineaDeFacturas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_getLineaDeFacturasMethodKey9,
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

        return (java.util.List<es.emergya.negocio.model.LineaDeFactura>) ClpSerializer.translateOutput(returnObj);
    }

    public int getLineaDeFacturasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_getLineaDeFacturasCountMethodKey10);

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

    public es.emergya.negocio.model.LineaDeFactura updateLineaDeFactura(
        es.emergya.negocio.model.LineaDeFactura lineaDeFactura)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_updateLineaDeFacturaMethodKey11,
                lineaDeFactura);

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

        return (es.emergya.negocio.model.LineaDeFactura) ClpSerializer.translateOutput(returnObj);
    }

    public es.emergya.negocio.model.LineaDeFactura updateLineaDeFactura(
        es.emergya.negocio.model.LineaDeFactura lineaDeFactura, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_updateLineaDeFacturaMethodKey12,
                lineaDeFactura, merge);

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

        return (es.emergya.negocio.model.LineaDeFactura) ClpSerializer.translateOutput(returnObj);
    }

    public ClassLoaderProxy getClassLoaderProxy() {
        return _classLoaderProxy;
    }
}
