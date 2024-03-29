package es.emergya.negocio.service;

import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;


public class InformeLocalServiceClp implements InformeLocalService {
    private ClassLoaderProxy _classLoaderProxy;
    private MethodKey _addInformeMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
            "addInforme", es.emergya.negocio.model.Informe.class);
    private MethodKey _createInformeMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
            "createInforme", long.class);
    private MethodKey _deleteInformeMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
            "deleteInforme", long.class);
    private MethodKey _deleteInformeMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
            "deleteInforme", es.emergya.negocio.model.Informe.class);
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
    private MethodKey _getInformeMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
            "getInforme", long.class);
    private MethodKey _getInformesMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
            "getInformes", int.class, int.class);
    private MethodKey _getInformesCountMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
            "getInformesCount");
    private MethodKey _updateInformeMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
            "updateInforme", es.emergya.negocio.model.Informe.class);
    private MethodKey _updateInformeMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
            "updateInforme", es.emergya.negocio.model.Informe.class,
            boolean.class);
    private MethodKey _createInformeMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
            "createInforme", java.lang.String.class, java.lang.String.class,
            java.lang.String.class, java.util.Date.class, java.lang.Long.class,
            java.lang.Long.class, java.lang.Long.class);
    private MethodKey _getInformeByTitulo_o_UserIdMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
            "getInformeByTitulo_o_UserId", java.lang.String.class,
            java.lang.Long.class);
    private MethodKey _getCountInformeByTitulo_o_UserIdMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
            "getCountInformeByTitulo_o_UserId", java.lang.String.class,
            java.lang.Long.class);
    private MethodKey _getInformeByTitulo_o_UserId_orderMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
            "getInformeByTitulo_o_UserId_order", java.lang.String.class,
            java.lang.Long.class);

    public InformeLocalServiceClp(ClassLoaderProxy classLoaderProxy) {
        _classLoaderProxy = classLoaderProxy;
    }

    public es.emergya.negocio.model.Informe addInforme(
        es.emergya.negocio.model.Informe informe)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_addInformeMethodKey0,
                informe);

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

        return (es.emergya.negocio.model.Informe) ClpSerializer.translateOutput(returnObj);
    }

    public es.emergya.negocio.model.Informe createInforme(long informeId) {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_createInformeMethodKey1,
                informeId);

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

        return (es.emergya.negocio.model.Informe) ClpSerializer.translateOutput(returnObj);
    }

    public void deleteInforme(long informeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        MethodHandler methodHandler = new MethodHandler(_deleteInformeMethodKey2,
                informeId);

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

    public void deleteInforme(es.emergya.negocio.model.Informe informe)
        throws com.liferay.portal.kernel.exception.SystemException {
        MethodHandler methodHandler = new MethodHandler(_deleteInformeMethodKey3,
                informe);

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

    public es.emergya.negocio.model.Informe getInforme(long informeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_getInformeMethodKey8,
                informeId);

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

        return (es.emergya.negocio.model.Informe) ClpSerializer.translateOutput(returnObj);
    }

    public java.util.List<es.emergya.negocio.model.Informe> getInformes(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_getInformesMethodKey9,
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

        return (java.util.List<es.emergya.negocio.model.Informe>) ClpSerializer.translateOutput(returnObj);
    }

    public int getInformesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_getInformesCountMethodKey10);

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

    public es.emergya.negocio.model.Informe updateInforme(
        es.emergya.negocio.model.Informe informe)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_updateInformeMethodKey11,
                informe);

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

        return (es.emergya.negocio.model.Informe) ClpSerializer.translateOutput(returnObj);
    }

    public es.emergya.negocio.model.Informe updateInforme(
        es.emergya.negocio.model.Informe informe, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_updateInformeMethodKey12,
                informe, merge);

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

        return (es.emergya.negocio.model.Informe) ClpSerializer.translateOutput(returnObj);
    }

    public es.emergya.negocio.model.Informe createInforme(
        java.lang.String titulo, java.lang.String contenido,
        java.lang.String descripcion, java.util.Date fechaCreacion,
        java.lang.Long userId, java.lang.Long companyId, java.lang.Long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_createInformeMethodKey13,
                titulo, contenido, descripcion, fechaCreacion, userId,
                companyId, groupId);

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

        return (es.emergya.negocio.model.Informe) ClpSerializer.translateOutput(returnObj);
    }

    public java.util.List<es.emergya.negocio.model.Informe> getInformeByTitulo_o_UserId(
        java.lang.String titulo, java.lang.Long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_getInformeByTitulo_o_UserIdMethodKey14,
                titulo, userId);

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

        return (java.util.List<es.emergya.negocio.model.Informe>) ClpSerializer.translateOutput(returnObj);
    }

    public int getCountInformeByTitulo_o_UserId(java.lang.String titulo,
        java.lang.Long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_getCountInformeByTitulo_o_UserIdMethodKey15,
                titulo, userId);

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

    public java.util.List<es.emergya.negocio.model.Informe> getInformeByTitulo_o_UserId_order(
        java.lang.String titulo, java.lang.Long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        MethodHandler methodHandler = new MethodHandler(_getInformeByTitulo_o_UserId_orderMethodKey16,
                titulo, userId);

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

        return (java.util.List<es.emergya.negocio.model.Informe>) ClpSerializer.translateOutput(returnObj);
    }

    public ClassLoaderProxy getClassLoaderProxy() {
        return _classLoaderProxy;
    }
}
