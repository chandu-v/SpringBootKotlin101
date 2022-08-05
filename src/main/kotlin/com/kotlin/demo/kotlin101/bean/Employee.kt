package com.kotlin.demo.kotlin101.bean

import lombok.AllArgsConstructor
import lombok.NoArgsConstructor
import javax.persistence.*

@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
data class Employee(var firstName: String, var lastName: String, @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Int, var salary: Double)