package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUsername}")
	private String dbUsername;
	
	public HibernateCustomerRepositoryImpl() {
		System.out.println("Hibernate Customer Repository Implementation is initialized!");
		
	}
	
	/* (non-Javadoc)
	 * @see com.pluralsight.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		
		
		System.out.println("dbUsername -> " + dbUsername); //test app.properties usage
		
		List<Customer> customersList = new ArrayList<>();

		Customer customer = new Customer();
		customer.setFirstname("Seckin");
		customer.setLastname("Ozden");

		customersList.add(customer);

		return customersList;
	}
}
