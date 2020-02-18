package blu.spring.kotlinql.routes

import blu.spring.kotlinql.model.Person
import org.apache.camel.builder.RouteBuilder
import org.apache.camel.component.jackson.JacksonDataFormat
import org.springframework.stereotype.Component

@Component
class RabbitMQRoute : RouteBuilder() {
    override fun configure() {
        val jsonDataFormat = JacksonDataFormat(Person::class.java)

        from("direct:startQueuePoint")
                .id("rabbitQ1")
                .marshal(jsonDataFormat)
                .to("rabbitmq://localhost:5672/blurabbit.exhange?queue=rabbitq1.queue&autoDelete=false")
                .to("log:exchange")
                .end()
    }
}