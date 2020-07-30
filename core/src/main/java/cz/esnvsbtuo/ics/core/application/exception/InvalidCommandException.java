package cz.esnvsbtuo.ics.core.application.exception;

public class InvalidCommandException extends BusinessLogicException {
    public InvalidCommandException(String msg) {
        super(msg);
    }
}
