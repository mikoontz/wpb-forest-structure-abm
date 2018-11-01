package wpb_forest_structure;

import observer.Observer;
import sweep.ParameterSweeper;
import sweep.SimStateSweep;

public class Experimenter extends Observer {

	public Experimenter(String fileName, String folderName, SimStateSweep state, ParameterSweeper sweeper,
			String precision, String[] headers) {
		super(fileName, folderName, state, sweeper, precision, headers);
		// TODO Auto-generated constructor stub
	}

}
