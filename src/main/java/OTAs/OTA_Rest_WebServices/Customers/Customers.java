package OTAs.OTA_Rest_WebServices.Customers;

import java.time.LocalDate;

public class Customers 
{

	    private int CustomerID;
	    private String CompnayName;
	    private String CustomerFirstName;
	    private String CustomerLastName;
	    private LocalDate CreatedDate;
	    

		public Customers(int CustomerID,String CompnayName,String CustomerFirstName,String CustomerLastName,LocalDate CreatedDate)
		{
			this.CustomerID=CustomerID;
			this.CompnayName=CompnayName;
			this.CustomerFirstName=CustomerFirstName;
			this.CustomerLastName=CustomerLastName;
			this.CreatedDate=CreatedDate;
		}


		public int getCustomerID() {
			return CustomerID;
		}


		public void setCustomerID(int customerID) {
			CustomerID = customerID;
		}


		public String getCompnayName() {
			return CompnayName;
		}


		public void setCompnayName(String compnayName) {
			CompnayName = compnayName;
		}


		public String getCustomerFirstName() {
			return CustomerFirstName;
		}


		public void setCustomerFirstName(String customerFirstName) {
			CustomerFirstName = customerFirstName;
		}


		public String getCustomerLastName() {
			return CustomerLastName;
		}


		public void setCustomerLastName(String customerLastName) {
			CustomerLastName = customerLastName;
		}


		public LocalDate getCreatedDate() {
			return CreatedDate;
		}


		public void setCreatedDate(LocalDate createdDate) {
			CreatedDate = createdDate;
		}


	
		
		

}
