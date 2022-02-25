package com.example.adminpage.Repository;

import com.example.adminpage.Model.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findFirstByPhoneNumberOrderById(String phoneNumber);
}
