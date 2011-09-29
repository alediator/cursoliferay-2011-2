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

package es.emergya.negocio.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Junction;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;

import es.emergya.negocio.model.Factura;
import es.emergya.negocio.service.base.FacturaLocalServiceBaseImpl;

/**
 * The implementation of the factura local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link es.emergya.negocio.service.FacturaLocalService} interface.
 * </p>
 * 
 * <p>
 * Never reference this interface directly. Always use
 * {@link es.emergya.negocio.service.FacturaLocalServiceUtil} to access the
 * factura local service.
 * </p>
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author adiaz
 * @see es.emergya.negocio.service.base.FacturaLocalServiceBaseImpl
 * @see es.emergya.negocio.service.FacturaLocalServiceUtil
 */
public class FacturaLocalServiceImpl extends FacturaLocalServiceBaseImpl {

	/**
	 * Creates a new factura parameters. Adds to database
	 * 
	 * @param nombreCliente
	 * @param importeTotal
	 * @param descripcion
	 * 
	 * @return the new factura
	 * @throws SystemException
	 */
	public Factura createFactura(String nombreCliente, double importeTotal,
			String descripcion) throws SystemException {

		// Paso 1: Se obtiene el identificador unico asociado al nuevo objeto
		// Paso 2: Se obtiene el objeto factura
		Factura factura = createFactura(counterLocalService.increment());

		// Paso 3: Se asignan los valores de la factura
		factura.setNombreCliente(nombreCliente);
		factura.setDescripcion(descripcion);
		factura.setImporteTotal(importeTotal);

		return addFactura(factura);
	}

	/**
	 * Finds all the facturas where nombreCliente = &#63;.
	 * 
	 * @param nombreCliente
	 *            the nombre cliente to search with
	 * @return the matching facturas
	 * @throws SystemException
	 *             if a system exception occurred
	 */
	public List<Factura> findByNombreCliente(String nombreCliente)
			throws SystemException {
		return facturaPersistence.findByNombreCliente(nombreCliente);
	}

	/**
	 * Search in Facturas
	 * 
	 * @param companyId
	 * @param keywords
	 * @param start
	 * @param end
	 * @param comparator
	 * @return
	 */
	public List<Factura> search(long companyId, String keywords, int start,
			int end, OrderByComparator comparator) {
		String descripcion = null;
		String nombreCliente = null;
		Double importeFactura = null;
		boolean and = false;

		if (keywords != null && !keywords.equals("")) {
			descripcion = keywords;
			nombreCliente = keywords;
			try {
				importeFactura = Double.parseDouble(keywords);
			} catch (Exception e) {
				importeFactura = null;
			}
		} else {
			and = true;
		}

		return search(companyId, descripcion, nombreCliente, importeFactura,
				start, end, comparator, and);
	}

	/**
	 * Search count in facturas
	 * 
	 * @param companyId
	 * @param keywords
	 * @param start
	 * @param end
	 * @param comparator
	 * @return
	 */
	public int searchCount(long companyId, String keywords,
			OrderByComparator comparator) {
		String descripcion = null;
		String nombreCliente = null;
		Double importeFactura = null;
		boolean and = false;

		if (keywords != null && !keywords.equals("")) {
			descripcion = keywords;
			nombreCliente = keywords;
			try {
				importeFactura = Double.parseDouble(keywords);
			} catch (Exception e) {
				importeFactura = null;
			}

		} else {
			and = true;
		}

		return searchCount(companyId, descripcion, nombreCliente,
				importeFactura, comparator, and);
	}

	/**
	 * Parametized search in facturas
	 * 
	 * @param companyId
	 * @param descripcion
	 * @param nombreCliente
	 * @param importeFactura
	 * @param start
	 * @param end
	 * @param comparator
	 * @param and
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Factura> search(long companyId, String descripcion,
			String nombreCliente, Double importeFactura, int start, int end,
			OrderByComparator comparator, boolean and) {
		List<Factura> resultado = new ArrayList<Factura>();

		DynamicQuery dynamicQuery = getDynamicQueryByDescripcion_o_NombreCliente_o_ImporteTotal(
				descripcion, nombreCliente, importeFactura, false, and);

		try {
			resultado
					.addAll(dynamicQuery(dynamicQuery, start, end, comparator));
		} catch (SystemException e) {
			e.printStackTrace();
		}

		return resultado;
	}

	/**
	 * Parametized search count
	 * 
	 * @param companyId
	 * @param descripcion
	 * @param nombreCliente
	 * @param importeFactura
	 * @param start
	 * @param end
	 * @param comparator
	 * @param and
	 * @return
	 */
	public int searchCount(long companyId, String descripcion,
			String nombreCliente, Double importeFactura,
			OrderByComparator comparator, boolean and) {
		int resultado = 0;

		DynamicQuery dynamicQuery = getDynamicQueryByDescripcion_o_NombreCliente_o_ImporteTotal(
				descripcion, nombreCliente, importeFactura, false, and);

		try {
			resultado = (int) dynamicQueryCount(dynamicQuery);
		} catch (SystemException e) {
			e.printStackTrace();
		}

		return resultado;
	}

	/**
	 * Dynamic query for facturas search
	 * 
	 * @param descripcion
	 * @param nombreCliente
	 * @param importeTotal
	 * @param order
	 * @param and
	 * @return
	 */
	private DynamicQuery getDynamicQueryByDescripcion_o_NombreCliente_o_ImporteTotal(
			String descripcion, String nombreCliente, Double importeTotal,
			boolean order, boolean and) {

		// Paso 1: Creamos la dynamic query
		// Si fueran sobre el core hay que que utilizar el
		// classloader:
		// DynamicQueryFactoryUtil.forClass(Class<?>,
		// PortalClassLoaderUtil.getClassLoader())
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil
				.forClass(Factura.class);

		// Paso 2: Se configura la consulta adecuadamente
		Criterion criterio1 = null;
		Criterion criterio2 = null;
		Criterion criterio3 = null;
		if (descripcion != null) {
			criterio1 = RestrictionsFactoryUtil.ilike("descripcion",
					descripcion);
		}
		if (nombreCliente != null) {
			criterio2 = RestrictionsFactoryUtil.ilike("nombreCliente",
					nombreCliente);
		}
		if (importeTotal != null) {
//			criterio3 = RestrictionsFactoryUtil
//					.eq("importeTotal", importeTotal);
		}
		Junction junction;
		if (and) {
			junction = RestrictionsFactoryUtil.conjunction();
		} else {
			junction = RestrictionsFactoryUtil.disjunction();
		}
		if (criterio1 != null) {
			junction.add(criterio1);
		}
		if (criterio2 != null) {
			junction.add(criterio2);
		}
		if (criterio3 != null) {
			junction.add(criterio3);
		}
		dynamicQuery.add(junction);

//		// Paso 3: Orden
//		if (order) {
//			dynamicQuery.addOrder(OrderFactoryUtil.asc("descripcion"));
//		}

		return dynamicQuery;
	}
}