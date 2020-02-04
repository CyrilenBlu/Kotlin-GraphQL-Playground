package blu.spring.kotlinql.routes

import org.apache.camel.builder.RouteBuilder
import org.springframework.stereotype.Component

@Component
class PersonRoute : RouteBuilder() {

    override fun configure() {
        from("direct:start")
                .to("graphql:http://localhost:8080/graphql?queryFile=graphql-test-endpoints/getPeople.graphql")
                .to("log:exchange")

    }
}