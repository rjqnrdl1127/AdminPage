package com.example.adminpage.Controller.api;

import com.example.adminpage.Controller.CrudController;
import com.example.adminpage.Model.Entity.OrderGroup;
import com.example.adminpage.Model.Network.Request.OrderGroupApiRequest;
import com.example.adminpage.Model.Network.Response.OrderGroupApiResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/api/orderGroup")
public class OrderGroupApiController extends CrudController<OrderGroupApiRequest, OrderGroupApiResponse, OrderGroup> {

}
