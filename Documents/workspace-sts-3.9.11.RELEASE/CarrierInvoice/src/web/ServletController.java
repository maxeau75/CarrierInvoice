package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.CarrierInvoiceHeader;
import entity.EntityImpl;
import entity.EntityInterface;


public class ServletController extends HttpServlet {
	private EntityInterface entity;
	@Override
	public void init() throws ServletException
	{
		entity= new EntityImpl();
		//super.init();
	}
	
	//Read data request
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException
	{
		String kw= request.getParameter("keyWord");
		CarrierInvoiceHeaderModel mod= new CarrierInvoiceHeaderModel();		
		mod.setKeyWord(kw);
		List<CarrierInvoiceHeader> carrierinvoice= entity.getCarrierInvoiceHeaderByKW(kw);
		mod.setCarrierinvoice(carrierinvoice);
		request.setAttribute("model", mod);
		request.getRequestDispatcher("CarrierInvoiceHeadersView.jsp").forward(request, response);
		
	}
	

}
