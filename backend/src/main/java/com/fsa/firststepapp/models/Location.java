package com.fsa.firststepapp.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Locations")
public class Location implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="locationId")
    private Long locationId;

    @Column(name="name")
    private String name;

    @Column(name="type")
    private String type;

    @Column(name="latitude")
    private String latitude;

    @Column(name="longitude")
    private String longitude;

    @Column(name="img")
    private String img;

    @Column(name="description")
    private String description;

    @Column(name="site")
    private String site;

    @OneToMany(mappedBy = "location")
    private List<Event> events;
}
