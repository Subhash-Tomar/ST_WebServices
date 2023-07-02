package OTAs.OTA_Rest_WebServices.Customers;

import java.time.LocalDate;

public class Users 

{
	
	private int Userid;
	private int Customerid;
	private String UserFirstname;
	private String UserLastname;
	private LocalDate CreatedDate;
	
	
	public Users(int Userid,int Customerid, String UserFirstname,String UserLastname,LocalDate CreatedDate)
	{
		this.Userid=Userid;
		this.Customerid=Customerid;
		this.UserFirstname=UserFirstname;
		this.UserLastname=UserLastname;
		this.CreatedDate=CreatedDate;
	}
	
	public int getUserid() {
		return Userid;
	}


	public void setUserid(int userid) {
		Userid = userid;
	}


	public int getCustomerid() {
		return Customerid;
	}


	public void setCustomerid(int customerid) {
		Customerid = customerid;
	}


	public String getUserFirstname() {
		return UserFirstname;
	}


	public void setUserFirstname(String userFirstname) {
		UserFirstname = userFirstname;
	}


	public String getUserLastname() {
		return UserLastname;
	}


	public void setUserLastname(String userLastname) {
		UserLastname = userLastname;
	}


	public LocalDate getCreatedDate() {
		return CreatedDate;
	}


	public void setCreatedDate(LocalDate createdDate) {
		CreatedDate = createdDate;
	}


	
	
}
