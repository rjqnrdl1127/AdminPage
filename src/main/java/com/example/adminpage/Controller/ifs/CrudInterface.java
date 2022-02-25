package com.example.adminpage.Controller.ifs;

import com.example.adminpage.Model.Network.Header;
import com.example.adminpage.Model.Network.Request.UserApiRequest;
import com.example.adminpage.Model.Network.Response.UserApiResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface CrudInterface<Request, Response> {

    Header<Response> create(Header<Request> request);

    Header<Response> read(Long id);

    Header<Response> update(Header<Request> request);

    Header delete(Long id);
}
