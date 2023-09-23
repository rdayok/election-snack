package com.rdi.evotersapp.controllers;

import com.rdi.evotersapp.dtos.requests.AdminRegistrationRequest;
import com.rdi.evotersapp.dtos.responses.AdminRegistrationResponse;
import com.rdi.evotersapp.services.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admins")
public class AdminController {

    private final AdminService adminService;


    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping
    public ResponseEntity<AdminRegistrationResponse> register(AdminRegistrationRequest adminRegistrationRequest){
        AdminRegistrationResponse savedAdmin = adminService.register(adminRegistrationRequest);
        return new ResponseEntity<>(savedAdmin, HttpStatus.OK);
    }


}
