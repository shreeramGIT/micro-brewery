package com.shree.microbrewery.web.model;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CostumerDto {
    private UUID id;
    private String name;
}
