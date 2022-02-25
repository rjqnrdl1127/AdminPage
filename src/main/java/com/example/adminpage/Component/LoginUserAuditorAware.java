package com.example.adminpage.Component;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class LoginUserAuditorAware implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("AdminServer");
    }
}
