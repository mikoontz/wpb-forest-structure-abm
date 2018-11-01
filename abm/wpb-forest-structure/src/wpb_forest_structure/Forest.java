package wpb_forest_structure;

// import sim.engine.SimState;
import sim.field.continuous.*;
import sim.util.Bag;
import sim.util.Double2D;
import spaces.Spaces;
import sweep.SimStateSweep;

public class Forest extends SimStateSweep {
	
	public double height = 200;
	public double width = 200;
	public int nPipos = 1000;
	public double maxDBH = 100;
	public double maxRes = 1;
	public PipoProbe probe;
	public int initiallyAttacked = 5;
	
	public int getPipos() {
		return nPipos;
	}

	public void setPipos(int pipos) {
		this.nPipos = nPipos;
	}

	public double getMaxDBH() {
		return maxDBH;
	}

	public void setMaxDBH(double maxDBH) {
		this.maxDBH = maxDBH;
	}

	public double getMaxRes() {
		return maxRes;
	}

	public void setMaxRes(double maxRes) {
		this.maxRes = maxRes;
	}

	public Forest(long seed, Class observer) {
		super(seed, observer);
		// TODO Auto-generated constructor stub
	}

	public void makePipos() {
		
		for (int i = 0; i < nPipos; i++) {
			
			double lon = random.nextDouble() * gridWidth;
			double lat = random.nextDouble() * gridHeight;
			Double2D location = new Double2D(lon, lat);
			
			double dbh = random.nextDouble() * maxDBH;
			double res = random.nextDouble() * maxRes;
			
			Pipo p = new Pipo(this, lat, lon, dbh, res, 0, true);
			
			// Schedule the 
			p.event = schedule.scheduleRepeating(p);
			this.continuousSpace.setObjectLocation(p, location);
			
		}
		// Make Ponderosa agents
	}
	
	public void initialAttack() {
		Bag allPipos = new Bag();
		allPipos = this.continuousSpace.getAllObjects();
		
//		for (int i = 0; i < initiallyAttacked; i++) {
//			int idx = random.nextInt(pipos);
//			allPipos[i] 
//		}
	}
	public void start() {
		super.start();
		spaces = Spaces.CONTINUOUS;
		make2DSpace(spaces, 50, gridHeight, gridHeight);
		makePipos();
		
	}
	
}
