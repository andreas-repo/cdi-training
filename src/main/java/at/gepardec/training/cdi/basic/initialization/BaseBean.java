package at.gepardec.training.cdi.basic.initialization;

import org.slf4j.Logger;

import javax.inject.Inject;
import java.io.Serializable;

/**
 * Don't do anything here!
 */
public abstract class BaseBean implements Serializable {

    @Inject
    private Logger log;

    public void logInit() {
        log.info(this.getClass().getSimpleName() + " got initialized");
    }

    public void logDestroy() {
        log.info(this.getClass().getSimpleName() + " got destroyed");
    }
}
