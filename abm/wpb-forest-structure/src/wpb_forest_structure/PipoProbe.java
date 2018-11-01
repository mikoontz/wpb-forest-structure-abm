package wpb_forest_structure;

import observer.Observer;
//import observer.Probe;
import sweep.SimStateSweep;
import sweep.ParameterSweeper;

public class PipoProbe extends Observer {

	public PipoProbe(String fileName, String folderName, SimStateSweep state, ParameterSweeper sweeper,
			String precision, String[] headers) {
		super(fileName, folderName, state, sweeper, precision, headers);
		// TODO Auto-generated constructor stub
	}

	
//	public PipoProbe(SimStateSweep state, int burnIn, double min, double max, double interval) {
//		super(state, burnIn, min, max, interval);
//		// TODO Auto-generated constructor stub
//	}
	
}
