package com.example.adminpage.Controller.api;

import com.example.adminpage.Controller.ifs.CrudInterface;
import com.example.adminpage.Model.Network.Header;
import com.example.adminpage.Model.Network.Request.UserApiRequest;
import com.example.adminpage.Model.Network.Response.UserApiResponse;
import com.example.adminpage.Service.UserApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserApiController implements CrudInterface<UserApiRequest, UserApiResponse> {

    @Autowired
    private UserApiLogicService userApiLogicService;


    @Override
    @PostMapping("")
    public Header<UserApiResponse> create(@RequestBody Header<UserApiRequest> userApiRequest) {
        return userApiLogicService.create(userApiRequest);
    }

    @Override
    @GetMapping("/{id}")
    public Header<UserApiResponse> read(@PathVariable(name = "id") Long id) {
        return null;
    }

    @Override
    @PutMapping("")
    public Header<UserApiResponse> update(@RequestBody Header<UserApiRequest> userApiRequest) {
        return null;
    }

    @Override
    @DeleteMapping("/{id}")
    public Header delete(@PathVariable(name = "id") Long id) {
        return null;
    }
}
