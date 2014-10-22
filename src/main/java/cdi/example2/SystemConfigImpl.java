package cdi.example2;

import java.util.Properties;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SystemConfigImpl implements SystemConfig {
    private final Properties properties;

    @Override
    public String os() {
        return properties.getProperty("os.name");
    }
}
