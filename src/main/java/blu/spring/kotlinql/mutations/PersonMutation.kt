package blu.spring.kotlinql.mutations

import blu.spring.kotlinql.model.Person
import blu.spring.kotlinql.services.PersonService
import com.coxautodev.graphql.tools.GraphQLMutationResolver
import org.springframework.stereotype.Component
import java.util.*

@Component
class PersonMutation(private val service : PersonService) : GraphQLMutationResolver {

    fun addAccount(personAccountNumber : String, accountId: Int) : Optional<Person> {
        return this.service.addAccount(personAccountNumber, accountId)
    }

    fun createPerson(name : String, surname : String, age : Int) : Optional<Person> {
        return this.service.createPerson(name, surname, age)
    }

}