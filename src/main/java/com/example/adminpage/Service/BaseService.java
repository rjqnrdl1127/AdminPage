package com.example.adminpage.Service;

import com.example.adminpage.Controller.ifs.CrudInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public abstract class BaseService<request, response, Entity> implements CrudInterface<request, response> {

    @Autowired(required = false)
    protected JpaRepository<Entity, Long> baseRepository;
}
