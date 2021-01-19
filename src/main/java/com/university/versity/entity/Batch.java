package com.university.versity.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "batch")
public class Batch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long batchId;
    @Column
    private String batchName;
    @Column
    private String batchYear;
    @Column
    private boolean enabled=true;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "student_batch",joinColumns = @JoinColumn(name = "studentId"),inverseJoinColumns = @JoinColumn(name = "batchId"))
    private List<Student> studentList;

}
