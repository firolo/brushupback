package com.firolo.brushup.services;

import com.firolo.brushup.dtos.DefinitionDTO;

public interface IDefinitionService {
    DefinitionDTO getDefinition(String word);
}
