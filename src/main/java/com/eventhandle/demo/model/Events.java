package com.eventhandle.demo.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbevents")
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    @Column(name= "start_date",nullable=false)
    private LocalDateTime startDateTime;
    @Column(name = "end_date",nullable = false)
    private LocalDateTime endDateTime;
    private String location;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Userdb category;

}
