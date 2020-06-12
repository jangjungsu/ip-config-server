package com.dealicious.configserver;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jungsu on 2020. 05. 18.
 */
@RestController
public class HealthController {

    @GetMapping({"/", "/health"})
    public ResponseEntity healthCheck() {

        return ResponseEntity.status(HttpStatus.OK).body("ip-config-server");
    }
}
