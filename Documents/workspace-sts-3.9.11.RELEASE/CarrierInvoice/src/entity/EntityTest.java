package entity;

import java.sql.Connection;
import java.util.List;

import entity.SingletonConnection;

public class EntityTest{

	public static void main(String[] args){
		
		
		Connection conn= SingletonConnection.getConnection();
		EntityImpl entity= new EntityImpl();
		try 
		{
		List<CarrierInvoiceHeader> carinv= entity.getCarrierInvoiceHeaderByKW("");
		for(CarrierInvoiceHeader cain:carinv)
		{
			System.out.println(cain.getId());
			System.out.println(cain.getFilename());
			System.out.println(cain.getAccessorialTotal());
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println();
		}

	}

	}
