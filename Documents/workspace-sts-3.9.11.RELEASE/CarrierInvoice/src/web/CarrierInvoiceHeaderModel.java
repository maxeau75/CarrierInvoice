package web;

import java.util.ArrayList;
import java.util.List;

import entity.CarrierInvoiceHeader;

public class CarrierInvoiceHeaderModel {

		private String keyWord;
		private List<CarrierInvoiceHeader> carrierinvoice= new ArrayList<>();
		public String getKeyWord() {
			return keyWord;
		}
		public void setKeyWord(String keyWord) {
			this.keyWord = keyWord;
		}
		public List<CarrierInvoiceHeader> getCarrierinvoice() {
			return carrierinvoice;
		}
		public void setCarrierinvoice(List<CarrierInvoiceHeader> carrierinvoice) {
			this.carrierinvoice = carrierinvoice;
		}
		
		

	}


