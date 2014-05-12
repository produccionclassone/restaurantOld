package es.classone.restaurant.web.components;

import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.Cookies;

import com.trsvax.bootstrap.annotations.Exclude;

@Exclude(stylesheet={"core"})  //If you do not want Tapestry CSS
@Import(stylesheet={
        "classpath:/com/trsvax/bootstrap/assets/bootstrap/css/bootstrap.css",
        "classpath:/com/trsvax/bootstrap/assets/bootstrap/css/bootstrap-responsive.css"
        },
library={
        "classpath:/com/trsvax/bootstrap/assets/bootstrap/js/bootstrap.js"
        }
)
public class LayoutLogin {

    @Property
    @Parameter(required = true, defaultPrefix = "message")
    private String pageTitle;

    @Inject
    private Cookies cookies;
    
    
}