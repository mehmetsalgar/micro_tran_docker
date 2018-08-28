package org.salgar.customer.v1.imp;

import org.salgar.customer.api.v1.CustomerService;
import org.salgar.customer.api.v1.model.Customer;
import org.salgar.customer.v1.dao.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Customer giveCustomer(Integer customerId) {
		return customerRepository.findById(customerId);
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Customer saveCustomer(Customer customer) {
		return customerRepository.saveCustomer(customer);
	}
     
	@Override
	@Transactional(readOnly = true, propagation = Propagation.NEVER)
	public String giveAlive() {
		return alive_signal;
	}
}