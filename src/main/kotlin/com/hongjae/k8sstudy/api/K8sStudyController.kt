package com.hongjae.k8sstudy.api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/k8s/v1")
class K8sStudyController {
    @GetMapping
    fun hello() = ResponseEntity.ok("hello")
}