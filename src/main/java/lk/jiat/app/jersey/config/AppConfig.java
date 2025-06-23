package lk.jiat.app.jersey.config;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.jsp.JspMvcFeature;

import java.util.HashSet;
import java.util.Set;

//@ApplicationPath("/api")
public class AppConfig extends ResourceConfig {
    public AppConfig() {
        packages("lk.jiat.app.jersey.controller");
        packages("lk.jiat.app.jersey.middleware");

        register(JspMvcFeature.class);

        property(JspMvcFeature.TEMPLATE_BASE_PATH, "/WEB-INF/views/");
    }
}
