package blu.spring.kotlinql.repositories

import blu.spring.kotlinql.model.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface PersonRepository : JpaRepository<Person, Int>{
    fun findByAccountNumber(accountNumber: String) : Optional<Person>
}