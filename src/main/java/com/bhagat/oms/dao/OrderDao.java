package com.bhagat.oms.dao;


import com.bhagat.oms.dto.Customer;

public interface OrderDao {
    Customer findOrderByCustomerId(Long customerId);
}
