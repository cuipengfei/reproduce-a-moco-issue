package com.reproduce.gradle.encoding.issue;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloResource {
    @GET
    public String hello() {
        return "hello中文";
    }
}
