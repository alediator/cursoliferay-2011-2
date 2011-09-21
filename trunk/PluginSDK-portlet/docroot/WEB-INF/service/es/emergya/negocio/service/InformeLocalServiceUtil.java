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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;

/**
 * The utility for the informe local service. This utility wraps {@link es.emergya.negocio.service.impl.InformeLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link es.emergya.negocio.service.impl.InformeLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adiaz
 * @see InformeLocalService
 * @see es.emergya.negocio.service.base.InformeLocalServiceBaseImpl
 * @see es.emergya.negocio.service.impl.InformeLocalServiceImpl
 * @generated
 */
public class InformeLocalServiceUtil {
	/**
	* Adds the informe to the database. Also notifies the appropriate model listeners.
	*
	* @param informe the informe to add
	* @return the informe that was added
	* @throws SystemException if a system exception occurred
	*/
	public static es.emergya.negocio.model.Informe addInforme(
		es.emergya.negocio.model.Informe informe)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addInforme(informe);
	}

	/**
	* Creates a new informe with the primary key. Does not add the informe to the database.
	*
	* @param informeId the primary key for the new informe
	* @return the new informe
	*/
	public static es.emergya.negocio.model.Informe createInforme(long informeId) {
		return getService().createInforme(informeId);
	}

	/**
	* Deletes the informe with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param informeId the primary key of the informe to delete
	* @throws PortalException if a informe with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteInforme(long informeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteInforme(informeId);
	}

	/**
	* Deletes the informe from the database. Also notifies the appropriate model listeners.
	*
	* @param informe the informe to delete
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteInforme(es.emergya.negocio.model.Informe informe)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteInforme(informe);
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
	* Gets the informe with the primary key.
	*
	* @param informeId the primary key of the informe to get
	* @return the informe
	* @throws PortalException if a informe with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.emergya.negocio.model.Informe getInforme(long informeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getInforme(informeId);
	}

	/**
	* Gets a range of all the informes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of informes to return
	* @param end the upper bound of the range of informes to return (not inclusive)
	* @return the range of informes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.emergya.negocio.model.Informe> getInformes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getInformes(start, end);
	}

	/**
	* Gets the number of informes.
	*
	* @return the number of informes
	* @throws SystemException if a system exception occurred
	*/
	public static int getInformesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getInformesCount();
	}

	/**
	* Updates the informe in the database. Also notifies the appropriate model listeners.
	*
	* @param informe the informe to update
	* @return the informe that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static es.emergya.negocio.model.Informe updateInforme(
		es.emergya.negocio.model.Informe informe)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateInforme(informe);
	}

	/**
	* Updates the informe in the database. Also notifies the appropriate model listeners.
	*
	* @param informe the informe to update
	* @param merge whether to merge the informe with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the informe that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static es.emergya.negocio.model.Informe updateInforme(
		es.emergya.negocio.model.Informe informe, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateInforme(informe, merge);
	}

	public static void clearService() {
		_service = null;
	}

	public static InformeLocalService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					InformeLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new InformeLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(InformeLocalService service) {
		_service = service;
	}

	private static InformeLocalService _service;
}