package com.firolo.brushup.services.impl;

import com.firolo.brushup.dtos.DefinitionDTO;
import com.firolo.brushup.services.IDefinitionService;
import org.springframework.stereotype.Service;

@Service
public class DefinitionServiceImpl implements IDefinitionService {

    @Override
    public DefinitionDTO getDefinition(String word) {
        if(word.equals("test")) {
            return DefinitionDTO.builder().word(word).definition("test of something").build();
        }
        if(word.equals("brush up")) {
            return DefinitionDTO.builder().word(word).definition("definition brush up").build();
        }
        return DefinitionDTO.builder().word("not found").definition("not found").build();
    }
}
