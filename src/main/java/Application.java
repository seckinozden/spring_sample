import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		CustomerService service = applicationContext.getBean(CustomerService.class);
		CustomerService service2 = applicationContext.getBean(CustomerService.class);
		
		//test bean scopes
		System.out.println(service);
		System.out.println(service2);
		
		System.out.println(service.findAll().get(0).getFirstname());
	}

}
