package cz.esnvsbtuo.ics.core.application.port.out;

import cz.esnvsbtuo.ics.core.domain.Account;

public interface PersistUserPort {
    void persist(Account account);
}
