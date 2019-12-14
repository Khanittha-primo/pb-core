package com.pb.core

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletResponse

@RestController
class TestController {

    @GetMapping("/api/foo")
    fun test(response: HttpServletResponse): Any {
        response.addHeader("Access-Control-Allow-Origin", "*")
        return object { val value = "foooooooooo" }
    }

}
