package com.example.jpademo.common.exception.advice

import org.springframework.http.HttpStatus

class DemoException(override val status: HttpStatus, override val code: Int) : MyException()