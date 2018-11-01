package wpb_forest_structure;

import sim.engine.*;
import sim.display.*;
import sim.portrayal.continuous.ContinuousPortrayal2D;
import java.awt.*;
import javax.swing.*;
import sim.portrayal.simple.OvalPortrayal2D;

public class AgentsGUI extends GUIState {
	public Display2D display;
	public JFrame displayFrame;
	ContinuousPortrayal2D agentsPortrayal = 
                             new ContinuousPortrayal2D();

	public static void main(String[] args) {
		AgentsGUI ex = new AgentsGUI();
		Console c = new Console(ex);
		c.setVisible(true);
		System.out.println("Start Simulation");
	}

	public AgentsGUI() {
		super(new Forest(System.currentTimeMillis()));
	}

	public void quit() {
		super.quit(); 

		if (displayFrame!=null) displayFrame.dispose();
		displayFrame = null;
		display = null;
	}

	public void start() {
		super.start();
		setupPortrayals();
	}

	public void load(SimState state) {
		super.load(state);
		setupPortrayals();
	}

	public void setupPortrayals() {
                Forest se = (Forest)state;
		agentsPortrayal.setField(se.space);
                OvalPortrayal2D o = new OvalPortrayal2D(Color.red);
		agentsPortrayal.setPortrayalForAll(o);
		display.reset();
		display.repaint();
	}

	public void init(Controller c){
		super.init(c);
		display = new Display2D(400,400,this);
		displayFrame = display.createFrame();
		c.registerFrame(displayFrame);
		displayFrame.setVisible(true);
		display.setBackdrop(Color.black);
		display.attach(agentsPortrayal,"Agents");
	}

	public Object getSimulationInspectedObject() {
		return state;
	}
}