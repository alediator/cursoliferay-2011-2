package es.emergya.negocio.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;


public class LineaDeFacturaClp extends BaseModelImpl<LineaDeFactura>
    implements LineaDeFactura {
    private long _lineaDeacturaId;
    private String _detalle;
    private double _importe;
    private long _facturaId;

    public LineaDeFacturaClp() {
    }

    public long getPrimaryKey() {
        return _lineaDeacturaId;
    }

    public void setPrimaryKey(long pk) {
        setLineaDeacturaId(pk);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_lineaDeacturaId);
    }

    public long getLineaDeacturaId() {
        return _lineaDeacturaId;
    }

    public void setLineaDeacturaId(long lineaDeacturaId) {
        _lineaDeacturaId = lineaDeacturaId;
    }

    public String getDetalle() {
        return _detalle;
    }

    public void setDetalle(String detalle) {
        _detalle = detalle;
    }

    public double getImporte() {
        return _importe;
    }

    public void setImporte(double importe) {
        _importe = importe;
    }

    public long getFacturaId() {
        return _facturaId;
    }

    public void setFacturaId(long facturaId) {
        _facturaId = facturaId;
    }

    public LineaDeFactura toEscapedModel() {
        if (isEscapedModel()) {
            return this;
        } else {
            return (LineaDeFactura) Proxy.newProxyInstance(LineaDeFactura.class.getClassLoader(),
                new Class[] { LineaDeFactura.class },
                new AutoEscapeBeanHandler(this));
        }
    }

    public Object clone() {
        LineaDeFacturaClp clone = new LineaDeFacturaClp();

        clone.setLineaDeacturaId(getLineaDeacturaId());
        clone.setDetalle(getDetalle());
        clone.setImporte(getImporte());
        clone.setFacturaId(getFacturaId());

        return clone;
    }

    public int compareTo(LineaDeFactura lineaDeFactura) {
        long pk = lineaDeFactura.getPrimaryKey();

        if (getPrimaryKey() < pk) {
            return -1;
        } else if (getPrimaryKey() > pk) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        LineaDeFacturaClp lineaDeFactura = null;

        try {
            lineaDeFactura = (LineaDeFacturaClp) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        long pk = lineaDeFactura.getPrimaryKey();

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

        sb.append("{lineaDeacturaId=");
        sb.append(getLineaDeacturaId());
        sb.append(", detalle=");
        sb.append(getDetalle());
        sb.append(", importe=");
        sb.append(getImporte());
        sb.append(", facturaId=");
        sb.append(getFacturaId());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("es.emergya.negocio.model.LineaDeFactura");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>lineaDeacturaId</column-name><column-value><![CDATA[");
        sb.append(getLineaDeacturaId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>detalle</column-name><column-value><![CDATA[");
        sb.append(getDetalle());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>importe</column-name><column-value><![CDATA[");
        sb.append(getImporte());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>facturaId</column-name><column-value><![CDATA[");
        sb.append(getFacturaId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
