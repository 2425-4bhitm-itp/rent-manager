package at.ac.htlleonding;

import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;


@Path("/team")
public class TeamResource {

    @Path("/addTeam")
    @POST
    public Response addTeam(@FormParam("teamName") String name){
        if(GameResource.currentGame.getTeams().size() == 2){
            GameResource.currentGame.getTeams().clear();
        }
        GameResource.currentGame.getTeams().add(new Team(name));
        return Response.ok().build();
    }
}