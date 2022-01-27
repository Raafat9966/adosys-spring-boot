package com.example.adosysspringboot.registration;

import com.example.adosysspringboot.appuser.AppUser;
import com.example.adosysspringboot.appuser.AppUserRepository;
import com.example.adosysspringboot.token.ConfirmationToken;
import com.example.adosysspringboot.token.ConfirmationTokenService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path= "api/v1/registration")
public class RegistrationController {

    private final RegistrationService registrationService;
    private final AppUserRepository appUserRepository;

    public RegistrationController(RegistrationService registrationService, AppUserRepository appUserRepository) {

        this.registrationService = registrationService;
        this.appUserRepository = appUserRepository;
    }

    @PostMapping
    public String register(@RequestBody RegistrationRequest request) {
        return registrationService.register(request);
    }

    @GetMapping("/users")
    public List<AppUser> getUser() {
        return appUserRepository.findAll();
    }

}
