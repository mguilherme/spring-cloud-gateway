package com.guilherme.service2;

import com.google.common.collect.ImmutableMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Miguel Guilherme
 */
@Slf4j
@RestController
public class MyController {


    @GetMapping
    public ResponseEntity<Map<String, Object>> getMessage() {

        log.info("Calling Service 2...");

        Map<String, Object> body = ImmutableMap.of("message", "Message from service 2");

        return ResponseEntity.ok(body);
    }

}
