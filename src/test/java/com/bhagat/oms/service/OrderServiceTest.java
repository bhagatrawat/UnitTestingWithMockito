package com.bhagat.oms.service;

import com.bhagat.oms.dao.OrderDao;
import com.bhagat.oms.dto.Customer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class OrderServiceTest {
    OrderDao orderDao;
    @Before
    public void setup(){
        orderDao = mock(OrderDao.class);
    }

    @Test
    public void testGetCustomerByCustomerId(){
        Long custId =1L;
        when(orderDao.findOrderByCustomerId(custId)).thenReturn(new Customer());
        Customer cust = orderDao.findOrderByCustomerId(custId);
        System.out.println("Customer: "+ cust);
        Assert.assertNotNull(cust);
    }
}