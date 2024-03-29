package es.emergya.negocio.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Factura service. Represents a row in the &quot;factura&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link es.emergya.negocio.model.impl.FacturaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link es.emergya.negocio.model.impl.FacturaImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a factura model instance should use the {@link Factura} interface instead.
 * </p>
 *
 * @author adiaz
 * @see Factura
 * @see es.emergya.negocio.model.impl.FacturaImpl
 * @see es.emergya.negocio.model.impl.FacturaModelImpl
 * @generated
 */
public interface FacturaModel extends BaseModel<Factura> {
    /**
     * Gets the primary key of this factura.
     *
     * @return the primary key of this factura
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this factura
     *
     * @param pk the primary key of this factura
     */
    public void setPrimaryKey(long pk);

    /**
     * Gets the factura id of this factura.
     *
     * @return the factura id of this factura
     */
    public long getFacturaId();

    /**
     * Sets the factura id of this factura.
     *
     * @param facturaId the factura id of this factura
     */
    public void setFacturaId(long facturaId);

    /**
     * Gets the nombre cliente of this factura.
     *
     * @return the nombre cliente of this factura
     */
    @AutoEscape
    public String getNombreCliente();

    /**
     * Sets the nombre cliente of this factura.
     *
     * @param nombreCliente the nombre cliente of this factura
     */
    public void setNombreCliente(String nombreCliente);

    /**
     * Gets the importe total of this factura.
     *
     * @return the importe total of this factura
     */
    public double getImporteTotal();

    /**
     * Sets the importe total of this factura.
     *
     * @param importeTotal the importe total of this factura
     */
    public void setImporteTotal(double importeTotal);

    /**
     * Gets the descripcion of this factura.
     *
     * @return the descripcion of this factura
     */
    @AutoEscape
    public String getDescripcion();

    /**
     * Sets the descripcion of this factura.
     *
     * @param descripcion the descripcion of this factura
     */
    public void setDescripcion(String descripcion);

    /**
     * Gets a copy of this factura as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
     *
     * @return the escaped model instance
     * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
     */
    public Factura toEscapedModel();

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

    public int compareTo(Factura factura);

    public int hashCode();

    public String toString();

    public String toXmlString();
}
