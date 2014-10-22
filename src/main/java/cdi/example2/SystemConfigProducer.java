package cdi.example2;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

public class SystemConfigProducer {
    @Produces
    @ApplicationScoped
    public SystemConfig get() {
        return new SystemConfigImpl(System.getProperties());
    }
}
