package com.example.jpademo.common.exception.advice

import org.springframework.http.HttpStatus

abstract class MyException : java.lang.Exception() {
    abstract val status: HttpStatus
    abstract val code: Int
}