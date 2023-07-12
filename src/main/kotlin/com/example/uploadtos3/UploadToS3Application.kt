package com.example.uploadtos3

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UploadToS3Application

fun main(args: Array<String>) {
    runApplication<UploadToS3Application>(*args)
}
