/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package es.emergya.negocio.service;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.BaseModel;

import es.emergya.negocio.model.FacturaClp;
import es.emergya.negocio.model.LineaDeFacturaClp;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpSerializer {
	public static final String SERVLET_CONTEXT_NAME = "EmergyaSDK-portlet";

	public static void setClassLoader(ClassLoader classLoader) {
		_classLoader = classLoader;
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(FacturaClp.class.getName())) {
			FacturaClp oldCplModel = (FacturaClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("es.emergya.negocio.model.impl.FacturaImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setFacturaId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getFacturaId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setNombreCliente",
							new Class[] { String.class });

					String value1 = oldCplModel.getNombreCliente();

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setImporteTotal",
							new Class[] { Double.TYPE });

					Double value2 = new Double(oldCplModel.getImporteTotal());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setDescripcion",
							new Class[] { String.class });

					String value3 = oldCplModel.getDescripcion();

					method3.invoke(newModel, value3);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		if (oldModelClassName.equals(LineaDeFacturaClp.class.getName())) {
			LineaDeFacturaClp oldCplModel = (LineaDeFacturaClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("es.emergya.negocio.model.impl.LineaDeFacturaImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setLineaDeacturaId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getLineaDeacturaId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setDetalle",
							new Class[] { String.class });

					String value1 = oldCplModel.getDetalle();

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setImporte",
							new Class[] { Double.TYPE });

					Double value2 = new Double(oldCplModel.getImporte());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setFacturaId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getFacturaId());

					method3.invoke(newModel, value3);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
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
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"es.emergya.negocio.model.impl.FacturaImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					FacturaClp newModel = new FacturaClp();

					Method method0 = oldModelClass.getMethod("getFacturaId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setFacturaId(value0);

					Method method1 = oldModelClass.getMethod("getNombreCliente");

					String value1 = (String)method1.invoke(oldModel,
							(Object[])null);

					newModel.setNombreCliente(value1);

					Method method2 = oldModelClass.getMethod("getImporteTotal");

					Double value2 = (Double)method2.invoke(oldModel,
							(Object[])null);

					newModel.setImporteTotal(value2);

					Method method3 = oldModelClass.getMethod("getDescripcion");

					String value3 = (String)method3.invoke(oldModel,
							(Object[])null);

					newModel.setDescripcion(value3);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		if (oldModelClassName.equals(
					"es.emergya.negocio.model.impl.LineaDeFacturaImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					LineaDeFacturaClp newModel = new LineaDeFacturaClp();

					Method method0 = oldModelClass.getMethod(
							"getLineaDeacturaId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setLineaDeacturaId(value0);

					Method method1 = oldModelClass.getMethod("getDetalle");

					String value1 = (String)method1.invoke(oldModel,
							(Object[])null);

					newModel.setDetalle(value1);

					Method method2 = oldModelClass.getMethod("getImporte");

					Double value2 = (Double)method2.invoke(oldModel,
							(Object[])null);

					newModel.setImporte(value2);

					Method method3 = oldModelClass.getMethod("getFacturaId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setFacturaId(value3);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
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
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static ClassLoader _classLoader;
}