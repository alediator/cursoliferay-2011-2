package es.emergya.negocio.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import es.emergya.negocio.model.Factura;
import es.emergya.negocio.model.FacturaModel;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

/**
 * The base model implementation for the Factura service. Represents a row in the &quot;factura&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link es.emergya.negocio.model.FacturaModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FacturaImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. All methods that expect a factura model instance should use the {@link es.emergya.negocio.model.Factura} interface instead.
 * </p>
 *
 * @author adiaz
 * @see FacturaImpl
 * @see es.emergya.negocio.model.Factura
 * @see es.emergya.negocio.model.FacturaModel
 * @generated
 */
public class FacturaModelImpl extends BaseModelImpl<Factura>
    implements FacturaModel {
    public static final String TABLE_NAME = "factura";
    public static final Object[][] TABLE_COLUMNS = {
            { "facturaId", new Integer(Types.BIGINT) },
            { "nombreCliente", new Integer(Types.VARCHAR) },
            { "importeTotal", new Integer(Types.DOUBLE) },
            { "descripcion", new Integer(Types.VARCHAR) }
        };
    public static final String TABLE_SQL_CREATE = "create table factura (facturaId LONG not null primary key,nombreCliente VARCHAR(75) null,importeTotal DOUBLE,descripcion VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table factura";
    public static final String ORDER_BY_JPQL = " ORDER BY factura.nombreCliente ASC";
    public static final String ORDER_BY_SQL = " ORDER BY factura.nombreCliente ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.es.emergya.negocio.model.Factura"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.es.emergya.negocio.model.Factura"),
            true);
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.es.emergya.negocio.model.Factura"));
    private long _facturaId;
    private String _nombreCliente;
    private double _importeTotal;
    private String _descripcion;
    private transient ExpandoBridge _expandoBridge;

    public FacturaModelImpl() {
    }

    public long getPrimaryKey() {
        return _facturaId;
    }

    public void setPrimaryKey(long pk) {
        setFacturaId(pk);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_facturaId);
    }

    public long getFacturaId() {
        return _facturaId;
    }

    public void setFacturaId(long facturaId) {
        _facturaId = facturaId;
    }

    public String getNombreCliente() {
        if (_nombreCliente == null) {
            return StringPool.BLANK;
        } else {
            return _nombreCliente;
        }
    }

    public void setNombreCliente(String nombreCliente) {
        _nombreCliente = nombreCliente;
    }

    public double getImporteTotal() {
        return _importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        _importeTotal = importeTotal;
    }

    public String getDescripcion() {
        if (_descripcion == null) {
            return StringPool.BLANK;
        } else {
            return _descripcion;
        }
    }

    public void setDescripcion(String descripcion) {
        _descripcion = descripcion;
    }

    public Factura toEscapedModel() {
        if (isEscapedModel()) {
            return (Factura) this;
        } else {
            return (Factura) Proxy.newProxyInstance(Factura.class.getClassLoader(),
                new Class[] { Factura.class }, new AutoEscapeBeanHandler(this));
        }
    }

    public ExpandoBridge getExpandoBridge() {
        if (_expandoBridge == null) {
            _expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
                    Factura.class.getName(), getPrimaryKey());
        }

        return _expandoBridge;
    }

    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        getExpandoBridge().setAttributes(serviceContext);
    }

    public Object clone() {
        FacturaImpl facturaImpl = new FacturaImpl();

        facturaImpl.setFacturaId(getFacturaId());

        facturaImpl.setNombreCliente(getNombreCliente());

        facturaImpl.setImporteTotal(getImporteTotal());

        facturaImpl.setDescripcion(getDescripcion());

        return facturaImpl;
    }

    public int compareTo(Factura factura) {
        int value = 0;

        value = getNombreCliente().compareTo(factura.getNombreCliente());

        if (value != 0) {
            return value;
        }

        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        Factura factura = null;

        try {
            factura = (Factura) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        long pk = factura.getPrimaryKey();

        if (getPrimaryKey() == pk) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (int) getPrimaryKey();
    }

    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{facturaId=");
        sb.append(getFacturaId());
        sb.append(", nombreCliente=");
        sb.append(getNombreCliente());
        sb.append(", importeTotal=");
        sb.append(getImporteTotal());
        sb.append(", descripcion=");
        sb.append(getDescripcion());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("es.emergya.negocio.model.Factura");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>facturaId</column-name><column-value><![CDATA[");
        sb.append(getFacturaId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nombreCliente</column-name><column-value><![CDATA[");
        sb.append(getNombreCliente());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>importeTotal</column-name><column-value><![CDATA[");
        sb.append(getImporteTotal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>descripcion</column-name><column-value><![CDATA[");
        sb.append(getDescripcion());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
