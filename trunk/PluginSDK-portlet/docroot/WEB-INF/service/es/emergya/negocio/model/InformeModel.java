package es.emergya.negocio.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Informe service. Represents a row in the &quot;Emergya_Informe&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link es.emergya.negocio.model.impl.InformeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link es.emergya.negocio.model.impl.InformeImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a informe model instance should use the {@link Informe} interface instead.
 * </p>
 *
 * @author adiaz
 * @see Informe
 * @see es.emergya.negocio.model.impl.InformeImpl
 * @see es.emergya.negocio.model.impl.InformeModelImpl
 * @generated
 */
public interface InformeModel extends BaseModel<Informe> {
    /**
     * Gets the primary key of this informe.
     *
     * @return the primary key of this informe
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this informe
     *
     * @param pk the primary key of this informe
     */
    public void setPrimaryKey(long pk);

    /**
     * Gets the informe id of this informe.
     *
     * @return the informe id of this informe
     */
    public long getInformeId();

    /**
     * Sets the informe id of this informe.
     *
     * @param informeId the informe id of this informe
     */
    public void setInformeId(long informeId);

    /**
     * Gets the company id of this informe.
     *
     * @return the company id of this informe
     */
    public long getCompanyId();

    /**
     * Sets the company id of this informe.
     *
     * @param companyId the company id of this informe
     */
    public void setCompanyId(long companyId);

    /**
     * Gets the user id of this informe.
     *
     * @return the user id of this informe
     */
    public long getUserId();

    /**
     * Sets the user id of this informe.
     *
     * @param userId the user id of this informe
     */
    public void setUserId(long userId);

    /**
     * Gets the user uuid of this informe.
     *
     * @return the user uuid of this informe
     * @throws SystemException if a system exception occurred
     */
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this informe.
     *
     * @param userUuid the user uuid of this informe
     */
    public void setUserUuid(String userUuid);

    /**
     * Gets the group id of this informe.
     *
     * @return the group id of this informe
     */
    public long getGroupId();

    /**
     * Sets the group id of this informe.
     *
     * @param groupId the group id of this informe
     */
    public void setGroupId(long groupId);

    /**
     * Gets the titulo of this informe.
     *
     * @return the titulo of this informe
     */
    @AutoEscape
    public String getTitulo();

    /**
     * Sets the titulo of this informe.
     *
     * @param titulo the titulo of this informe
     */
    public void setTitulo(String titulo);

    /**
     * Gets the descripcion of this informe.
     *
     * @return the descripcion of this informe
     */
    @AutoEscape
    public String getDescripcion();

    /**
     * Sets the descripcion of this informe.
     *
     * @param descripcion the descripcion of this informe
     */
    public void setDescripcion(String descripcion);

    /**
     * Gets the contenido of this informe.
     *
     * @return the contenido of this informe
     */
    @AutoEscape
    public String getContenido();

    /**
     * Sets the contenido of this informe.
     *
     * @param contenido the contenido of this informe
     */
    public void setContenido(String contenido);

    /**
     * Gets the fecha creacion of this informe.
     *
     * @return the fecha creacion of this informe
     */
    public Date getFechaCreacion();

    /**
     * Sets the fecha creacion of this informe.
     *
     * @param fechaCreacion the fecha creacion of this informe
     */
    public void setFechaCreacion(Date fechaCreacion);

    /**
     * Gets a copy of this informe as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
     *
     * @return the escaped model instance
     * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
     */
    public Informe toEscapedModel();

    public boolean isNew();

    public void setNew(boolean n);

    public boolean isCachedModel();

    public void setCachedModel(boolean cachedModel);

    public boolean isEscapedModel();

    public void setEscapedModel(boolean escapedModel);

    public Serializable getPrimaryKeyObj();

    public ExpandoBridge getExpandoBridge();

    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    public Object clone();

    public int compareTo(Informe informe);

    public int hashCode();

    public String toString();

    public String toXmlString();
}
