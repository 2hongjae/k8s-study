package com.hongjae.k8sstudy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class K8sStudyApplication

fun main(args: Array<String>) {
    runApplication<K8sStudyApplication>(*args)
}
