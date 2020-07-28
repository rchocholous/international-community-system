package cz.esnvsbtuo.ics.core.application.service;

import cz.esnvsbtuo.ics.core.application.port.out.PersistUserPort;
import cz.esnvsbtuo.ics.core.application.port.usecase.RegisterUserUseCase;
import cz.esnvsbtuo.ics.core.domain.Account;

public class UserRegistrationService implements RegisterUserUseCase {

    private PersistUserPort persistUserPort;

    public UserRegistrationService(PersistUserPort persistUserPort) {
        this.persistUserPort = persistUserPort;
    }

    public void registerUser(RegisterUserCommand command) {
        //TODO
        this.persistUserPort.persist(new Account());
    }
}
