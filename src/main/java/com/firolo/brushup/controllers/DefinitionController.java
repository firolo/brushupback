package com.firolo.brushup.controllers;


import com.firolo.brushup.dtos.DefinitionDTO;
import com.firolo.brushup.services.IDefinitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/definition")
public class DefinitionController {
    @Autowired
    IDefinitionService definitionService;
    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public DefinitionDTO test(@RequestParam String word){
        return definitionService.getDefinition(word);
    }
}
