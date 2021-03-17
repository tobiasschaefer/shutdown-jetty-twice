package shutdown.jetty.twice;

import io.micronaut.runtime.event.annotation.EventListener;
import io.micronaut.runtime.server.event.ServerShutdownEvent;

import javax.inject.Singleton;

@Singleton
public class MyClass {
    @EventListener
    public void onShutdown(ServerShutdownEvent event) {
        System.err.println("Shutdown");
    }
}
