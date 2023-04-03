package org.dani.controller;

import lombok.AllArgsConstructor;
import org.dani.client.Service2Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Controller {
    private final Service2Client service2Client;
    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<String>(service2Client.hello() + " | called by service", HttpStatus.OK);
    }
}
