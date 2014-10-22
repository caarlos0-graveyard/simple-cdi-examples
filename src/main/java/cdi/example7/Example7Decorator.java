package cdi.example7;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

@Decorator
public class Example7Decorator implements Example7 {
    @Any
    @Inject
    @Delegate
    private Example7 ex;

    @Override
    public String work() {
        return ex.work() + " on decoration!";
    }
}
