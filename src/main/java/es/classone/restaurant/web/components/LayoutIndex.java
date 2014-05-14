package es.classone.restaurant.web.components;

import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;

import com.trsvax.bootstrap.annotations.Exclude;


public class LayoutIndex {
    
    @Property
    @Parameter(required = true, defaultPrefix = "message")
    private String pageTitle;

    
    
}