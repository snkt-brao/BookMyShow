package com.sanket.BMS.models;

import com.sanket.BMS.models.enums.Feature;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel {
    private String name;
    private String language;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features;
}
