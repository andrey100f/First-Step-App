package com.fsa.firststepapp.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Entity
@Table(name="Questions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="questionId")
    private Long questionId;

    @Column(name="text")
    private String text;

    @Column(name="questionDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date questionDate;

    @Column(name="category")
    private String category;

    @ManyToOne()
    @JoinColumn(name="posterId", nullable = false)
    private User user;

    @OneToMany(mappedBy = "question")
    private List<Answer> answers;
    
}
