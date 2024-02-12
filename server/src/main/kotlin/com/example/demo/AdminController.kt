package com.example.demo

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AdminController(private val adminService: AdminService) {
    @PostMapping("/api/admin/v1/map/init")
    fun initMap() {
        adminService.initMap()
    }
}