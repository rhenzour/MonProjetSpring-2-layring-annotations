package be.bt.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import be.bt.domain.Order;
@Repository("ordersRepositoryImpl")
public class OrdersRepositoryImpl implements IOrderRepository {
	@Autowired
	private List<Order> order;

	
public void setOrder(List<Order> order) {
	this.order = order;
}

	@Override
	public void create(Order o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Order findById(String id) {
	return order.stream().filter(o->o.getOrderId().equals(id)).findFirst().orElse(null);
	}

	@Override
	public List<Order> findAll() {
		return order;
	}

	@Override
	public Order update(Order o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
