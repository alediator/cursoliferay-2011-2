package es.emergya.negocio.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;


public class InformeClp extends BaseModelImpl<Informe> implements Informe {
    private long _informeId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private long _groupId;
    private String _titulo;
    private String _descripcion;
    private String _contenido;
    private Date _fechaCreacion;

    public InformeClp() {
    }

    public long getPrimaryKey() {
        return _informeId;
    }

    public void setPrimaryKey(long pk) {
        setInformeId(pk);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_informeId);
    }

    public long getInformeId() {
        return _informeId;
    }

    public void setInformeId(long informeId) {
        _informeId = informeId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public String getTitulo() {
        return _titulo;
    }

    public void setTitulo(String titulo) {
        _titulo = titulo;
    }

    public String getDescripcion() {
        return _descripcion;
    }

    public void setDescripcion(String descripcion) {
        _descripcion = descripcion;
    }

    public String getContenido() {
        return _contenido;
    }

    public void setContenido(String contenido) {
        _contenido = contenido;
    }

    public Date getFechaCreacion() {
        return _fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        _fechaCreacion = fechaCreacion;
    }

    public Informe toEscapedModel() {
        if (isEscapedModel()) {
            return this;
        } else {
            return (Informe) Proxy.newProxyInstance(Informe.class.getClassLoader(),
                new Class[] { Informe.class }, new AutoEscapeBeanHandler(this));
        }
    }

    public Object clone() {
        InformeClp clone = new InformeClp();

        clone.setInformeId(getInformeId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setGroupId(getGroupId());
        clone.setTitulo(getTitulo());
        clone.setDescripcion(getDescripcion());
        clone.setContenido(getContenido());
        clone.setFechaCreacion(getFechaCreacion());

        return clone;
    }

    public int compareTo(Informe informe) {
        int value = 0;

        value = getTitulo().compareTo(informe.getTitulo());

        if (value != 0) {
            return value;
        }

        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        InformeClp informe = null;

        try {
            informe = (InformeClp) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        long pk = informe.getPrimaryKey();

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
        StringBundler sb = new StringBundler(17);

        sb.append("{informeId=");
        sb.append(getInformeId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", titulo=");
        sb.append(getTitulo());
        sb.append(", descripcion=");
        sb.append(getDescripcion());
        sb.append(", contenido=");
        sb.append(getContenido());
        sb.append(", fechaCreacion=");
        sb.append(getFechaCreacion());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(28);

        sb.append("<model><model-name>");
        sb.append("es.emergya.negocio.model.Informe");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>informeId</column-name><column-value><![CDATA[");
        sb.append(getInformeId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>titulo</column-name><column-value><![CDATA[");
        sb.append(getTitulo());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>descripcion</column-name><column-value><![CDATA[");
        sb.append(getDescripcion());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>contenido</column-name><column-value><![CDATA[");
        sb.append(getContenido());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fechaCreacion</column-name><column-value><![CDATA[");
        sb.append(getFechaCreacion());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
