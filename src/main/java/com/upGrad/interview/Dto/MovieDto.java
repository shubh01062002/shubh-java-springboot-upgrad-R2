package com.upGrad.interview.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class MovieDto {

    private int id;
    private String title;
    private int release_year;
    private int runtime;
    private String plot;


}
