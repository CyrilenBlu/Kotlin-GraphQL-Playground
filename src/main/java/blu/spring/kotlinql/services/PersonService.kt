package blu.spring.kotlinql.services

import blu.spring.kotlinql.model.Person
import blu.spring.kotlinql.repositories.AccountRepository
import blu.spring.kotlinql.repositories.PersonRepository
import org.springframework.stereotype.Service
import java.util.*
import java.util.stream.Collectors

@Service
class PersonService(private val repository: PersonRepository, private val accRepository : AccountRepository) {

    fun getPeople(count : Int) : List<Person> {
        return repository.findAll().stream().limit(count.toLong()).collect(Collectors.toList())
    }

    fun getPerson(id : Int) : Optional<Person> {
        return repository.findById(id)
    }

    fun addAccount(personAccountNumber : String, accountId : Int) : Optional<Person> {
        val person = repository.findByAccountNumber(accountNumber = personAccountNumber).get()
        val account = accRepository.findById(accountId)
        person.accounts?.add(account.get())
        return Optional.of(repository.save(person))
    }

    fun createPerson(name : String, surname : String, age : Int) : Optional<Person> {
        val person = Person()
        person.name = name
        person.surname = surname
        person.age = age
        return Optional.of(this.repository.save(person))
    }

}