package cz.esnvsbtuo.ics.core.application.exception;

public class EntityNotFoundException extends BusinessLogicException {
    public EntityNotFoundException(String msg) {
        super(msg);
    }
}
