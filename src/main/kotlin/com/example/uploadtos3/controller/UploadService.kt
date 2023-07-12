package com.example.uploadtos3.controller

import org.springframework.stereotype.Service
import software.amazon.awssdk.services.s3.S3Client
import software.amazon.awssdk.services.s3.model.PutObjectRequest
import java.io.File

/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 12/07/23
 */
@Service
class UploadService {

    fun upload() {
        val file = File("imgs/re2.jpg")
        val img = PutObjectRequest.builder()
            .bucket("wip-medias")
            .key("uploads/re2.jpg")
            .build()
        println(S3Client.builder().build().putObject(img, file.toPath()))
    }
}