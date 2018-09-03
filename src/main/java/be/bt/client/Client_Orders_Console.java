package be.bt.client;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import be.bt.business.IOrdersbusiness;
import be.bt.configuration.AppConfiguration;
import be.bt.domain.Order;

@Component
public class Client_Orders_Console {
	@Autowired
	private IOrdersbusiness business;
	
	
	
	public IOrdersbusiness getBusiness() {
		return business;
	}



	public void setBusiness(IOrdersbusiness business) {
		this.business = business;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try(ConfigurableApplicationContext context= new AnnotationConfigApplicationContext(AppConfiguration.class)){
			// récupérer l'object à partir du conteneur
			 Client_Orders_Console client=context.getBean(Client_Orders_Console.class);
	       	BigDecimal total=client.getBusiness().computeTotalPrice("order1");
	       	
	       System.out.println("Got order from Spring factory "+total);
		 }
			
	}

}
