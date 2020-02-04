package blu.spring.kotlinql.controllers

import org.apache.camel.Produce
import org.apache.camel.ProducerTemplate
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Suppress("UNCHECKED_CAST")
@RestController
class CamelController(@Produce(uri = "direct:start") private val producerTemplate: ProducerTemplate) {

    @RequestMapping("/")
    fun startCamel() {
        producerTemplate.sendBody(producerTemplate.defaultEndpoint, "")
    }

}