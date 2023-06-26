package com.giaolang.bookstore.resources.v1;

import com.giaolang.bookstore.dto.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author 
 */
@Path("/v1/books")
public class BookResouce {
    
//    @GET
//    public Response ping(){
//        return Response
//                .ok("ping Jakarta EE ahihi")
//                .build();
//    }
    
    @GET    
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBook() {
        return Response.ok().entity(new Book("123", "456")).build();
    }
    
//    @GET    
//    @Produces(MediaType.APPLICATION_JSON)
//    public Book getBook() {
//        return new Book("123", "456");
//    }
}
