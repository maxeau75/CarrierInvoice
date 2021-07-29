package entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EntityImpl implements EntityInterface {

	@Override
	public List<CarrierInvoiceHeader> getCarrierInvoiceHeaderByKW(String kw) {
		List<CarrierInvoiceHeader> carinv= new ArrayList<CarrierInvoiceHeader>();
		Connection conn= SingletonConnection.getConnection();
		try {
			PreparedStatement ps= conn.prepareStatement("select * from CarrierInvoiceHeader where settlementInvoiceNumber like ?");
			ps.setString(1, "%"+ kw+"%");
			ResultSet rs= ps.executeQuery();
			while(rs.next())
			{
				CarrierInvoiceHeader cain=new CarrierInvoiceHeader();
				  cain.setId(rs.getLong("id"));
				  cain.setFilename(rs.getString("filename"));
				  cain.setPaymentMethod(rs.getString("paymentMethod"));
				  cain.setBillToAddressId(rs.getString("billToAddressId"));
				  cain.setPodReceived(rs.getString("podReceived"));
				  cain.setStatus(rs.getString("status")); 
				  cain.setOwner(rs.getString("owner"));
				  cain.setWeight(rs.getString("weight"));
				  cain.setWeightUom(rs.getString("weightUom"));
				  cain.setSettlementQueue(rs.getString("settlementQueue"));
				  cain.setSettlementTotal(rs.getString("settlementTotal"));
				  cain.setSettlementReasonCode(rs.getString("settlementReasonCode"));
				  cain.setSettlementInvoiceNumber(rs.getString("settlementInvoiceNumber"));
				  cain.setSettlementDateType(rs.getString("settlementDateType"));
				  cain.setSettlementDate(rs.getString("settlementDate"));
				  cain.setSettlementMOP(rs.getString("settlementMOP"));
				  cain.setSettlementComments(rs.getString("settlementComments"));
				  cain.setSettlementCheckNumber(rs.getString("settlementCheckNumber"));
				  cain.setSettlementCheckAmount(rs.getString("settlementCheckAmount"));
				  cain.setSettlementCheckPayee(rs.getString("settlementCheckPayee"));
				  cain.setSettlementCheckDate(rs.getString("settlementCheckDate"));
				  cain.setSettlementCheckDepositDate(rs.getString("settlementCheckDepositDate"));
				  cain.setAccessorialTotal(rs.getDouble("accessorialTotal"));
				  cain.setSubTotal(rs.getDouble("subTotal"));
				  cain.setTotal(rs.getDouble("total"));
				  cain.setNormalizedTotal(rs.getDouble("normalizedTotal"));
				  cain.setNormalizedTotalCurrency(rs.getString("normalizedTotalCurrency"));
				  cain.setGlCode(rs.getString("glCode"));
				  cain.setCarrierId(rs.getString("carrierId"));
				  cain.setCarrierName(rs.getString("carrierName"));
				  cain.setCarrierSCAC(rs.getString("carrierSCAC"));
				  cain.setCarrierMode(rs.getString("carrierMode"));
				  cain.setCarrierServiceDays(rs.getString("carrierServiceDays"));
				  cain.setCarrierDistance(rs.getString("carrierDistance"));
				  cain.setSentToAROn(rs.getString("sentToAROn"));
				  carinv.add(cain); 
			}
			
			//ps.close(); 
			//conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return carinv;
	}

	@Override
	public void addCarrierInvoiceHeader(CarrierInvoiceHeader cain) {
		// TODO Auto-generated method stub
		
	}
	
	

}
