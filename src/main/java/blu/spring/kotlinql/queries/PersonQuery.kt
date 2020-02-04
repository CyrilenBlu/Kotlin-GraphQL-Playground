package blu.spring.kotlinql.queries

import blu.spring.kotlinql.model.Person
import blu.spring.kotlinql.services.PersonService
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component
import java.util.*

@Component
class PersonQuery(private val service : PersonService) : GraphQLQueryResolver {

    fun getPeople(count : Int) : List<Person> {
        return service.getPeople(count)
    }

    fun getPerson(id : Int) : Optional<Person> {
        return service.getPerson(id)
    }

}