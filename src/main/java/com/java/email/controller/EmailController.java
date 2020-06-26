package com.java.email.controller;

import com.java.email.modal.Email;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emails")
public class EmailController {

    @GetMapping("/{id}")
    public ResponseEntity<Email> getEmailByUserId(@PathVariable("id") Integer id) {
        Email email = new Email(id + "@rest.local");
        return ResponseEntity.ok(email);
    }
}
