package com.example.firstjpa.Controller;

import com.example.firstjpa.ResponseApi.ResponsefromApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1")
public class GetController {
    @GetMapping("/testdata")
    public ResponseEntity<?> GetData(){
        return ResponseEntity.ok(new ResponsefromApi<>(
              "Hello" ,
              LocalDateTime.now(),
                true
        ));
    }
}
