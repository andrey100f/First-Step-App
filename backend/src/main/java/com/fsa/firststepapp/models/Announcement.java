package com.fsa.firststepapp.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Announcements")
public class Announcement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="announcementId")
    private Long announcementId;

    @Column(name="title")
    private String title;

    @Column(name="text")
    private String text;

    @Column(name="url")
    private String url;

    @ManyToOne()
    @JoinColumn(name="university")
    private University university;

    @ManyToOne()
    @JoinColumn(name="faculty")
    private Faculty faculty;
}
