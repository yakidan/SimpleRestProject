package com.yakidan.spring.student_rest_api.repositories

import com.yakidan.spring.student_rest_api.entity.Student
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository:JpaRepository<Student,Int> {
}