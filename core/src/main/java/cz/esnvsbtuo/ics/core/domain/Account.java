package cz.esnvsbtuo.ics.core.domain;

import cz.esnvsbtuo.ics.infrastructure.AgregateRoot;

public class Account implements AgregateRoot {
    private AccountId accountId;

    public AccountId getId() {
        return accountId;
    }

    public class AccountId {
    }
}
