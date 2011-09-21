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
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;

import es.emergya.negocio.model.Informe;
import es.emergya.negocio.service.base.InformeLocalServiceBaseImpl;

/**
 * The implementation of the informe local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.emergya.negocio.service.InformeLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link es.emergya.negocio.service.InformeLocalServiceUtil} to access the informe local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adiaz
 * @see es.emergya.negocio.service.base.InformeLocalServiceBaseImpl
 * @see es.emergya.negocio.service.InformeLocalServiceUtil
 */
public class InformeLocalServiceImpl extends InformeLocalServiceBaseImpl {
	
	/**
	 * Creates a new informe with the primary key. Adds the informe to the database.
	 *
	 * @param titulo
	 * @param descripcion
	 * @param contenido
	 * @param fechaCreacion
	 * @param userId
	 * @param companyId
	 * @param groupId
	 * @return the new informe
	 */
	public Informe createInforme(String titulo, String contenido, String descripcion, Date fechaCreacion, Long userId, Long companyId, Long groupId) throws SystemException {
		
		// Pasos 1 y 2: Se obtiene el id unico y se crea el ojeto informe
		Informe informe = super.createInforme(counterLocalService.increment());
		
		// Paso 3: Paso de propiedades 
		informe.setTitulo(titulo);
		informe.setDescripcion(descripcion);
		informe.setContenido(contenido);
		informe.setFechaCreacion(fechaCreacion);
		informe.setCompanyId(companyId);
		informe.setUserId(userId);
		informe.setGroupId(groupId);
		
		// Paso 4: persist
		return addInforme(informe);
	}
	
	/**
	 * Obtiene el listado de informes por titulo o userId
	 * 
	 * @param titulo
	 * @param userId
	 * @return list de informes
	 * @throws SystemException
	 */
	@SuppressWarnings("unchecked")
	public List<Informe> getInformeByTitulo_o_UserId(String titulo, Long userId) throws SystemException{
		
		// Paso 1: Resultado vacio para evitar devolver
		List<Informe> resultado = new ArrayList<Informe>();
		
		// Paso 2: Creamos la dynamic query
		// Si fueran sobre el core hay que que utilizar el classloader: DynamicQueryFactoryUtil.forClass(Class<?>, PortalClassLoaderUtil.getClassLoader())
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Informe.class);
	
		// Paso 3: Se configura la consulta adecuadamente
		Criterion criterio1 = null;
		Criterion criterio2 = null;
		if(titulo != null){
			criterio1 = RestrictionsFactoryUtil.ilike("titulo", titulo);
		}
		if (userId != null){
			criterio2 = RestrictionsFactoryUtil.eq("userId", userId);
		}
		Disjunction disjuntion = RestrictionsFactoryUtil.disjunction();
		if(criterio1 != null){
			disjuntion.add(criterio1);
		}
		if(criterio2 != null){
			disjuntion.add(criterio2);
		}
		dynamicQuery.add(disjuntion);
		
		// Paso 4: Se incluyen los resultados
		resultado.addAll(dynamicQuery(dynamicQuery));
		
		return resultado;
	}
	
	/**
	 * Obtiene el numero de resultados
	 * 
	 * @param titulo
	 * @param userId
	 * @return count
	 * @throws SystemException
	 */
	public int getCountInformeByTitulo_o_UserId(String titulo, Long userId) throws SystemException{
		
		// Paso 1: Creamos la dynamic query
		// Si fueran sobre el core hay que que utilizar el 
		// classloader: 
		// 		DynamicQueryFactoryUtil.forClass(Class<?>, PortalClassLoaderUtil.getClassLoader())
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Informe.class);
	
		// Paso 2: Se configura la consulta adecuadamente
		Criterion criterio1 = null;
		Criterion criterio2 = null;
		if(titulo != null){
			criterio1 = RestrictionsFactoryUtil.ilike("titulo", titulo);
		}
		if (userId != null){
			criterio2 = RestrictionsFactoryUtil.eq("userId", userId);
		}
		Disjunction disjuntion = RestrictionsFactoryUtil.disjunction();
		if(criterio1 != null){
			disjuntion.add(criterio1);
		}
		if(criterio2 != null){
			disjuntion.add(criterio2);
		}
		dynamicQuery.add(disjuntion);
		
		// Paso 3: Se obtiene el resultado
		return (int) dynamicQueryCount(dynamicQuery);
	}
	
}