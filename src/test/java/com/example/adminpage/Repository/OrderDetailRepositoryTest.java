package com.example.adminpage.Repository;

import com.example.adminpage.AdminPageApplicationTests;
import com.example.adminpage.Model.Entity.OrderDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderDetailRepositoryTest extends AdminPageApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void create() {
        OrderDetail orderDetail = new OrderDetail();


    }
}
