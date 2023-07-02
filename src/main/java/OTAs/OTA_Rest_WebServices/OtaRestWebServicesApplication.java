package OTAs.OTA_Rest_WebServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class OtaRestWebServicesApplication extends SpringBootServletInitializer 
{
	
	

	public static void main(String[] args) {
		SpringApplication.run(OtaRestWebServicesApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(OtaRestWebServicesApplication.class);
    }
}

