package com.museum.museum.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "showroom")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ShowroomEntity {
    @Id
    @Column(name = "showroom_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer showroom_id;

    @Column(name = "first_name")
    private String first_name;

    public Integer getShowroom_id() {
        return showroom_id;
    }

    public void setShowroom_id(Integer showroom_id) {
        this.showroom_id = showroom_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
}
