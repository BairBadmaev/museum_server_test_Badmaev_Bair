package com.museum.museum.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;



@Entity
@Table(name = "exhibits_in_showroom")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Exhibits_in_showroomEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "exhibits_id")
    private Integer exhibits_id;

    @Column(name = "showroom_id")
    private Integer showroom_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExhibits_id() {
        return exhibits_id;
    }

    public void setExhibits_id(Integer exhibits_id) {
        this.exhibits_id = exhibits_id;
    }

    public Integer getShowroom_id() {
        return showroom_id;
    }

    public void setShowroom_id(Integer showroom_id) {
        this.showroom_id = showroom_id;
    }


}
