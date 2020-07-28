package cz.esnvsbtuo.ics.core.application.port;

import cz.esnvsbtuo.ics.adapter.persistence.UserRepository;
import cz.esnvsbtuo.ics.core.application.service.UserRegistrationService;
import cz.esnvsbtuo.ics.core.application.port.usecase.RegisterUserUseCase;
import cz.esnvsbtuo.ics.core.domain.Account;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TestRegisterUserUseCase {

    @Test
    public void sendRegistrationCommand_repositoryIsCalled() {
        UserRepository mockRepository = Mockito.mock(UserRepository.class);
        RegisterUserUseCase useCase = new UserRegistrationService(mockRepository);

        RegisterUserUseCase.RegisterUserCommand command = new RegisterUserUseCase.RegisterUserCommand();

        useCase.registerUser(command);

        Mockito.verify(mockRepository, Mockito.times(1)).persist(Mockito.any(Account.class));
    }
}
