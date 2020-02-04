package blu.spring.kotlinql.controllers

import blu.spring.kotlinql.model.Person
import org.apache.camel.Produce
import org.apache.camel.ProducerTemplate
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CamelController(@Produce(uri = "direct:start") private val producerTemplate: ProducerTemplate) {

    @RequestMapping("/")
    fun startCamel() {
        producerTemplate.sendBody(producerTemplate.defaultEndpoint, "")
    }

    @RequestMapping("/person")
    fun testPerson() : String {
        val person = Person()
        person.name = "Luke"
        person.surname = "Petzer"
        person.age = 20
        producerTemplate.asyncSendBody("direct:startQueuePoint", person)
        return ""
    }

}