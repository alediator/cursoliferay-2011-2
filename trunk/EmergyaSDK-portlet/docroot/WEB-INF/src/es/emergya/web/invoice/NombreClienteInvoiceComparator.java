/**
 * 
 */
package es.emergya.web.invoice;

import com.liferay.portal.kernel.util.OrderByComparator;

import es.emergya.negocio.model.Factura;

/**
 * @author adiaz
 *
 */
public class NombreClienteInvoiceComparator extends OrderByComparator {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4396734183288790951L;

	// Paso 1: Asc
	private boolean asc;
	
	// Paso 2; Definir literales de tipo cadena para construir las consultas
	public static final String ORDER_BY_ASC = "factura.nombreCliente ASC";
	public static final String ORDER_BY_DESC = "factura.nombreCliente DESC";
	public static String[] ORDER_BY_FIELDS = {"nombreCliente"};
	
	public boolean isAscending() {
		return asc;
	}
	
	// Paso 3: Se implementan los metodos orderBy..
	public String getOrderBy() {
		String cad = ORDER_BY_ASC;
		if(isAscending()){
			cad = ORDER_BY_DESC;
		}
		return cad;
	}
	
	public String[] getOrderByFields() {
		return ORDER_BY_FIELDS;
	}

	public NombreClienteInvoiceComparator(boolean asc){
		this.asc = asc;
	}	

	/* (non-Javadoc)
	 * @see com.liferay.portal.kernel.util.OrderByComparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Object obj1, Object obj2) {
		if(obj1 instanceof Factura && obj2 instanceof Factura){
			Factura f1 = (Factura) obj1;
			Factura f2 = (Factura) obj2;
			
			return f1.getNombreCliente().compareTo(f2.getNombreCliente());
		}
		
		return 0;
	}

}
