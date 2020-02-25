package com.mango.cors1;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 凌风的MI
 */
@RestController
// @CrossOrigin(origins = "http://localhost:8081")
public class HelloController {

    @GetMapping("/doGet")
    public String getData() {
        return "hello get cors";
    }

    @PutMapping("/doPut")
    public String putData(){
        return "hello put cors";
    }
}
