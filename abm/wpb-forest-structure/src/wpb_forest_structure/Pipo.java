package wpb_forest_structure;

import sim.engine.SimState;
import sim.engine.Steppable;
import sim.engine.Stoppable;

public class Pipo implements Steppable {

	double lat;
	double lon;
	double dbh;
	double res;
	int nBeetles;
	boolean alive;
	
	Stoppable event;
	
	public Pipo(Forest state, double lat, double lon, double dbh, double res, int nBeetles, boolean alive) {
		super();
		this.lat = lat;
		this.lon = lon;
		this.dbh = dbh;
		this.res = res;
		this.nBeetles = nBeetles;
		this.alive = alive;
	}
	
	
	public void step(SimState state) {
		// TODO Auto-generated method stub

	}

}
