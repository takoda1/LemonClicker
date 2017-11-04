package edu.unc.takoda.lemonclicker;

import java.io.Serializable;

public class LemonStand extends stand implements Serializable {

	//This is the first level
	
	LemonStand() {
		super();
		lemPerSec = 1;
		costForStand = 15;
		costIncrease15percent = 30;
	}
	
	
}
