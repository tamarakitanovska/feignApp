package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentApiController {
    @Autowired
    private StudentApi studentApi;

    @RequestMapping(value = "/studentinfo")
    public List<Student> userInfo() {
        return studentApi.studentInfo();
    }
}
