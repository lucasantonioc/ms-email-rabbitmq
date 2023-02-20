package com.ms.email.controllers;

import com.ms.email.consumers.consumers.EmailConsumer;
import com.ms.email.dtos.EmailDto;
import com.ms.email.models.EmailModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class EmailController {

    @Autowired
    private EmailConsumer emailConsumer;

    @PostMapping("/sending-email")
    public ResponseEntity<EmailModel> sendingEmail(@RequestBody @Valid EmailDto emailDto) {
        return emailConsumer.listen(emailDto);
    }

}
