package com.yakidan.spring.student_rest_api.service

import com.yakidan.spring.student_rest_api.entity.Student
import com.yakidan.spring.student_rest_api.repositories.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService(
    @Autowired
    val s: StudentRepository
) {


    //    @Autowired


    fun getAllStudent(): List<Student> {
        return s.findAll();
    }

}