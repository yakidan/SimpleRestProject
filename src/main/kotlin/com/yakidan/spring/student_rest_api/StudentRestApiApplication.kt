package com.yakidan.spring.student_rest_api

import com.yakidan.spring.student_rest_api.entity.Student
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StudentRestApiApplication

fun main(args: Array<String>) {
    var value = Student(1, "Sergey", "ITMO");
    runApplication<StudentRestApiApplication>(*args)
}
