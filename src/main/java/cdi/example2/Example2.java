package cdi.example2;

import javax.inject.Inject;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor(onConstructor = @__(@Inject))
public class Example2 {
    @Inject
    private SystemConfig systemConfig;

    public boolean get() {
        return systemConfig.os().toLowerCase().indexOf("win") < 0;
    }
}
