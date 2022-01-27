package com.example.adosysspringboot.registration;

import com.example.adosysspringboot.appuser.AppUser;
import com.example.adosysspringboot.appuser.AppUserRole;
import com.example.adosysspringboot.appuser.AppUserService;
import com.example.adosysspringboot.token.ConfirmationTokenService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final AppUserService appUserService;
    private final ConfirmationTokenService confirmationTokenService;

    public String register(RegistrationRequest request) {

        return appUserService.singUpUser(
                new AppUser(
                        request.getUsername(),
                        request.getPassword(),
                        AppUserRole.USER
                )
        );

    }
}
