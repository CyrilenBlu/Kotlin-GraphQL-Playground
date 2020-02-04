package blu.spring.kotlinql.model

import java.time.Instant
import java.util.*
import javax.persistence.*

@Entity
class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Int = 0

    var accountName : String = ""

    val creationDate : Date = Date.from(Instant.now())

}