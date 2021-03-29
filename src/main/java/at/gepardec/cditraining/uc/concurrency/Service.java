package at.gepardec.cditraining.uc.concurrency;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

/**
 * This is bean is executed on another Thread and cannot have any dependency to beans outside the following scopes:
 * <ol>
 *     <li>@ApplicationScoped // Exists always</li>
 *     <li>@Dependent         // Exists for the depending bean only</li>
 * </ol>
 */
@Dependent
public class Service {

    /**
     * Nevertheless that this is actually request scoped, it's actually not, because there is no proxy causing problems
     */
    @Inject
    private Context config;

    public String execute() {
        // 'config.getCounter()' causes an Exception if executed on a request scoped proxy
        return Thread.currentThread().getId() + " (" + config.getRequestUri() + ")";
    }
}
