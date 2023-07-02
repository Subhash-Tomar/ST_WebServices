package OTAs.OTA_Rest_WebServices.Customers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomersOperations 

{
	private CustomerDataAccessService service;
	
	public CustomersOperations(CustomerDataAccessService service) 
	{
		this.service=service;
	}
	

	@GetMapping("/Get/Customers")
	public List<Customers> GetAllCustomer()
	{
		return service.FindAllCustomers();
	}
	
	@PostMapping("/Get/allCustomers")
	public List<Customers> GetAllCustomers(@RequestBody Customers customer)
	{
		return service.FindAllCustomers();
	}
	
	@GetMapping("/Get/Users")
	public List<Users> GetAllUsers()
	{
		return service.FindAllUsers();
	}
	
	@GetMapping("/Get/Users/{userid}")
	public List<Users> GetOneUser(@PathVariable int userid)
	{
		
		return service.FindOneUser(userid);
	}
	
	@PostMapping("/add/Customers")
	public void CreateCustomer(@RequestBody Customers customer)
	{
		service.AddCustomer(customer);
	}

}
