package io.github.inertia4j.spring.example;

import io.github.inertia4j.springboot3.VersionProvider;
import org.springframework.stereotype.Component;

@Component
public class SimpleVersionProvider implements VersionProvider {
    @Override
    public String get() {
        return "latest";
    }
}
