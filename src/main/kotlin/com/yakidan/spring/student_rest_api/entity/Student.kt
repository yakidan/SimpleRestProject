package com.yakidan.spring.student_rest_api.entity

import lombok.Getter
import lombok.Setter
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "students")
class Student(
    @Id @Getter @Setter @Column(name = "id") val id: Int,
    @Getter @Setter @Column(name = "name") val name: String,
    @Getter @Setter @Column(name = "university") val university: String
) {


}