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
        when(orderDao.findOrderByCustomerId(custId)).thenReturn(new Customer("Bhagat", "Singh", "Irvine, CA, 92604"));
        Customer cust = orderDao.findOrderByCustomerId(custId);
        System.out.println("Customer: "+ cust);
        Assert.assertNotNull(cust);
        Assert.assertTrue("First Name should be Bhagat:", cust.getFirstName().equals("Bhagat"));
        Assert.assertTrue("Last Name should be Singh:", cust.getLastName().equals("Singh"));
        Assert.assertTrue("Address should be Irvine, CA, 92604", cust.getAddress().equals("Irvine, CA, 92604"));
    }
}