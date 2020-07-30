package cz.esnvsbtuo.ics.core.application.service;

import cz.esnvsbtuo.ics.core.port.PersistUserPort;
import cz.esnvsbtuo.ics.core.usecase.command.RegisterUserUseCase;
import cz.esnvsbtuo.ics.core.domain.Account;

public class RegisterUserHandler implements RegisterUserUseCase {

    private PersistUserPort persistUserPort;

    public RegisterUserHandler(PersistUserPort persistUserPort) {
        this.persistUserPort = persistUserPort;
    }

    public void registerUser(RegisterUserCommand command) {
        //TODO
        this.persistUserPort.persist(new Account());
    }
}
