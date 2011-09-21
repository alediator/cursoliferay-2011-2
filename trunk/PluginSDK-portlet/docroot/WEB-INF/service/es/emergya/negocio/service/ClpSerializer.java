package es.emergya.negocio.service;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.BaseModel;

import es.emergya.negocio.model.InformeClp;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ClpSerializer {
    public static final String SERVLET_CONTEXT_NAME = "PluginSDK-portlet";
    private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
    private static ClassLoader _classLoader;

    public static void setClassLoader(ClassLoader classLoader) {
        _classLoader = classLoader;
    }

    public static Object translateInput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(InformeClp.class.getName())) {
            InformeClp oldCplModel = (InformeClp) oldModel;

            ClassLoader contextClassLoader = Thread.currentThread()
                                                   .getContextClassLoader();

            try {
                Thread.currentThread().setContextClassLoader(_classLoader);

                try {
                    Class<?> newModelClass = Class.forName("es.emergya.negocio.model.impl.InformeImpl",
                            true, _classLoader);

                    Object newModel = newModelClass.newInstance();

                    Method method0 = newModelClass.getMethod("setInformeId",
                            new Class[] { Long.TYPE });

                    Long value0 = new Long(oldCplModel.getInformeId());

                    method0.invoke(newModel, value0);

                    Method method1 = newModelClass.getMethod("setCompanyId",
                            new Class[] { Long.TYPE });

                    Long value1 = new Long(oldCplModel.getCompanyId());

                    method1.invoke(newModel, value1);

                    Method method2 = newModelClass.getMethod("setUserId",
                            new Class[] { Long.TYPE });

                    Long value2 = new Long(oldCplModel.getUserId());

                    method2.invoke(newModel, value2);

                    Method method3 = newModelClass.getMethod("setGroupId",
                            new Class[] { Long.TYPE });

                    Long value3 = new Long(oldCplModel.getGroupId());

                    method3.invoke(newModel, value3);

                    Method method4 = newModelClass.getMethod("setTitulo",
                            new Class[] { String.class });

                    String value4 = oldCplModel.getTitulo();

                    method4.invoke(newModel, value4);

                    Method method5 = newModelClass.getMethod("setDescripcion",
                            new Class[] { String.class });

                    String value5 = oldCplModel.getDescripcion();

                    method5.invoke(newModel, value5);

                    Method method6 = newModelClass.getMethod("setContenido",
                            new Class[] { String.class });

                    String value6 = oldCplModel.getContenido();

                    method6.invoke(newModel, value6);

                    Method method7 = newModelClass.getMethod("setFechaCreacion",
                            new Class[] { Date.class });

                    Date value7 = oldCplModel.getFechaCreacion();

                    method7.invoke(newModel, value7);

                    return newModel;
                } catch (Exception e) {
                    _log.error(e, e);
                }
            } finally {
                Thread.currentThread().setContextClassLoader(contextClassLoader);
            }
        }

        return oldModel;
    }

    public static Object translateInput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateInput(curObj));
        }

        return newList;
    }

    public static Object translateInput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateInput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateInput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Object translateOutput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(
                    "es.emergya.negocio.model.impl.InformeImpl")) {
            ClassLoader contextClassLoader = Thread.currentThread()
                                                   .getContextClassLoader();

            try {
                Thread.currentThread().setContextClassLoader(_classLoader);

                try {
                    InformeClp newModel = new InformeClp();

                    Method method0 = oldModelClass.getMethod("getInformeId");

                    Long value0 = (Long) method0.invoke(oldModel,
                            (Object[]) null);

                    newModel.setInformeId(value0);

                    Method method1 = oldModelClass.getMethod("getCompanyId");

                    Long value1 = (Long) method1.invoke(oldModel,
                            (Object[]) null);

                    newModel.setCompanyId(value1);

                    Method method2 = oldModelClass.getMethod("getUserId");

                    Long value2 = (Long) method2.invoke(oldModel,
                            (Object[]) null);

                    newModel.setUserId(value2);

                    Method method3 = oldModelClass.getMethod("getGroupId");

                    Long value3 = (Long) method3.invoke(oldModel,
                            (Object[]) null);

                    newModel.setGroupId(value3);

                    Method method4 = oldModelClass.getMethod("getTitulo");

                    String value4 = (String) method4.invoke(oldModel,
                            (Object[]) null);

                    newModel.setTitulo(value4);

                    Method method5 = oldModelClass.getMethod("getDescripcion");

                    String value5 = (String) method5.invoke(oldModel,
                            (Object[]) null);

                    newModel.setDescripcion(value5);

                    Method method6 = oldModelClass.getMethod("getContenido");

                    String value6 = (String) method6.invoke(oldModel,
                            (Object[]) null);

                    newModel.setContenido(value6);

                    Method method7 = oldModelClass.getMethod("getFechaCreacion");

                    Date value7 = (Date) method7.invoke(oldModel,
                            (Object[]) null);

                    newModel.setFechaCreacion(value7);

                    return newModel;
                } catch (Exception e) {
                    _log.error(e, e);
                }
            } finally {
                Thread.currentThread().setContextClassLoader(contextClassLoader);
            }
        }

        return oldModel;
    }

    public static Object translateOutput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateOutput(curObj));
        }

        return newList;
    }

    public static Object translateOutput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateOutput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateOutput((List<Object>) obj);
        } else {
            return obj;
        }
    }
}
