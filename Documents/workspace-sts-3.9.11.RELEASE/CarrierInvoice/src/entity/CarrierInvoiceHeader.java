package entity;

import java.io.Serializable;

public class CarrierInvoiceHeader implements Serializable{
	
	private Long id;
    private String filename;
	private String paymentMethod;
	private String billToAddressId;
	private String podReceived;
	private String status;
	private String owner;
	private String weight;
	private String weightUom;
	private String settlementQueue;
	private String settlementTotal;
	private String settlementReasonCode;
	private String settlementInvoiceNumber;
	private String settlementDateType;
	private String settlementDate;
	private String settlementMOP;
	private String settlementComments;
	private String settlementCheckNumber;
	private String settlementCheckAmount;
	private String settlementCheckPayee;
	private String settlementCheckDate;
	private String settlementCheckDepositDate;
	private double accessorialTotal;
	private double subTotal;
    private double total;
    private double normalizedTotal;
	private String normalizedTotalCurrency;
	private String glCode;
	private String carrierId;
	private String carrierName;
	private String carrierSCAC;
	private String carrierMode;
	private String carrierServiceDays;
	private String carrierDistance;
	private String sentToAROn;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getBillToAddressId() {
		return billToAddressId;
	}
	public void setBillToAddressId(String billToAddressId) {
		this.billToAddressId = billToAddressId;
	}
	public String getPodReceived() {
		return podReceived;
	}
	public void setPodReceived(String podReceived) {
		this.podReceived = podReceived;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getWeightUom() {
		return weightUom;
	}
	public void setWeightUom(String weightUom) {
		this.weightUom = weightUom;
	}
	public String getSettlementQueue() {
		return settlementQueue;
	}
	public void setSettlementQueue(String settlementQueue) {
		this.settlementQueue = settlementQueue;
	}
	public String getSettlementTotal() {
		return settlementTotal;
	}
	public void setSettlementTotal(String settlementTotal) {
		this.settlementTotal = settlementTotal;
	}
	public String getSettlementReasonCode() {
		return settlementReasonCode;
	}
	public void setSettlementReasonCode(String settlementReasonCode) {
		this.settlementReasonCode = settlementReasonCode;
	}
	public String getSettlementInvoiceNumber() {
		return settlementInvoiceNumber;
	}
	public void setSettlementInvoiceNumber(String settlementInvoiceNumber) {
		this.settlementInvoiceNumber = settlementInvoiceNumber;
	}
	public String getSettlementDateType() {
		return settlementDateType;
	}
	public void setSettlementDateType(String settlementDateType) {
		this.settlementDateType = settlementDateType;
	}
	public String getSettlementDate() {
		return settlementDate;
	}
	public void setSettlementDate(String settlementDate) {
		this.settlementDate = settlementDate;
	}
	public String getSettlementMOP() {
		return settlementMOP;
	}
	public void setSettlementMOP(String settlementMOP) {
		this.settlementMOP = settlementMOP;
	}
	public String getSettlementComments() {
		return settlementComments;
	}
	public void setSettlementComments(String settlementComments) {
		this.settlementComments = settlementComments;
	}
	public String getSettlementCheckNumber() {
		return settlementCheckNumber;
	}
	public void setSettlementCheckNumber(String settlementCheckNumber) {
		this.settlementCheckNumber = settlementCheckNumber;
	}
	public String getSettlementCheckAmount() {
		return settlementCheckAmount;
	}
	public void setSettlementCheckAmount(String settlementCheckAmount) {
		this.settlementCheckAmount = settlementCheckAmount;
	}
	public String getSettlementCheckPayee() {
		return settlementCheckPayee;
	}
	public void setSettlementCheckPayee(String settlementCheckPayee) {
		this.settlementCheckPayee = settlementCheckPayee;
	}
	public String getSettlementCheckDate() {
		return settlementCheckDate;
	}
	public void setSettlementCheckDate(String settlementCheckDate) {
		this.settlementCheckDate = settlementCheckDate;
	}
	public String getSettlementCheckDepositDate() {
		return settlementCheckDepositDate;
	}
	public void setSettlementCheckDepositDate(String settlementCheckDepositDate) {
		this.settlementCheckDepositDate = settlementCheckDepositDate;
	}
	public double getAccessorialTotal() {
		return accessorialTotal;
	}
	public void setAccessorialTotal(double accessorialTotal) {
		this.accessorialTotal = accessorialTotal;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getNormalizedTotal() {
		return normalizedTotal;
	}
	public void setNormalizedTotal(double normalizedTotal) {
		this.normalizedTotal = normalizedTotal;
	}
	public String getNormalizedTotalCurrency() {
		return normalizedTotalCurrency;
	}
	public void setNormalizedTotalCurrency(String normalizedTotalCurrency) {
		this.normalizedTotalCurrency = normalizedTotalCurrency;
	}
	public String getGlCode() {
		return glCode;
	}
	public void setGlCode(String glCode) {
		this.glCode = glCode;
	}
	public String getCarrierId() {
		return carrierId;
	}
	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
	}
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	public String getCarrierSCAC() {
		return carrierSCAC;
	}
	public void setCarrierSCAC(String carrierSCAC) {
		this.carrierSCAC = carrierSCAC;
	}
	public String getCarrierMode() {
		return carrierMode;
	}
	public void setCarrierMode(String carrierMode) {
		this.carrierMode = carrierMode;
	}
	public String getCarrierServiceDays() {
		return carrierServiceDays;
	}
	public void setCarrierServiceDays(String carrierServiceDays) {
		this.carrierServiceDays = carrierServiceDays;
	}
	public String getCarrierDistance() {
		return carrierDistance;
	}
	public void setCarrierDistance(String carrierDistance) {
		this.carrierDistance = carrierDistance;
	}
	public String getSentToAROn() {
		return sentToAROn;
	}
	public void setSentToAROn(String sentToAROn) {
		this.sentToAROn = sentToAROn;
	}
	public CarrierInvoiceHeader() {
		super();
		
	}
	public CarrierInvoiceHeader(Long id, String filename, String paymentMethod, String billToAddressId, String podReceived,
			String status, String owner, String weight, String weightUom, String settlementQueue,
			String settlementTotal, String settlementReasonCode, String settlementInvoiceNumber,
			String settlementDateType, String settlementDate, String settlementMOP, String settlementComments,
			String settlementCheckNumber, String settlementCheckAmount, String settlementCheckPayee,
			String settlementCheckDate, String settlementCheckDepositDate, double accessorialTotal, double subTotal,
			double total, double normalizedTotal, String normalizedTotalCurrency, String glCode, String carrierId,
			String carrierName, String carrierSCAC, String carrierMode, String carrierServiceDays,
			String carrierDistance, String sentToAROn) {
		super();
		this.id= id;
		this.filename = filename;
		this.paymentMethod = paymentMethod;
		this.billToAddressId = billToAddressId;
		this.podReceived = podReceived;
		this.status = status;
		this.owner = owner;
		this.weight = weight;
		this.weightUom = weightUom;
		this.settlementQueue = settlementQueue;
		this.settlementTotal = settlementTotal;
		this.settlementReasonCode = settlementReasonCode;
		this.settlementInvoiceNumber = settlementInvoiceNumber;
		this.settlementDateType = settlementDateType;
		this.settlementDate = settlementDate;
		this.settlementMOP = settlementMOP;
		this.settlementComments = settlementComments;
		this.settlementCheckNumber = settlementCheckNumber;
		this.settlementCheckAmount = settlementCheckAmount;
		this.settlementCheckPayee = settlementCheckPayee;
		this.settlementCheckDate = settlementCheckDate;
		this.settlementCheckDepositDate = settlementCheckDepositDate;
		this.accessorialTotal = accessorialTotal;
		this.subTotal = subTotal;
		this.total = total;
		this.normalizedTotal = normalizedTotal;
		this.normalizedTotalCurrency = normalizedTotalCurrency;
		this.glCode = glCode;
		this.carrierId = carrierId;
		this.carrierName = carrierName;
		this.carrierSCAC = carrierSCAC;
		this.carrierMode = carrierMode;
		this.carrierServiceDays = carrierServiceDays;
		this.carrierDistance = carrierDistance;
		this.sentToAROn = sentToAROn;
	}
	
	

}
