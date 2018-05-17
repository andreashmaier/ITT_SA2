package de.gbsschulen;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
/**
 * 
 * @author andreasmaier
 *
 */
@Path("/ping")
public class PingResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String ping() {
		return "Ping: " + new Date().toString();
	}
}
