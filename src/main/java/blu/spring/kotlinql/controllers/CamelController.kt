package blu.spring.kotlinql.controllers

import org.apache.camel.ProducerTemplate
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Suppress("UNCHECKED_CAST")
@RestController
class CamelController(private val producerTemplate: ProducerTemplate) {

    @RequestMapping("/")
    fun startCamel() {
        producerTemplate.sendBody("direct:start", "")
    }

}