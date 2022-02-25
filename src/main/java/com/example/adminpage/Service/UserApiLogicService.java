package com.example.adminpage.Service;

import com.example.adminpage.Controller.ifs.CrudInterface;
import com.example.adminpage.Model.Entity.User;
import com.example.adminpage.Model.Network.Header;
import com.example.adminpage.Model.Network.Request.UserApiRequest;
import com.example.adminpage.Model.Network.Response.UserApiResponse;
import com.example.adminpage.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;

@Service
public class UserApiLogicService implements CrudInterface<UserApiRequest, UserApiResponse> {

    @Autowired
    private UserRepository userRepository;

    // 1. request data
    // 2. user 생성
    // 3. 생성된 user -> response
    @Override
    public Header<UserApiResponse> create(@RequestBody Header<UserApiRequest> userApiRequest) {
        // 1. request data
        UserApiRequest userApiRequest1 = userApiRequest.getData();

        // 2. user 생성
        User user = User.builder()
                .account(userApiRequest1.getAccount())
                .password(userApiRequest1.getPassword())
                .status("REGISTERED")
                .phoneNumber(userApiRequest1.getPhoneNumber())
                .email(userApiRequest1.getEmail())
                .registeredAt(LocalDateTime.now())
                .build();

        User newUser = userRepository.save(user);

        return response(newUser);
    }

    @Override
    public Header<UserApiResponse> read(Long id) {
        return null;
    }

    @Override
    public Header<UserApiResponse> update(@RequestBody Header<UserApiRequest> userApiRequest) {
        return null;
    }

    @Override
    public Header delete(Long id) {
        return null;
    }

    private Header<UserApiResponse> response(User user) {
        // user -> response

        UserApiResponse userApiResponse = UserApiResponse.builder()
                .id(user.getId())
                .account(user.getAccount())
                .password(user.getPassword())
                .email(user.getEmail())
                .phoneNumber(user.getPhoneNumber())
                .status(user.getStatus())
                .registeredAt(user.getRegisteredAt())
                .unregisteredAt(user.getUnregisteredAt())
                .build();

        // Header + data
        return Header.OK(userApiResponse);
    }
}
