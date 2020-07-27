package com.felipealencar.tomperoapi.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private Integer city_id;

    @NotNull
    private String name;

    @NotNull
    private String address;

    @NotNull
    private String number;

    @NotNull
    private String cep;

    @NotNull
    private String complement;

    @NotNull
    private String neighborhood;
}
