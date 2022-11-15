package ch.zli.m223;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;



@Path("/calculator/add")
public class CalculatorResource {
    @GET
    @Path("/{a}/{b}")
    public String add(@PathParam("a") int a, @PathParam("b") int b) {
        return String.valueOf(a + b);
    }
}
    

