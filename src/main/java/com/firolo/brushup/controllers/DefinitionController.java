package com.firolo.brushup.controllers;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/definition")
public class DefinitionController {
    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public String test(){
        return "{\"code:\"ok\"}";
    }
}
