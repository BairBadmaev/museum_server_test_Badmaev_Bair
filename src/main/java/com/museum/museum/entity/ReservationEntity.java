package com.museum.museum.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "reservation")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ReservationEntity {
    @Id
    @Column(name = "reserv_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reserv_id;

    @Column(name = "date_reserv")
    private String date_reserv;

    @Column(name = "count")
    private Integer count;

    @Column(name = "mobile_number")
    private String mobile_number;

    @Column(name = "user_id")
    private Integer user_id;

    public Integer getReserv_id() {
        return reserv_id;
    }

    public void setReserv_id(Integer reserv_id) {
        this.reserv_id = reserv_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getDate_reserv() {
        return date_reserv;
    }

    public void setDate_reserv(String date_reserv) {
        this.date_reserv = date_reserv;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }


}
