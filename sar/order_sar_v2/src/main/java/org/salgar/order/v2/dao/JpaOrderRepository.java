package org.salgar.order.v2.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.salgar.order.api.v2.model.Order;
import org.springframework.stereotype.Repository;

@Repository
public class JpaOrderRepository implements OrderRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Order findOrderByd(Integer orderId) {
		return entityManager.find(Order.class, orderId);
	}

	@Override
	public Order saveOrder(Order order) {
		return entityManager.merge(order);
	}
}