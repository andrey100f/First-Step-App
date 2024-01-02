package com.fsa.firststepapp.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Faculties")
public class Faculty implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="facultyId")
    private Long facultyId;

    @Column(name="name")
    private String name;

    @ManyToOne()
    @JoinColumn(name="university", nullable = false)
    private University university;

    @OneToMany(mappedBy = "faculty")
    private List<User> users;

    @OneToMany(mappedBy = "faculty")
    private List<Announcement> announcements;
}
