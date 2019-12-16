package com.pb.core.controllers

import com.pb.core.domain.TestEntity
import com.pb.core.repositories.TestRepository
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletResponse

@RestController
@RequestMapping("/api/test")
class TestController(@Autowired var repository: TestRepository) {

    @GetMapping
    @ApiOperation(value = "Test", notes = "Test controller")
    fun getTest(response: HttpServletResponse): Any {
        response.addHeader("Access-Control-Allow-Origin", "*")
        val findAll = repository.findAll()
        return object {
            val value = findAll
        }
    }

    @PostMapping
    fun createTest(response: HttpServletResponse): Any {
        var obj = TestEntity()
        obj.id = System.currentTimeMillis()
        obj.lastName = "testLastName"
        obj.name = "TestName"
        repository.save(obj)
        return object {
            val value = "${obj.id}"
        }
    }
}
