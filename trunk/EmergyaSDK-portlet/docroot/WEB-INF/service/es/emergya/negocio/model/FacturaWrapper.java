package es.emergya.negocio.model;

/**
 * <p>
 * This class is a wrapper for {@link Factura}.
 * </p>
 *
 * @author    adiaz
 * @see       Factura
 * @generated
 */
public class FacturaWrapper implements Factura {
    private Factura _factura;

    public FacturaWrapper(Factura factura) {
        _factura = factura;
    }

    public long getPrimaryKey() {
        return _factura.getPrimaryKey();
    }

    public void setPrimaryKey(long pk) {
        _factura.setPrimaryKey(pk);
    }

    public long getFacturaId() {
        return _factura.getFacturaId();
    }

    public void setFacturaId(long facturaId) {
        _factura.setFacturaId(facturaId);
    }

    public java.lang.String getNombreCliente() {
        return _factura.getNombreCliente();
    }

    public void setNombreCliente(java.lang.String nombreCliente) {
        _factura.setNombreCliente(nombreCliente);
    }

    public double getImporteTotal() {
        return _factura.getImporteTotal();
    }

    public void setImporteTotal(double importeTotal) {
        _factura.setImporteTotal(importeTotal);
    }

    public java.lang.String getDescripcion() {
        return _factura.getDescripcion();
    }

    public void setDescripcion(java.lang.String descripcion) {
        _factura.setDescripcion(descripcion);
    }

    public es.emergya.negocio.model.Factura toEscapedModel() {
        return _factura.toEscapedModel();
    }

    public boolean isNew() {
        return _factura.isNew();
    }

    public void setNew(boolean n) {
        _factura.setNew(n);
    }

    public boolean isCachedModel() {
        return _factura.isCachedModel();
    }

    public void setCachedModel(boolean cachedModel) {
        _factura.setCachedModel(cachedModel);
    }

    public boolean isEscapedModel() {
        return _factura.isEscapedModel();
    }

    public void setEscapedModel(boolean escapedModel) {
        _factura.setEscapedModel(escapedModel);
    }

    public java.io.Serializable getPrimaryKeyObj() {
        return _factura.getPrimaryKeyObj();
    }

    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _factura.getExpandoBridge();
    }

    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _factura.setExpandoBridgeAttributes(serviceContext);
    }

    public java.lang.Object clone() {
        return _factura.clone();
    }

    public int compareTo(es.emergya.negocio.model.Factura factura) {
        return _factura.compareTo(factura);
    }

    public int hashCode() {
        return _factura.hashCode();
    }

    public java.lang.String toString() {
        return _factura.toString();
    }

    public java.lang.String toXmlString() {
        return _factura.toXmlString();
    }

    public Factura getWrappedFactura() {
        return _factura;
    }
}
