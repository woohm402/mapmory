package com.example.demo

import jakarta.persistence.*

@Entity
class Country (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0L,

        val title: String,
)