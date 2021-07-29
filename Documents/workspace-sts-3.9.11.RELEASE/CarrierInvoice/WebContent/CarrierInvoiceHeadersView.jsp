<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="controller.php"  method="post">
	Search:<input type="text" name="keyWord" value="${model.keyWord}">
	<input type="submit" value="OK">
 </form>
 <table border="1" width="80%">
   <tr>
	 <th>id</th><th>filename</th><th>paymentMethod</th><th>billToAddressId</th><th>podReceived</th><th>status</th><th>owner</th><th>weight</th><th>weightUom</th><th>settlementQueue</th><th>settlementTotal</th><th>settlementReasonCode</th><th>settlementInvoiceNumber</th><th>settlementDateType</th><th>settlementDate</th><th>settlementMOP</th><th>settlementComments</th><th>settlementCheckNumber</th><th>settlementCheckAmount</th><th>settlementCheckPayee</th><th>settlementCheckDate</th><th>settlementCheckDepositDate</th><th>accessorialTotal</th><th>subTotal</th><th>total</th><th>normalizedTotal</th><th>normalizedTotalCurrency</th><th>glCode</th><th>carrierId</th><th>carrierName</th><th>carrierSCAC</th><th>carrierMode</th><th>carrierServiceDays</th><th>carrierDistance</th><th>sentToAROn</th>
   </tr>
   <c:forEach items="${model.carrierinvoice}" var="p">
   	 <tr>
   	   <td>${p.id}</td>
   	   <td>${p.filename}</td>
   	   <td>${p.paymentMethod}</td>
   	   <td>${p.billToAddressId}</td>
   	   <td>${p.podReceived}</td>
   	   <td>${p.status}</td>
   	   <td>${p.owner}</td>
   	   <td>${p.weight}</td>
   	   <td>${p.weightUom}</td>
   	   <td>${p.settlementQueue}</td>
   	   <td>${p.settlementTotal}</td>
   	   <td>${p.settlementReasonCode}</td>
   	   <td>${p.settlementInvoiceNumber}</td>
   	   <td>${p.settlementDateType}</td>
   	   <td>${p.settlementDate}</td>
   	   <td>${p.settlementMOP}</td>
   	   <td>${p.settlementComments}</td>
   	   <td>${p.settlementCheckNumber}</td>
   	   <td>${p.settlementCheckAmount}</td>
   	   <td>${p.settlementCheckPayee}</td>
   	   <td>${p.settlementCheckDate}</td>
   	   <td>${p.settlementCheckDepositDate}</td>
   	   <td>${p.accessorialTotal}</td>
   	   <td>${p.subTotal}</td>
   	   <td>${p.total}</td>
   	   <td>${p.normalizedTotal}</td>
   	   <td>${p.normalizedTotalCurrency}</td>
   	   <td>${p.glCode}</td>
   	   <td>${p.carrierId}</td>
   	   <td>${p.carrierName}</td>
   	   <td>${p.carrierSCAC}</td>
   	   <td>${p.carrierMode}</td>
   	   <td>${p.carrierServiceDays}</td>
   	   <td>${p.carrierDistance}</td>
   	   <td>${p.sentToAROn}</td>
	</c:forEach>
 </table>
</body>
</html>