package es.emergya.negocio.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;


public class FacturaClp extends BaseModelImpl<Factura> implements Factura {
    private long _facturaId;
    private String _nombreCliente;
    private double _importeTotal;
    private String _descripcion;

    public FacturaClp() {
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
        return _nombreCliente;
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
        return _descripcion;
    }

    public void setDescripcion(String descripcion) {
        _descripcion = descripcion;
    }

    public Factura toEscapedModel() {
        if (isEscapedModel()) {
            return this;
        } else {
            return (Factura) Proxy.newProxyInstance(Factura.class.getClassLoader(),
                new Class[] { Factura.class }, new AutoEscapeBeanHandler(this));
        }
    }

    public Object clone() {
        FacturaClp clone = new FacturaClp();

        clone.setFacturaId(getFacturaId());
        clone.setNombreCliente(getNombreCliente());
        clone.setImporteTotal(getImporteTotal());
        clone.setDescripcion(getDescripcion());

        return clone;
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

        FacturaClp factura = null;

        try {
            factura = (FacturaClp) obj;
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
