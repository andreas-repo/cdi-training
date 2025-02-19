package at.gepardec.training.cdi.basic.initialization;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Implement a lifecycle callback methods in the injected beans.
 */
@Path("/basic/initialization")
@Controller
public class InitializationController {

    @Inject
    private NormalScopedBean requestBean;

    @Inject
    private DependentBean dependentBean;

    /**
     * Remember that CDI beans are initialized lazily, maybe you need to do something else in this method.
     */
    @GET
    @Path("/")
    public String get() {
        return "basic/initialization.xhtml";
    }
}
