package com.university.versity.dto;

import com.university.versity.entity.Batch;
import com.university.versity.entity.Department;
import lombok.Data;

@Data
public class StudentDto {
    private long studentId;
    private String studentName;
    private String studentGender;
    private boolean enabled=true;
    private Department department;
    private Batch batch;

    private long departmentId;
    private long batchId;
}
