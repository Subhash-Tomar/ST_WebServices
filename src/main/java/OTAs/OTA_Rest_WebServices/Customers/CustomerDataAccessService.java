package OTAs.OTA_Rest_WebServices.Customers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class CustomerDataAccessService

{

	private static List<Customers> CustomersD=new ArrayList<>();
	private static List<Users> Userid=new ArrayList<>();

	static
	{
		CustomersD.add(new Customers(1,"Booking","A","M",LocalDate.now()) );
		CustomersD.add(new Customers(2,"Booking","B","M",LocalDate.now()) );
        CustomersD.add(new Customers(3,"Booking","C","M",LocalDate.now()) );

		
	}
	
	static
	{
		Userid.add(new Users(1,1,"A","M",LocalDate.now()) );
		Userid.add(new Users(2,1,"B","M",LocalDate.now()) );
		Userid.add(new Users(2,2,"C","M",LocalDate.now()) );
		Userid.add(new Users(4,3,"A","M",LocalDate.now()) );
		Userid.add(new Users(5,3,"B","M",LocalDate.now()) );
		Userid.add(new Users(6,3,"C","M",LocalDate.now()) );

	}
	
	
	public List<Customers> FindAllCustomers()
	{
		return CustomersD;
		
	}
	
	public List<Users> FindAllUsers()
	{
		return Userid;
		
	}
	
	public List<Users> FindOneUser(int userid)
	{
		Predicate<? super Users> predicate=users-> users.getUserid()==userid;
		return Userid.stream().filter(predicate).collect(Collectors.toList());
			
	}
	
	public Customers AddCustomer(Customers customer) 
	{
		CustomersD.add(customer);
		return customer;
	}
	
}
