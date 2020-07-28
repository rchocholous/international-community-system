package cz.esnvsbtuo.ics.adapter.persistence;

import cz.esnvsbtuo.ics.core.application.port.out.PersistUserPort;
import cz.esnvsbtuo.ics.core.domain.Account;

import java.util.HashMap;
import java.util.Map;

public class UserRepository implements PersistUserPort {
    private Map<Account.AccountId, Account> accounts = new HashMap<>();

    public void persist(Account account) {
        accounts.put(account.getId(), account);
    }
}
