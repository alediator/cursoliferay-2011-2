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

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import es.emergya.negocio.model.Factura;
import es.emergya.negocio.service.base.FacturaLocalServiceBaseImpl;

/**
 * The implementation of the factura local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.emergya.negocio.service.FacturaLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link es.emergya.negocio.service.FacturaLocalServiceUtil} to access the factura local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
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
	public Factura createFactura(String nombreCliente, double importeTotal, String descripcion) throws SystemException {
		
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
	 * @param nombreCliente the nombre cliente to search with
	 * @return the matching facturas
	 * @throws SystemException if a system exception occurred
	 */
	public List<Factura> findByNombreCliente(String nombreCliente)
		throws SystemException {
		return facturaPersistence.findByNombreCliente(nombreCliente); 
	}
}