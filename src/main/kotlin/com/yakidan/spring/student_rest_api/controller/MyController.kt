package com.yakidan.spring.student_rest_api.controller

import com.yakidan.spring.student_rest_api.entity.Student
import com.yakidan.spring.student_rest_api.repositories.StudentRepository
import com.yakidan.spring.student_rest_api.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class MyController(
    @Autowired val service: StudentService
) {

    @GetMapping("/students")
    public fun getAllStudents(): List<Student> {
        return service.getAllStudent();
    }
}