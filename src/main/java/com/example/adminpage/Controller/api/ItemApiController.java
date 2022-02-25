package com.example.adminpage.Controller.api;

import com.example.adminpage.Controller.CrudController;
import com.example.adminpage.Model.Entity.Item;
import com.example.adminpage.Model.Network.Request.ItemApiRequest;
import com.example.adminpage.Model.Network.Response.ItemApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("/api/item")
public class ItemApiController extends CrudController<ItemApiRequest, ItemApiResponse, Item>{

}
