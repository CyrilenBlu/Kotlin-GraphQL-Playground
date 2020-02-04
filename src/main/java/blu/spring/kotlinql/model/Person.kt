package blu.spring.kotlinql.model

import java.util.*
import javax.persistence.*

@Entity
class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Int = 0

    var name : String = ""

    var surname : String = ""

    val accountNumber : String = UUID.randomUUID().toString()

    var age : Int = 0

    @ManyToMany(fetch = FetchType.EAGER)
    val accounts : MutableList<Account>? = mutableListOf()
}