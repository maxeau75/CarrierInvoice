package entity;

import java.util.List;

public interface EntityInterface {
	
	public List<CarrierInvoiceHeader> getCarrierInvoiceHeaderByKW(String kw);
	public void addCarrierInvoiceHeader(CarrierInvoiceHeader cain);

	
}
