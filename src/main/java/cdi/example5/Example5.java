package cdi.example5;

import javax.enterprise.event.Event;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import lombok.extern.log4j.Log4j;

@Log4j
public class Example5 {
    @Inject
    private Event<Example5Event> events;

    public void fire(String message) {
        events.fire(new Example5Event(message));
    }

    public void listen(@Observes Example5Event event) {
        log.info(String.format("Received message: '%s'.", event.getMessage()));
    }
}
