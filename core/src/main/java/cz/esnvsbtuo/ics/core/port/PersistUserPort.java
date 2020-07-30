package cz.esnvsbtuo.ics.core.port;

import cz.esnvsbtuo.ics.core.domain.Account;

public interface PersistUserPort {
    void persist(Account account);
}
