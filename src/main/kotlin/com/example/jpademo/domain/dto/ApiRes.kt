package com.example.jpademo.domain.dto

import java.time.LocalDateTime
import java.time.ZoneId

data class ApiRes(
    var code: String = "200",
    var message: String = "ok",
    var timestamp: Long = LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli(),
    var result: ResponseData
)
