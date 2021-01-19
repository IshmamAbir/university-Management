package com.university.versity.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "semester")
public class Semester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long semesterId;
    @Column
    private String semesterName;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "semester_enrollment",joinColumns = @JoinColumn(name = "enrollmentId"),inverseJoinColumns = @JoinColumn(name = "semesterId"))
    private List<Enrollment> enrollmentList;

}
