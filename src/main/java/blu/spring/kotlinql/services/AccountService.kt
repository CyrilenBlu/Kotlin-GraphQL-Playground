package blu.spring.kotlinql.services

import blu.spring.kotlinql.model.Account
import blu.spring.kotlinql.repositories.AccountRepository
import org.springframework.stereotype.Service
import java.util.*
import java.util.stream.Collectors

@Service
class AccountService(private val repository: AccountRepository) {

    fun getAccounts(count : Int) : List<Account> {
        return repository.findAll().stream().limit(count.toLong()).collect(Collectors.toList())
    }

    fun getAccount(id : Int) : Optional<Account> {
        return repository.findById(id)
    }

    fun createAccount(accountName: String) : Optional<Account> {
        val account = Account()
        account.accountName = accountName
        return Optional.of(repository.save(account))
    }
}