package com.university.versity.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long courseId;
    @Column
    private String courseCode;
    @Column
    private String courseName;
    @Column
    private boolean enabled=true;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "course_enrollment",joinColumns = @JoinColumn(name = "enrollmentId"),inverseJoinColumns = @JoinColumn(name = "courseId"))
    private List<Enrollment> enrollmentList;

}
