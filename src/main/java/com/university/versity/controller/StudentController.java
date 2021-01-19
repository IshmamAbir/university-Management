package com.university.versity.controller;

import com.university.versity.dto.StudentDto;
import com.university.versity.service.DepartmentService;
import com.university.versity.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private DepartmentService departmentService;
    @GetMapping("/add")
    public String getAddPage(Model model) {
        model.addAttribute("studentDto", new StudentDto());
        model.addAttribute("departmentListDto",
                this.departmentListToDepartmentDtoList(departmentService.getAllDepartment()));
        model.addAttribute("genderList", this.genderList());

        model.addAttribute("subjectListDto",this.getSubjectDtoList(subjectService.getAllSubject()));
        return "student/add";
    }

}
