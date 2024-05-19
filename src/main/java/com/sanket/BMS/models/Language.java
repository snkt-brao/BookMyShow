package com.sanket.BMS.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Language extends BaseModel{
    private String name;
}
