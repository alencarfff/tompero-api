package com.felipealencar.tomperoapi.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Data
@Entity
@NoArgsConstructor
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private Integer userId;

    @NotNull
    private Integer subcategoryId;

    @NotNull
    @Max(value = 80)
    private String title;

    @NotNull
    @Max(value = 255)
    private String description;

    @NotNull
    private Integer averageAvaliation;

    @NotNull
    @Min(value = 1)
    @Max(value = 5)
    private Integer difficulty;

    @NotNull
    private String imagePath;

    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Timestamp creationDate;
}
