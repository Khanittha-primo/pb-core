package com.pb.core

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletResponse

@RestController
class TestController {

    @GetMapping("/foo")
    fun test(response: HttpServletResponse) = object {
        val field = "fooooo"
    }

}
