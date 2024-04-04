package com.upGrad.interview.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CountryDto {

    private int id;
    private String name;
    private String shortName;
    private int phoneCode;
    private String status;
    private String isDeleted;
}
