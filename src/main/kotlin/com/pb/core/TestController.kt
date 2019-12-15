package com.pb.core

import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletResponse

@RestController
class TestController {

    @GetMapping("/api/foo")
    @ApiOperation(value = "Заглушка", notes = "Тестовый контроллер-заглушка")
    fun test(response: HttpServletResponse): Any {
        response.addHeader("Access-Control-Allow-Origin", "*")
        return object { val value = "foooooooooo" }
    }

}
