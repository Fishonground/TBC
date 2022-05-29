package server;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
public class ListGodsResponse {
    List<God> god;
    
    public ListGodsResponse(List<God> gods) {
    	this.god = gods;
    }
    
    public List<God> getGod() {
    	return god;
    }
}