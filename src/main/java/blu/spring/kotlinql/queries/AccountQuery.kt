package blu.spring.kotlinql.queries

import blu.spring.kotlinql.model.Account
import blu.spring.kotlinql.services.AccountService
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component
import java.util.*

@Component
class AccountQuery(private val service : AccountService) : GraphQLQueryResolver {

    fun getAccounts(count : Int) : List<Account> {
        return this.service.getAccounts(count)
    }

    fun getAccount(id : Int) : Optional<Account> {
        return this.service.getAccount(id)
    }

}