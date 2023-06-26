package com.giaolang.bookstore;

import com.giaolang.bookstore.resources.v1.BookResouce;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Configures Jakarta RESTful Web Services for the application.
 * @author Juneau
 */
@ApplicationPath("api")
public class BookApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> x = new HashSet<>();
        x.add(BookResouce.class);
        return x;
    }
    
    
}
