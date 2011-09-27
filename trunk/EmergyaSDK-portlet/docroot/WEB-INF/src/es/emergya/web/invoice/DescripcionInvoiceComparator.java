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
public class DescripcionInvoiceComparator extends OrderByComparator {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3798287454362750234L;
	
	// Paso 1: Asc
	private boolean asc;
	
	// Paso 2; Definir literales de tipo cadena para construir las consultas
	public static final String ORDER_BY_ASC = "factura.descripcion ASC";
	public static final String ORDER_BY_DESC = "factura.descripcion DESC";
	public static String[] ORDER_BY_FIELDS = {"descripcion"};
	
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

	public DescripcionInvoiceComparator(boolean asc){
		this.asc = asc;
	}	

	/* (non-Javadoc)
	 * @see com.liferay.portal.kernel.util.OrderByComparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Object obj1, Object obj2) {
		if(obj1 instanceof Factura && obj2 instanceof Factura){
			Factura f1 = (Factura) obj1;
			Factura f2 = (Factura) obj2;
			
			return f1.getDescripcion().compareTo(f2.getDescripcion());
		}
		
		return 0;
	}

}
