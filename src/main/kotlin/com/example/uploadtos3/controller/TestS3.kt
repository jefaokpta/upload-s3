package com.example.uploadtos3.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import software.amazon.awssdk.services.s3.S3Client

/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 12/07/23
 */
@RestController
@RequestMapping("/s3")
class TestS3(private val uploadService: UploadService) {

    @GetMapping("list")
    fun listBuckets() = S3Client.builder().build().listBuckets().buckets().map { it.name() }

    @GetMapping("upload")
    fun upload() = uploadService.upload()
}