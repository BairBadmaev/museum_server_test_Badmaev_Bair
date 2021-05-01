package com.museum.museum.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "exhibits")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ExhibitsEntity {
    @Id
    @Column(name = "exhibits_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer exhibits_id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "habitat")
    private String habitat;

    @Column(name = "description")
    private String description;

    @Column(name = "year_BC")
    private String year_BC;

    public Integer getExhibit_id() {
        return exhibits_id;
    }

    public void setExhibit_id(Integer exhibit_id) {
        this.exhibits_id = exhibit_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYear_BC() {
        return year_BC;
    }

    public void setYear_BC(String year_BC) {
        this.year_BC = year_BC;
    }
}
