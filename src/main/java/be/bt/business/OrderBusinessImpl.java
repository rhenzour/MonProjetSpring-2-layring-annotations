package be.bt.business;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.bt.Repository.IOrderRepository;
import be.bt.domain.Order;
@Service
public class OrderBusinessImpl implements IOrdersbusiness{
	@Autowired
	private IOrderRepository repo;


public IOrderRepository getRepo() {
	return repo;
}


public void setRepo(IOrderRepository repo) {
	this.repo = repo;
}


@Override
public BigDecimal computeTotalPrice(String id) {
	// TODO Auto-generated method stub
Order order= repo.findById(id);
return order.getProducts().stream().map(p->p.getUniPrice()).reduce(BigDecimal.ZERO, BigDecimal::add);
}
}
