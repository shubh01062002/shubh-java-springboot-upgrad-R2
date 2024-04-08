package com.upGrad.interview.Entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@Table(name = "Movies")


public class MoviesEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @Column(name = "title", nullable = false, length = 255)
    private String title;

    @Column(name = "release_year" , nullable=false)
    private Integer release_year;

     @Column(name = "runtime" , nullable=true)
    private Integer runtime;



    @Column(name = "plot", nullable = true, length = 255)
    private String plot;

}