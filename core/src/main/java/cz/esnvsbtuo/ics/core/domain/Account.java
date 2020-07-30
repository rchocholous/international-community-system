package cz.esnvsbtuo.ics.core.domain;

import cz.esnvsbtuo.ics.core.domain.section.Association;
import cz.esnvsbtuo.ics.infrastructure.AggregateRoot;

public class Account implements AggregateRoot {
    private AccountId accountId;
    private Association.AssociationId associationId;

    public AccountId getId() {
        return accountId;
    }

    public class AccountId {
    }
}
