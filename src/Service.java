import javax.ws.rs.core.MediaType;
import javax.ws.rs.*;

@Path("/v1/order")
public class Service {

		
		@GET
		@Produces(MediaType.TEXT_HTML)
		public String returnTitle(){
			return "<p> Java Web Service </p>";
			
		}
		}



