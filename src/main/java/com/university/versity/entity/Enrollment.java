package com.university.versity.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "enrollment")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long enrollmentId;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "course_enrollment",joinColumns = @JoinColumn(name = "courseId"),inverseJoinColumns = @JoinColumn(name = "enrollmentId"))
    private List<Course> courseList;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "semester_enrollment",joinColumns = @JoinColumn(name = "semesterId"),inverseJoinColumns = @JoinColumn(name = "enrollmentId"))
    private List<Semester> semesterList;



}
