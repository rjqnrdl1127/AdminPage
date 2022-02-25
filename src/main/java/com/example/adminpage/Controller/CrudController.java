package com.example.adminpage.Controller;

import com.example.adminpage.Controller.ifs.CrudInterface;
import com.example.adminpage.Model.Network.Header;
import com.example.adminpage.Model.Network.Response.UserApiResponse;
import com.example.adminpage.Service.BaseService;
import com.example.adminpage.Service.UserApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
public abstract class CrudController<request, response, Entity> implements CrudInterface<request, response> {

    @Autowired(required = false)
    protected BaseService<request, response, Entity> baseService;

    @Override
    @PostMapping("")
    public Header<response> create(@RequestBody Header<request> request) {
        return baseService.create(request);
    }

    @Override
    @GetMapping("{id}")
    public Header<response> read(@PathVariable Long id) {
        return baseService.read(id);
    }

    @Override
    @PutMapping("")
    public Header<response> update(@RequestBody Header<request> request) {
        return baseService.update(request);
    }

    @Override
    @DeleteMapping("{id}")
    public Header delete(@PathVariable Long id) {
        return baseService.delete(id);
    }
}
