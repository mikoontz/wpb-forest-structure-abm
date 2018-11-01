package wpb_forest_structure;

import java.awt.Color;

import observer.Observer;
import randomWalker.AgentsContinuousWithGUI;
import randomWalker.EnvironmentContinuous;
import spaces.Spaces;
import sweep.GUIStateSweep;
import sweep.SimStateSweep;

public class ContinuousGUI extends GUIStateSweep {

	public ContinuousGUI(SimStateSweep state, int gridWidth, int gridHeight, Color backdrop, Color agentDefaultColor,
			boolean agentPortrayal) {
		super(state, gridWidth, gridHeight, backdrop, agentDefaultColor, agentPortrayal);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		initialize (Forest.class, Experimenter.class, ContinuousGUI.class, 400, 400, Color.WHITE, Color.BLUE,true, Spaces.CONTINUOUS);
	}
}
