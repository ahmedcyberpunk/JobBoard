package com.example.meeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mic4/meeting")
public class MeetingRestApi {
    @GetMapping("/hello")
    public String hello() {
        return "hello micro 4";
    }
}
