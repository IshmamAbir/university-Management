package com.university.versity.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;
    @Column
    private String studentName;
    @Column
    private String studentGender;
    @Column
    private boolean enabled=true;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "departmentId")
    private Department department;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "student_batch",joinColumns = @JoinColumn(name = "batchId"),inverseJoinColumns = @JoinColumn(name = "studentId"))
    private Batch batch;

}
