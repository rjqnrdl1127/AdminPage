package com.example.adminpage.Controller.api;

import com.example.adminpage.Controller.CrudController;
import com.example.adminpage.Model.Entity.User;
import com.example.adminpage.Model.Network.Request.UserApiRequest;
import com.example.adminpage.Model.Network.Response.UserApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserApiController extends CrudController<UserApiRequest, UserApiResponse, User> {

}
