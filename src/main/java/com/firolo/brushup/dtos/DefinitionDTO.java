package com.firolo.brushup.dtos;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DefinitionDTO {
    String word;
    String definition;
}
