package be.bt.configuration;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import be.bt.domain.Order;
import be.bt.domain.Produit;

@Configuration   // cionfiguration class : remplacement for beans.xml
@ComponentScan(basePackages="be.bt")
public class AppConfiguration {

	@Bean // producers (producteur) 
	public List<Order> orders(){
		return Arrays.asList(new Order("order1",LocalDate.now(),Arrays.asList(new Produit("A100","AAA",BigDecimal.TEN)
				,new Produit("B100","AAA",BigDecimal.TEN))));
	}
}
