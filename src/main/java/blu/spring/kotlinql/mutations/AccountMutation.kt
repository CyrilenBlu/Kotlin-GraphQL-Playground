package blu.spring.kotlinql.mutations

import blu.spring.kotlinql.model.Account
import blu.spring.kotlinql.services.AccountService
import com.coxautodev.graphql.tools.GraphQLMutationResolver
import org.springframework.stereotype.Component
import java.util.*

@Component
class AccountMutation(private val service : AccountService) : GraphQLMutationResolver {

    fun createAccount(accountName : String) : Optional<Account> {
        return this.service.createAccount(accountName)
    }

}